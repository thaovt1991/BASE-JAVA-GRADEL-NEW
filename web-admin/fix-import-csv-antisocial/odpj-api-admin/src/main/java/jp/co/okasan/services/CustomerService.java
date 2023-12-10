package jp.co.okasan.services;

import jp.co.okasan.domain.dto.CustomerDTO;
import jp.co.okasan.domain.request.GetListCustomerParam;
import jp.co.okasan.entity.Client;

import java.util.List;

public interface CustomerService {

    Client getCustomerByCd(String branchCd, Integer customerCd);
    List<CustomerDTO> getListCustomer(GetListCustomerParam param);

}
