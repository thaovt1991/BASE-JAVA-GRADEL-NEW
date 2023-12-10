package jp.co.okasan.core.errorhandler;

import javax.validation.ConstraintViolationException;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.core.errorhandler.domain.WebResponseErrorException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

/** 特定な例外以外すべて対応する */
@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
  private final ErrorHandlerConfig errorHandlerConfig;

  private final ServerProperties serverProperties;

  @ExceptionHandler(WebResponseErrorException.class)
  public ResponseEntity<ApiResponse> handleWebResponseErrorException(WebResponseErrorException ex) {
    return switch (ex.getStatus()) {
        // Bodyがないステータス、他にも対応したい場合ここに追加
      case NO_CONTENT, ACCEPTED, RESET_CONTENT -> ResponseEntity.status(ex.getStatus()).build();
      default -> ResponseEntity.status(ex.getStatus()).body(ex.getResponse());
    };
  }

  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<Object> handleConstraintViolationException(
      ConstraintViolationException ex, WebRequest request) {
    return handleExceptionInternal(ex, null, HttpHeaders.EMPTY, HttpStatus.BAD_REQUEST, request);
  }

  @Override
  protected ResponseEntity<Object> handleExceptionInternal(
      Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
    if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
      request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
    }
    // デフォルト
    final var response = ResponseEntity.status(status).headers(headers);
    return switch (status) {
        // Contentがないステータス。他のステータスも対応したい場合ここに
      case NO_CONTENT, RESET_CONTENT, ACCEPTED -> response.build();
      default -> response.body(
          ApiResponse.builder()
              .httpStatus(status)
              .result(
                  ResponseResult.builder()
                      .bindingErrors(
                          errorHandlerConfig.getBindingErrors(ex, serverProperties.getError()))
                      .build())
              .message(errorHandlerConfig.getMessage(ex, status, serverProperties.getError()))
              .exception(errorHandlerConfig.getException(ex, serverProperties.getError()))
              .trace(errorHandlerConfig.trace(ex, serverProperties.getError()))
              .build());
    };
  }
}
