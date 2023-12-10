package jp.co.okasan.exception;

import lombok.Getter;

@Getter
public class OkasanHttpException extends RuntimeException {

  private final String code;

  public OkasanHttpException(String code) {
    this.code = code;
  }

  public OkasanHttpException(String code, String message) {
    super(message);
    this.code = code;
  }
}
