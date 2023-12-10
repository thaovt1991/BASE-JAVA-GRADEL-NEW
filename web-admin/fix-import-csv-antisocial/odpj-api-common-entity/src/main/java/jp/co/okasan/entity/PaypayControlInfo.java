package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The persistent class for the PAYPAY_CONTROL_INFO database table. */
@Entity
@Table(name = "PAYPAY_CONTROL_INFO")
@NamedQuery(name = "PaypayControlInfo.findAll", query = "SELECT p FROM PaypayControlInfo p")
public class PaypayControlInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "BANK_CD")
  private int bankCd;

  @Column(name = "BANK_CONECT_ROUTE_KBN")
  private int bankConectRouteKbn;

  @Column(name = "BANK_CONECT_STS")
  private int bankConectSts;

  @Column(name = "COMPANY_IN_CASH_END_HM")
  private String companyInCashEndHm;

  @Column(name = "COMPANY_IN_CASH_START_HM")
  private String companyInCashStartHm;

  @Column(name = "CON_TIMEOUT_TM")
  private int conTimeoutTm;

  @Column(name = "CONNECT_CNT")
  private int connectCnt;

  @Column(name = "CONTRACT_SERVICE_KBN")
  private int contractServiceKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_TM")
  private Date createTm;

  @Column(name = "CREATE_USER_ID")
  private int createUserId;

  @Column(name = "DELETE_FLG")
  private int deleteFlg;

  @Column(name = "GET_CNT")
  private int getCnt;

  @Column(name = "IN_CASH_PROCESS_END_HM")
  private String inCashProcessEndHm;

  @Column(name = "IN_CASH_PROCESS_SLEEP_TM")
  private int inCashProcessSleepTm;

  @Column(name = "`IN_CASH_PROCESS_START _HM`")
  private String inCashProcessStart_Hm;

  @Column(name = "MSG_TIMEOUT_TM")
  private int msgTimeoutTm;

  @Column(name = "RETRY_ALLOWANCE_CNT")
  private int retryAllowanceCnt;

  @Column(name = "RETRY_WAIT_TM")
  private int retryWaitTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_TM")
  private Date updateTm;

  @Column(name = "UPDATE_USER_ID")
  private int updateUserId;

  public PaypayControlInfo() {}

  public int getBankCd() {
    return this.bankCd;
  }

  public void setBankCd(int bankCd) {
    this.bankCd = bankCd;
  }

  public int getBankConectRouteKbn() {
    return this.bankConectRouteKbn;
  }

  public void setBankConectRouteKbn(int bankConectRouteKbn) {
    this.bankConectRouteKbn = bankConectRouteKbn;
  }

  public int getBankConectSts() {
    return this.bankConectSts;
  }

  public void setBankConectSts(int bankConectSts) {
    this.bankConectSts = bankConectSts;
  }

  public String getCompanyInCashEndHm() {
    return this.companyInCashEndHm;
  }

  public void setCompanyInCashEndHm(String companyInCashEndHm) {
    this.companyInCashEndHm = companyInCashEndHm;
  }

  public String getCompanyInCashStartHm() {
    return this.companyInCashStartHm;
  }

  public void setCompanyInCashStartHm(String companyInCashStartHm) {
    this.companyInCashStartHm = companyInCashStartHm;
  }

  public int getConTimeoutTm() {
    return this.conTimeoutTm;
  }

  public void setConTimeoutTm(int conTimeoutTm) {
    this.conTimeoutTm = conTimeoutTm;
  }

  public int getConnectCnt() {
    return this.connectCnt;
  }

  public void setConnectCnt(int connectCnt) {
    this.connectCnt = connectCnt;
  }

  public int getContractServiceKbn() {
    return this.contractServiceKbn;
  }

  public void setContractServiceKbn(int contractServiceKbn) {
    this.contractServiceKbn = contractServiceKbn;
  }

  public Date getCreateTm() {
    return this.createTm;
  }

  public void setCreateTm(Date createTm) {
    this.createTm = createTm;
  }

  public int getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(int createUserId) {
    this.createUserId = createUserId;
  }

  public int getDeleteFlg() {
    return this.deleteFlg;
  }

  public void setDeleteFlg(int deleteFlg) {
    this.deleteFlg = deleteFlg;
  }

  public int getGetCnt() {
    return this.getCnt;
  }

  public void setGetCnt(int getCnt) {
    this.getCnt = getCnt;
  }

  public String getInCashProcessEndHm() {
    return this.inCashProcessEndHm;
  }

  public void setInCashProcessEndHm(String inCashProcessEndHm) {
    this.inCashProcessEndHm = inCashProcessEndHm;
  }

  public int getInCashProcessSleepTm() {
    return this.inCashProcessSleepTm;
  }

  public void setInCashProcessSleepTm(int inCashProcessSleepTm) {
    this.inCashProcessSleepTm = inCashProcessSleepTm;
  }

  public String getInCashProcessStart_Hm() {
    return this.inCashProcessStart_Hm;
  }

  public void setInCashProcessStart_Hm(String inCashProcessStart_Hm) {
    this.inCashProcessStart_Hm = inCashProcessStart_Hm;
  }

  public int getMsgTimeoutTm() {
    return this.msgTimeoutTm;
  }

  public void setMsgTimeoutTm(int msgTimeoutTm) {
    this.msgTimeoutTm = msgTimeoutTm;
  }

  public int getRetryAllowanceCnt() {
    return this.retryAllowanceCnt;
  }

  public void setRetryAllowanceCnt(int retryAllowanceCnt) {
    this.retryAllowanceCnt = retryAllowanceCnt;
  }

  public int getRetryWaitTm() {
    return this.retryWaitTm;
  }

  public void setRetryWaitTm(int retryWaitTm) {
    this.retryWaitTm = retryWaitTm;
  }

  public Date getUpdateTm() {
    return this.updateTm;
  }

  public void setUpdateTm(Date updateTm) {
    this.updateTm = updateTm;
  }

  public int getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(int updateUserId) {
    this.updateUserId = updateUserId;
  }
}
