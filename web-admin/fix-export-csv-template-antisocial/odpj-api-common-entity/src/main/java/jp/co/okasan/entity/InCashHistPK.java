package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The primary key class for the IN_CASH_HIST database table. */
@Embeddable
public class InCashHistPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Temporal(TemporalType.DATE)
  @Column(name = "FILE_PROC_TM")
  private java.util.Date fileProcTm;

  @Column(name = "IN_CASH_NO")
  private int inCashNo;

  public InCashHistPK() {}

  public java.util.Date getFileProcTm() {
    return this.fileProcTm;
  }

  public void setFileProcTm(java.util.Date fileProcTm) {
    this.fileProcTm = fileProcTm;
  }

  public int getInCashNo() {
    return this.inCashNo;
  }

  public void setInCashNo(int inCashNo) {
    this.inCashNo = inCashNo;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof InCashHistPK)) {
      return false;
    }
    InCashHistPK castOther = (InCashHistPK) other;
    return this.fileProcTm.equals(castOther.fileProcTm) && (this.inCashNo == castOther.inCashNo);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.fileProcTm.hashCode();
    hash = hash * prime + this.inCashNo;

    return hash;
  }
}
