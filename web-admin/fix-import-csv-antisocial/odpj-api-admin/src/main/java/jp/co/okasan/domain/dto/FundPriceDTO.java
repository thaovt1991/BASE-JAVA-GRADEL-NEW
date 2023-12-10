package jp.co.okasan.domain.dto;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;


/**
 * The persistent class for the FUND_PRICE database table.
 */
@Entity
@Data
public class FundPriceDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private FundPricePKDTO id;

    private int avgTrustPrice;

    private int avgTrustPriceDiff;

    private int buyPrice;

    private int buyPriceDiff;

    private int buybackPrice;

    private int buybackPriceDiff;

    private int dividendPrice;

    private int dividendPriceDiff;

    private String meigaraNmDisp;

    private int sellBuyPrice;

    private int sellBuyPriceDiff;

    private int sellPrice;

    private int sellPriceDiff;

    private int stdPrice;

    private int stdPriceDiff;

}
