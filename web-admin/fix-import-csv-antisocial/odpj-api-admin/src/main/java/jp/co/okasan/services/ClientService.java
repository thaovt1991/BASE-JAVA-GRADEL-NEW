package jp.co.okasan.services;

import jp.co.okasan.domain.dto.ClientDTO;
import jp.co.okasan.domain.request.GetAccPrivParam;
import jp.co.okasan.domain.response.GetAccPrivResponse;
import jp.co.okasan.entity.Client;
import jp.co.okasan.search.ClientSearchCriteria;

import java.util.List;

public interface ClientService {

    List<ClientDTO> search(ClientSearchCriteria searchCriteria);

    GetAccPrivResponse getAccPriv(GetAccPrivParam param);
}
