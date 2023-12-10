package jp.co.okasan.search;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class FundPriceSearchCriteria extends AbstractSearchCriteria {
    @JsonProperty("issueCd")
    private String issueCd;

    @JsonProperty("stdStartDt")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date stdStartDt;

    @JsonProperty("stdEndDt")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date stdEndDt;

    public FundPriceSearchCriteria() {
        super("id.issueCd");
    }
}
