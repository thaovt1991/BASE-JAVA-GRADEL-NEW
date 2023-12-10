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

/** The persistent class for the FUND_LIMIT_NOMINAL database table. */
@Entity
@Table(name = "FUND_LIMIT_NOMINAL")
@NamedQuery(name = "FundLimitNominal.findAll", query = "SELECT f FROM FundLimitNominal f")
public class FundLimitNominal implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private FundLimitNominalPK id;

  @Column(name = "`AMERICAN_ RESTRIC_KBN`")
  private int american_restricKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "BUY_DT")
  private Date buyDt;

  @Column(name = "BUY_LIMIT_NOMINAL")
  private int buyLimitNominal;

  @Column(name = "BUY_USED_NOMINAL")
  private int buyUsedNominal;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "COUNTRY_CD")
  private String countryCd;

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "FIX_FLOAT_USED_NOMINAL")
  private int fixFloatUsedNominal;

  @Column(name = "FLOAT_LIMIT_NOMINAL")
  private int floatLimitNominal;

  @Column(name = "FLOAT_RCV_NOMINAL")
  private int floatRcvNominal;

  @Column(name = "FOREIGN_RESTRIC_KBN")
  private int foreignRestricKbn;

  @Column(name = "FUND_CLASS_KBN")
  private int fundClassKbn;

  @Column(name = "FUND_FORM_KBN")
  private int fundFormKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INV_COMPANY_CD")
  private String invCompanyCd;

  @Column(name = "INV_FUND_KBN")
  private int invFundKbn;

  @Column(name = "LISTED_FLG")
  private int listedFlg;

  @Column(name = "PP_PO_TYP")
  private int ppPoTyp;

  @Temporal(TemporalType.DATE)
  @Column(name = "RDM_DT")
  private Date rdmDt;

  @Column(name = "SEC_FULL_DESC_KANJI")
  private String secFullDescKanji;

  @Column(name = "SEC_SHORT_DESC_KANA")
  private String secShortDescKana;

  @Column(name = "SEC_SHORT_DESC_KANJI")
  private String secShortDescKanji;

  @Column(name = "SEPARATE_SELF_ASSESS_TAX_FLG")
  private int separateSelfAssessTaxFlg;

  @Column(name = "SUB_LMT_FLG")
  private int subLmtFlg;

  @Column(name = "SUB_MAX_SHARE_AMT")
  private int subMaxShareAmt;

  @Column(name = "SUB_MIN_SHARE_AMT")
  private String subMinShareAmt;

  @Column(name = "SUB_PRC")
  private int subPrc;

  @Column(name = "SUB_SHARE_AMT_KBN")
  private int subShareAmtKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "SUB_TERM_FROM")
  private Date subTermFrom;

  @Temporal(TemporalType.DATE)
  @Column(name = "SUB_TERM_TO")
  private Date subTermTo;

  @Column(name = "SUB_UNIT")
  private int subUnit;

  @Column(name = "TRUST_COMPANY_CD")
  private String trustCompanyCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "WEB_LINK_FLG")
  private int webLinkFlg;

  public FundLimitNominal() {}

  public FundLimitNominalPK getId() {
    return this.id;
  }

  public void setId(FundLimitNominalPK id) {
    this.id = id;
  }

  public int getAmerican_restricKbn() {
    return this.american_restricKbn;
  }

  public void setAmerican_restricKbn(int american_restricKbn) {
    this.american_restricKbn = american_restricKbn;
  }

  public Date getBuyDt() {
    return this.buyDt;
  }

  public void setBuyDt(Date buyDt) {
    this.buyDt = buyDt;
  }

  public int getBuyLimitNominal() {
    return this.buyLimitNominal;
  }

  public void setBuyLimitNominal(int buyLimitNominal) {
    this.buyLimitNominal = buyLimitNominal;
  }

  public int getBuyUsedNominal() {
    return this.buyUsedNominal;
  }

  public void setBuyUsedNominal(int buyUsedNominal) {
    this.buyUsedNominal = buyUsedNominal;
  }

  public String getCcyCd() {
    return this.ccyCd;
  }

  public void setCcyCd(String ccyCd) {
    this.ccyCd = ccyCd;
  }

  public String getCountryCd() {
    return this.countryCd;
  }

  public void setCountryCd(String countryCd) {
    this.countryCd = countryCd;
  }

  public int getDoFoClassKbn() {
    return this.doFoClassKbn;
  }

  public void setDoFoClassKbn(int doFoClassKbn) {
    this.doFoClassKbn = doFoClassKbn;
  }

  public int getFixFloatUsedNominal() {
    return this.fixFloatUsedNominal;
  }

  public void setFixFloatUsedNominal(int fixFloatUsedNominal) {
    this.fixFloatUsedNominal = fixFloatUsedNominal;
  }

  public int getFloatLimitNominal() {
    return this.floatLimitNominal;
  }

  public void setFloatLimitNominal(int floatLimitNominal) {
    this.floatLimitNominal = floatLimitNominal;
  }

  public int getFloatRcvNominal() {
    return this.floatRcvNominal;
  }

  public void setFloatRcvNominal(int floatRcvNominal) {
    this.floatRcvNominal = floatRcvNominal;
  }

  public int getForeignRestricKbn() {
    return this.foreignRestricKbn;
  }

  public void setForeignRestricKbn(int foreignRestricKbn) {
    this.foreignRestricKbn = foreignRestricKbn;
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

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public String getInvCompanyCd() {
    return this.invCompanyCd;
  }

  public void setInvCompanyCd(String invCompanyCd) {
    this.invCompanyCd = invCompanyCd;
  }

  public int getInvFundKbn() {
    return this.invFundKbn;
  }

  public void setInvFundKbn(int invFundKbn) {
    this.invFundKbn = invFundKbn;
  }

  public int getListedFlg() {
    return this.listedFlg;
  }

  public void setListedFlg(int listedFlg) {
    this.listedFlg = listedFlg;
  }

  public int getPpPoTyp() {
    return this.ppPoTyp;
  }

  public void setPpPoTyp(int ppPoTyp) {
    this.ppPoTyp = ppPoTyp;
  }

  public Date getRdmDt() {
    return this.rdmDt;
  }

  public void setRdmDt(Date rdmDt) {
    this.rdmDt = rdmDt;
  }

  public String getSecFullDescKanji() {
    return this.secFullDescKanji;
  }

  public void setSecFullDescKanji(String secFullDescKanji) {
    this.secFullDescKanji = secFullDescKanji;
  }

  public String getSecShortDescKana() {
    return this.secShortDescKana;
  }

  public void setSecShortDescKana(String secShortDescKana) {
    this.secShortDescKana = secShortDescKana;
  }

  public String getSecShortDescKanji() {
    return this.secShortDescKanji;
  }

  public void setSecShortDescKanji(String secShortDescKanji) {
    this.secShortDescKanji = secShortDescKanji;
  }

  public int getSeparateSelfAssessTaxFlg() {
    return this.separateSelfAssessTaxFlg;
  }

  public void setSeparateSelfAssessTaxFlg(int separateSelfAssessTaxFlg) {
    this.separateSelfAssessTaxFlg = separateSelfAssessTaxFlg;
  }

  public int getSubLmtFlg() {
    return this.subLmtFlg;
  }

  public void setSubLmtFlg(int subLmtFlg) {
    this.subLmtFlg = subLmtFlg;
  }

  public int getSubMaxShareAmt() {
    return this.subMaxShareAmt;
  }

  public void setSubMaxShareAmt(int subMaxShareAmt) {
    this.subMaxShareAmt = subMaxShareAmt;
  }

  public String getSubMinShareAmt() {
    return this.subMinShareAmt;
  }

  public void setSubMinShareAmt(String subMinShareAmt) {
    this.subMinShareAmt = subMinShareAmt;
  }

  public int getSubPrc() {
    return this.subPrc;
  }

  public void setSubPrc(int subPrc) {
    this.subPrc = subPrc;
  }

  public int getSubShareAmtKbn() {
    return this.subShareAmtKbn;
  }

  public void setSubShareAmtKbn(int subShareAmtKbn) {
    this.subShareAmtKbn = subShareAmtKbn;
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

  public int getSubUnit() {
    return this.subUnit;
  }

  public void setSubUnit(int subUnit) {
    this.subUnit = subUnit;
  }

  public String getTrustCompanyCd() {
    return this.trustCompanyCd;
  }

  public void setTrustCompanyCd(String trustCompanyCd) {
    this.trustCompanyCd = trustCompanyCd;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }

  public int getWebLinkFlg() {
    return this.webLinkFlg;
  }

  public void setWebLinkFlg(int webLinkFlg) {
    this.webLinkFlg = webLinkFlg;
  }
}
