package jp.co.okasan.core.errorhandler.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Value;
import org.springframework.http.HttpStatus;

/** APIのレスポンス */
@Value
@JsonInclude(Include.NON_NULL)
@Builder(toBuilder = true)
@JsonPropertyOrder({ "status", "content" })
public class ApiResponse {

	/** Http Status、設定しない場合 {@link HttpStatus#OK} */
	@JsonIgnore
	private HttpStatus httpStatus;

	private boolean status;

	/** 成功：true, 失敗: false */
	public boolean getStatus() {
		return httpStatus == null || httpStatus.is2xxSuccessful();
	}

	/** レスポンスデータ */
	private ResponseResult result;

	/** 詳細エラーメッセージ：開発用 */
	private	String message;

	/** 例外情報 */
	private	String exception;

	/** 例外情報：開発用 */
	private	String trace;
}
