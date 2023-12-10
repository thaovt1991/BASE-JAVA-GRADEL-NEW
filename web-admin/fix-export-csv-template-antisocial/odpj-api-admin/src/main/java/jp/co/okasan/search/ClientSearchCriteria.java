package jp.co.okasan.search;

import jp.co.okasan.core.errorhandler.domain.AbstractSearchCriteria;
import lombok.Data;

import java.util.Date;

@Data
public class ClientSearchCriteria extends AbstractSearchCriteria {
    public ClientSearchCriteria() {
        super("id.branchCd");
    }
    private Integer branchCd;
    private Integer customerCd;
}
