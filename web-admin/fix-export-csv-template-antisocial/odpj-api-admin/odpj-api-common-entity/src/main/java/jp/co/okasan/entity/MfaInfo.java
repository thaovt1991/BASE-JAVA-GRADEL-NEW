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

/** The persistent class for the MFA_INFO database table. */
@Entity
@Table(name = "MFA_INFO")
@NamedQuery(name = "MfaInfo.findAll", query = "SELECT m FROM MfaInfo m")
public class MfaInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private MfaInfoPK id;

  @Temporal(TemporalType.DATE)
  @Column(name = "CANCEL_DATE")
  private Date cancelDate;

  @Column(name = "FAIL_COUNT")
  private int failCount;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_DATE")
  private Date inputDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INPUT_USER_CD")
  private int inputUserCd;

  @Column(name = "MFA_TYPE")
  private int mfaType;

  @Column(name = "MOBILE_PHONE_NO_1")
  private String mobilePhoneNo1;

  @Column(name = "NUMBER")
  private int number;

  @Temporal(TemporalType.DATE)
  @Column(name = "SMS_AUTH_COUNT")
  private Date smsAuthCount;

  @Column(name = "SMS_FAIL_COUNT")
  private int smsFailCount;

  @Temporal(TemporalType.DATE)
  @Column(name = "SMS_FAIL_DATE")
  private Date smsFailDate;

  @Column(name = "SMS_IN_COUNT")
  private int smsInCount;

  @Column(name = "SMS_PIN")
  private int smsPin;

  @Temporal(TemporalType.DATE)
  @Column(name = "SMS_TRANSE_DATE")
  private Date smsTranseDate;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  public MfaInfo() {}

  public MfaInfoPK getId() {
    return this.id;
  }

  public void setId(MfaInfoPK id) {
    this.id = id;
  }

  public Date getCancelDate() {
    return this.cancelDate;
  }

  public void setCancelDate(Date cancelDate) {
    this.cancelDate = cancelDate;
  }

  public int getFailCount() {
    return this.failCount;
  }

  public void setFailCount(int failCount) {
    this.failCount = failCount;
  }

  public int getInputBranchCd() {
    return this.inputBranchCd;
  }

  public void setInputBranchCd(int inputBranchCd) {
    this.inputBranchCd = inputBranchCd;
  }

  public Date getInputDate() {
    return this.inputDate;
  }

  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public int getInputUserCd() {
    return this.inputUserCd;
  }

  public void setInputUserCd(int inputUserCd) {
    this.inputUserCd = inputUserCd;
  }

  public int getMfaType() {
    return this.mfaType;
  }

  public void setMfaType(int mfaType) {
    this.mfaType = mfaType;
  }

  public String getMobilePhoneNo1() {
    return this.mobilePhoneNo1;
  }

  public void setMobilePhoneNo1(String mobilePhoneNo1) {
    this.mobilePhoneNo1 = mobilePhoneNo1;
  }

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Date getSmsAuthCount() {
    return this.smsAuthCount;
  }

  public void setSmsAuthCount(Date smsAuthCount) {
    this.smsAuthCount = smsAuthCount;
  }

  public int getSmsFailCount() {
    return this.smsFailCount;
  }

  public void setSmsFailCount(int smsFailCount) {
    this.smsFailCount = smsFailCount;
  }

  public Date getSmsFailDate() {
    return this.smsFailDate;
  }

  public void setSmsFailDate(Date smsFailDate) {
    this.smsFailDate = smsFailDate;
  }

  public int getSmsInCount() {
    return this.smsInCount;
  }

  public void setSmsInCount(int smsInCount) {
    this.smsInCount = smsInCount;
  }

  public int getSmsPin() {
    return this.smsPin;
  }

  public void setSmsPin(int smsPin) {
    this.smsPin = smsPin;
  }

  public Date getSmsTranseDate() {
    return this.smsTranseDate;
  }

  public void setSmsTranseDate(Date smsTranseDate) {
    this.smsTranseDate = smsTranseDate;
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
