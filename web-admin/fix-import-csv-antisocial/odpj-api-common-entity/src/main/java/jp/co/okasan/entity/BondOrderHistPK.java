package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The primary key class for the BOND_ORDER_HIST database table. */
@Embeddable
public class BondOrderHistPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_DATE")
  private java.util.Date inputDate;

  @Column(name = "ORDER_NO")
  private int orderNo;

  public BondOrderHistPK() {}

  public java.util.Date getInputDate() {
    return this.inputDate;
  }

  public void setInputDate(java.util.Date inputDate) {
    this.inputDate = inputDate;
  }

  public int getOrderNo() {
    return this.orderNo;
  }

  public void setOrderNo(int orderNo) {
    this.orderNo = orderNo;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof BondOrderHistPK)) {
      return false;
    }
    BondOrderHistPK castOther = (BondOrderHistPK) other;
    return this.inputDate.equals(castOther.inputDate) && (this.orderNo == castOther.orderNo);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.inputDate.hashCode();
    hash = hash * prime + this.orderNo;

    return hash;
  }
}
