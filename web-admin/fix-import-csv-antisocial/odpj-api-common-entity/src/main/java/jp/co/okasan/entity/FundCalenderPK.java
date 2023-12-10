package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The primary key class for the FUND_CALENDER database table. */
@Embeddable
public class FundCalenderPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "STD_DT")
  private java.util.Date stdDt;

  public FundCalenderPK() {}

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public java.util.Date getStdDt() {
    return this.stdDt;
  }

  public void setStdDt(java.util.Date stdDt) {
    this.stdDt = stdDt;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof FundCalenderPK)) {
      return false;
    }
    FundCalenderPK castOther = (FundCalenderPK) other;
    return this.issueCd.equals(castOther.issueCd) && this.stdDt.equals(castOther.stdDt);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.issueCd.hashCode();
    hash = hash * prime + this.stdDt.hashCode();

    return hash;
  }
}
