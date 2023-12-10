package jp.co.okasan.core.errorhandler.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Value;

@Value @JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(toBuilder = true)
public class MessageDetail {
  String code;
  String message;
  Object rejectedValue;
}
