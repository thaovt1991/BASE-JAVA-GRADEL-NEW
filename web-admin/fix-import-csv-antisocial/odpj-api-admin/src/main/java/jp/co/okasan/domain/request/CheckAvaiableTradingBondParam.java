package jp.co.okasan.domain.request;

import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ConfigurableValidation
public class CheckAvaiableTradingBondParam {

    private Integer clientCdOut;
    private Integer clientCdIn;
    private Integer marketCd;

}
