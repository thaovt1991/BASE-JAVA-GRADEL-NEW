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

/** The persistent class for the IN_CASH_HIST database table. */
@Entity
@Table(name = "IN_CASH_HIST")
@NamedQuery(name = "InCashHist.findAll", query = "SELECT i FROM InCashHist i")
public class InCashHist implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private InCashHistPK id;

  @Column(name = "ACCOUNT_NUM")
  private int accountNum;

  @Column(name = "BANK_BRANCH_CD")
  private int bankBranchCd;

  @Column(name = "BANK_CD")
  private int bankCd;

  @Column(name = "BANK_DEPOSIT_KBN")
  private int bankDepositKbn;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CLIENT_NM_KANA")
  private String clientNmKana;

  @Column(name = "CORRES_AMOUNT")
  private int corresAmount;

  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_DT")
  private Date createDt;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "FROM_CLIENT_BANK_ACC_NO")
  private int fromClientBankAccNo;

  @Column(name = "FROM_CLIENT_BANK_BRANCH_NO")
  private int fromClientBankBranchNo;

  @Column(name = "IN_CASH_AMOUNT")
  private int inCashAmount;

  @Column(name = "IN_CASH_TYPE")
  private int inCashType;

  @Column(name = "IN_OUT_CASH_NO")
  private int inOutCashNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "`INP UT_TM`")
  private Date inp_utTm;

  @Column(name = "KANJYO_DATE")
  private int kanjyoDate;

  @Column(name = "KISAN_DATE")
  private int kisanDate;

  @Column(name = "LOGIN_ID")
  private String loginId;

  @Column(name = "OUTPUT_NAME")
  private String outputName;

  @Column(name = "P_DUMMY1")
  private String pDummy1;

  @Column(name = "RECEIVE_MONEY_STS")
  private int receiveMoneySts;

  @Column(name = "RECEIVE_MONEY_UNMATCH_STS")
  private int receiveMoneyUnmatchSts;

  @Column(name = "RMT_BANK_NAME")
  private String rmtBankName;

  @Column(name = "RMT_BRUNCH_NAME")
  private String rmtBrunchName;

  @Column(name = "SHOKAI_NO")
  private int shokaiNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  public InCashHist() {}

  public InCashHistPK getId() {
    return this.id;
  }

  public void setId(InCashHistPK id) {
    this.id = id;
  }

  public int getAccountNum() {
    return this.accountNum;
  }

  public void setAccountNum(int accountNum) {
    this.accountNum = accountNum;
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

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public String getClientNmKana() {
    return this.clientNmKana;
  }

  public void setClientNmKana(String clientNmKana) {
    this.clientNmKana = clientNmKana;
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

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public int getFromClientBankAccNo() {
    return this.fromClientBankAccNo;
  }

  public void setFromClientBankAccNo(int fromClientBankAccNo) {
    this.fromClientBankAccNo = fromClientBankAccNo;
  }

  public int getFromClientBankBranchNo() {
    return this.fromClientBankBranchNo;
  }

  public void setFromClientBankBranchNo(int fromClientBankBranchNo) {
    this.fromClientBankBranchNo = fromClientBankBranchNo;
  }

  public int getInCashAmount() {
    return this.inCashAmount;
  }

  public void setInCashAmount(int inCashAmount) {
    this.inCashAmount = inCashAmount;
  }

  public int getInCashType() {
    return this.inCashType;
  }

  public void setInCashType(int inCashType) {
    this.inCashType = inCashType;
  }

  public int getInOutCashNo() {
    return this.inOutCashNo;
  }

  public void setInOutCashNo(int inOutCashNo) {
    this.inOutCashNo = inOutCashNo;
  }

  public Date getInp_utTm() {
    return this.inp_utTm;
  }

  public void setInp_utTm(Date inp_utTm) {
    this.inp_utTm = inp_utTm;
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

  public String getLoginId() {
    return this.loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
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

  public int getReceiveMoneySts() {
    return this.receiveMoneySts;
  }

  public void setReceiveMoneySts(int receiveMoneySts) {
    this.receiveMoneySts = receiveMoneySts;
  }

  public int getReceiveMoneyUnmatchSts() {
    return this.receiveMoneyUnmatchSts;
  }

  public void setReceiveMoneyUnmatchSts(int receiveMoneyUnmatchSts) {
    this.receiveMoneyUnmatchSts = receiveMoneyUnmatchSts;
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
