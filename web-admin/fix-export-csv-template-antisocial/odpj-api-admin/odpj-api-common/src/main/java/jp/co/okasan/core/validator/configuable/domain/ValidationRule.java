package jp.co.okasan.core.validator.configuable.domain;

import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import lombok.SneakyThrows;

/** バリデーションルール */
public class ValidationRule extends LinkedHashMap<String, String> {
  /** バリデーション用の */
  @SneakyThrows
  @SuppressWarnings("unchecked")
  public <T extends Annotation> Class<T> getAnnotation() {
    return (Class<T>) Class.forName(get("annotation"));
  }

  /** メッセージ */
  public String getMessage() {
    return get("message");
  }
}
