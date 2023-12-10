package jp.co.okasan.domain.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import jp.co.okasan.core.errorhandler.domain.AbstractSearchCriteria;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@NoArgsConstructor
@AllArgsConstructor
@ConfigurableValidation
public class TradeInquiryRequest extends AbstractSearchCriteria {
  private Date dateFrom;
  private Date dateTo;
  private Integer branchCd;
  private Integer customerCd;
  private String issueCd;
  private Integer tradeTypeCd;
}
