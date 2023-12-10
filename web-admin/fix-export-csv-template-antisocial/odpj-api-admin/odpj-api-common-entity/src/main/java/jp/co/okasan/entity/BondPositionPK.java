package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the BOND_POSITION database table. */
@Embeddable
public class BondPositionPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  public BondPositionPK() {}

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

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof BondPositionPK)) {
      return false;
    }
    BondPositionPK castOther = (BondPositionPK) other;
    return (this.branchCd == castOther.branchCd)
        && (this.customerCd == castOther.customerCd)
        && this.issueCd.equals(castOther.issueCd);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.branchCd;
    hash = hash * prime + this.customerCd;
    hash = hash * prime + this.issueCd.hashCode();

    return hash;
  }
}
