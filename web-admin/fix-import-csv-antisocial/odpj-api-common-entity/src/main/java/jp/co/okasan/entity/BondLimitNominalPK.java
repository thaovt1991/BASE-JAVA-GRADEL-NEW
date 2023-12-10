package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the BOND_LIMIT_NOMINAL database table. */
@Embeddable
public class BondLimitNominalPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "SUB_KBN")
  private int subKbn;

  public BondLimitNominalPK() {}

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public int getSubKbn() {
    return this.subKbn;
  }

  public void setSubKbn(int subKbn) {
    this.subKbn = subKbn;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof BondLimitNominalPK)) {
      return false;
    }
    BondLimitNominalPK castOther = (BondLimitNominalPK) other;
    return this.issueCd.equals(castOther.issueCd) && (this.subKbn == castOther.subKbn);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.issueCd.hashCode();
    hash = hash * prime + this.subKbn;

    return hash;
  }
}
