package jp.co.okasan.controllers;

import javax.validation.Valid;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.core.utils.CsvUtils;
import jp.co.okasan.domain.request.TradeInquiryRequest;
import jp.co.okasan.domain.response.TradeInquiryDto;
import jp.co.okasan.dto.ResultListDto;
import jp.co.okasan.services.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/trade")
public class TradeController {

  private final TradeService tradeService;

  @GetMapping("/inquiry")
  public ResultListDto getTradeInquiry(@Valid @RequestBody TradeInquiryRequest request) {
    var result = tradeService.getTradeInquiry(request);
    return ResultListDto.builder()
        .result(ResponseResult.builder()
            .data(TradeInquiryDto.builder().tradeInfo(result.getContent()).build())
            .build())
        .totalCount(result.getTotalElements())
        .count(result.getContent().size())
        .page(result.getPageable().getPageNumber() + 1)
        .pageSize(result.getPageable().getPageSize())
        .build();
  }

  @PostMapping("/csv")
  public ResponseEntity<?> exportTradeInquiry(@Valid @RequestBody TradeInquiryRequest request) {

    byte[] bytes = tradeService.exportTradeInquiry(request);

    return ResponseEntity.ok()
        .headers(CsvUtils.getHttpHeader("trade_inquiry.csv"))
        .body(bytes);
  }
}
