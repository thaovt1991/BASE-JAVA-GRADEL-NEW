package jp.co.okasan.config;

import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.exception.OkasanHttpException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

@RestControllerAdvice
@Slf4j
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  private final MessageConverter messageConverter;

  public RestResponseEntityExceptionHandler(MessageConverter messageConverter) {
    this.messageConverter = messageConverter;
  }

  @ExceptionHandler({Exception.class})
  public ResponseEntity<Object> handleException(Exception ex) {
    log.error(ex.getMessage(), ex);
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(
            ApiResponse.builder()
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                .result(
                    ResponseResult.builder()
                        .messages(
                            List.of(
                                MessageDetail.builder()
                                    .code("-1")
                                    .message("Internal Error")
                                    .build()))
                        .build())
                .build());
  }

  @ExceptionHandler(OkasanHttpException.class)
  public ResponseEntity<?> handleOkasanException(OkasanHttpException e) {
    log.error("OkasanHttpException: {}: {}", e.toString(), e.getMessage());
    String code = e.getCode();
    log.error(e.getMessage(), e);
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(
            ApiResponse.builder()
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                .exception(e.toString())
                .result(
                    ResponseResult.builder()
                        .messages(List.of(messageConverter.convert(code)))
                        .build())
                .build());
  }
}
