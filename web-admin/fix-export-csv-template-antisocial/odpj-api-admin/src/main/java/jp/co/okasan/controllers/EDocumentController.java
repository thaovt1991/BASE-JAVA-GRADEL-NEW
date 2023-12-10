package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.ElDlvDocParam;
import jp.co.okasan.services.EDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/e-document")
public class EDocumentController {
    private final EDocumentService eDocumentService;

    @PutMapping(value = "/update-e_document", produces = {"application/json"})
    public ApiResponse updateEDocument(@Valid @RequestBody ElDlvDocParam param) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(eDocumentService.updateEDocument(param)).build())
                .build();
    }
}
