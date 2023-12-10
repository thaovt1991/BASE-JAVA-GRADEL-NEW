package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the FUND_COMMISSION database table. */
@Entity
@Table(name = "FUND_COMMISSION")
@NamedQuery(name = "FundCommission.findAll", query = "SELECT f FROM FundCommission f")
public class FundCommission implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private FundCommissionPK id;

  @Column(name = "COMM_FRAME_KBN")
  private int commFrameKbn;

  @Column(name = "COMM_PRICE_KBN")
  private int commPriceKbn;

  @Column(name = "COMM_RATE")
  private int commRate;

  @Column(name = "COMM_RATE_KBN")
  private int commRateKbn;

  @Column(name = "STD_SHARE")
  private int stdShare;

  @Column(name = "TO_AMT")
  private int toAmt;

  public FundCommission() {}

  public FundCommissionPK getId() {
    return this.id;
  }

  public void setId(FundCommissionPK id) {
    this.id = id;
  }

  public int getCommFrameKbn() {
    return this.commFrameKbn;
  }

  public void setCommFrameKbn(int commFrameKbn) {
    this.commFrameKbn = commFrameKbn;
  }

  public int getCommPriceKbn() {
    return this.commPriceKbn;
  }

  public void setCommPriceKbn(int commPriceKbn) {
    this.commPriceKbn = commPriceKbn;
  }

  public int getCommRate() {
    return this.commRate;
  }

  public void setCommRate(int commRate) {
    this.commRate = commRate;
  }

  public int getCommRateKbn() {
    return this.commRateKbn;
  }

  public void setCommRateKbn(int commRateKbn) {
    this.commRateKbn = commRateKbn;
  }

  public int getStdShare() {
    return this.stdShare;
  }

  public void setStdShare(int stdShare) {
    this.stdShare = stdShare;
  }

  public int getToAmt() {
    return this.toAmt;
  }

  public void setToAmt(int toAmt) {
    this.toAmt = toAmt;
  }
}
