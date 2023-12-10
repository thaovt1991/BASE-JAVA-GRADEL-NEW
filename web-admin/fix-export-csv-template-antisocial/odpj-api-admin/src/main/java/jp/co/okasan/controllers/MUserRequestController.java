package jp.co.okasan.controllers;

import java.util.List;
import javax.validation.Valid;
import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.param.UpdateUserAntisocialStatusRequest;
import jp.co.okasan.domain.param.UpdateUserIdentifiStatusRequest;
import jp.co.okasan.domain.param.UpdateUserRequestImageParam;
import jp.co.okasan.services.MUserRequestImageService;
import jp.co.okasan.services.MUserRequestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user-request")
@Slf4j
public class MUserRequestController {

    private final MUserRequestService mUserRequestService;
    private final MUserRequestImageService mUserRequestImageService;

    private final MessageConverter messageConverter;

    @PostMapping("/update-identify-status")
    public ApiResponse updateUserIdentifyStatus(@RequestBody UpdateUserIdentifiStatusRequest request) {
        mUserRequestService.updateUserIdentifyStatus(request);
        return ApiResponse.builder().result(ResponseResult.builder().messages(List.of(messageConverter.convert(MessagesCodes.UI0003))).build())
                .build();
    }

    @PostMapping(value = "/update-antisocial-status", produces = {"application/json"})
    public ApiResponse updateUserAntiSocialStatus(@RequestBody UpdateUserAntisocialStatusRequest request) {
        mUserRequestService.updateUserAntiSocialStatus(request);
        return ApiResponse.builder().result(ResponseResult.builder().messages(List.of(messageConverter.convert(MessagesCodes.UI000003))).build())
          .build();
    }
    @PostMapping("/update-user-request-image")
    public ApiResponse updateUserRequestImage(@Valid @RequestBody UpdateUserRequestImageParam param) {
        mUserRequestImageService.updateUserRequestImageResponse(param);
        return ApiResponse.builder()
                .result(ResponseResult.builder()
                        .messages(List.of(messageConverter.convert(MessagesCodes.CI0005)))
                        .build())
                .build();
    }

}
