package jp.co.okasan.domain.response;

import com.univocity.parsers.annotations.Parsed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FundPriceCsvResponse {
    @Parsed
    private String issueCd;

    @Parsed
    private java.util.Date stdDt;

    @Parsed
    private int avgTrustPrice;

    @Parsed
    private int avgTrustPriceDiff;

    @Parsed
    private int buyPrice;

    @Parsed
    private int buyPriceDiff;

    @Parsed
    private int buybackPrice;

    @Parsed
    private int buybackPriceDiff;

    @Parsed
    private int dividendPrice;

    @Parsed
    private int dividendPriceDiff;

    @Parsed
    private String meigaraNmDisp;

    @Parsed
    private int sellBuyPrice;

    @Parsed
    private int sellBuyPriceDiff;

    @Parsed
    private int sellPrice;

    @Parsed
    private int sellPriceDiff;

    @Parsed
    private int stdPrice;

    @Parsed
    private int stdPriceDiff;
}
