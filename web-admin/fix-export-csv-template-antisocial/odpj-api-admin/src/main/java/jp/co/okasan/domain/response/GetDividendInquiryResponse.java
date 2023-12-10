package jp.co.okasan.domain.response;

import jp.co.okasan.entity.FundDivProfit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter @Getter
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
public class GetDividendInquiryResponse {
  private Integer total;
  private List<FundDivProfit> dividendInfo;
}
