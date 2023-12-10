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

/** The persistent class for the ACC_DEL_APPLICATION_INFO database table. */
@Entity
@Table(name = "ACC_DEL_APPLICATION_INFO")
@NamedQuery(name = "AccDelApplicationInfo.findAll", query = "SELECT a FROM AccDelApplicationInfo a")
public class AccDelApplicationInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private AccDelApplicationInfoPK id;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACC_DELETE_APPLY_DT")
  private Date accDeleteApplyDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACC_DELETE_APPROVAL_DT")
  private Date accDeleteApprovalDt;

  @Column(name = "ACC_DELETE_STS")
  private int accDeleteSts;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Column(name = "INPUT_CLIENT_CD")
  private int inputClientCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "`UP DATE_DATETIME`")
  private Date up_dateDatetime;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  public AccDelApplicationInfo() {}

  public AccDelApplicationInfoPK getId() {
    return this.id;
  }

  public void setId(AccDelApplicationInfoPK id) {
    this.id = id;
  }

  public Date getAccDeleteApplyDt() {
    return this.accDeleteApplyDt;
  }

  public void setAccDeleteApplyDt(Date accDeleteApplyDt) {
    this.accDeleteApplyDt = accDeleteApplyDt;
  }

  public Date getAccDeleteApprovalDt() {
    return this.accDeleteApprovalDt;
  }

  public void setAccDeleteApprovalDt(Date accDeleteApprovalDt) {
    this.accDeleteApprovalDt = accDeleteApprovalDt;
  }

  public int getAccDeleteSts() {
    return this.accDeleteSts;
  }

  public void setAccDeleteSts(int accDeleteSts) {
    this.accDeleteSts = accDeleteSts;
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

  public Date getUp_dateDatetime() {
    return this.up_dateDatetime;
  }

  public void setUp_dateDatetime(Date up_dateDatetime) {
    this.up_dateDatetime = up_dateDatetime;
  }

  public int getUpdateBranchCd() {
    return this.updateBranchCd;
  }

  public void setUpdateBranchCd(int updateBranchCd) {
    this.updateBranchCd = updateBranchCd;
  }

  public int getUpdateUserCd() {
    return this.updateUserCd;
  }

  public void setUpdateUserCd(int updateUserCd) {
    this.updateUserCd = updateUserCd;
  }
}
