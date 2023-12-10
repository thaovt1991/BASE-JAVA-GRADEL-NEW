package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.GetResourceInfoRequest;
import jp.co.okasan.services.YoryokuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
@RestController
@RequiredArgsConstructor
@RequestMapping("/yoryoku")
public class YoryokuController {
    private final YoryokuService service;
    @GetMapping("/get-resource-info")
    public ApiResponse getResourceInfo(@Valid GetResourceInfoRequest param){
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(service.getResourceInfo(param)).build())
                .build();
    }
}
