package jp.co.okasan.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PrivilegeInquiryDto {
    public PrivilegeInquiryDto() {
        this.issueCd = issueCd;
        this.secShortDescKanji = secShortDescKanji;
        this.couponRateChangeDt = couponRateChangeDt;
        this.couponRate = couponRate;
    }

    public PrivilegeInquiryDto(String issueCd, String secShortDescKanji, LocalDate couponRateChangeDt, Integer couponRate) {
        this.issueCd = issueCd;
        this.secShortDescKanji = secShortDescKanji;
        this.couponRateChangeDt = couponRateChangeDt;
        this.couponRate = couponRate;
    }

    @JsonProperty("issue_cd")
    private String issueCd;
    @JsonProperty("sec_short_desc_kanji")
    private String secShortDescKanji;
    @JsonProperty("coupon_rate_change_dt")
    private LocalDate couponRateChangeDt;
    @JsonProperty("coupon_rate")
    private Integer couponRate;

}
