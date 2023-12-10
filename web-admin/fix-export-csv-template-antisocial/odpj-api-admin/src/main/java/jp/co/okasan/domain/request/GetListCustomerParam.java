package jp.co.okasan.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetListCustomerParam {

    private String branchCd;

    private Integer customerCd;

    private String name;

    private String kanaName;

    private int pageSize;

    private int pageIndex;

}
