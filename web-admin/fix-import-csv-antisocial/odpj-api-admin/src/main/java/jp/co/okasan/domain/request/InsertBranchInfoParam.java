package jp.co.okasan.domain.request;

import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.*;

@Data
@ConfigurableValidation
public class InsertBranchInfoParam {
    private Integer branchCd;
    private String branchNm;
}
