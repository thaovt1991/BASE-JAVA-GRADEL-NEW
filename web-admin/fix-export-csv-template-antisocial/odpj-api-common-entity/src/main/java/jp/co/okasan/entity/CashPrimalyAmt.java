package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The persistent class for the CASH_PRIMALY_AMT database table. */
@Entity
@Table(name = "CASH_PRIMALY_AMT")
@NamedQuery(name = "CashPrimalyAmt.findAll", query = "SELECT c FROM CashPrimalyAmt c")
public class CashPrimalyAmt implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private CashPrimalyAmtPK id;

  @Temporal(TemporalType.DATE)
  @Column(name = "STD_DT")
  private Date stdDt;

  @Column(name = "SUB_ACCEPT_PREV_BAL")
  private int subAcceptPrevBal;

  @Column(name = "SUB_ACCEPT_TODAY_BAL")
  private int subAcceptTodayBal;

  @Column(name = "SUB_KBN")
  private int subKbn;

  public CashPrimalyAmt() {}

  public CashPrimalyAmtPK getId() {
    return this.id;
  }

  public void setId(CashPrimalyAmtPK id) {
    this.id = id;
  }

  public Date getStdDt() {
    return this.stdDt;
  }

  public void setStdDt(Date stdDt) {
    this.stdDt = stdDt;
  }

  public int getSubAcceptPrevBal() {
    return this.subAcceptPrevBal;
  }

  public void setSubAcceptPrevBal(int subAcceptPrevBal) {
    this.subAcceptPrevBal = subAcceptPrevBal;
  }

  public int getSubAcceptTodayBal() {
    return this.subAcceptTodayBal;
  }

  public void setSubAcceptTodayBal(int subAcceptTodayBal) {
    this.subAcceptTodayBal = subAcceptTodayBal;
  }

  public int getSubKbn() {
    return this.subKbn;
  }

  public void setSubKbn(int subKbn) {
    this.subKbn = subKbn;
  }
}
