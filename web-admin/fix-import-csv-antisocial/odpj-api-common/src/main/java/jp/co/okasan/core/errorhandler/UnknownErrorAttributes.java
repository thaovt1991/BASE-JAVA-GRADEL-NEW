package jp.co.okasan.core.errorhandler;

import java.util.Map;
import java.util.Objects;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

/** 未ハンドリングのエラー対応 */
@Component
@RequiredArgsConstructor
public class UnknownErrorAttributes extends DefaultErrorAttributes {
  private final ErrorHandlerConfig errorHandlerConfig;
  private final ServerProperties serverProperties;

  @Override
  public Map<String, Object> getErrorAttributes(
      WebRequest webRequest, ErrorAttributeOptions options) {
    /** {@link jp.co.okasan.core.errorhandler.domain.ApiResponse} のフォーマットに合わせる */
    final var attributes = super.getErrorAttributes(webRequest, options);
    // 例外
    final var e = getError(webRequest);
    final var httpStatus =
        Objects.equals(HttpStatus.BAD_REQUEST.value(), attributes.get("status"))
            ? HttpStatus.BAD_REQUEST
            : null;
    // ステータス: 失敗
    attributes.put("status", false);
    attributes.put(
        "result",
        ResponseResult.builder()
            .bindingErrors(errorHandlerConfig.getBindingErrors(e, serverProperties.getError()))
            .build());
    attributes.compute(
        "exception",
        (key, old) -> {
          final var exception = errorHandlerConfig.getException(e, serverProperties.getError());
          return exception == null ? old : exception;
        });
    attributes.compute(
        "message",
        (key, old) -> {
          final var msg = errorHandlerConfig.getMessage(e, httpStatus, serverProperties.getError());
          return msg == null ? old : msg;
        });
    attributes.compute("trace", (k, o) -> errorHandlerConfig.trace(e, serverProperties.getError()));

    attributes.remove("error");
    attributes.remove("path");
    attributes.remove("timestamp");
    return attributes;
  }
}
