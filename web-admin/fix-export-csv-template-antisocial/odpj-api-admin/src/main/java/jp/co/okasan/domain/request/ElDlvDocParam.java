package jp.co.okasan.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@ConfigurableValidation
public class ElDlvDocParam {

    private String documentCd;

    private String elecDocFileTypeNm;

    private String elecDocFilepass;

    private String dateSettingFlg;

    private Integer validFlg;
   
    private Date inputTm;
}
