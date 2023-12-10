package jp.co.okasan.domain.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@ConfigurableValidation
public class GetDividendInquiryParam {
  @JsonProperty("issue_cd")
  private String issueCd;

  @JsonProperty("from_date")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date fromDate;

  @JsonProperty("to_date")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date toDate;

  @JsonProperty("page_number")
  private Integer pageNumber;

  @JsonProperty("page_size")
  private Integer pageSize;
}
