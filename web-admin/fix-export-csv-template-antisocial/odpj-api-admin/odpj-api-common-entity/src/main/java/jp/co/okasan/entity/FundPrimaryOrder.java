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

/** The persistent class for the FUND_PRIMARY_ORDER database table. */
@Entity
@Table(name = "FUND_PRIMARY_ORDER")
@NamedQuery(name = "FundPrimaryOrder.findAll", query = "SELECT f FROM FundPrimaryOrder f")
public class FundPrimaryOrder implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "PRYMARY_ORDER_NO")
  private int prymaryOrderNo;

  @Column(name = "AMT_FUND_SHARE")
  private int amtFundShare;

  @Column(name = "AMT_FUND_SHARE_INST_TYP")
  private int amtFundShareInstTyp;

  @Column(name = "BP_UPD_FLG")
  private int bpUpdFlg;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "BUY_DT")
  private Date buyDt;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "CCY_NM")
  private String ccyNm;

  @Column(name = "CLIENT_NM")
  private String clientNm;

  @Column(name = "COMM_RATE")
  private int commRate;

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

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "DS_FLG")
  private int dsFlg;

  @Column(name = "FUND_CLASS_KBN")
  private int fundClassKbn;

  @Column(name = "FUND_FORM_KBN")
  private int fundFormKbn;

  @Column(name = "FUND_TYPE_CD")
  private int fundTypeCd;

  @Column(name = "FX_RATE")
  private int fxRate;

  @Column(name = "GROSS_AMT")
  private int grossAmt;

  @Column(name = "GROSS_AMT_FOREIGN")
  private int grossAmtForeign;

  @Column(name = "INCOME_TAX")
  private int incomeTax;

  @Column(name = "INCOME_TAX_FOREIGN")
  private int incomeTaxForeign;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INPUT_USER_CD")
  private int inputUserCd;

  @Column(name = "INV_COMPANY_CD")
  private String invCompanyCd;

  @Column(name = "INV_COMPANY_NM_KANJI")
  private String invCompanyNmKanji;

  @Column(name = "INV_FUND_KBN")
  private int invFundKbn;

  @Column(name = "INV_SEC_CLASS_KBN")
  private int invSecClassKbn;

  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "LOCAL_TAX")
  private int localTax;

  @Column(name = "LOCAL_TAX_FOREIGN")
  private int localTaxForeign;

  @Column(name = "MARUYU_KBN")
  private int maruyuKbn;

  @Column(name = "METHOD_KBN")
  private int methodKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "MOUSIKOMI_DATETIME")
  private Date mousikomiDatetime;

  @Column(name = "NET_AMT")
  private int netAmt;

  @Column(name = "NET_AMT_FOREIGN")
  private int netAmtForeign;

  @Column(name = "P_A_CLASS_KBN")
  private int pAClassKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "RM_RCV_TM")
  private Date rmRcvTm;

  @Column(name = "SALESMAN_CD")
  private int salesmanCd;

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

  @Column(name = "STD_SHARE")
  private int stdShare;

  @Column(name = "SUB_KBN")
  private int subKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "SUB_TERM_FROM")
  private Date subTermFrom;

  @Temporal(TemporalType.DATE)
  @Column(name = "SUB_TERM_TO")
  private Date subTermTo;

  @Temporal(TemporalType.DATE)
  @Column(name = "TRADE_DT")
  private Date tradeDt;

  @Column(name = "TRADE_FUND_SHARE")
  private int tradeFundShare;

  @Column(name = "TRADE_FUND_SHARE_BUY_MARUYU")
  private int tradeFundShareBuyMaruyu;

  @Column(name = "TRADE_KBN")
  private int tradeKbn;

  @Column(name = "TRADER_CD")
  private int traderCd;

  @Column(name = "TRUST_ASSET_RESERVE_AMT")
  private int trustAssetReserveAmt;

  @Column(name = "UNIT_SHARE")
  private int unitShare;

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

  public FundPrimaryOrder() {}

  public int getPrymaryOrderNo() {
    return this.prymaryOrderNo;
  }

  public void setPrymaryOrderNo(int prymaryOrderNo) {
    this.prymaryOrderNo = prymaryOrderNo;
  }

  public int getAmtFundShare() {
    return this.amtFundShare;
  }

  public void setAmtFundShare(int amtFundShare) {
    this.amtFundShare = amtFundShare;
  }

  public int getAmtFundShareInstTyp() {
    return this.amtFundShareInstTyp;
  }

  public void setAmtFundShareInstTyp(int amtFundShareInstTyp) {
    this.amtFundShareInstTyp = amtFundShareInstTyp;
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

  public Date getBuyDt() {
    return this.buyDt;
  }

  public void setBuyDt(Date buyDt) {
    this.buyDt = buyDt;
  }

  public String getCcyCd() {
    return this.ccyCd;
  }

  public void setCcyCd(String ccyCd) {
    this.ccyCd = ccyCd;
  }

  public String getCcyNm() {
    return this.ccyNm;
  }

  public void setCcyNm(String ccyNm) {
    this.ccyNm = ccyNm;
  }

  public String getClientNm() {
    return this.clientNm;
  }

  public void setClientNm(String clientNm) {
    this.clientNm = clientNm;
  }

  public int getCommRate() {
    return this.commRate;
  }

  public void setCommRate(int commRate) {
    this.commRate = commRate;
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

  public int getDoFoClassKbn() {
    return this.doFoClassKbn;
  }

  public void setDoFoClassKbn(int doFoClassKbn) {
    this.doFoClassKbn = doFoClassKbn;
  }

  public int getDsFlg() {
    return this.dsFlg;
  }

  public void setDsFlg(int dsFlg) {
    this.dsFlg = dsFlg;
  }

  public int getFundClassKbn() {
    return this.fundClassKbn;
  }

  public void setFundClassKbn(int fundClassKbn) {
    this.fundClassKbn = fundClassKbn;
  }

  public int getFundFormKbn() {
    return this.fundFormKbn;
  }

  public void setFundFormKbn(int fundFormKbn) {
    this.fundFormKbn = fundFormKbn;
  }

  public int getFundTypeCd() {
    return this.fundTypeCd;
  }

  public void setFundTypeCd(int fundTypeCd) {
    this.fundTypeCd = fundTypeCd;
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

  public String getInvCompanyCd() {
    return this.invCompanyCd;
  }

  public void setInvCompanyCd(String invCompanyCd) {
    this.invCompanyCd = invCompanyCd;
  }

  public String getInvCompanyNmKanji() {
    return this.invCompanyNmKanji;
  }

  public void setInvCompanyNmKanji(String invCompanyNmKanji) {
    this.invCompanyNmKanji = invCompanyNmKanji;
  }

  public int getInvFundKbn() {
    return this.invFundKbn;
  }

  public void setInvFundKbn(int invFundKbn) {
    this.invFundKbn = invFundKbn;
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

  public int getMaruyuKbn() {
    return this.maruyuKbn;
  }

  public void setMaruyuKbn(int maruyuKbn) {
    this.maruyuKbn = maruyuKbn;
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

  public int getPAClassKbn() {
    return this.pAClassKbn;
  }

  public void setPAClassKbn(int pAClassKbn) {
    this.pAClassKbn = pAClassKbn;
  }

  public Date getRmRcvTm() {
    return this.rmRcvTm;
  }

  public void setRmRcvTm(Date rmRcvTm) {
    this.rmRcvTm = rmRcvTm;
  }

  public int getSalesmanCd() {
    return this.salesmanCd;
  }

  public void setSalesmanCd(int salesmanCd) {
    this.salesmanCd = salesmanCd;
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

  public int getStdShare() {
    return this.stdShare;
  }

  public void setStdShare(int stdShare) {
    this.stdShare = stdShare;
  }

  public int getSubKbn() {
    return this.subKbn;
  }

  public void setSubKbn(int subKbn) {
    this.subKbn = subKbn;
  }

  public Date getSubTermFrom() {
    return this.subTermFrom;
  }

  public void setSubTermFrom(Date subTermFrom) {
    this.subTermFrom = subTermFrom;
  }

  public Date getSubTermTo() {
    return this.subTermTo;
  }

  public void setSubTermTo(Date subTermTo) {
    this.subTermTo = subTermTo;
  }

  public Date getTradeDt() {
    return this.tradeDt;
  }

  public void setTradeDt(Date tradeDt) {
    this.tradeDt = tradeDt;
  }

  public int getTradeFundShare() {
    return this.tradeFundShare;
  }

  public void setTradeFundShare(int tradeFundShare) {
    this.tradeFundShare = tradeFundShare;
  }

  public int getTradeFundShareBuyMaruyu() {
    return this.tradeFundShareBuyMaruyu;
  }

  public void setTradeFundShareBuyMaruyu(int tradeFundShareBuyMaruyu) {
    this.tradeFundShareBuyMaruyu = tradeFundShareBuyMaruyu;
  }

  public int getTradeKbn() {
    return this.tradeKbn;
  }

  public void setTradeKbn(int tradeKbn) {
    this.tradeKbn = tradeKbn;
  }

  public int getTraderCd() {
    return this.traderCd;
  }

  public void setTraderCd(int traderCd) {
    this.traderCd = traderCd;
  }

  public int getTrustAssetReserveAmt() {
    return this.trustAssetReserveAmt;
  }

  public void setTrustAssetReserveAmt(int trustAssetReserveAmt) {
    this.trustAssetReserveAmt = trustAssetReserveAmt;
  }

  public int getUnitShare() {
    return this.unitShare;
  }

  public void setUnitShare(int unitShare) {
    this.unitShare = unitShare;
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
