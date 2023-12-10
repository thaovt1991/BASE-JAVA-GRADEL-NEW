package jp.co.okasan.controllers;

import javax.validation.Valid;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.GetStockCompanyParam;
import jp.co.okasan.services.MasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/master")
public class MasterController {

  private final MasterService service;

  @GetMapping("/stock-company")
  public ApiResponse getStockCompany(@RequestParam String brandCd) {
    return ApiResponse.builder()
        .result(ResponseResult.builder().data(service.findStockCompany(brandCd)).build())
        .build();
  }
}
