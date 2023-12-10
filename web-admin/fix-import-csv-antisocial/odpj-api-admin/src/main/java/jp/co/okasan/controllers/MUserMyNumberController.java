package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.UpdateMyNumberRequest;
import jp.co.okasan.services.MUserMyNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-my-number")
public class MUserMyNumberController {

    private final MUserMyNumberService mUserMyNumberService;

    private final MessageConverter messageConverter;
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse updateMyNumber(@Valid @RequestBody UpdateMyNumberRequest request) {
        mUserMyNumberService.updateMyNumber(request);
        return ApiResponse.builder()
                .result(ResponseResult.builder().messages(List.of(messageConverter.convert(MessagesCodes.UU0001))).build())
                .build();
    }
}
