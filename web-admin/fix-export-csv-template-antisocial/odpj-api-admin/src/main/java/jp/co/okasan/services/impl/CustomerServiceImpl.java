package jp.co.okasan.services.impl;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.domain.dto.CustomerDTO;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.GetListCustomerParam;
import jp.co.okasan.entity.Client;
import jp.co.okasan.repositories.ClientRepository;
import jp.co.okasan.repositories.ClientRepositoryCustom;
import jp.co.okasan.services.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final ClientRepository clientRepository;
    private final MessageConverter messageConverter;
    private final ClientRepositoryCustom clientRepositoryCustom;
    @Override
    public Client getCustomerByCd(String branchCd, Integer customerCd) {
        try {
            return Objects.requireNonNull(clientRepository.
                    findClientByBranchCdAndCustomerCd(branchCd,customerCd).orElse(null));
            //return clientRepository.findClientByBranchCdAndCustomerCd(branchCd,customerCd);
        } catch (Exception e) {
            throw new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR, List.of(messageConverter.convert(MessagesCodes.RG5000)), e);
        }
    }
    @Override
    public List<CustomerDTO> getListCustomer(GetListCustomerParam param) {
        try {
            return clientRepositoryCustom.getListCustomer(param.getBranchCd(),
                    param.getCustomerCd(), param.getName(), param.getKanaName());
        } catch (Exception e) {
            throw  new WebResponseErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                    List.of(messageConverter.convert(MessagesCodes.DV000501)), e);
        }
    }
}


