package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the FUND_COMMISSION database table. */
@Embeddable
public class FundCommissionPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "IT_COMM_KBN")
  private int itCommKbn;

  @Column(name = "IT_STEP_KBN")
  private int itStepKbn;

  @Column(name = "FROM_AMT")
  private int fromAmt;

  public FundCommissionPK() {}

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public int getItCommKbn() {
    return this.itCommKbn;
  }

  public void setItCommKbn(int itCommKbn) {
    this.itCommKbn = itCommKbn;
  }

  public int getItStepKbn() {
    return this.itStepKbn;
  }

  public void setItStepKbn(int itStepKbn) {
    this.itStepKbn = itStepKbn;
  }

  public int getFromAmt() {
    return this.fromAmt;
  }

  public void setFromAmt(int fromAmt) {
    this.fromAmt = fromAmt;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof FundCommissionPK)) {
      return false;
    }
    FundCommissionPK castOther = (FundCommissionPK) other;
    return this.issueCd.equals(castOther.issueCd)
        && (this.itCommKbn == castOther.itCommKbn)
        && (this.itStepKbn == castOther.itStepKbn)
        && (this.fromAmt == castOther.fromAmt);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.issueCd.hashCode();
    hash = hash * prime + this.itCommKbn;
    hash = hash * prime + this.itStepKbn;
    hash = hash * prime + this.fromAmt;

    return hash;
  }
}
