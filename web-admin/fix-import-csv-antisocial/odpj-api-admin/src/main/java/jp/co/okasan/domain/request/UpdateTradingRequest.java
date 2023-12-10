package jp.co.okasan.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
public class UpdateTradingRequest {

	@JsonProperty("dscr_cd")
	private String dscrCd;
	@JsonProperty("client_cd_1")
	private Integer clientCd1;
	@JsonProperty("client_cd_2")
	private Integer clientCd2;
	@JsonProperty("sp_acc_kbn")
	private Integer spAccKbn;

}
