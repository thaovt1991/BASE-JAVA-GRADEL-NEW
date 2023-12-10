package jp.co.okasan.domain.response;

import jp.co.okasan.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerItemResponse {

    private String branchCd;

    private Integer customerCd;

    private String customerName;

    public static GetCustomerItemResponse toGetCustomerByCdResponse(Client client) {
        final var result = new GetCustomerItemResponse();

//        result.setBranchCd(client.getBranchCd());
//        result.setCustomerCd(client.getCustomerCd());
//        result.setCustomerName(client.getNameSei() + " " + client.getNameMei());
        return result;
    }
}
