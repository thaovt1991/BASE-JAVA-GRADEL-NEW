package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/** The primary key class for the FUND_PRICE database table. */
@Embeddable
@Data
public class FundPricePK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "STD_DT")
  private java.util.Date stdDt;

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof FundPricePK)) {
      return false;
    }
    FundPricePK castOther = (FundPricePK) other;
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
