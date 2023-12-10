package jp.co.okasan.domain.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

import java.time.LocalDate;

@Data
@ConfigurableValidation
public class PrivilegeInquiryRequest {
    @JsonProperty("issue_cd")
    private String issueCd;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonProperty("target_date")
    private LocalDate targetDate;
}
