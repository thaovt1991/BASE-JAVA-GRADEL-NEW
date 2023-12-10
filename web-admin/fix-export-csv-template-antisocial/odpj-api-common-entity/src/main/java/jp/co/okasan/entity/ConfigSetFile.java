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

/** The persistent class for the CONFIG_SET_FILE database table. */
@Entity
@Table(name = "CONFIG_SET_FILE")
@NamedQuery(name = "ConfigSetFile.findAll", query = "SELECT c FROM ConfigSetFile c")
public class ConfigSetFile implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Column(name = "INPUT_CLIENT_CD")
  private int inputClientCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "LOGIN_MAIL_FLG")
  private int loginMailFlg;

  @Column(name = "LOGIN_MAIL_SEND_TYP")
  private int loginMailSendTyp;

  @Column(name = "MFA_LOGIN_FLG")
  private int mfaLoginFlg;

  @Column(name = "MFA_OUT_CASH_FLG")
  private int mfaOutCashFlg;

  @Column(name = "MFA_PASSWORD_FLG")
  private int mfaPasswordFlg;

  @Column(name = "MFA_PIN_NO__FLG")
  private int mfaPinNoFlg;

  @Column(name = "OUT_CASH_MAIL_FLG")
  private int outCashMailFlg;

  @Column(name = "OUT_CASH_MAIL_SEND_TYP")
  private int outCashMailSendTyp;

  @Column(name = "PASSWORD_MAIL_FLG")
  private int passwordMailFlg;

  @Column(name = "PASSWORD_MAIL_SEND_TYP")
  private int passwordMailSendTyp;

  @Column(name = "PIN_NO_MAIL_FLG")
  private int pinNoMailFlg;

  @Column(name = "PIN_NO_MAIL_SEND_TYP")
  private int pinNoMailSendTyp;

  @Column(name = "PIN_NO_OMIT_FLG")
  private int pinNoOmitFlg;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  public ConfigSetFile() {}

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

  public int getInputBranchCd() {
    return this.inputBranchCd;
  }

  public void setInputBranchCd(int inputBranchCd) {
    this.inputBranchCd = inputBranchCd;
  }

  public int getInputClientCd() {
    return this.inputClientCd;
  }

  public void setInputClientCd(int inputClientCd) {
    this.inputClientCd = inputClientCd;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public int getLoginMailFlg() {
    return this.loginMailFlg;
  }

  public void setLoginMailFlg(int loginMailFlg) {
    this.loginMailFlg = loginMailFlg;
  }

  public int getLoginMailSendTyp() {
    return this.loginMailSendTyp;
  }

  public void setLoginMailSendTyp(int loginMailSendTyp) {
    this.loginMailSendTyp = loginMailSendTyp;
  }

  public int getMfaLoginFlg() {
    return this.mfaLoginFlg;
  }

  public void setMfaLoginFlg(int mfaLoginFlg) {
    this.mfaLoginFlg = mfaLoginFlg;
  }

  public int getMfaOutCashFlg() {
    return this.mfaOutCashFlg;
  }

  public void setMfaOutCashFlg(int mfaOutCashFlg) {
    this.mfaOutCashFlg = mfaOutCashFlg;
  }

  public int getMfaPasswordFlg() {
    return this.mfaPasswordFlg;
  }

  public void setMfaPasswordFlg(int mfaPasswordFlg) {
    this.mfaPasswordFlg = mfaPasswordFlg;
  }

  public int getMfaPinNoFlg() {
    return this.mfaPinNoFlg;
  }

  public void setMfaPinNoFlg(int mfaPinNoFlg) {
    this.mfaPinNoFlg = mfaPinNoFlg;
  }

  public int getOutCashMailFlg() {
    return this.outCashMailFlg;
  }

  public void setOutCashMailFlg(int outCashMailFlg) {
    this.outCashMailFlg = outCashMailFlg;
  }

  public int getOutCashMailSendTyp() {
    return this.outCashMailSendTyp;
  }

  public void setOutCashMailSendTyp(int outCashMailSendTyp) {
    this.outCashMailSendTyp = outCashMailSendTyp;
  }

  public int getPasswordMailFlg() {
    return this.passwordMailFlg;
  }

  public void setPasswordMailFlg(int passwordMailFlg) {
    this.passwordMailFlg = passwordMailFlg;
  }

  public int getPasswordMailSendTyp() {
    return this.passwordMailSendTyp;
  }

  public void setPasswordMailSendTyp(int passwordMailSendTyp) {
    this.passwordMailSendTyp = passwordMailSendTyp;
  }

  public int getPinNoMailFlg() {
    return this.pinNoMailFlg;
  }

  public void setPinNoMailFlg(int pinNoMailFlg) {
    this.pinNoMailFlg = pinNoMailFlg;
  }

  public int getPinNoMailSendTyp() {
    return this.pinNoMailSendTyp;
  }

  public void setPinNoMailSendTyp(int pinNoMailSendTyp) {
    this.pinNoMailSendTyp = pinNoMailSendTyp;
  }

  public int getPinNoOmitFlg() {
    return this.pinNoOmitFlg;
  }

  public void setPinNoOmitFlg(int pinNoOmitFlg) {
    this.pinNoOmitFlg = pinNoOmitFlg;
  }

  public int getUpdateBranchCd() {
    return this.updateBranchCd;
  }

  public void setUpdateBranchCd(int updateBranchCd) {
    this.updateBranchCd = updateBranchCd;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }

  public int getUpdateUserCd() {
    return this.updateUserCd;
  }

  public void setUpdateUserCd(int updateUserCd) {
    this.updateUserCd = updateUserCd;
  }
}
