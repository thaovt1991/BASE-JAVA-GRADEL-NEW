package jp.co.okasan.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class UpdateFundDividendPrice {

    @JsonProperty("issueCd")
    private String issueCd;

    @JsonProperty("stdDt")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stdDt =  new Date();

    @NotNull
    @JsonProperty("dividendPrice")
    private Integer dividendPrice;

}
