package jp.co.okasan.services.impl;

import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.core.utils.CsvUtils;
import jp.co.okasan.domain.request.TradeInquiryRequest;
import jp.co.okasan.domain.response.TradeInfoDto;
import jp.co.okasan.domain.response.TradeInquiryDto;
import jp.co.okasan.dto.ResultListDto;
import jp.co.okasan.repositories.BondTradeRepository;
import jp.co.okasan.services.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TradeServiceImpl implements TradeService {

  private final BondTradeRepository bondTradeRepository;

  @Override
  @Transactional(readOnly = true)
  public Page<TradeInfoDto> getTradeInquiry(TradeInquiryRequest request) {
    return bondTradeRepository.getTradeInquiry(request);
  }

  @Override
  @Transactional(readOnly = true)
  public byte[] exportTradeInquiry(TradeInquiryRequest request) {
    Page<TradeInfoDto> result = bondTradeRepository.getTradeInquiry(request);
    return CsvUtils.writeCsv(result.getContent(), TradeInfoDto.class);
  }
}
