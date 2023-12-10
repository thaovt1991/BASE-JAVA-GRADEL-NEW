package jp.co.okasan.domain.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
public class UpdateFundStdPriceParam {
  @JsonProperty("issue_cd")
  private String issueCd;

  @JsonProperty("std_dt")
  private Date stdDt;

  @JsonProperty("std_price")
  private Integer stdPrice;
}
