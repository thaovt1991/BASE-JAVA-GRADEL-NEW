package jp.co.okasan.services;

import javax.validation.constraints.NotNull;

import jp.co.okasan.domain.request.GetStockCompanyParam;
import jp.co.okasan.domain.response.StockCompanies;
import org.springframework.lang.NonNull;

public interface MasterService {
  @NotNull StockCompanies findStockCompany(String brandCd);
}
