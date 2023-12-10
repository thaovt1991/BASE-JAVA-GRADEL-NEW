package jp.co.okasan.controllers;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.enums.MessagesCodes;
import jp.co.okasan.services.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/branch")
@RequiredArgsConstructor
public class GetBranchInfoController {

  private final BranchService branchService;

  private final MessageConverter messageConverter;

  @GetMapping("/get-branch-info")
  public ApiResponse getBranchInfo() {
    return ApiResponse.builder()
            .result(ResponseResult.builder()
                    .messages(List.of(messageConverter.convert(MessagesCodes.D0000200)))
                    .data(branchService.getBranchInfo())
                    .build())
            .build();
  }
}
