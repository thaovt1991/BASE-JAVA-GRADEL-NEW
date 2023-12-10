package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The primary key class for the NYUSYUKIN_HIST database table. */
@Embeddable
public class NyusyukinHistPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_DATE")
  private java.util.Date inputDate;

  @Column(name = "IN_OUT_CASH_NO")
  private int inOutCashNo;

  public NyusyukinHistPK() {}

  public java.util.Date getInputDate() {
    return this.inputDate;
  }

  public void setInputDate(java.util.Date inputDate) {
    this.inputDate = inputDate;
  }

  public int getInOutCashNo() {
    return this.inOutCashNo;
  }

  public void setInOutCashNo(int inOutCashNo) {
    this.inOutCashNo = inOutCashNo;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof NyusyukinHistPK)) {
      return false;
    }
    NyusyukinHistPK castOther = (NyusyukinHistPK) other;
    return this.inputDate.equals(castOther.inputDate)
        && (this.inOutCashNo == castOther.inOutCashNo);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.inputDate.hashCode();
    hash = hash * prime + this.inOutCashNo;

    return hash;
  }
}
