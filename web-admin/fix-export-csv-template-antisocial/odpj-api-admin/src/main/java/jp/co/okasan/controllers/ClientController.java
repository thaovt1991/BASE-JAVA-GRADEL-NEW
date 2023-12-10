package jp.co.okasan.controllers;

import java.util.List;

import javax.validation.Valid;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.GetAccPrivParam;
import jp.co.okasan.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jp.co.okasan.domain.param.UpdateLockInfoRequest;
import jp.co.okasan.services.AccountLockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private final AccountLockService accountLockService;
    private final ClientService service;

    @PostMapping("/update-lock_info")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse updateLockInfo(@Valid @RequestBody UpdateLockInfoRequest request) {
        return ApiResponse.builder()
                .result(
                        ResponseResult.builder().messages(List.of(accountLockService.updateLockInfo(request))).build())
                .build();
    }

    @GetMapping("/get-acc-priv")
    public ApiResponse getAccPriv(@Valid GetAccPrivParam param) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(service.getAccPriv(param)).build())
                .build();
    }
}
