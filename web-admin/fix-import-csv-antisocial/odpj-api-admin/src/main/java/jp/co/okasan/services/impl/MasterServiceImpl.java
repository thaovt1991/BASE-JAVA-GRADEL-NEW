package jp.co.okasan.services.impl;

import jp.co.okasan.core.cache.DataCache;
import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.response.StockCompanies;
import jp.co.okasan.repositories.StockCompanyRepository;
import jp.co.okasan.services.MasterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MasterServiceImpl implements MasterService {
  private static final String NO_BRAND_CD = "0";
  private final StockCompanyRepository stockCompanyRepository;
  private final MessageConverter messageConverter;
  private final DataCache dataCache;

  @NotNull @Override
  public StockCompanies findStockCompany(String brandCd) {
    final var companies = getStockCompanies();
    if (!CollectionUtils.isEmpty(companies.getStockCompanies()) && hasBrandCd(brandCd)) {
      final var filtered =
          companies.getStockCompanies().stream()
              .filter(c -> brandCd.equals(c.getBrandCd()))
              .findAny()
              .map(List::of)
              .orElse(Collections.emptyList());
      return new StockCompanies(filtered);
    }
    return companies;
  }

  protected boolean hasBrandCd(String param) {
    return !param.isEmpty() && !NO_BRAND_CD.equals(param);
  }

  protected StockCompanies getStockCompanies() {
    try {
      try {
        return dataCache.get(
                StockCompanies.class.getName(),
                StockCompanies.class,
                () -> new StockCompanies(stockCompanyRepository.findAll()));
      } catch (Exception e){
        return new StockCompanies(stockCompanyRepository.findAll());
      }
    } catch (Exception e) {
      log.error(MessagesCodes.DS000001.name(), e);
      throw new WebResponseErrorException(
          HttpStatus.INTERNAL_SERVER_ERROR,
          List.of(messageConverter.convert(MessagesCodes.DS000001)),
          e);
    }
  }
}
