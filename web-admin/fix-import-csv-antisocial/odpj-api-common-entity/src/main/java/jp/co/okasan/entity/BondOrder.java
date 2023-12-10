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

/** The persistent class for the BOND_ORDER database table. */
@Entity
@Table(name = "BOND_ORDER")
@NamedQuery(name = "BondOrder.findAll", query = "SELECT b FROM BondOrder b")
public class BondOrder implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private BondOrderPK id;

  @Column(name = "ACCOUNT_NUM")
  private int accountNum;

  @Column(name = "ACCRUED_INTEREST_CALC_STS")
  private int accruedInterestCalcSts;

  @Column(name = "ACCRUED_INTEREST_TAX_KBN")
  private int accruedInterestTaxKbn;

  @Column(name = "ACCURED_INTEREST")
  private int accuredInterest;

  @Column(name = "ACCURED_INTEREST_FOREIGN")
  private int accuredInterestForeign;

  @Column(name = "BANK_ACC_NM_KANA")
  private String bankAccNmKana;

  @Column(name = "BANK_ACC_NM_KANJI")
  private String bankAccNmKanji;

  @Column(name = "BANK_BRANCH_ADDITIONAL_CD")
  private int bankBranchAdditionalCd;

  @Column(name = "BANK_BRANCH_CD")
  private int bankBranchCd;

  @Column(name = "BANK_BRANCH_KANA_NM")
  private String bankBranchKanaNm;

  @Column(name = "BANK_BRANCH_NM")
  private String bankBranchNm;

  @Column(name = "BANK_CD")
  private int bankCd;

  @Column(name = "BANK_DEPOSIT_KBN")
  private int bankDepositKbn;

  @Column(name = "BANK_KANA_NM")
  private String bankKanaNm;

  @Column(name = "BANK_NM")
  private String bankNm;

  @Column(name = "BP_UPD_FLG")
  private int bpUpdFlg;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CANCEL_CORRECT_KBN")
  private int cancelCorrectKbn;

  @Column(name = "CAPITAL_GAIN_TAX")
  private int capitalGainTax;

  @Column(name = "CAPITAL_GAIN_TAX_FOREIGN")
  private int capitalGainTaxForeign;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "CLIENT_NM")
  private String clientNm;

  @Column(name = "COMM_AMT")
  private int commAmt;

  @Column(name = "COMMISSION")
  private int commission;

  @Column(name = "COMMISSION_FOREIGN")
  private int commissionForeign;

  @Column(name = "CONSUMPTION_TAX")
  private int consumptionTax;

  @Column(name = "CONSUMPTION_TAX_FOREIGN")
  private int consumptionTaxForeign;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DATA_INPUT_KBN")
  private int dataInputKbn;

  @Column(name = "DES_TRANSFER_FLG")
  private int desTransferFlg;

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "FX_COMM_AMT")
  private int fxCommAmt;

  @Column(name = "FX_RATE")
  private int fxRate;

  @Column(name = "FX_SPREAD")
  private int fxSpread;

  @Column(name = "GROSS_AMT")
  private int grossAmt;

  @Column(name = "GROSS_AMT_FOREIGN")
  private int grossAmtForeign;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INPUT_USER_CD")
  private int inputUserCd;

  @Column(name = "INTERST_TAX_BOND_KBN")
  private int interstTaxBondKbn;

  @Column(name = "INV_SEC_CLASS_KBN")
  private int invSecClassKbn;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "METHOD_KBN")
  private int methodKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "MOUSIKOMI_DATETIME")
  private Date mousikomiDatetime;

  @Column(name = "NET_AMT")
  private int netAmt;

  @Column(name = "NET_AMT_FOREIGN")
  private int netAmtForeign;

  @Column(name = "ORDER_NOMINAL")
  private int orderNominal;

  @Column(name = "P_A_CLASS_KBN")
  private int pAClassKbn;

  @Column(name = "SALESMAN_CD")
  private int salesmanCd;

  @Column(name = "SEC_DEPOSITARY_KBN")
  private int secDepositaryKbn;

  @Column(name = "SEC_FULL_DESC")
  private String secFullDesc;

  @Column(name = "SEC_SHORT_DESC")
  private String secShortDesc;

  @Column(name = "SEC_TYPE_KBN")
  private int secTypeKbn;

  @Column(name = "SPEC_ACCOUNT_TYPE")
  private byte specAccountType;

  @Column(name = "SUB_KBN")
  private int subKbn;

  @Column(name = "TMP_FX_RATE")
  private int tmpFxRate;

  @Column(name = "TMP_FX_SPREAD")
  private int tmpFxSpread;

  @Column(name = "TMP_PRC")
  private int tmpPrc;

  @Column(name = "TMP_PRC_FOREIGN")
  private int tmpPrcForeign;

  @Temporal(TemporalType.DATE)
  @Column(name = "TRADE_DT")
  private Date tradeDt;

  @Column(name = "TRADE_KBN")
  private int tradeKbn;

  @Column(name = "TRADE_NOMINAL")
  private int tradeNominal;

  @Column(name = "TRADE_PRC")
  private int tradePrc;

  @Column(name = "TRADE_PRC_FOREIGN")
  private int tradePrcForeign;

  @Temporal(TemporalType.DATE)
  @Column(name = "TRADE_TM")
  private Date tradeTm;

  @Column(name = "TRADER_CD")
  private int traderCd;

  @Column(name = "TRF_TAX_KBN")
  private int trfTaxKbn;

  @Column(name = "UNDECIDED_NET_AMT")
  private int undecidedNetAmt;

  @Column(name = "UNDECIDED_NET_AMT_FOREIGN")
  private int undecidedNetAmtForeign;

  @Column(name = "UPD_USER_CD")
  private int updUserCd;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Temporal(TemporalType.DATE)
  @Column(name = "VALUE_DT")
  private Date valueDt;

  public BondOrder() {}

  public BondOrderPK getId() {
    return this.id;
  }

  public void setId(BondOrderPK id) {
    this.id = id;
  }

  public int getAccountNum() {
    return this.accountNum;
  }

  public void setAccountNum(int accountNum) {
    this.accountNum = accountNum;
  }

  public int getAccruedInterestCalcSts() {
    return this.accruedInterestCalcSts;
  }

  public void setAccruedInterestCalcSts(int accruedInterestCalcSts) {
    this.accruedInterestCalcSts = accruedInterestCalcSts;
  }

  public int getAccruedInterestTaxKbn() {
    return this.accruedInterestTaxKbn;
  }

  public void setAccruedInterestTaxKbn(int accruedInterestTaxKbn) {
    this.accruedInterestTaxKbn = accruedInterestTaxKbn;
  }

  public int getAccuredInterest() {
    return this.accuredInterest;
  }

  public void setAccuredInterest(int accuredInterest) {
    this.accuredInterest = accuredInterest;
  }

  public int getAccuredInterestForeign() {
    return this.accuredInterestForeign;
  }

  public void setAccuredInterestForeign(int accuredInterestForeign) {
    this.accuredInterestForeign = accuredInterestForeign;
  }

  public String getBankAccNmKana() {
    return this.bankAccNmKana;
  }

  public void setBankAccNmKana(String bankAccNmKana) {
    this.bankAccNmKana = bankAccNmKana;
  }

  public String getBankAccNmKanji() {
    return this.bankAccNmKanji;
  }

  public void setBankAccNmKanji(String bankAccNmKanji) {
    this.bankAccNmKanji = bankAccNmKanji;
  }

  public int getBankBranchAdditionalCd() {
    return this.bankBranchAdditionalCd;
  }

  public void setBankBranchAdditionalCd(int bankBranchAdditionalCd) {
    this.bankBranchAdditionalCd = bankBranchAdditionalCd;
  }

  public int getBankBranchCd() {
    return this.bankBranchCd;
  }

  public void setBankBranchCd(int bankBranchCd) {
    this.bankBranchCd = bankBranchCd;
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

  public int getBpUpdFlg() {
    return this.bpUpdFlg;
  }

  public void setBpUpdFlg(int bpUpdFlg) {
    this.bpUpdFlg = bpUpdFlg;
  }

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getCancelCorrectKbn() {
    return this.cancelCorrectKbn;
  }

  public void setCancelCorrectKbn(int cancelCorrectKbn) {
    this.cancelCorrectKbn = cancelCorrectKbn;
  }

  public int getCapitalGainTax() {
    return this.capitalGainTax;
  }

  public void setCapitalGainTax(int capitalGainTax) {
    this.capitalGainTax = capitalGainTax;
  }

  public int getCapitalGainTaxForeign() {
    return this.capitalGainTaxForeign;
  }

  public void setCapitalGainTaxForeign(int capitalGainTaxForeign) {
    this.capitalGainTaxForeign = capitalGainTaxForeign;
  }

  public String getCcyCd() {
    return this.ccyCd;
  }

  public void setCcyCd(String ccyCd) {
    this.ccyCd = ccyCd;
  }

  public String getClientNm() {
    return this.clientNm;
  }

  public void setClientNm(String clientNm) {
    this.clientNm = clientNm;
  }

  public int getCommAmt() {
    return this.commAmt;
  }

  public void setCommAmt(int commAmt) {
    this.commAmt = commAmt;
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

  public int getConsumptionTaxForeign() {
    return this.consumptionTaxForeign;
  }

  public void setConsumptionTaxForeign(int consumptionTaxForeign) {
    this.consumptionTaxForeign = consumptionTaxForeign;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public int getDataInputKbn() {
    return this.dataInputKbn;
  }

  public void setDataInputKbn(int dataInputKbn) {
    this.dataInputKbn = dataInputKbn;
  }

  public int getDesTransferFlg() {
    return this.desTransferFlg;
  }

  public void setDesTransferFlg(int desTransferFlg) {
    this.desTransferFlg = desTransferFlg;
  }

  public int getDoFoClassKbn() {
    return this.doFoClassKbn;
  }

  public void setDoFoClassKbn(int doFoClassKbn) {
    this.doFoClassKbn = doFoClassKbn;
  }

  public int getFxCommAmt() {
    return this.fxCommAmt;
  }

  public void setFxCommAmt(int fxCommAmt) {
    this.fxCommAmt = fxCommAmt;
  }

  public int getFxRate() {
    return this.fxRate;
  }

  public void setFxRate(int fxRate) {
    this.fxRate = fxRate;
  }

  public int getFxSpread() {
    return this.fxSpread;
  }

  public void setFxSpread(int fxSpread) {
    this.fxSpread = fxSpread;
  }

  public int getGrossAmt() {
    return this.grossAmt;
  }

  public void setGrossAmt(int grossAmt) {
    this.grossAmt = grossAmt;
  }

  public int getGrossAmtForeign() {
    return this.grossAmtForeign;
  }

  public void setGrossAmtForeign(int grossAmtForeign) {
    this.grossAmtForeign = grossAmtForeign;
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

  public int getInterstTaxBondKbn() {
    return this.interstTaxBondKbn;
  }

  public void setInterstTaxBondKbn(int interstTaxBondKbn) {
    this.interstTaxBondKbn = interstTaxBondKbn;
  }

  public int getInvSecClassKbn() {
    return this.invSecClassKbn;
  }

  public void setInvSecClassKbn(int invSecClassKbn) {
    this.invSecClassKbn = invSecClassKbn;
  }

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public int getMethodKbn() {
    return this.methodKbn;
  }

  public void setMethodKbn(int methodKbn) {
    this.methodKbn = methodKbn;
  }

  public Date getMousikomiDatetime() {
    return this.mousikomiDatetime;
  }

  public void setMousikomiDatetime(Date mousikomiDatetime) {
    this.mousikomiDatetime = mousikomiDatetime;
  }

  public int getNetAmt() {
    return this.netAmt;
  }

  public void setNetAmt(int netAmt) {
    this.netAmt = netAmt;
  }

  public int getNetAmtForeign() {
    return this.netAmtForeign;
  }

  public void setNetAmtForeign(int netAmtForeign) {
    this.netAmtForeign = netAmtForeign;
  }

  public int getOrderNominal() {
    return this.orderNominal;
  }

  public void setOrderNominal(int orderNominal) {
    this.orderNominal = orderNominal;
  }

  public int getPAClassKbn() {
    return this.pAClassKbn;
  }

  public void setPAClassKbn(int pAClassKbn) {
    this.pAClassKbn = pAClassKbn;
  }

  public int getSalesmanCd() {
    return this.salesmanCd;
  }

  public void setSalesmanCd(int salesmanCd) {
    this.salesmanCd = salesmanCd;
  }

  public int getSecDepositaryKbn() {
    return this.secDepositaryKbn;
  }

  public void setSecDepositaryKbn(int secDepositaryKbn) {
    this.secDepositaryKbn = secDepositaryKbn;
  }

  public String getSecFullDesc() {
    return this.secFullDesc;
  }

  public void setSecFullDesc(String secFullDesc) {
    this.secFullDesc = secFullDesc;
  }

  public String getSecShortDesc() {
    return this.secShortDesc;
  }

  public void setSecShortDesc(String secShortDesc) {
    this.secShortDesc = secShortDesc;
  }

  public int getSecTypeKbn() {
    return this.secTypeKbn;
  }

  public void setSecTypeKbn(int secTypeKbn) {
    this.secTypeKbn = secTypeKbn;
  }

  public byte getSpecAccountType() {
    return this.specAccountType;
  }

  public void setSpecAccountType(byte specAccountType) {
    this.specAccountType = specAccountType;
  }

  public int getSubKbn() {
    return this.subKbn;
  }

  public void setSubKbn(int subKbn) {
    this.subKbn = subKbn;
  }

  public int getTmpFxRate() {
    return this.tmpFxRate;
  }

  public void setTmpFxRate(int tmpFxRate) {
    this.tmpFxRate = tmpFxRate;
  }

  public int getTmpFxSpread() {
    return this.tmpFxSpread;
  }

  public void setTmpFxSpread(int tmpFxSpread) {
    this.tmpFxSpread = tmpFxSpread;
  }

  public int getTmpPrc() {
    return this.tmpPrc;
  }

  public void setTmpPrc(int tmpPrc) {
    this.tmpPrc = tmpPrc;
  }

  public int getTmpPrcForeign() {
    return this.tmpPrcForeign;
  }

  public void setTmpPrcForeign(int tmpPrcForeign) {
    this.tmpPrcForeign = tmpPrcForeign;
  }

  public Date getTradeDt() {
    return this.tradeDt;
  }

  public void setTradeDt(Date tradeDt) {
    this.tradeDt = tradeDt;
  }

  public int getTradeKbn() {
    return this.tradeKbn;
  }

  public void setTradeKbn(int tradeKbn) {
    this.tradeKbn = tradeKbn;
  }

  public int getTradeNominal() {
    return this.tradeNominal;
  }

  public void setTradeNominal(int tradeNominal) {
    this.tradeNominal = tradeNominal;
  }

  public int getTradePrc() {
    return this.tradePrc;
  }

  public void setTradePrc(int tradePrc) {
    this.tradePrc = tradePrc;
  }

  public int getTradePrcForeign() {
    return this.tradePrcForeign;
  }

  public void setTradePrcForeign(int tradePrcForeign) {
    this.tradePrcForeign = tradePrcForeign;
  }

  public Date getTradeTm() {
    return this.tradeTm;
  }

  public void setTradeTm(Date tradeTm) {
    this.tradeTm = tradeTm;
  }

  public int getTraderCd() {
    return this.traderCd;
  }

  public void setTraderCd(int traderCd) {
    this.traderCd = traderCd;
  }

  public int getTrfTaxKbn() {
    return this.trfTaxKbn;
  }

  public void setTrfTaxKbn(int trfTaxKbn) {
    this.trfTaxKbn = trfTaxKbn;
  }

  public int getUndecidedNetAmt() {
    return this.undecidedNetAmt;
  }

  public void setUndecidedNetAmt(int undecidedNetAmt) {
    this.undecidedNetAmt = undecidedNetAmt;
  }

  public int getUndecidedNetAmtForeign() {
    return this.undecidedNetAmtForeign;
  }

  public void setUndecidedNetAmtForeign(int undecidedNetAmtForeign) {
    this.undecidedNetAmtForeign = undecidedNetAmtForeign;
  }

  public int getUpdUserCd() {
    return this.updUserCd;
  }

  public void setUpdUserCd(int updUserCd) {
    this.updUserCd = updUserCd;
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
