package jp.co.okasan.domain.response;

import java.util.List;

import jp.co.okasan.entity.Client;
import jp.co.okasan.entity.FundDivProfit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter @Getter
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
public class GetAccPrivResponse {
  private Long total;
  private List<Client> customerInfos;
}
