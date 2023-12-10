package jp.co.okasan.controllers;

import java.util.List;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.domain.dto.UserInfoDTO;
import jp.co.okasan.domain.request.SaveUserRequest;
import jp.co.okasan.domain.request.UserInfoParam;
import jp.co.okasan.domain.response.UserInfoResponse;
import jp.co.okasan.dto.ResultListDto;
import jp.co.okasan.services.LoginInfoService;
import jp.co.okasan.services.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-info")
public class UserInfoController {

  private final UserInfoService userInfoService;
  private final LoginInfoService loginInfoService;

  @GetMapping(value = "/get-user-info")
  public ApiResponse getUserInfo(@RequestParam int customerCd) {
    return ApiResponse.builder()
        .result(ResponseResult.builder().data(loginInfoService.getUserInfo(customerCd)).build())
        .build();
  }

  @GetMapping("/get-form-save-user")
  @ResponseStatus(HttpStatus.OK)
  public ApiResponse getFormSaveUser() {
    // TODO [TQVu1][ODPJ-331] confirm response message, code
    return ApiResponse.builder()
        .result(ResponseResult.builder().data(userInfoService.getFormSaveUser()).build())
        .build();
  }

  @PostMapping("/save-user")
  @ResponseStatus(HttpStatus.OK)
  public ApiResponse saveUser(@Valid @RequestBody SaveUserRequest request) {
    return ApiResponse.builder()
        .result(ResponseResult.builder().data(userInfoService.saveUser(request)).build())
        .build();
  }


  @GetMapping("/get-user_info_by_id")
  public ResultListDto getUserInfo(@Valid UserInfoParam userInfoParam) {

    Page<UserInfoDTO> result = userInfoService.getUserInfo(userInfoParam);
    UserInfoResponse responseData = UserInfoResponse.builder()
        .userInfo(result.getContent())
        .build();

    return ResultListDto.builder()
        .result(ResponseResult.builder().data(responseData).build())
        .totalCount(result.getTotalElements())
        .count(result.getContent().size())
        .page(result.getPageable().getPageNumber())
        .pageSize(result.getPageable().getPageSize())
        .build();
  }
}
