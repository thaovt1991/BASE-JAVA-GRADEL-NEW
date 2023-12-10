package jp.co.okasan.domain.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jp.co.okasan.core.errorhandler.domain.AbstractSearchCriteria;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserInfoParam extends AbstractSearchCriteria {
    private Boolean searchFlg;
    private Integer userCd;
    private String userNm;
}
