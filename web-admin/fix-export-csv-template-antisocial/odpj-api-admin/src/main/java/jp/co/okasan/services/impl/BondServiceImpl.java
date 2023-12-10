package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.ReadFileCsvResult;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.core.utils.CsvImportHelper;
import jp.co.okasan.domain.dto.BondDiscreptionDTO;
import jp.co.okasan.domain.dto.PrivilegeInquiryDto;
import jp.co.okasan.entity.BondDiscreption;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.param.PrivilegeInquiryRequest;
import jp.co.okasan.mapper.BondMapper;
import jp.co.okasan.mapper.BondMapperImpl;
import jp.co.okasan.mapper.PrivilegeInquiryMapper;
import jp.co.okasan.repositories.BondDiscreptionRepository;
import jp.co.okasan.services.BondService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class BondServiceImpl implements BondService {
    private final BondDiscreptionRepository bondDiscreptionRepository;
    private final MessageConverter messageConverter;
    private PrivilegeInquiryMapper mapper;
    private BondMapper bondMapper;
    private final CsvImportHelper<BondDiscreptionDTO> csvImportHelper;
    @PersistenceContext
    EntityManager entityManager;
    @NonNull
    @Override
    public List<PrivilegeInquiryDto> getPrivilegeInquiry(@NonNull PrivilegeInquiryRequest request) {
        try {
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<PrivilegeInquiryDto> query = builder
                    .createQuery(PrivilegeInquiryDto.class);
            Root<BondDiscreption> bd = query.from(BondDiscreption.class);
            List<Predicate> predicates = new ArrayList<>();
            if (!request.getIssueCd().isEmpty() && !request.getIssueCd().isBlank()) {
                predicates.add(builder.equal(bd.get("issueSecCd"), request.getIssueCd()));
            }
            TypedQuery typedQuery = entityManager.createQuery(query.multiselect(
                            bd.get("issueSecCd"),
                            bd.get("secShortDescKanji"),
                            bd.get("couponRateChangeDt"),
                            bd.get("couponRate"))
                    .where(predicates.toArray(new Predicate[]{})));
            return typedQuery.getResultList();

        } catch (Exception e) {
            log.error(MessagesCodes.RY000509.name(), e);
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.RY000509)),
                    e);
        }
    }
    public MessageDetail importBondCsvFile(Class type, InputStream is) {
        try {
            bondMapper = new BondMapperImpl();
            ReadFileCsvResult result = csvImportHelper.readCsvFromInputStream(BondDiscreptionDTO.class, is);
            if (result != null && result.isStatus()) {
                List<BondDiscreption> list = ((List<BondDiscreptionDTO>) result.getObject()).stream().map(bondMapper::toDto).collect(Collectors.toList());
                bondDiscreptionRepository.saveAll(list);
            } else {
                return messageConverter.convert(MessagesCodes.VT000500, result.getMessage());
            }
        } catch (Exception e) {
            log.error(MessagesCodes.DT000500.name(), e);
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DT000500)),
                    e);
        }
        return messageConverter.convert(MessagesCodes.RT000009);
    }

}

