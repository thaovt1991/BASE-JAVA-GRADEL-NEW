package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.UpdateCashInfoRequest;
import jp.co.okasan.services.InCashInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class InCashInfoController {
    private final InCashInfoService inCashInfoService;
    @PutMapping("/update-cash-info")
    public ApiResponse updateInCashInfo(@Valid UpdateCashInfoRequest param) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(inCashInfoService.updateInCashInfo(param)).build())
                .build();
    }
}
