package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the CASH_PRIMALY_AMT database table. */
@Embeddable
public class CashPrimalyAmtPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  public CashPrimalyAmtPK() {}

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof CashPrimalyAmtPK)) {
      return false;
    }
    CashPrimalyAmtPK castOther = (CashPrimalyAmtPK) other;
    return (this.branchCd == castOther.branchCd) && (this.customerCd == castOther.customerCd);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.branchCd;
    hash = hash * prime + this.customerCd;

    return hash;
  }
}
