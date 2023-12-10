package jp.co.okasan.core.errorhandler;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import jp.co.okasan.core.errorhandler.domain.MessageDetail;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.NestedCheckedException;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.core.NestedRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.util.NestedServletException;

/**
 * エラーレスポンス設定
 *
 * <ul>
 *   <li>{@code okasan.common.error-handler.debug = true} なら、開発用の情報までレスポンス
 *   <li>バリデーションエラーなどは {@code application-error.yaml} でデフォルトの値をセットする。同じ設定が欲しい場合Includeしてくだし
 *       <ul>
 *         <li>{@code include-binding-errors: always}
 *         <li>{@code include-exception: false}
 *         <li>{@code include-message: never}
 *         <li>{@code include-stacktrace: never}
 *       </ul>
 * </ul>
 */
@Data
@Component
@ConfigurationProperties(prefix = "okasan.common.error-handler")
@Accessors(chain = true)
public class ErrorHandlerConfig {
  private boolean debug;

  /**
   * 例外のレスポンス取得
   *
   * @param e 例外
   * @param properties サーバーエラー設定
   * @return レスポンスデータ
   */
  public String getException(Throwable e, ErrorProperties properties) {
    if (e == null) {
      return null;
    }
    if (debug) {
      // DEBUGの場合、詳細情報まで返す
      if (e.getCause() == null || e.getCause() == e || isNestedException(e)) {
        return e.getMessage();
      }
      // 参考: NestedExceptionUtils.buildMessage()
      final var sb = new StringBuilder(64);
      if (e.getMessage() != null) {
        sb.append(e.getMessage()).append("; ");
      }
      var cause = e.getCause();
      while (cause != null) {
        sb.append("nested exception is ").append(cause);
        if (isNestedException(cause)) {
          break;
        }
        final var nestedCause = cause.getCause();
        cause = nestedCause != null && nestedCause != cause ? nestedCause : null;
      }
      sb.append("nested exception is ").append(cause);
      return sb.toString();
    }
    if (!properties.isIncludeException()) {
      return null;
    }
    // 本番の場合、クラス名のみ
    final var cause = NestedExceptionUtils.getMostSpecificCause(e);
    if (cause == e) {
      return e.getClass().getName();
    }
    return e.getClass().getName() + "root cause is " + cause.getClass().getName();
  }

  protected boolean isNestedException(Throwable e) {
    return e instanceof NestedServletException
        || e instanceof NestedCheckedException
        || e instanceof NestedRuntimeException;
  }

  public String getField(@NonNull Path path) {
    // TODO
    return path.toString();
  }

  /**
   * Bindingエラーフィールド取得
   *
   * @param references パス
   * @return フィールド名
   */
  public String getField(List<JsonMappingException.Reference> references) {
    if (CollectionUtils.isEmpty(references)) {
      return "";
    }
    final var sb = new StringBuilder();

    for (JsonMappingException.Reference ref : references) {
      if (ref.getFieldName() != null) {
        if (!sb.isEmpty()) {
          sb.append(".");
        }
        sb.append(ref.getFieldName());
        continue;
      }
      if (ref.getIndex() >= 0) {
        sb.append("[").append(ref.getIndex()).append(")");
        continue;
      }
      sb.append("[?]");
    }
    return sb.toString();
  }

  /**
   * エラーメッセ取得
   *
   * @param e 例外
   * @param status ステータス
   * @param properties サーバーエラー設定
   * @return エラーメッセージ
   */
  public String getMessage(Throwable e, HttpStatus status, ErrorProperties properties) {
    if (e == null) {
      return null;
    }
    if (debug) {
      return e.getMessage();
    }
    return properties.getIncludeMessage() == ErrorProperties.IncludeAttribute.NEVER
            || status != HttpStatus.BAD_REQUEST
        ? null
        : e.getMessage();
  }

  /**
   * Bindingエラー（バリデーション・変換など）
   *
   * @param ex 例外
   * @param properties サーバーエラー設定
   * @return レスポンス情報
   */
  public Map<String, List<MessageDetail>> getBindingErrors(
      Throwable ex, ErrorProperties properties) {
    if (ex == null) {
      return null;
    }

    if (debug || properties.getIncludeBindingErrors() == ErrorProperties.IncludeAttribute.ALWAYS) {
      if (ex instanceof BindingResult) {
        return ((BindingResult) ex)
            .getFieldErrors().stream()
                .collect(
                    Collectors.groupingBy(
                        FieldError::getField,
                        Collectors.mapping(
                            f ->
                                MessageDetail.builder()
                                    .rejectedValue(f.getRejectedValue())
                                    .message(f.getDefaultMessage())
                                    .code(f.getCode())
                                    .build(),
                            Collectors.toList())));
      }

      if (ex instanceof MissingServletRequestParameterException) {
        return Map.of(
            ((MissingServletRequestParameterException) ex).getParameterName(),
            List.of(MessageDetail.builder().code("required").message("must not be null").build()));
      }
      final var cause = NestedExceptionUtils.getMostSpecificCause(ex);
      if (cause instanceof final MismatchedInputException e) {
        return Map.of(
            getField(e.getPath()),
            List.of(
                MessageDetail.builder()
                    .code(e.getClass().getSimpleName())
                    .message("should be " + e.getTargetType())
                    .rejectedValue(
                        e instanceof InvalidFormatException
                            ? ((InvalidFormatException) e).getValue()
                            : null)
                    .build()));
      }
      if (cause instanceof final JsonMappingException e) {
        return Map.of(
            getField(e.getPath()),
            List.of(
                MessageDetail.builder()
                    .code(e.getClass().getSimpleName())
                    .message(e.getClass().getSimpleName())
                    .build()));
      }
      if (cause instanceof final ConstraintViolationException e) {
        return e.getConstraintViolations().stream()
            .collect(
                Collectors.groupingBy(
                    v -> getField(v.getPropertyPath()),
                    Collectors.mapping(
                        v ->
                            MessageDetail.builder()
                                .message(v.getMessage())
                                .rejectedValue(v.getInvalidValue())
                                .build(),
                        Collectors.toList())));
      }
    }
    return null;
  }

  /**
   * Trace開発用
   *
   * @param ex 例外
   * @param properties サーバーエラー設定
   * @return レスポンス情報
   */
  public String trace(Throwable ex, ErrorProperties properties) {
    if (ex == null) {
      return null;
    }

    if (debug
        && properties.isIncludeException()
        && properties.getIncludeStacktrace() == ErrorProperties.IncludeAttribute.ALWAYS) {
      final var stackTrace = new StringWriter();
      ex.printStackTrace(new PrintWriter(stackTrace));
      stackTrace.flush();
      return stackTrace.toString();
    }
    return null;
  }
}
