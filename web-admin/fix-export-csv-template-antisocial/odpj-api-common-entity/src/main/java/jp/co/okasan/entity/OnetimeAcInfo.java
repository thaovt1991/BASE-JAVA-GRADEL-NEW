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

/** The persistent class for the ONETIME_AC_INFO database table. */
@Entity
@Table(name = "ONETIME_AC_INFO")
@NamedQuery(name = "OnetimeAcInfo.findAll", query = "SELECT o FROM OnetimeAcInfo o")
public class OnetimeAcInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private OnetimeAcInfoPK id;

  @Column(name = "ACCOUNT_NAME")
  private String accountName;

  @Column(name = "ACCOUNT_NUM")
  private int accountNum;

  @Column(name = "BANK_DEPOSIT_KBN")
  private int bankDepositKbn;

  @Column(name = "CVS_CODE")
  private String cvsCode;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "KANRI_NO_NAME")
  private String kanriNoName;

  @Column(name = "ONETIME_BTN")
  private int onetimeBtn;

  @Column(name = "ONETIME_CLIENT_CD")
  private int onetimeClientCd;

  @Column(name = "RECON_AC_NAME1")
  private String reconAcName1;

  @Column(name = "RECON_AC_NAME2")
  private String reconAcName2;

  @Column(name = "RECON_AC_NAME3")
  private String reconAcName3;

  @Column(name = "RECON_AC_NAME4")
  private String reconAcName4;

  @Column(name = "RECON_AC_NAME5")
  private String reconAcName5;

  @Column(name = "RMT_BANK_NAME")
  private String rmtBankName;

  @Column(name = "RMT_BRUNCH_NAME")
  private String rmtBrunchName;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  public OnetimeAcInfo() {}

  public OnetimeAcInfoPK getId() {
    return this.id;
  }

  public void setId(OnetimeAcInfoPK id) {
    this.id = id;
  }

  public String getAccountName() {
    return this.accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public int getAccountNum() {
    return this.accountNum;
  }

  public void setAccountNum(int accountNum) {
    this.accountNum = accountNum;
  }

  public int getBankDepositKbn() {
    return this.bankDepositKbn;
  }

  public void setBankDepositKbn(int bankDepositKbn) {
    this.bankDepositKbn = bankDepositKbn;
  }

  public String getCvsCode() {
    return this.cvsCode;
  }

  public void setCvsCode(String cvsCode) {
    this.cvsCode = cvsCode;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public String getKanriNoName() {
    return this.kanriNoName;
  }

  public void setKanriNoName(String kanriNoName) {
    this.kanriNoName = kanriNoName;
  }

  public int getOnetimeBtn() {
    return this.onetimeBtn;
  }

  public void setOnetimeBtn(int onetimeBtn) {
    this.onetimeBtn = onetimeBtn;
  }

  public int getOnetimeClientCd() {
    return this.onetimeClientCd;
  }

  public void setOnetimeClientCd(int onetimeClientCd) {
    this.onetimeClientCd = onetimeClientCd;
  }

  public String getReconAcName1() {
    return this.reconAcName1;
  }

  public void setReconAcName1(String reconAcName1) {
    this.reconAcName1 = reconAcName1;
  }

  public String getReconAcName2() {
    return this.reconAcName2;
  }

  public void setReconAcName2(String reconAcName2) {
    this.reconAcName2 = reconAcName2;
  }

  public String getReconAcName3() {
    return this.reconAcName3;
  }

  public void setReconAcName3(String reconAcName3) {
    this.reconAcName3 = reconAcName3;
  }

  public String getReconAcName4() {
    return this.reconAcName4;
  }

  public void setReconAcName4(String reconAcName4) {
    this.reconAcName4 = reconAcName4;
  }

  public String getReconAcName5() {
    return this.reconAcName5;
  }

  public void setReconAcName5(String reconAcName5) {
    this.reconAcName5 = reconAcName5;
  }

  public String getRmtBankName() {
    return this.rmtBankName;
  }

  public void setRmtBankName(String rmtBankName) {
    this.rmtBankName = rmtBankName;
  }

  public String getRmtBrunchName() {
    return this.rmtBrunchName;
  }

  public void setRmtBrunchName(String rmtBrunchName) {
    this.rmtBrunchName = rmtBrunchName;
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
