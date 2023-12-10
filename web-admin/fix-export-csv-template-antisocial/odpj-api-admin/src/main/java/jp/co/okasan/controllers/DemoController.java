package jp.co.okasan.controllers;

import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import jp.co.okasan.repositories.UserRequestImageRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/** For Test only, should delete before merge to main */
@RestController
@RequiredArgsConstructor
public class DemoController {

  @Data
  public static class NestedValue {
    private Integer number;
    @Valid private List<@NotEmpty @Size(max = 2) String> list;
  }

  @Data
  @ConfigurableValidation
  public static class DemoParam {
    @Length(max = 5) private String username;

    private String email;
    @Valid private NestedValue nestedValue;
  }

  @GetMapping("/ok")
  public Object getOk() {
    return "OK";
  }

  @GetMapping("/invalid")
  public Object invalid(@Valid DemoController.DemoParam demoParam) {
    return "OK";
  }

  @GetMapping("/exception")
  public Object exception() {
    throw new RuntimeException("error");
  }

  @PostMapping("/")
  public Object valid(@Valid @RequestBody DemoParam body) {
    return "OK";
  }

  @GetMapping("/custom-error")
  public Object customError(@RequestParam(value = "status", defaultValue = "200") int status) {
    throw new WebResponseErrorException(
        ApiResponse.builder()
            .httpStatus(Objects.requireNonNullElse(HttpStatus.resolve(status), HttpStatus.OK))
            .message("custom error")
            .build(),
        null);
  }

  @Data
  public static class UserRequestImageParam {
    Integer clientNo;
    Integer identityDocumentsSeqNo;
  }

  @Service
  @RequiredArgsConstructor
  public static class GetUserRequestImageService {
    private final UserRequestImageRepository userRequestImageRepository;

    Object find() {
      return userRequestImageRepository.findAll();
    }
  }

  private final GetUserRequestImageService getUserRequestImageService;

  @GetMapping("/user-request-image")
  public Object getUserRequestImages() {
    return getUserRequestImageService.find();
  }
}
