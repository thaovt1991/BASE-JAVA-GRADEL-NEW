package jp.co.okasan.core.errorhandler.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Value;

@Value @JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(toBuilder = true)
public class ResponseResult {

  /** 成功の時のデータ */
  @JsonUnwrapped Object data;

  /** バリデーションエラー・変換エラーなど｛field:[エラー情報]｝ */
  Map<String, List<MessageDetail>> bindingErrors;

  /** 一般エラー */
  List<MessageDetail> messages;
}
