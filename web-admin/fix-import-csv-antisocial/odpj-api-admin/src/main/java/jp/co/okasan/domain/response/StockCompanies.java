package jp.co.okasan.domain.response;

import java.util.List;
import jp.co.okasan.entity.MStockCompany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class StockCompanies {
  List<MStockCompany> stockCompanies;
}
