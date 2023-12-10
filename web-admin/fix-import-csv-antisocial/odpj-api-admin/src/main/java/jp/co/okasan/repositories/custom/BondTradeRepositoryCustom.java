package jp.co.okasan.repositories.custom;

import jp.co.okasan.domain.request.TradeInquiryRequest;
import jp.co.okasan.domain.response.TradeInfoDto;
import org.springframework.data.domain.Page;

/**
 * Custom repository for BondTrade
 */
public interface BondTradeRepositoryCustom {
  Page<TradeInfoDto> getTradeInquiry(TradeInquiryRequest request);
}
