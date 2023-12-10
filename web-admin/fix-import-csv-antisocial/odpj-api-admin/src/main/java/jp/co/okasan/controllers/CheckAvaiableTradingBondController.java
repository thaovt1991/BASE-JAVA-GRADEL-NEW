package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.CheckAvaiableTradingBondParam;
import jp.co.okasan.services.BondTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/check-avaiable-trading-bond")
public class CheckAvaiableTradingBondController {

    @Autowired
    private BondTradeService bondTradeService;

    @PostMapping(produces = {"application/json"})
    public ApiResponse checkAvaiableTradingBond(@Valid @RequestBody CheckAvaiableTradingBondParam param) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(bondTradeService.checkCustomerIssueBond(param)).build())
                .build();
    }
}
