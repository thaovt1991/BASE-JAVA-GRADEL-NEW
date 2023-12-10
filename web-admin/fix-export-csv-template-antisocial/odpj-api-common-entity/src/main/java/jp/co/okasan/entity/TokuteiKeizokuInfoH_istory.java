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

/** The persistent class for the `TOKUTEI_KEIZOKU_INFO_H ISTORY` database table. */
@Entity
@Table(name = "`TOKUTEI_KEIZOKU_INFO_H ISTORY`")
@NamedQuery(
    name = "TokuteiKeizokuInfoH_istory.findAll",
    query = "SELECT t FROM TokuteiKeizokuInfoH_istory t")
public class TokuteiKeizokuInfoH_istory implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACCEPT_DT")
  private Date acceptDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACCEPT_INPUT_DT")
  private Date acceptInputDt;

  @Column(name = "ACCEPT_YEAR")
  private String acceptYear;

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

  @Column(name = "NAYOSE_NO")
  private String nayoseNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "STD_DT")
  private Date stdDt;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  public TokuteiKeizokuInfoH_istory() {}

  public Date getAcceptDt() {
    return this.acceptDt;
  }

  public void setAcceptDt(Date acceptDt) {
    this.acceptDt = acceptDt;
  }

  public Date getAcceptInputDt() {
    return this.acceptInputDt;
  }

  public void setAcceptInputDt(Date acceptInputDt) {
    this.acceptInputDt = acceptInputDt;
  }

  public String getAcceptYear() {
    return this.acceptYear;
  }

  public void setAcceptYear(String acceptYear) {
    this.acceptYear = acceptYear;
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

  public String getNayoseNo() {
    return this.nayoseNo;
  }

  public void setNayoseNo(String nayoseNo) {
    this.nayoseNo = nayoseNo;
  }

  public Date getStdDt() {
    return this.stdDt;
  }

  public void setStdDt(Date stdDt) {
    this.stdDt = stdDt;
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
