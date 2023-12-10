package jp.co.okasan.core.errorhandler.domain;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.server.ResponseStatusException;

/**
 * 特定なレスポンスをする場合、この例外を発生する {@code 例: throw new
 * WebResponseErrorException(ApiResponse.builder().httpStatus(HttpStatus.NO_CONTENT)) }
 */
public class WebResponseErrorException extends ResponseStatusException implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = -90371793279899033L;
@Getter private final ApiResponse response;

  /**
   * Constructor
   *
   * @param response レスポンス
   */
  public WebResponseErrorException(@NonNull ApiResponse response, Throwable cause) {
    super(Objects.requireNonNullElse(response.getHttpStatus(), HttpStatus.OK), null, cause);
    this.response = response;
  }

  /**
   * のConstructor
   *
   * @param status 　ステータス
   * @param messages メッセージ
   */
  public WebResponseErrorException(
      @NonNull HttpStatus status, @NonNull List<MessageDetail> messages) {
    this(
        ApiResponse.builder()
            .httpStatus(status)
            .result(ResponseResult.builder().messages(messages).build())
            .build(),
        null);
  }

  /**
   * メッセージ・コードリストのConstructor
   *
   * @param status 　ステータス
   * @param messages メッセージ
   * @param cause メッセージ
   */
  public WebResponseErrorException(
      @NonNull HttpStatus status, @NonNull List<MessageDetail> messages, Throwable cause) {
    this(
        ApiResponse.builder()
            .httpStatus(status)
            .result(ResponseResult.builder().messages(messages).build())
            .build(),
        cause);
  }

  /**
   * メッセージ・コードリストのConstructor
   *
   * @param cause
   * @param messages メッセージ
   */
  public WebResponseErrorException(
      @NonNull HttpStatus status, Throwable cause, MessageDetail... messages) {
    this(status, messages == null ? Collections.emptyList() : List.of(messages), cause);
  }
}
