package jp.co.okasan.domain.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
public class GetAccPrivParam {
  @JsonProperty("branch_cd")
  private String branchCd;

  @JsonProperty("customer_cd")
  private Integer customerCd;

  @JsonProperty("page_number")
  private Integer pageNumber;

  @JsonProperty("page_size")
  private Integer pageSize;
}
