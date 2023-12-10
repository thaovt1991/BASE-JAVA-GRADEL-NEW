package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.core.utils.CsvExecutorService;
import jp.co.okasan.domain.dto.FundPriceDTO;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.UpdateFundDividendPrice;
import jp.co.okasan.domain.request.UpdateFundStdPriceParam;
import jp.co.okasan.domain.response.ExportCsvBondsDetailResponse;
import jp.co.okasan.domain.response.FundPriceCsvResponse;
import jp.co.okasan.entity.FundPrice;
import jp.co.okasan.entity.FundPricePK;
import jp.co.okasan.mapper.FundPriceMapper;
import jp.co.okasan.repositories.FundPriceRepository;
import jp.co.okasan.search.FundPriceSearchCriteria;
import jp.co.okasan.services.FundPriceService;
import jp.co.okasan.specification.FundPriceSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FundPriceServiceImpl implements FundPriceService {
    private final String FILENAME = "FundPrice";

    private final FundPriceRepository fundPriceRepository;
    private final MessageConverter messageConverter;
    private final CsvExecutorService csvExecutorService;
    private final FundPriceMapper fundPriceMapper;

    @Override
    public ExportCsvBondsDetailResponse exportCsv(FundPriceSearchCriteria searchCriteria) {
        try {
            Specification<FundPrice> spec = FundPriceSpecification.search(searchCriteria);
            List<FundPrice> fundPrices = fundPriceRepository.findAll(spec);
            List<FundPriceCsvResponse> list = new ArrayList<>();
            fundPrices.forEach(item -> {
                FundPriceCsvResponse fundPriceCsvResponse = new FundPriceCsvResponse();
                BeanUtils.copyProperties(item, fundPriceCsvResponse);
                fundPriceCsvResponse.setIssueCd(item.getId().getIssueCd());
                fundPriceCsvResponse.setStdDt(item.getId().getStdDt());
                list.add(fundPriceCsvResponse);
            });

            ByteArrayResource resource = new ByteArrayResource(csvExecutorService.toBytes(list));

            String contentType = "text/csv";

            int fileSize = resource.getByteArray().length;

            String fileData = Base64.getEncoder().encodeToString(resource.getByteArray());

            return new ExportCsvBondsDetailResponse(FILENAME, contentType, fileSize, fileData);

        } catch (IllegalStateException | IOException e) {
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DE000002)),
                    null);
        }
    }

    @NonNull
    @Override
    public MessageDetail updateFundStdPrice(@NonNull UpdateFundStdPriceParam param) {
        try {
            FundPricePK id = new FundPricePK();
            id.setIssueCd(param.getIssueCd());
            id.setStdDt(param.getStdDt());
            Optional<FundPrice> optional = fundPriceRepository.findById(id);
            if (optional.isPresent()) {
                FundPrice entity = optional.get();
                entity.setStdPrice(param.getStdPrice());
                fundPriceRepository.save(entity);
            } else {
                return messageConverter.convert(MessagesCodes.DS000003);
            }
        } catch (Exception e) {
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DS000002)),
                    e);
        }
        return messageConverter.convert(MessagesCodes.CI0006);
    }

    @Override
    public List<FundPriceDTO> search(FundPriceSearchCriteria searchCriteria) {
        Specification<FundPrice> spec = FundPriceSpecification.search(searchCriteria);
        Page<FundPrice> page = fundPriceRepository.findAll(spec, searchCriteria.pageRequest());
        List<FundPriceDTO> list = page.getContent().stream().map(fundPriceMapper::toDto).collect(Collectors.toList());
        if (page.getContent().isEmpty()) {
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DY000501)),
                    null);
        } else {
            return list;
        }
    }

    @Override
    public FundPriceDTO updateFundDividendPrice(UpdateFundDividendPrice model) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(model.getStdDt());
        FundPrice entity = fundPriceRepository.getByIssueCdAndStd(model.getIssueCd(), format);
        if (entity != null) {
            entity.setDividendPrice(model.getDividendPrice());
            entity = fundPriceRepository.save(entity);
            return fundPriceMapper.toDto(entity);
        }
        throw new WebResponseErrorException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                List.of(messageConverter.convert(MessagesCodes.RY0002)),
                null);
    }
}
