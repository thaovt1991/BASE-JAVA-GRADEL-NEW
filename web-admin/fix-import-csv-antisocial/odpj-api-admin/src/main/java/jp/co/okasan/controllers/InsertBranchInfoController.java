package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.InsertBranchInfoParam;
import jp.co.okasan.services.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/insert-branch-info")
public class InsertBranchInfoController {

    private final BranchService branchService;

    @PutMapping(produces = {"application/json"})
    public ApiResponse insertBranchInfo(@Valid @RequestBody InsertBranchInfoParam param){
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(branchService.insertBranchInfo(param)).build())
                .build();
    }

}
