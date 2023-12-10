package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the TOTAL_RETURN database table. */
@Entity
@Table(name = "TOTAL_RETURN")
@NamedQuery(name = "TotalReturn.findAll", query = "SELECT t FROM TotalReturn t")
public class TotalReturn implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "BUY_AMT")
  private int buyAmt;

  @Column(name = "CAL_BASE_DT")
  private String calBaseDt;

  @Column(name = "CAL_START_DT")
  private String calStartDt;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DIVIDEND_AMT")
  private int dividendAmt;

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "MARKET_VALUE")
  private int marketValue;

  @Column(name = "NOMINAL")
  private int nominal;

  @Column(name = "REINVEST_BUY_AMT")
  private int reinvestBuyAmt;

  @Column(name = "REINVEST_DIVIDEND_AMT")
  private String reinvestDividendAmt;

  @Column(name = "SELL_AMT")
  private int sellAmt;

  @Column(name = "SP_ACC_KBN")
  private int spAccKbn;

  @Column(name = "TOTAL_RETURN_AMT")
  private int totalReturnAmt;

  @Column(name = "TOTAL_RETURN_FIT_TYP")
  private int totalReturnFitTyp;

  public TotalReturn() {}

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getBuyAmt() {
    return this.buyAmt;
  }

  public void setBuyAmt(int buyAmt) {
    this.buyAmt = buyAmt;
  }

  public String getCalBaseDt() {
    return this.calBaseDt;
  }

  public void setCalBaseDt(String calBaseDt) {
    this.calBaseDt = calBaseDt;
  }

  public String getCalStartDt() {
    return this.calStartDt;
  }

  public void setCalStartDt(String calStartDt) {
    this.calStartDt = calStartDt;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public int getDividendAmt() {
    return this.dividendAmt;
  }

  public void setDividendAmt(int dividendAmt) {
    this.dividendAmt = dividendAmt;
  }

  public int getDoFoClassKbn() {
    return this.doFoClassKbn;
  }

  public void setDoFoClassKbn(int doFoClassKbn) {
    this.doFoClassKbn = doFoClassKbn;
  }

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public int getMarketValue() {
    return this.marketValue;
  }

  public void setMarketValue(int marketValue) {
    this.marketValue = marketValue;
  }

  public int getNominal() {
    return this.nominal;
  }

  public void setNominal(int nominal) {
    this.nominal = nominal;
  }

  public int getReinvestBuyAmt() {
    return this.reinvestBuyAmt;
  }

  public void setReinvestBuyAmt(int reinvestBuyAmt) {
    this.reinvestBuyAmt = reinvestBuyAmt;
  }

  public String getReinvestDividendAmt() {
    return this.reinvestDividendAmt;
  }

  public void setReinvestDividendAmt(String reinvestDividendAmt) {
    this.reinvestDividendAmt = reinvestDividendAmt;
  }

  public int getSellAmt() {
    return this.sellAmt;
  }

  public void setSellAmt(int sellAmt) {
    this.sellAmt = sellAmt;
  }

  public int getSpAccKbn() {
    return this.spAccKbn;
  }

  public void setSpAccKbn(int spAccKbn) {
    this.spAccKbn = spAccKbn;
  }

  public int getTotalReturnAmt() {
    return this.totalReturnAmt;
  }

  public void setTotalReturnAmt(int totalReturnAmt) {
    this.totalReturnAmt = totalReturnAmt;
  }

  public int getTotalReturnFitTyp() {
    return this.totalReturnFitTyp;
  }

  public void setTotalReturnFitTyp(int totalReturnFitTyp) {
    this.totalReturnFitTyp = totalReturnFitTyp;
  }
}
