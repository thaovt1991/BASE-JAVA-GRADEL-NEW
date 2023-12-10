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

/** The persistent class for the BOND_ORDER_HIST database table. */
@Entity
@Table(name = "BOND_ORDER_HIST")
@NamedQuery(name = "BondOrderHist.findAll", query = "SELECT b FROM BondOrderHist b")
public class BondOrderHist implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private BondOrderHistPK id;

  @Column(name = "ACCOUNT_NUM")
  private int accountNum;

  @Column(name = "ACQ_SHARE_ACQ_PRC")
  private int acqShareAcqPrc;

  @Column(name = "AMT_FUND_SHARE")
  private int amtFundShare;

  @Column(name = "AMT_FUND_SHARE_INST_TYP")
  private int amtFundShareInstTyp;

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

  @Column(name = "`BANK_KANA_N M`")
  private String bankKanaN_m;

  @Column(name = "BANK_NM")
  private String bankNm;

  @Column(name = "BP_UPD_FLG")
  private int bpUpdFlg;

  @Column(name = "BRANCH_CD")
  private int branchCd;

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

  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_EFFECTIVE_DT")
  private Date dataEffectiveDt;

  @Column(name = "DES_TRANSFER_FLG")
  private int desTransferFlg;

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

  @Column(name = "NET_AMT")
  private int netAmt;

  @Column(name = "NET_AMT_FOREIGN")
  private int netAmtForeign;

  @Column(name = "P_A_CLASS_KBN")
  private int pAClassKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "RCV_TM")
  private Date rcvTm;

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

  @Column(name = "TAX_KBN")
  private int taxKbn;

  @Column(name = "TMP_PRC")
  private int tmpPrc;

  @Column(name = "TMP_PRC_FOREIGN")
  private int tmpPrcForeign;

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

  public BondOrderHist() {}

  public BondOrderHistPK getId() {
    return this.id;
  }

  public void setId(BondOrderHistPK id) {
    this.id = id;
  }

  public int getAccountNum() {
    return this.accountNum;
  }

  public void setAccountNum(int accountNum) {
    this.accountNum = accountNum;
  }

  public int getAcqShareAcqPrc() {
    return this.acqShareAcqPrc;
  }

  public void setAcqShareAcqPrc(int acqShareAcqPrc) {
    this.acqShareAcqPrc = acqShareAcqPrc;
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

  public String getBankKanaN_m() {
    return this.bankKanaN_m;
  }

  public void setBankKanaN_m(String bankKanaN_m) {
    this.bankKanaN_m = bankKanaN_m;
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

  public Date getDataEffectiveDt() {
    return this.dataEffectiveDt;
  }

  public void setDataEffectiveDt(Date dataEffectiveDt) {
    this.dataEffectiveDt = dataEffectiveDt;
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

  public Date getRcvTm() {
    return this.rcvTm;
  }

  public void setRcvTm(Date rcvTm) {
    this.rcvTm = rcvTm;
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

  public int getTaxKbn() {
    return this.taxKbn;
  }

  public void setTaxKbn(int taxKbn) {
    this.taxKbn = taxKbn;
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
