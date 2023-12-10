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

/** The persistent class for the BANK_INFO database table. */
@Entity
@Table(name = "BANK_INFO")
@NamedQuery(name = "BankInfo.findAll", query = "SELECT b FROM BankInfo b")
public class BankInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private BankInfoPK id;

  @Temporal(TemporalType.DATE)
  @Column(name = "BANK_BRANCH_CLOSE_DT")
  private Date bankBranchCloseDt;

  @Column(name = "BANK_BRANCH_KANA_NM")
  private String bankBranchKanaNm;

  @Column(name = "BANK_BRANCH_NM")
  private String bankBranchNm;

  @Column(name = "BANK_KANA_NM")
  private String bankKanaNm;

  @Column(name = "BANK_NM")
  private String bankNm;

  @Column(name = "BANK_WEB_NO_DISP_FLG")
  private int bankWebNoDispFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_DATE")
  private Date inputDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DT")
  private Date updateDt;

  public BankInfo() {}

  public BankInfoPK getId() {
    return this.id;
  }

  public void setId(BankInfoPK id) {
    this.id = id;
  }

  public Date getBankBranchCloseDt() {
    return this.bankBranchCloseDt;
  }

  public void setBankBranchCloseDt(Date bankBranchCloseDt) {
    this.bankBranchCloseDt = bankBranchCloseDt;
  }

  public String getBankBranchKanaNm() {
    return this.bankBranchKanaNm;
  }

  public void setBankBranchKanaNm(String bankBranchKanaNm) {
    this.bankBranchKanaNm = bankBranchKanaNm;
  }

  public String getBankBranchNm() {
    return this.bankBranchNm;
  }

  public void setBankBranchNm(String bankBranchNm) {
    this.bankBranchNm = bankBranchNm;
  }

  public String getBankKanaNm() {
    return this.bankKanaNm;
  }

  public void setBankKanaNm(String bankKanaNm) {
    this.bankKanaNm = bankKanaNm;
  }

  public String getBankNm() {
    return this.bankNm;
  }

  public void setBankNm(String bankNm) {
    this.bankNm = bankNm;
  }

  public int getBankWebNoDispFlg() {
    return this.bankWebNoDispFlg;
  }

  public void setBankWebNoDispFlg(int bankWebNoDispFlg) {
    this.bankWebNoDispFlg = bankWebNoDispFlg;
  }

  public Date getInputDate() {
    return this.inputDate;
  }

  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }

  public Date getUpdateDt() {
    return this.updateDt;
  }

  public void setUpdateDt(Date updateDt) {
    this.updateDt = updateDt;
  }
}
