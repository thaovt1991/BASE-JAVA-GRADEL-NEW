package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.UpdateFundDividendPrice;
import jp.co.okasan.domain.request.UpdateFundStdPriceParam;
import jp.co.okasan.search.FundPriceSearchCriteria;
import jp.co.okasan.services.FundPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class FundPriceController {

    @Autowired
    private FundPriceService service;

    @PostMapping(value = "/export-csv-fund-price")
    public ApiResponse exportCsv(@RequestBody FundPriceSearchCriteria searchCriteria) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(service.exportCsv(searchCriteria)).build())
                .build();
    }

    @PutMapping("/update-fund-std-price")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse updateFundStdPrice(@Valid @RequestBody UpdateFundStdPriceParam param) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(service.updateFundStdPrice(param)).build())
                .build();
    }

    @PostMapping("/get-fund-prices")
    public ApiResponse getFundPrices(@RequestBody FundPriceSearchCriteria searchCriteria) {
        return ApiResponse.builder()
                .result(ResponseResult.builder()
                        .data(service.search(searchCriteria)).build())
                .build();
    }

    @PostMapping("update-fund_dividend_price")
    public ApiResponse updateFundDividendPrice(@RequestBody UpdateFundDividendPrice model) {
        return ApiResponse.builder()
                .result(ResponseResult.builder()
                        .data(service.updateFundDividendPrice(model)).build())
                .build();
    }

}
