package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the TRANSFER_COM database table. */
@Entity
@Table(name = "TRANSFER_COM")
@NamedQuery(name = "TransferCom.findAll", query = "SELECT t FROM TransferCom t")
public class TransferCom implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "AMOUNT_FROM")
  private int amountFrom;

  @Column(name = "AMOUNT_TO")
  private int amountTo;

  @Column(name = "COMMISSION")
  private int commission;

  public TransferCom() {}

  public int getAmountFrom() {
    return this.amountFrom;
  }

  public void setAmountFrom(int amountFrom) {
    this.amountFrom = amountFrom;
  }

  public int getAmountTo() {
    return this.amountTo;
  }

  public void setAmountTo(int amountTo) {
    this.amountTo = amountTo;
  }

  public int getCommission() {
    return this.commission;
  }

  public void setCommission(int commission) {
    this.commission = commission;
  }
}
