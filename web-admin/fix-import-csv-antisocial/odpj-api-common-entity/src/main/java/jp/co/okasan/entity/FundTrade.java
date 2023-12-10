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

/** The persistent class for the FUND_TRADE database table. */
@Entity
@Table(name = "FUND_TRADE")
@NamedQuery(name = "FundTrade.findAll", query = "SELECT f FROM FundTrade f")
public class FundTrade implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "TRADE_NO")
  private int tradeNo;

  @Column(name = "ACC_HEAD_CD")
  private int accHeadCd;

  @Column(name = "ACC_HEAD_NM")
  private String accHeadNm;

  @Column(name = "AMT_FUND_SHARE_INST_TYP")
  private int amtFundShareInstTyp;

  @Column(name = "AV_PRC")
  private int avPrc;

  @Column(name = "AV_PRC_FOREIGN")
  private int avPrcForeign;

  @Column(name = "BOOK_VALUE")
  private int bookValue;

  @Column(name = "BOOK_VALUE_FOREIGN")
  private int bookValueForeign;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CALC_PRC_TRANSFER_PL")
  private int calcPrcTransferPl;

  @Column(name = "CANCEL_CORRECT_KBN")
  private int cancelCorrectKbn;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "CLIENT_LIST_REMARKS")
  private String clientListRemarks;

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

  @Column(name = "DES_TRANSFER_FLG")
  private int desTransferFlg;

  @Column(name = "DIVIDEND_AMT")
  private int dividendAmt;

  @Column(name = "DIVIDEND_AMT_FOREIGN")
  private int dividendAmtForeign;

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "EARLY_SELL_NOMINAL")
  private int earlySellNominal;

  @Column(name = "FUND_TYPE_CD")
  private int fundTypeCd;

  @Column(name = "FX_COMM_AMT")
  private int fxCommAmt;

  @Column(name = "FX_RATE")
  private int fxRate;

  @Column(name = "GROSS_AMT")
  private int grossAmt;

  @Column(name = "GROSS_AMT_FOREIGN")
  private int grossAmtForeign;

  @Column(name = "IN_OUT_CASH_NO")
  private int inOutCashNo;

  @Column(name = "INCOME_TAX")
  private int incomeTax;

  @Column(name = "INCOME_TAX_FOREIGN")
  private int incomeTaxForeign;

  @Column(name = "`INDIV_PRINCIPAL_PR C`")
  private int indivPrincipalPr_c;

  @Column(name = "INDIV_PRINCIPAL_PRC_FOREIGN")
  private int indivPrincipalPrcForeign;

  @Column(name = "INOUT_CASH_KBN")
  private int inoutCashKbn;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Column(name = "INPUT_CLIENT_CD")
  private int inputClientCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_DATE")
  private Date inputDate;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "LOCAL_TAX")
  private int localTax;

  @Column(name = "LOCAL_TAX_FOREIGN")
  private int localTaxForeign;

  @Column(name = "MARKET_CD")
  private int marketCd;

  @Column(name = "MARKET_NM")
  private String marketNm;

  @Column(name = "MARUYU_KBN")
  private int maruyuKbn;

  @Column(name = "MARUYU_NOMINAL")
  private int maruyuNominal;

  @Column(name = "MEIGARA_NM_DISP")
  private String meigaraNmDisp;

  @Column(name = "METHOD_KBN")
  private int methodKbn;

  @Column(name = "NET_AMT")
  private int netAmt;

  @Column(name = "NET_AMT_FOREIGN")
  private int netAmtForeign;

  @Column(name = "NOMINAL")
  private int nominal;

  @Column(name = "NON_TAX_DIVIDEND_AMT")
  private int nonTaxDividendAmt;

  @Column(name = "NON_TAX_DIVIDEND_AMT_FOREIGN")
  private int nonTaxDividendAmtForeign;

  @Column(name = "ORDER_NO")
  private int orderNo;

  @Column(name = "ORDER_SALESMAN_CD")
  private int orderSalesmanCd;

  @Column(name = "PRICE")
  private int price;

  @Column(name = "PRICE_FOREIGN")
  private int priceForeign;

  @Column(name = "REALIZED_PL")
  private int realizedPl;

  @Column(name = "REALIZED_PL_FOREIGN")
  private int realizedPlForeign;

  @Column(name = "RECEIPT_KBN")
  private int receiptKbn;

  @Column(name = "SEC_FULL_DESC")
  private String secFullDesc;

  @Column(name = "SEC_SHORT_DESC")
  private String secShortDesc;

  @Column(name = "SEC_TYPE_KBN")
  private int secTypeKbn;

  @Column(name = "SETTELMENT_KBN")
  private int settelmentKbn;

  @Column(name = "SPEC_ACCOUNT_TYPE")
  private byte specAccountType;

  @Column(name = "SUB_KBN")
  private int subKbn;

  @Column(name = "SW_PREFER_EXERCISE_AMT")
  private String swPreferExerciseAmt;

  @Column(name = "SW_PREFER_EXERCISE_AMT_FOREIGN")
  private String swPreferExerciseAmtForeign;

  @Column(name = "TAX_KBN")
  private int taxKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "TRADE_DT")
  private Date tradeDt;

  @Column(name = "TRADE_REASON_CLASS_KBN")
  private int tradeReasonClassKbn;

  @Column(name = "TRADE_TYPE_CD")
  private int tradeTypeCd;

  @Column(name = "TRADER_CD")
  private int traderCd;

  @Column(name = "TRANSFER_PL")
  private int transferPl;

  @Column(name = "TRUST_ASSET_RESERVE_AMT")
  private int trustAssetReserveAmt;

  @Column(name = "TRUST_ASSET_RESERVE_AMT_FO")
  private int trustAssetReserveAmtFo;

  @Temporal(TemporalType.DATE)
  @Column(name = "VALUE_DT")
  private Date valueDt;

  public FundTrade() {}

  public int getTradeNo() {
    return this.tradeNo;
  }

  public void setTradeNo(int tradeNo) {
    this.tradeNo = tradeNo;
  }

  public int getAccHeadCd() {
    return this.accHeadCd;
  }

  public void setAccHeadCd(int accHeadCd) {
    this.accHeadCd = accHeadCd;
  }

  public String getAccHeadNm() {
    return this.accHeadNm;
  }

  public void setAccHeadNm(String accHeadNm) {
    this.accHeadNm = accHeadNm;
  }

  public int getAmtFundShareInstTyp() {
    return this.amtFundShareInstTyp;
  }

  public void setAmtFundShareInstTyp(int amtFundShareInstTyp) {
    this.amtFundShareInstTyp = amtFundShareInstTyp;
  }

  public int getAvPrc() {
    return this.avPrc;
  }

  public void setAvPrc(int avPrc) {
    this.avPrc = avPrc;
  }

  public int getAvPrcForeign() {
    return this.avPrcForeign;
  }

  public void setAvPrcForeign(int avPrcForeign) {
    this.avPrcForeign = avPrcForeign;
  }

  public int getBookValue() {
    return this.bookValue;
  }

  public void setBookValue(int bookValue) {
    this.bookValue = bookValue;
  }

  public int getBookValueForeign() {
    return this.bookValueForeign;
  }

  public void setBookValueForeign(int bookValueForeign) {
    this.bookValueForeign = bookValueForeign;
  }

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getCalcPrcTransferPl() {
    return this.calcPrcTransferPl;
  }

  public void setCalcPrcTransferPl(int calcPrcTransferPl) {
    this.calcPrcTransferPl = calcPrcTransferPl;
  }

  public int getCancelCorrectKbn() {
    return this.cancelCorrectKbn;
  }

  public void setCancelCorrectKbn(int cancelCorrectKbn) {
    this.cancelCorrectKbn = cancelCorrectKbn;
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

  public int getDesTransferFlg() {
    return this.desTransferFlg;
  }

  public void setDesTransferFlg(int desTransferFlg) {
    this.desTransferFlg = desTransferFlg;
  }

  public int getDividendAmt() {
    return this.dividendAmt;
  }

  public void setDividendAmt(int dividendAmt) {
    this.dividendAmt = dividendAmt;
  }

  public int getDividendAmtForeign() {
    return this.dividendAmtForeign;
  }

  public void setDividendAmtForeign(int dividendAmtForeign) {
    this.dividendAmtForeign = dividendAmtForeign;
  }

  public int getDoFoClassKbn() {
    return this.doFoClassKbn;
  }

  public void setDoFoClassKbn(int doFoClassKbn) {
    this.doFoClassKbn = doFoClassKbn;
  }

  public int getEarlySellNominal() {
    return this.earlySellNominal;
  }

  public void setEarlySellNominal(int earlySellNominal) {
    this.earlySellNominal = earlySellNominal;
  }

  public int getFundTypeCd() {
    return this.fundTypeCd;
  }

  public void setFundTypeCd(int fundTypeCd) {
    this.fundTypeCd = fundTypeCd;
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

  public int getInOutCashNo() {
    return this.inOutCashNo;
  }

  public void setInOutCashNo(int inOutCashNo) {
    this.inOutCashNo = inOutCashNo;
  }

  public int getIncomeTax() {
    return this.incomeTax;
  }

  public void setIncomeTax(int incomeTax) {
    this.incomeTax = incomeTax;
  }

  public int getIncomeTaxForeign() {
    return this.incomeTaxForeign;
  }

  public void setIncomeTaxForeign(int incomeTaxForeign) {
    this.incomeTaxForeign = incomeTaxForeign;
  }

  public int getIndivPrincipalPr_c() {
    return this.indivPrincipalPr_c;
  }

  public void setIndivPrincipalPr_c(int indivPrincipalPr_c) {
    this.indivPrincipalPr_c = indivPrincipalPr_c;
  }

  public int getIndivPrincipalPrcForeign() {
    return this.indivPrincipalPrcForeign;
  }

  public void setIndivPrincipalPrcForeign(int indivPrincipalPrcForeign) {
    this.indivPrincipalPrcForeign = indivPrincipalPrcForeign;
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

  public int getInputClientCd() {
    return this.inputClientCd;
  }

  public void setInputClientCd(int inputClientCd) {
    this.inputClientCd = inputClientCd;
  }

  public Date getInputDate() {
    return this.inputDate;
  }

  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public int getLocalTax() {
    return this.localTax;
  }

  public void setLocalTax(int localTax) {
    this.localTax = localTax;
  }

  public int getLocalTaxForeign() {
    return this.localTaxForeign;
  }

  public void setLocalTaxForeign(int localTaxForeign) {
    this.localTaxForeign = localTaxForeign;
  }

  public int getMarketCd() {
    return this.marketCd;
  }

  public void setMarketCd(int marketCd) {
    this.marketCd = marketCd;
  }

  public String getMarketNm() {
    return this.marketNm;
  }

  public void setMarketNm(String marketNm) {
    this.marketNm = marketNm;
  }

  public int getMaruyuKbn() {
    return this.maruyuKbn;
  }

  public void setMaruyuKbn(int maruyuKbn) {
    this.maruyuKbn = maruyuKbn;
  }

  public int getMaruyuNominal() {
    return this.maruyuNominal;
  }

  public void setMaruyuNominal(int maruyuNominal) {
    this.maruyuNominal = maruyuNominal;
  }

  public String getMeigaraNmDisp() {
    return this.meigaraNmDisp;
  }

  public void setMeigaraNmDisp(String meigaraNmDisp) {
    this.meigaraNmDisp = meigaraNmDisp;
  }

  public int getMethodKbn() {
    return this.methodKbn;
  }

  public void setMethodKbn(int methodKbn) {
    this.methodKbn = methodKbn;
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

  public int getNominal() {
    return this.nominal;
  }

  public void setNominal(int nominal) {
    this.nominal = nominal;
  }

  public int getNonTaxDividendAmt() {
    return this.nonTaxDividendAmt;
  }

  public void setNonTaxDividendAmt(int nonTaxDividendAmt) {
    this.nonTaxDividendAmt = nonTaxDividendAmt;
  }

  public int getNonTaxDividendAmtForeign() {
    return this.nonTaxDividendAmtForeign;
  }

  public void setNonTaxDividendAmtForeign(int nonTaxDividendAmtForeign) {
    this.nonTaxDividendAmtForeign = nonTaxDividendAmtForeign;
  }

  public int getOrderNo() {
    return this.orderNo;
  }

  public void setOrderNo(int orderNo) {
    this.orderNo = orderNo;
  }

  public int getOrderSalesmanCd() {
    return this.orderSalesmanCd;
  }

  public void setOrderSalesmanCd(int orderSalesmanCd) {
    this.orderSalesmanCd = orderSalesmanCd;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPriceForeign() {
    return this.priceForeign;
  }

  public void setPriceForeign(int priceForeign) {
    this.priceForeign = priceForeign;
  }

  public int getRealizedPl() {
    return this.realizedPl;
  }

  public void setRealizedPl(int realizedPl) {
    this.realizedPl = realizedPl;
  }

  public int getRealizedPlForeign() {
    return this.realizedPlForeign;
  }

  public void setRealizedPlForeign(int realizedPlForeign) {
    this.realizedPlForeign = realizedPlForeign;
  }

  public int getReceiptKbn() {
    return this.receiptKbn;
  }

  public void setReceiptKbn(int receiptKbn) {
    this.receiptKbn = receiptKbn;
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

  public int getSettelmentKbn() {
    return this.settelmentKbn;
  }

  public void setSettelmentKbn(int settelmentKbn) {
    this.settelmentKbn = settelmentKbn;
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

  public String getSwPreferExerciseAmt() {
    return this.swPreferExerciseAmt;
  }

  public void setSwPreferExerciseAmt(String swPreferExerciseAmt) {
    this.swPreferExerciseAmt = swPreferExerciseAmt;
  }

  public String getSwPreferExerciseAmtForeign() {
    return this.swPreferExerciseAmtForeign;
  }

  public void setSwPreferExerciseAmtForeign(String swPreferExerciseAmtForeign) {
    this.swPreferExerciseAmtForeign = swPreferExerciseAmtForeign;
  }

  public int getTaxKbn() {
    return this.taxKbn;
  }

  public void setTaxKbn(int taxKbn) {
    this.taxKbn = taxKbn;
  }

  public Date getTradeDt() {
    return this.tradeDt;
  }

  public void setTradeDt(Date tradeDt) {
    this.tradeDt = tradeDt;
  }

  public int getTradeReasonClassKbn() {
    return this.tradeReasonClassKbn;
  }

  public void setTradeReasonClassKbn(int tradeReasonClassKbn) {
    this.tradeReasonClassKbn = tradeReasonClassKbn;
  }

  public int getTradeTypeCd() {
    return this.tradeTypeCd;
  }

  public void setTradeTypeCd(int tradeTypeCd) {
    this.tradeTypeCd = tradeTypeCd;
  }

  public int getTraderCd() {
    return this.traderCd;
  }

  public void setTraderCd(int traderCd) {
    this.traderCd = traderCd;
  }

  public int getTransferPl() {
    return this.transferPl;
  }

  public void setTransferPl(int transferPl) {
    this.transferPl = transferPl;
  }

  public int getTrustAssetReserveAmt() {
    return this.trustAssetReserveAmt;
  }

  public void setTrustAssetReserveAmt(int trustAssetReserveAmt) {
    this.trustAssetReserveAmt = trustAssetReserveAmt;
  }

  public int getTrustAssetReserveAmtFo() {
    return this.trustAssetReserveAmtFo;
  }

  public void setTrustAssetReserveAmtFo(int trustAssetReserveAmtFo) {
    this.trustAssetReserveAmtFo = trustAssetReserveAmtFo;
  }

  public Date getValueDt() {
    return this.valueDt;
  }

  public void setValueDt(Date valueDt) {
    this.valueDt = valueDt;
  }
}
