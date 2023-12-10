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

/** The persistent class for the IN_CASH_RECON database table. */
@Entity
@Table(name = "IN_CASH_RECON")
@NamedQuery(name = "InCashRecon.findAll", query = "SELECT i FROM InCashRecon i")
public class InCashRecon implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "ACCOUNT_NUM")
  private int accountNum;

  @Column(name = "AMOUNT")
  private int amount;

  @Column(name = "BANK_BRANCH_CD")
  private int bankBranchCd;

  @Column(name = "BANK_CD")
  private int bankCd;

  @Column(name = "BANK_DEPOSIT_KBN")
  private int bankDepositKbn;

  @Column(name = "CORRES_AMOUNT")
  private int corresAmount;

  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_DT")
  private Date createDt;

  @Column(name = "DATA")
  private String data;

  @Column(name = "DATA_KBN")
  private String dataKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "FILE_PROC_TM")
  private Date fileProcTm;

  @Column(name = "IN_CASH_NO")
  private int inCashNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "KANJYO_DATE")
  private int kanjyoDate;

  @Column(name = "KISAN_DATE")
  private int kisanDate;

  @Column(name = "OUTPUT_NAME")
  private String outputName;

  @Column(name = "P_DUMMY1")
  private String pDummy1;

  @Column(name = "PROC_STS")
  private String procSts;

  @Column(name = "PUTPUT_CODE")
  private int putputCode;

  @Column(name = "REC_NO")
  private int recNo;

  @Column(name = "RMT_BANK_NAME")
  private String rmtBankName;

  @Column(name = "RMT_BRUNCH_NAME")
  private String rmtBrunchName;

  @Column(name = "SHOKAI_NO")
  private int shokaiNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  public InCashRecon() {}

  public int getAccountNum() {
    return this.accountNum;
  }

  public void setAccountNum(int accountNum) {
    this.accountNum = accountNum;
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getBankBranchCd() {
    return this.bankBranchCd;
  }

  public void setBankBranchCd(int bankBranchCd) {
    this.bankBranchCd = bankBranchCd;
  }

  public int getBankCd() {
    return this.bankCd;
  }

  public void setBankCd(int bankCd) {
    this.bankCd = bankCd;
  }

  public int getBankDepositKbn() {
    return this.bankDepositKbn;
  }

  public void setBankDepositKbn(int bankDepositKbn) {
    this.bankDepositKbn = bankDepositKbn;
  }

  public int getCorresAmount() {
    return this.corresAmount;
  }

  public void setCorresAmount(int corresAmount) {
    this.corresAmount = corresAmount;
  }

  public Date getCreateDt() {
    return this.createDt;
  }

  public void setCreateDt(Date createDt) {
    this.createDt = createDt;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getDataKbn() {
    return this.dataKbn;
  }

  public void setDataKbn(String dataKbn) {
    this.dataKbn = dataKbn;
  }

  public Date getFileProcTm() {
    return this.fileProcTm;
  }

  public void setFileProcTm(Date fileProcTm) {
    this.fileProcTm = fileProcTm;
  }

  public int getInCashNo() {
    return this.inCashNo;
  }

  public void setInCashNo(int inCashNo) {
    this.inCashNo = inCashNo;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public int getKanjyoDate() {
    return this.kanjyoDate;
  }

  public void setKanjyoDate(int kanjyoDate) {
    this.kanjyoDate = kanjyoDate;
  }

  public int getKisanDate() {
    return this.kisanDate;
  }

  public void setKisanDate(int kisanDate) {
    this.kisanDate = kisanDate;
  }

  public String getOutputName() {
    return this.outputName;
  }

  public void setOutputName(String outputName) {
    this.outputName = outputName;
  }

  public String getPDummy1() {
    return this.pDummy1;
  }

  public void setPDummy1(String pDummy1) {
    this.pDummy1 = pDummy1;
  }

  public String getProcSts() {
    return this.procSts;
  }

  public void setProcSts(String procSts) {
    this.procSts = procSts;
  }

  public int getPutputCode() {
    return this.putputCode;
  }

  public void setPutputCode(int putputCode) {
    this.putputCode = putputCode;
  }

  public int getRecNo() {
    return this.recNo;
  }

  public void setRecNo(int recNo) {
    this.recNo = recNo;
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

  public int getShokaiNo() {
    return this.shokaiNo;
  }

  public void setShokaiNo(int shokaiNo) {
    this.shokaiNo = shokaiNo;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }
}
