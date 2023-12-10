package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the SERIVICE_CONTROL database table. */
@Entity
@Table(name = "SERIVICE_CONTROL")
@NamedQuery(name = "SeriviceControl.findAll", query = "SELECT s FROM SeriviceControl s")
public class SeriviceControl implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "ACC_OPEN_SEND_END_STS")
  private int accOpenSendEndSts;

  @Column(name = "BRANCH_CD_DIGIT")
  private int branchCdDigit;

  @Column(name = "CLIENT_CD_DIGIT")
  private int clientCdDigit;

  @Id
  @Column(name = "CONTROL_NO")
  private int controlNo;

  @Column(name = "EBILLING_MAX_AMT")
  private int ebillingMaxAmt;

  @Column(name = "EBILLING_STOP_FLG")
  private int ebillingStopFlg;

  @Column(name = "FLG_FOR_STD_PRC")
  private int flgForStdPrc;

  @Column(name = "FOP_FLG_FOR_STD_PRC")
  private int fopFlgForStdPrc;

  @Column(name = "LOGIN_ID_DIGIT")
  private int loginIdDigit;

  @Column(name = "LOGIN_PASSWD_DIGIT")
  private int loginPasswdDigit;

  @Column(name = "MARKET_EXEC_END_STS")
  private int marketExecEndSts;

  @Column(name = "MAX_VALUE_AMT")
  private int maxValueAmt;

  @Column(name = "NYUUKIN_LIMIT_AMT")
  private int nyuukinLimitAmt;

  @Column(name = "NYUUKIN_STS")
  private int nyuukinSts;

  @Column(name = "OFFSET_PROCESS_STS")
  private int offsetProcessSts;

  @Column(name = "ONLINE_FAILURE_FLG")
  private int onlineFailureFlg;

  @Column(name = "OUT_CASH_EXAM_END_STS")
  private int outCashExamEndSts;

  @Column(name = "OUT_CASH_LOWEST_AMT")
  private int outCashLowestAmt;

  @Column(name = "PIN_NO_DIGIT")
  private int pinNoDigit;

  @Column(name = "TRADE_MAX_AGE")
  private int tradeMaxAge;

  @Column(name = "TRADE_MIN_AGE")
  private int tradeMinAge;

  @Column(name = "USER_PASSWD_EXPIRE_DAYS")
  private int userPasswdExpireDays;

  public SeriviceControl() {}

  public int getAccOpenSendEndSts() {
    return this.accOpenSendEndSts;
  }

  public void setAccOpenSendEndSts(int accOpenSendEndSts) {
    this.accOpenSendEndSts = accOpenSendEndSts;
  }

  public int getBranchCdDigit() {
    return this.branchCdDigit;
  }

  public void setBranchCdDigit(int branchCdDigit) {
    this.branchCdDigit = branchCdDigit;
  }

  public int getClientCdDigit() {
    return this.clientCdDigit;
  }

  public void setClientCdDigit(int clientCdDigit) {
    this.clientCdDigit = clientCdDigit;
  }

  public int getControlNo() {
    return this.controlNo;
  }

  public void setControlNo(int controlNo) {
    this.controlNo = controlNo;
  }

  public int getEbillingMaxAmt() {
    return this.ebillingMaxAmt;
  }

  public void setEbillingMaxAmt(int ebillingMaxAmt) {
    this.ebillingMaxAmt = ebillingMaxAmt;
  }

  public int getEbillingStopFlg() {
    return this.ebillingStopFlg;
  }

  public void setEbillingStopFlg(int ebillingStopFlg) {
    this.ebillingStopFlg = ebillingStopFlg;
  }

  public int getFlgForStdPrc() {
    return this.flgForStdPrc;
  }

  public void setFlgForStdPrc(int flgForStdPrc) {
    this.flgForStdPrc = flgForStdPrc;
  }

  public int getFopFlgForStdPrc() {
    return this.fopFlgForStdPrc;
  }

  public void setFopFlgForStdPrc(int fopFlgForStdPrc) {
    this.fopFlgForStdPrc = fopFlgForStdPrc;
  }

  public int getLoginIdDigit() {
    return this.loginIdDigit;
  }

  public void setLoginIdDigit(int loginIdDigit) {
    this.loginIdDigit = loginIdDigit;
  }

  public int getLoginPasswdDigit() {
    return this.loginPasswdDigit;
  }

  public void setLoginPasswdDigit(int loginPasswdDigit) {
    this.loginPasswdDigit = loginPasswdDigit;
  }

  public int getMarketExecEndSts() {
    return this.marketExecEndSts;
  }

  public void setMarketExecEndSts(int marketExecEndSts) {
    this.marketExecEndSts = marketExecEndSts;
  }

  public int getMaxValueAmt() {
    return this.maxValueAmt;
  }

  public void setMaxValueAmt(int maxValueAmt) {
    this.maxValueAmt = maxValueAmt;
  }

  public int getNyuukinLimitAmt() {
    return this.nyuukinLimitAmt;
  }

  public void setNyuukinLimitAmt(int nyuukinLimitAmt) {
    this.nyuukinLimitAmt = nyuukinLimitAmt;
  }

  public int getNyuukinSts() {
    return this.nyuukinSts;
  }

  public void setNyuukinSts(int nyuukinSts) {
    this.nyuukinSts = nyuukinSts;
  }

  public int getOffsetProcessSts() {
    return this.offsetProcessSts;
  }

  public void setOffsetProcessSts(int offsetProcessSts) {
    this.offsetProcessSts = offsetProcessSts;
  }

  public int getOnlineFailureFlg() {
    return this.onlineFailureFlg;
  }

  public void setOnlineFailureFlg(int onlineFailureFlg) {
    this.onlineFailureFlg = onlineFailureFlg;
  }

  public int getOutCashExamEndSts() {
    return this.outCashExamEndSts;
  }

  public void setOutCashExamEndSts(int outCashExamEndSts) {
    this.outCashExamEndSts = outCashExamEndSts;
  }

  public int getOutCashLowestAmt() {
    return this.outCashLowestAmt;
  }

  public void setOutCashLowestAmt(int outCashLowestAmt) {
    this.outCashLowestAmt = outCashLowestAmt;
  }

  public int getPinNoDigit() {
    return this.pinNoDigit;
  }

  public void setPinNoDigit(int pinNoDigit) {
    this.pinNoDigit = pinNoDigit;
  }

  public int getTradeMaxAge() {
    return this.tradeMaxAge;
  }

  public void setTradeMaxAge(int tradeMaxAge) {
    this.tradeMaxAge = tradeMaxAge;
  }

  public int getTradeMinAge() {
    return this.tradeMinAge;
  }

  public void setTradeMinAge(int tradeMinAge) {
    this.tradeMinAge = tradeMinAge;
  }

  public int getUserPasswdExpireDays() {
    return this.userPasswdExpireDays;
  }

  public void setUserPasswdExpireDays(int userPasswdExpireDays) {
    this.userPasswdExpireDays = userPasswdExpireDays;
  }
}
