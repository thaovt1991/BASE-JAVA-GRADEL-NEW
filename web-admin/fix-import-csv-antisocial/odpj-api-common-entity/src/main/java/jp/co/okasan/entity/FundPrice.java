package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

/** The persistent class for the FUND_PRICE database table. */
@Entity
@Data
@Table(name = "FUND_PRICE")
@NamedQuery(name = "FundPrice.findAll", query = "SELECT f FROM FundPrice f")
public class FundPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private jp.co.okasan.entity.FundPricePK id;

  @Column(name = "AVG_TRUST_PRICE")
  private int avgTrustPrice;

  @Column(name = "AVG_TRUST_PRICE_DIFF")
  private int avgTrustPriceDiff;

  @Column(name = "BUY_PRICE")
  private int buyPrice;

  @Column(name = "BUY_PRICE_DIFF")
  private int buyPriceDiff;

  @Column(name = "BUYBACK_PRICE")
  private int buybackPrice;

  @Column(name = "BUYBACK_PRICE_DIFF")
  private int buybackPriceDiff;

  @Column(name = "DIVIDEND_PRICE")
  private int dividendPrice;

  @Column(name = "DIVIDEND_PRICE_DIFF")
  private int dividendPriceDiff;

  @Column(name = "MEIGARA_NM_DISP")
  private String meigaraNmDisp;

  @Column(name = "SELL_BUY_PRICE")
  private int sellBuyPrice;

  @Column(name = "SELL_BUY_PRICE_DIFF")
  private int sellBuyPriceDiff;

  @Column(name = "SELL_PRICE")
  private int sellPrice;

  @Column(name = "SELL_PRICE_DIFF")
  private int sellPriceDiff;

  @Column(name = "STD_PRICE")
  private int stdPrice;

  @Column(name = "STD_PRICE_DIFF")
  private int stdPriceDiff;
}
