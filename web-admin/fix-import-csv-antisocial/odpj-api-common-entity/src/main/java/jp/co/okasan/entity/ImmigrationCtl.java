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

/** The persistent class for the IMMIGRATION_CTL database table. */
@Entity
@Table(name = "IMMIGRATION_CTL")
@NamedQuery(name = "ImmigrationCtl.findAll", query = "SELECT i FROM ImmigrationCtl i")
public class ImmigrationCtl implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private ImmigrationCtlPK id;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INPUT_USER_CD")
  private int inputUserCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "LEAVE_COUNTRY_DATE")
  private Date leaveCountryDate;

  @Column(name = "LEAVE_COUNTRY_PROC_STS")
  private int leaveCountryProcSts;

  @Column(name = "NON_RESIDENT_FLG")
  private int nonResidentFlg;

  @Column(name = "NONRESIDSENT_INSTITUTION_KBN")
  private int nonresidsentInstitutionKbn;

  @Column(name = "POSITION_EXT_ERR_FLG")
  private int positionExtErrFlg;

  @Column(name = "RESIDENT_COUNTRY_CD")
  private String residentCountryCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "`RETURN_COUNTRY_ DATE`")
  private Date returnCountry_date;

  @Column(name = "SP_ACC_CONTINUE_KBN")
  private int spAccContinueKbn;

  @Column(name = "UNDELI_TRADE_EXT_ERR_FLG")
  private int undeliTradeExtErrFlg;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  public ImmigrationCtl() {}

  public ImmigrationCtlPK getId() {
    return this.id;
  }

  public void setId(ImmigrationCtlPK id) {
    this.id = id;
  }

  public int getInputBranchCd() {
    return this.inputBranchCd;
  }

  public void setInputBranchCd(int inputBranchCd) {
    this.inputBranchCd = inputBranchCd;
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

  public Date getLeaveCountryDate() {
    return this.leaveCountryDate;
  }

  public void setLeaveCountryDate(Date leaveCountryDate) {
    this.leaveCountryDate = leaveCountryDate;
  }

  public int getLeaveCountryProcSts() {
    return this.leaveCountryProcSts;
  }

  public void setLeaveCountryProcSts(int leaveCountryProcSts) {
    this.leaveCountryProcSts = leaveCountryProcSts;
  }

  public int getNonResidentFlg() {
    return this.nonResidentFlg;
  }

  public void setNonResidentFlg(int nonResidentFlg) {
    this.nonResidentFlg = nonResidentFlg;
  }

  public int getNonresidsentInstitutionKbn() {
    return this.nonresidsentInstitutionKbn;
  }

  public void setNonresidsentInstitutionKbn(int nonresidsentInstitutionKbn) {
    this.nonresidsentInstitutionKbn = nonresidsentInstitutionKbn;
  }

  public int getPositionExtErrFlg() {
    return this.positionExtErrFlg;
  }

  public void setPositionExtErrFlg(int positionExtErrFlg) {
    this.positionExtErrFlg = positionExtErrFlg;
  }

  public String getResidentCountryCd() {
    return this.residentCountryCd;
  }

  public void setResidentCountryCd(String residentCountryCd) {
    this.residentCountryCd = residentCountryCd;
  }

  public Date getReturnCountry_date() {
    return this.returnCountry_date;
  }

  public void setReturnCountry_date(Date returnCountry_date) {
    this.returnCountry_date = returnCountry_date;
  }

  public int getSpAccContinueKbn() {
    return this.spAccContinueKbn;
  }

  public void setSpAccContinueKbn(int spAccContinueKbn) {
    this.spAccContinueKbn = spAccContinueKbn;
  }

  public int getUndeliTradeExtErrFlg() {
    return this.undeliTradeExtErrFlg;
  }

  public void setUndeliTradeExtErrFlg(int undeliTradeExtErrFlg) {
    this.undeliTradeExtErrFlg = undeliTradeExtErrFlg;
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
}
