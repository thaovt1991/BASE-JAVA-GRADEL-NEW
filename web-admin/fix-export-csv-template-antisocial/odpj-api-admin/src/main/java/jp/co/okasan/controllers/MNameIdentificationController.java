package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.entity.MNameIdentification;
import jp.co.okasan.services.MNameIdentificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/name-identification")
public class MNameIdentificationController {

    private final MNameIdentificationService mNameIdentificationService;

    private final MessageConverter messageConverter;

    @GetMapping()
    public ApiResponse getAllNameIdentification(
            @RequestParam(value = "entryNo", required = false) Integer entryNo,
            @RequestParam(value = "clientNo", required = false) Integer clientNo) {
        List<MNameIdentification> nameIdentifications = mNameIdentificationService.findAllByEntryNoAndClientNo(entryNo, clientNo);
        return ApiResponse.builder()
                .result(
                        ResponseResult.builder()
                                .data(nameIdentifications)
                                .messages(List.of(messageConverter.convert("RT9999")))
                                .build()
                )
                .build();
    }
}
