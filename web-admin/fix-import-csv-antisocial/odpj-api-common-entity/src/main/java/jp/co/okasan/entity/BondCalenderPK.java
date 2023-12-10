package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The primary key class for the BOND_CALENDER database table. */
@Embeddable
public class BondCalenderPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "COUNTRY_CD")
  private String countryCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "STD_DT")
  private java.util.Date stdDt;

  public BondCalenderPK() {}

  public String getCountryCd() {
    return this.countryCd;
  }

  public void setCountryCd(String countryCd) {
    this.countryCd = countryCd;
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
    if (!(other instanceof BondCalenderPK)) {
      return false;
    }
    BondCalenderPK castOther = (BondCalenderPK) other;
    return this.countryCd.equals(castOther.countryCd) && this.stdDt.equals(castOther.stdDt);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.countryCd.hashCode();
    hash = hash * prime + this.stdDt.hashCode();

    return hash;
  }
}
