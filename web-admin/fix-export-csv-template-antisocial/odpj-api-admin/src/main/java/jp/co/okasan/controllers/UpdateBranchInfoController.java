package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.request.UpdateBranchInfoParam;
import jp.co.okasan.services.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/update-branch-info")
@RequiredArgsConstructor
public class UpdateBranchInfoController {
    private final BranchService branchService;

    @GetMapping
    public ApiResponse updateBranchInfo(@Valid @RequestBody UpdateBranchInfoParam param){
        return ApiResponse.builder()
                .result(ResponseResult.builder().data(null).build())
                        .build();
    }
}
