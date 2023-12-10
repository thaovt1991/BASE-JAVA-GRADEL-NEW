package jp.co.okasan.domain.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
public class UpdateLockInfoRequest {
    @JsonProperty("branch_cd")
    private Integer branchCd;
    @JsonProperty("customer_cd")
    private Integer customerCd;
    @JsonProperty("lock_type")
    private Integer lockType;
    @JsonProperty("lock_flg")
    private Integer lockFlg;
    @JsonProperty("lock_reason")
    private String lockReason;
}
