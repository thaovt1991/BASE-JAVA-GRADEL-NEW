package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.domain.request.ExportCsvBranchesRequest;
import jp.co.okasan.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/export-csv-branches")
public class ExportCsvBranchController {
    @Autowired
    private BranchService branchService;

    @Autowired
    private MessageConverter messageConverter;

    @GetMapping
    public ApiResponse exportCsvBranches(@RequestBody ExportCsvBranchesRequest request) {
        return ApiResponse.builder()
                .result(ResponseResult.builder().messages(List.of(messageConverter.convert(MessagesCodes.E11000))).data(branchService.exportCsvBranches(request)).build())
                .build();
    }
}
