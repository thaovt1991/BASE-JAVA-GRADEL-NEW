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

/** The persistent class for the NYUSYUKIN_INFO database table. */
@Entity
@Table(name = "NYUSYUKIN_INFO")
@NamedQuery(name = "NyusyukinInfo.findAll", query = "SELECT n FROM NyusyukinInfo n")
public class NyusyukinInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "IN_OUT_CASH_NO")
  private int inOutCashNo;

  @Column(name = "ACC_HEAD_CD")
  private int accHeadCd;

  @Column(name = "ACC_NAME")
  private String accName;

  @Column(name = "ACC_NAME_KANA")
  private String accNameKana;

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

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CASH_INPUT_ROUTE_KBN")
  private int cashInputRouteKbn;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "CLIENT_LIST_REMARKS")
  private String clientListRemarks;

  @Column(name = "CLIENT_WEB_REMARKS")
  private String clientWebRemarks;

  @Column(name = "COMMISSION")
  private int commission;

  @Column(name = "COMMISSION_FOREIGN")
  private int commissionForeign;

  @Column(name = "CONSUMPTION_TAX")
  private int consumptionTax;

  @Column(name = "CONTRACT_BRANCH_CD")
  private int contractBranchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DS_FLG")
  private int dsFlg;

  @Column(name = "FROM_BANK_ACC_KBN")
  private int fromBankAccKbn;

  @Column(name = "FROM_BANK_ACC_NO")
  private int fromBankAccNo;

  @Column(name = "FROM_BANK_BRANCH_CD")
  private int fromBankBranchCd;

  @Column(name = "FROM_BANK_CD")
  private int fromBankCd;

  @Column(name = "FROM_BANK_UNIQUE_CD")
  private int fromBankUniqueCd;

  @Column(name = "FX_RATE")
  private int fxRate;

  @Column(name = "GET_EXCHANGE_RATE_KBN")
  private int getExchangeRateKbn;

  @Column(name = "IN_OUT_CASH_STS")
  private int inOutCashSts;

  @Column(name = "INFIRM_LIST_REMARKS")
  private String infirmListRemarks;

  @Column(name = "INOUT_CASH_KBN")
  private int inoutCashKbn;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INPUT_USER_CD")
  private int inputUserCd;

  @Column(name = "JNL_CD")
  private int jnlCd;

  @Column(name = "OPPONENT_AMOUNT")
  private int opponentAmount;

  @Column(name = "OPPONENT_CCY_CD")
  private String opponentCcyCd;

  @Column(name = "ORIGINAL_EXEC_NO")
  private int originalExecNo;

  @Column(name = "SETTELMENT_KBN")
  private int settelmentKbn;

  @Column(name = "TODAY_OUT_CASH_KBN")
  private int todayOutCashKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "TRADE_DT")
  private Date tradeDt;

  @Column(name = "TRADER_CD")
  private int traderCd;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Temporal(TemporalType.DATE)
  @Column(name = "VALUE_DT")
  private Date valueDt;

  public NyusyukinInfo() {}

  public int getInOutCashNo() {
    return this.inOutCashNo;
  }

  public void setInOutCashNo(int inOutCashNo) {
    this.inOutCashNo = inOutCashNo;
  }

  public int getAccHeadCd() {
    return this.accHeadCd;
  }

  public void setAccHeadCd(int accHeadCd) {
    this.accHeadCd = accHeadCd;
  }

  public String getAccName() {
    return this.accName;
  }

  public void setAccName(String accName) {
    this.accName = accName;
  }

  public String getAccNameKana() {
    return this.accNameKana;
  }

  public void setAccNameKana(String accNameKana) {
    this.accNameKana = accNameKana;
  }

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

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getCashInputRouteKbn() {
    return this.cashInputRouteKbn;
  }

  public void setCashInputRouteKbn(int cashInputRouteKbn) {
    this.cashInputRouteKbn = cashInputRouteKbn;
  }

  public String getCcyCd() {
    return this.ccyCd;
  }

  public void setCcyCd(String ccyCd) {
    this.ccyCd = ccyCd;
  }

  public String getClientListRemarks() {
    return this.clientListRemarks;
  }

  public void setClientListRemarks(String clientListRemarks) {
    this.clientListRemarks = clientListRemarks;
  }

  public String getClientWebRemarks() {
    return this.clientWebRemarks;
  }

  public void setClientWebRemarks(String clientWebRemarks) {
    this.clientWebRemarks = clientWebRemarks;
  }

  public int getCommission() {
    return this.commission;
  }

  public void setCommission(int commission) {
    this.commission = commission;
  }

  public int getCommissionForeign() {
    return this.commissionForeign;
  }

  public void setCommissionForeign(int commissionForeign) {
    this.commissionForeign = commissionForeign;
  }

  public int getConsumptionTax() {
    return this.consumptionTax;
  }

  public void setConsumptionTax(int consumptionTax) {
    this.consumptionTax = consumptionTax;
  }

  public int getContractBranchCd() {
    return this.contractBranchCd;
  }

  public void setContractBranchCd(int contractBranchCd) {
    this.contractBranchCd = contractBranchCd;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public int getDsFlg() {
    return this.dsFlg;
  }

  public void setDsFlg(int dsFlg) {
    this.dsFlg = dsFlg;
  }

  public int getFromBankAccKbn() {
    return this.fromBankAccKbn;
  }

  public void setFromBankAccKbn(int fromBankAccKbn) {
    this.fromBankAccKbn = fromBankAccKbn;
  }

  public int getFromBankAccNo() {
    return this.fromBankAccNo;
  }

  public void setFromBankAccNo(int fromBankAccNo) {
    this.fromBankAccNo = fromBankAccNo;
  }

  public int getFromBankBranchCd() {
    return this.fromBankBranchCd;
  }

  public void setFromBankBranchCd(int fromBankBranchCd) {
    this.fromBankBranchCd = fromBankBranchCd;
  }

  public int getFromBankCd() {
    return this.fromBankCd;
  }

  public void setFromBankCd(int fromBankCd) {
    this.fromBankCd = fromBankCd;
  }

  public int getFromBankUniqueCd() {
    return this.fromBankUniqueCd;
  }

  public void setFromBankUniqueCd(int fromBankUniqueCd) {
    this.fromBankUniqueCd = fromBankUniqueCd;
  }

  public int getFxRate() {
    return this.fxRate;
  }

  public void setFxRate(int fxRate) {
    this.fxRate = fxRate;
  }

  public int getGetExchangeRateKbn() {
    return this.getExchangeRateKbn;
  }

  public void setGetExchangeRateKbn(int getExchangeRateKbn) {
    this.getExchangeRateKbn = getExchangeRateKbn;
  }

  public int getInOutCashSts() {
    return this.inOutCashSts;
  }

  public void setInOutCashSts(int inOutCashSts) {
    this.inOutCashSts = inOutCashSts;
  }

  public String getInfirmListRemarks() {
    return this.infirmListRemarks;
  }

  public void setInfirmListRemarks(String infirmListRemarks) {
    this.infirmListRemarks = infirmListRemarks;
  }

  public int getInoutCashKbn() {
    return this.inoutCashKbn;
  }

  public void setInoutCashKbn(int inoutCashKbn) {
    this.inoutCashKbn = inoutCashKbn;
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

  public int getJnlCd() {
    return this.jnlCd;
  }

  public void setJnlCd(int jnlCd) {
    this.jnlCd = jnlCd;
  }

  public int getOpponentAmount() {
    return this.opponentAmount;
  }

  public void setOpponentAmount(int opponentAmount) {
    this.opponentAmount = opponentAmount;
  }

  public String getOpponentCcyCd() {
    return this.opponentCcyCd;
  }

  public void setOpponentCcyCd(String opponentCcyCd) {
    this.opponentCcyCd = opponentCcyCd;
  }

  public int getOriginalExecNo() {
    return this.originalExecNo;
  }

  public void setOriginalExecNo(int originalExecNo) {
    this.originalExecNo = originalExecNo;
  }

  public int getSettelmentKbn() {
    return this.settelmentKbn;
  }

  public void setSettelmentKbn(int settelmentKbn) {
    this.settelmentKbn = settelmentKbn;
  }

  public int getTodayOutCashKbn() {
    return this.todayOutCashKbn;
  }

  public void setTodayOutCashKbn(int todayOutCashKbn) {
    this.todayOutCashKbn = todayOutCashKbn;
  }

  public Date getTradeDt() {
    return this.tradeDt;
  }

  public void setTradeDt(Date tradeDt) {
    this.tradeDt = tradeDt;
  }

  public int getTraderCd() {
    return this.traderCd;
  }

  public void setTraderCd(int traderCd) {
    this.traderCd = traderCd;
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

  public Date getValueDt() {
    return this.valueDt;
  }

  public void setValueDt(Date valueDt) {
    this.valueDt = valueDt;
  }
}
