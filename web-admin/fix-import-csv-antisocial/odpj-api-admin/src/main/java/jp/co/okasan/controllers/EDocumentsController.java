package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.GetEDocumentsRequest;
import jp.co.okasan.services.EDocumentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class EDocumentsController {
    private final EDocumentsService service;
    @GetMapping("/get-e-documents-by-issue-cd")
    public ApiResponse getEDocumentsByIssueCd(@Valid GetEDocumentsRequest param){
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(service.getEDocumentsByIssueCd(param)).build())
                .build();
    }
}
