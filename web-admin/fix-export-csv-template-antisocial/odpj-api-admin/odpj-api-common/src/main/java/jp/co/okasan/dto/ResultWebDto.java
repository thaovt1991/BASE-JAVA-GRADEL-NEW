package jp.co.okasan.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@SuperBuilder
public class ResultWebDto {

  @JsonIgnore HttpStatus httpStatus;

  boolean status;

  /** 成功：true,　失敗: false */
  public boolean getStatus() {
    return httpStatus == null || httpStatus.is2xxSuccessful();
  }

  /** レスポンスデータ */
  ResponseResult result;
}
