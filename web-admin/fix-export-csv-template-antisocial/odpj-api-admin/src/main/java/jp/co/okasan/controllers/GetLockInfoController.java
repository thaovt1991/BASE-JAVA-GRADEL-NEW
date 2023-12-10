package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.GetLockInfoParam;
import jp.co.okasan.services.GetLockInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/get-lock_info")
@RequiredArgsConstructor
public class GetLockInfoController {

    private final GetLockInfoService getLockInfoService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getLockInfo(@Valid @RequestBody GetLockInfoParam param) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(getLockInfoService.getLockInfo(param)).build())
                .build();
    }
}
