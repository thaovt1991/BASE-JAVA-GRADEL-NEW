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

/** The persistent class for the INVITE_AC_OPEN database table. */
@Entity
@Table(name = "INVITE_AC_OPEN")
@NamedQuery(name = "InviteAcOpen.findAll", query = "SELECT i FROM InviteAcOpen i")
public class InviteAcOpen implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "INVITE_SEQNO")
  private int inviteSeqno;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DELETE_FLG")
  private int deleteFlg;

  @Column(name = "FIRST_NM_KANA")
  private String firstNmKana;

  @Column(name = "FIRST_NM_KANJI")
  private String firstNmKanji;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "LAST_NM_KANA")
  private String lastNmKana;

  @Column(name = "LAST_NM_KANJI")
  private String lastNmKanji;

  @Column(name = "MAIL_ADDRESS")
  private String mailAddress;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  public InviteAcOpen() {}

  public int getInviteSeqno() {
    return this.inviteSeqno;
  }

  public void setInviteSeqno(int inviteSeqno) {
    this.inviteSeqno = inviteSeqno;
  }

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

  public int getDeleteFlg() {
    return this.deleteFlg;
  }

  public void setDeleteFlg(int deleteFlg) {
    this.deleteFlg = deleteFlg;
  }

  public String getFirstNmKana() {
    return this.firstNmKana;
  }

  public void setFirstNmKana(String firstNmKana) {
    this.firstNmKana = firstNmKana;
  }

  public String getFirstNmKanji() {
    return this.firstNmKanji;
  }

  public void setFirstNmKanji(String firstNmKanji) {
    this.firstNmKanji = firstNmKanji;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public String getLastNmKana() {
    return this.lastNmKana;
  }

  public void setLastNmKana(String lastNmKana) {
    this.lastNmKana = lastNmKana;
  }

  public String getLastNmKanji() {
    return this.lastNmKanji;
  }

  public void setLastNmKanji(String lastNmKanji) {
    this.lastNmKanji = lastNmKanji;
  }

  public String getMailAddress() {
    return this.mailAddress;
  }

  public void setMailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
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
