package jp.co.okasan.services;

import jp.co.okasan.domain.request.TradeInquiryRequest;
import jp.co.okasan.domain.response.TradeInfoDto;
import jp.co.okasan.domain.response.TradeInquiryDto;
import jp.co.okasan.dto.ResultListDto;
import org.springframework.data.domain.Page;

public interface TradeService {
  Page<TradeInfoDto> getTradeInquiry(TradeInquiryRequest request);

  byte[] exportTradeInquiry(TradeInquiryRequest request);
}
