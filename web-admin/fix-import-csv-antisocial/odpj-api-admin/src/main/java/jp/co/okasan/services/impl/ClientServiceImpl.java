package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.domain.dto.ClientDTO;
import jp.co.okasan.domain.request.GetAccPrivParam;
import jp.co.okasan.domain.response.GetAccPrivResponse;
import jp.co.okasan.domain.response.GetDividendInquiryResponse;
import jp.co.okasan.entity.Client;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.entity.FundDivProfit;
import jp.co.okasan.mapper.ClientMapper;
import jp.co.okasan.repositories.ClientRepository;
import jp.co.okasan.search.ClientSearchCriteria;
import jp.co.okasan.services.ClientService;
import jp.co.okasan.specification.ClientSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    private MessageConverter messageConverter;

    @Autowired
    private ClientMapper mapper;

    @Override
    public List<ClientDTO> search(ClientSearchCriteria searchCriteria) {
        Specification<Client> spec = ClientSpecification.search(searchCriteria);
        Page<Client> page = clientRepository.findAll(spec, searchCriteria.pageRequest());
        List<ClientDTO> list = page.getContent().stream().map(mapper::toDto).collect(Collectors.toList());
        if (page.getContent().isEmpty()) {

            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DW000508)),
                    null);
        } else {
            return list;
        }
    }

    @Override
    public GetAccPrivResponse getAccPriv(GetAccPrivParam param) {
        GetAccPrivResponse result = new GetAccPrivResponse();
        Pageable pageable = PageRequest.of(param.getPageNumber()==null?(param.getPageNumber()-1):0, param.getPageSize());
        Page<Client> clientPage = clientRepository.findClientByBranchCdAndCustomerCd(
                param.getBranchCd(), param.getCustomerCd(), pageable);
        if (clientPage.getContent().isEmpty()) {
            throw new WebResponseErrorException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DW000508)),
                    null);
        } else {
            return result;
        }
    }

}
