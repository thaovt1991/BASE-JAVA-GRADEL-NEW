package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The primary key class for the ELT_REPORT database table. */
@Embeddable
public class EltReportPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_DT")
  private java.util.Date createDt;

  @Column(name = "REPORT_TYP")
  private int reportTyp;

  public EltReportPK() {}

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

  public java.util.Date getCreateDt() {
    return this.createDt;
  }

  public void setCreateDt(java.util.Date createDt) {
    this.createDt = createDt;
  }

  public int getReportTyp() {
    return this.reportTyp;
  }

  public void setReportTyp(int reportTyp) {
    this.reportTyp = reportTyp;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof EltReportPK)) {
      return false;
    }
    EltReportPK castOther = (EltReportPK) other;
    return (this.branchCd == castOther.branchCd)
        && (this.customerCd == castOther.customerCd)
        && this.createDt.equals(castOther.createDt)
        && (this.reportTyp == castOther.reportTyp);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.branchCd;
    hash = hash * prime + this.customerCd;
    hash = hash * prime + this.createDt.hashCode();
    hash = hash * prime + this.reportTyp;

    return hash;
  }
}
