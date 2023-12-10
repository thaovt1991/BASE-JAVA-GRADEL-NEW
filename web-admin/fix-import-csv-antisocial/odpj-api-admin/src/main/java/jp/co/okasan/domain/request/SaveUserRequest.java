package jp.co.okasan.domain.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SaveUserRequest {
  private String userCd;
  private String corpCd;
  private String branchCd;
  private String roleCd;
  private String traderCd;
  private String userNm;
  private String userNmKana;
  private String password;
  private String pinNo;
  private String startDt;
  private String endDt;
  private String deleteFlg;
}
