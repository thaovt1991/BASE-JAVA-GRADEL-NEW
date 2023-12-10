package jp.co.okasan.repositories;

import jp.co.okasan.domain.dto.CustomerDTO;

import java.util.List;

public interface ClientRepositoryCustom {
    List<CustomerDTO> getListCustomer(String branchCd, Integer customerCd,
                                      String name, String kanaName);
}
