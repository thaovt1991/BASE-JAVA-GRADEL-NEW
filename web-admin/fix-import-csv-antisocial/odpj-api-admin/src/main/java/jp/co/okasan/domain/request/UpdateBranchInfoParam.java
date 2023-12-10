package jp.co.okasan.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
public class UpdateBranchInfoParam {

    @JsonProperty("bank_cd")
    private Integer bankCd;
    @JsonProperty("branch_nm")
    private String branchNm;
    @JsonProperty("own_branch_flg")
    private Integer ownBranchFlg;
}
