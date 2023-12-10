package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the BANK_INFO database table. */
@Embeddable
public class BankInfoPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "BANK_CD")
  private int bankCd;

  @Column(name = "BANK_BRANCH_CD")
  private int bankBranchCd;

  public BankInfoPK() {}

  public int getBankCd() {
    return this.bankCd;
  }

  public void setBankCd(int bankCd) {
    this.bankCd = bankCd;
  }

  public int getBankBranchCd() {
    return this.bankBranchCd;
  }

  public void setBankBranchCd(int bankBranchCd) {
    this.bankBranchCd = bankBranchCd;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof BankInfoPK)) {
      return false;
    }
    BankInfoPK castOther = (BankInfoPK) other;
    return (this.bankCd == castOther.bankCd) && (this.bankBranchCd == castOther.bankBranchCd);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.bankCd;
    hash = hash * prime + this.bankBranchCd;

    return hash;
  }
}
