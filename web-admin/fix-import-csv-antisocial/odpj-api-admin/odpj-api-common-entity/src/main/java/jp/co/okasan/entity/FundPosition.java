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

/** The persistent class for the FUND_POSITION database table. */
@Entity
@Table(name = "FUND_POSITION")
@NamedQuery(name = "FundPosition.findAll", query = "SELECT f FROM FundPosition f")
public class FundPosition implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private FundPositionPK id;

  @Column(name = "CCY_CD")
  private String ccyCd;

  @Column(name = "CCY_NM")
  private String ccyNm;

  @Column(name = "COUNTRY_CD")
  private String countryCd;

  @Column(name = "COUNTRY_NAME")
  private String countryName;

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "FUND_CLASS_KBN")
  private int fundClassKbn;

  @Column(name = "FUND_FORM_KBN")
  private int fundFormKbn;

  @Column(name = "FUND_TYPE_CD")
  private int fundTypeCd;

  @Column(name = "INV_COMPANY_CD")
  private String invCompanyCd;

  @Column(name = "INV_COMPANY_NM_KANJI")
  private String invCompanyNmKanji;

  @Column(name = "INV_FUND_KBN")
  private int invFundKbn;

  @Column(name = "NOM_ON_CANCEL_ORDER")
  private int nomOnCancelOrder;

  @Column(name = "PREVD_BUY_AMT_TOTAL")
  private int prevdBuyAmtTotal;

  @Column(name = "PREVD_DIV_AMT_TOTAL")
  private int prevdDivAmtTotal;

  @Column(name = "PREVD_MARKET_FX_RATE")
  private int prevdMarketFxRate;

  @Column(name = "PREVD_MARKET_PRC")
  private int prevdMarketPrc;

  @Column(name = "PREVD_MARKET_PRC_CHG_FOREIGN")
  private int prevdMarketPrcChgForeign;

  @Column(name = "PREVD_MARKET_PRC_FOREIGN")
  private int prevdMarketPrcForeign;

  @Column(name = "PREVD_SELL_AMT_TOTAL")
  private String prevdSellAmtTotal;

  @Temporal(TemporalType.DATE)
  @Column(name = "PREVD_STD_DT")
  private Date prevdStdDt;

  @Column(name = "PREVD_TD_AC_AV_PRC")
  private int prevdTdAcAvPrc;

  @Column(name = "PREVD_TD_AC_AV_PRC_FOREIGN")
  private int prevdTdAcAvPrcForeign;

  @Column(name = "PREVD_TD_AC_BAL")
  private int prevdTdAcBal;

  @Column(name = "PREVD_TD_AC_BAL_FOREIGN")
  private String prevdTdAcBalForeign;

  @Column(name = "PREVD_TD_AV_FX_RATE")
  private int prevdTdAvFxRate;

  @Column(name = "PREVD_TD_CLOSE_MARUYU_NOMINAL")
  private int prevdTdCloseMaruyuNominal;

  @Column(name = "PREVD_TD_CLOSE_NOMINAL")
  private int prevdTdCloseNominal;

  @Column(name = "PREVD_TD_MARKET_VALUE")
  private int prevdTdMarketValue;

  @Column(name = "PREVD_TD_MARKET_VALUE_FOREIGN")
  private int prevdTdMarketValueForeign;

  @Column(name = "PREVD_TD_OPEN_MARUYU_NOMINAL")
  private int prevdTdOpenMaruyuNominal;

  @Column(name = "PREVD_TD_OPEN_NOMINAL")
  private int prevdTdOpenNominal;

  @Column(name = "PREVD_TD_UNREALIZED_PL")
  private int prevdTdUnrealizedPl;

  @Column(name = "PREVD_TD_UNREALIZED_PL_FOREIGN")
  private int prevdTdUnrealizedPlForeign;

  @Column(name = "PREVD_UNREAL_DIV_AMT")
  private int prevdUnrealDivAmt;

  @Column(name = "PREVD_UNREAL_DIV_AMT_YEN")
  private int prevdUnrealDivAmtYen;

  @Column(name = "PREVD_UNREALIZED_PL_ONCOST")
  private int prevdUnrealizedPlOncost;

  @Column(name = "SEC_FULL_DESC")
  private String secFullDesc;

  @Column(name = "SEC_SHORT_DESC")
  private String secShortDesc;

  @Temporal(TemporalType.DATE)
  @Column(name = "TODAY_STD_DT")
  private Date todayStdDt;

  @Column(name = "TODAY_TD_CLOSE_MARUYU_NOMINAL")
  private int todayTdCloseMaruyuNominal;

  @Column(name = "TODAY_TD_CLOSE_NOMINAL")
  private int todayTdCloseNominal;

  @Column(name = "TODAY_TD_OPEN_MARUYU_NOMINAL")
  private int todayTdOpenMaruyuNominal;

  @Column(name = "TODAY_TD_OPEN_NOMINAL")
  private int todayTdOpenNominal;

  @Column(name = "VD_MARUYU_NOMINAL")
  private int vdMaruyuNominal;

  @Column(name = "VD_MARUYU_NOMINAL_T1")
  private int vdMaruyuNominalT1;

  @Column(name = "VD_MARUYU_NOMINAL_TM1")
  private int vdMaruyuNominalTm1;

  @Column(name = "VD_NOMINAL")
  private int vdNominal;

  @Column(name = "VD_NOMINAL_T1")
  private int vdNominalT1;

  @Column(name = "VD_NOMINAL_TM1")
  private int vdNominalTm1;

  @Column(name = "VD_SELL_MARUYU_NOMINAL_T1")
  private int vdSellMaruyuNominalT1;

  @Column(name = "VD_SELL_NOMINAL_T1")
  private int vdSellNominalT1;

  public FundPosition() {}

  public FundPositionPK getId() {
    return this.id;
  }

  public void setId(FundPositionPK id) {
    this.id = id;
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

  public String getCountryCd() {
    return this.countryCd;
  }

  public void setCountryCd(String countryCd) {
    this.countryCd = countryCd;
  }

  public String getCountryName() {
    return this.countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public int getDoFoClassKbn() {
    return this.doFoClassKbn;
  }

  public void setDoFoClassKbn(int doFoClassKbn) {
    this.doFoClassKbn = doFoClassKbn;
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

  public int getNomOnCancelOrder() {
    return this.nomOnCancelOrder;
  }

  public void setNomOnCancelOrder(int nomOnCancelOrder) {
    this.nomOnCancelOrder = nomOnCancelOrder;
  }

  public int getPrevdBuyAmtTotal() {
    return this.prevdBuyAmtTotal;
  }

  public void setPrevdBuyAmtTotal(int prevdBuyAmtTotal) {
    this.prevdBuyAmtTotal = prevdBuyAmtTotal;
  }

  public int getPrevdDivAmtTotal() {
    return this.prevdDivAmtTotal;
  }

  public void setPrevdDivAmtTotal(int prevdDivAmtTotal) {
    this.prevdDivAmtTotal = prevdDivAmtTotal;
  }

  public int getPrevdMarketFxRate() {
    return this.prevdMarketFxRate;
  }

  public void setPrevdMarketFxRate(int prevdMarketFxRate) {
    this.prevdMarketFxRate = prevdMarketFxRate;
  }

  public int getPrevdMarketPrc() {
    return this.prevdMarketPrc;
  }

  public void setPrevdMarketPrc(int prevdMarketPrc) {
    this.prevdMarketPrc = prevdMarketPrc;
  }

  public int getPrevdMarketPrcChgForeign() {
    return this.prevdMarketPrcChgForeign;
  }

  public void setPrevdMarketPrcChgForeign(int prevdMarketPrcChgForeign) {
    this.prevdMarketPrcChgForeign = prevdMarketPrcChgForeign;
  }

  public int getPrevdMarketPrcForeign() {
    return this.prevdMarketPrcForeign;
  }

  public void setPrevdMarketPrcForeign(int prevdMarketPrcForeign) {
    this.prevdMarketPrcForeign = prevdMarketPrcForeign;
  }

  public String getPrevdSellAmtTotal() {
    return this.prevdSellAmtTotal;
  }

  public void setPrevdSellAmtTotal(String prevdSellAmtTotal) {
    this.prevdSellAmtTotal = prevdSellAmtTotal;
  }

  public Date getPrevdStdDt() {
    return this.prevdStdDt;
  }

  public void setPrevdStdDt(Date prevdStdDt) {
    this.prevdStdDt = prevdStdDt;
  }

  public int getPrevdTdAcAvPrc() {
    return this.prevdTdAcAvPrc;
  }

  public void setPrevdTdAcAvPrc(int prevdTdAcAvPrc) {
    this.prevdTdAcAvPrc = prevdTdAcAvPrc;
  }

  public int getPrevdTdAcAvPrcForeign() {
    return this.prevdTdAcAvPrcForeign;
  }

  public void setPrevdTdAcAvPrcForeign(int prevdTdAcAvPrcForeign) {
    this.prevdTdAcAvPrcForeign = prevdTdAcAvPrcForeign;
  }

  public int getPrevdTdAcBal() {
    return this.prevdTdAcBal;
  }

  public void setPrevdTdAcBal(int prevdTdAcBal) {
    this.prevdTdAcBal = prevdTdAcBal;
  }

  public String getPrevdTdAcBalForeign() {
    return this.prevdTdAcBalForeign;
  }

  public void setPrevdTdAcBalForeign(String prevdTdAcBalForeign) {
    this.prevdTdAcBalForeign = prevdTdAcBalForeign;
  }

  public int getPrevdTdAvFxRate() {
    return this.prevdTdAvFxRate;
  }

  public void setPrevdTdAvFxRate(int prevdTdAvFxRate) {
    this.prevdTdAvFxRate = prevdTdAvFxRate;
  }

  public int getPrevdTdCloseMaruyuNominal() {
    return this.prevdTdCloseMaruyuNominal;
  }

  public void setPrevdTdCloseMaruyuNominal(int prevdTdCloseMaruyuNominal) {
    this.prevdTdCloseMaruyuNominal = prevdTdCloseMaruyuNominal;
  }

  public int getPrevdTdCloseNominal() {
    return this.prevdTdCloseNominal;
  }

  public void setPrevdTdCloseNominal(int prevdTdCloseNominal) {
    this.prevdTdCloseNominal = prevdTdCloseNominal;
  }

  public int getPrevdTdMarketValue() {
    return this.prevdTdMarketValue;
  }

  public void setPrevdTdMarketValue(int prevdTdMarketValue) {
    this.prevdTdMarketValue = prevdTdMarketValue;
  }

  public int getPrevdTdMarketValueForeign() {
    return this.prevdTdMarketValueForeign;
  }

  public void setPrevdTdMarketValueForeign(int prevdTdMarketValueForeign) {
    this.prevdTdMarketValueForeign = prevdTdMarketValueForeign;
  }

  public int getPrevdTdOpenMaruyuNominal() {
    return this.prevdTdOpenMaruyuNominal;
  }

  public void setPrevdTdOpenMaruyuNominal(int prevdTdOpenMaruyuNominal) {
    this.prevdTdOpenMaruyuNominal = prevdTdOpenMaruyuNominal;
  }

  public int getPrevdTdOpenNominal() {
    return this.prevdTdOpenNominal;
  }

  public void setPrevdTdOpenNominal(int prevdTdOpenNominal) {
    this.prevdTdOpenNominal = prevdTdOpenNominal;
  }

  public int getPrevdTdUnrealizedPl() {
    return this.prevdTdUnrealizedPl;
  }

  public void setPrevdTdUnrealizedPl(int prevdTdUnrealizedPl) {
    this.prevdTdUnrealizedPl = prevdTdUnrealizedPl;
  }

  public int getPrevdTdUnrealizedPlForeign() {
    return this.prevdTdUnrealizedPlForeign;
  }

  public void setPrevdTdUnrealizedPlForeign(int prevdTdUnrealizedPlForeign) {
    this.prevdTdUnrealizedPlForeign = prevdTdUnrealizedPlForeign;
  }

  public int getPrevdUnrealDivAmt() {
    return this.prevdUnrealDivAmt;
  }

  public void setPrevdUnrealDivAmt(int prevdUnrealDivAmt) {
    this.prevdUnrealDivAmt = prevdUnrealDivAmt;
  }

  public int getPrevdUnrealDivAmtYen() {
    return this.prevdUnrealDivAmtYen;
  }

  public void setPrevdUnrealDivAmtYen(int prevdUnrealDivAmtYen) {
    this.prevdUnrealDivAmtYen = prevdUnrealDivAmtYen;
  }

  public int getPrevdUnrealizedPlOncost() {
    return this.prevdUnrealizedPlOncost;
  }

  public void setPrevdUnrealizedPlOncost(int prevdUnrealizedPlOncost) {
    this.prevdUnrealizedPlOncost = prevdUnrealizedPlOncost;
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

  public Date getTodayStdDt() {
    return this.todayStdDt;
  }

  public void setTodayStdDt(Date todayStdDt) {
    this.todayStdDt = todayStdDt;
  }

  public int getTodayTdCloseMaruyuNominal() {
    return this.todayTdCloseMaruyuNominal;
  }

  public void setTodayTdCloseMaruyuNominal(int todayTdCloseMaruyuNominal) {
    this.todayTdCloseMaruyuNominal = todayTdCloseMaruyuNominal;
  }

  public int getTodayTdCloseNominal() {
    return this.todayTdCloseNominal;
  }

  public void setTodayTdCloseNominal(int todayTdCloseNominal) {
    this.todayTdCloseNominal = todayTdCloseNominal;
  }

  public int getTodayTdOpenMaruyuNominal() {
    return this.todayTdOpenMaruyuNominal;
  }

  public void setTodayTdOpenMaruyuNominal(int todayTdOpenMaruyuNominal) {
    this.todayTdOpenMaruyuNominal = todayTdOpenMaruyuNominal;
  }

  public int getTodayTdOpenNominal() {
    return this.todayTdOpenNominal;
  }

  public void setTodayTdOpenNominal(int todayTdOpenNominal) {
    this.todayTdOpenNominal = todayTdOpenNominal;
  }

  public int getVdMaruyuNominal() {
    return this.vdMaruyuNominal;
  }

  public void setVdMaruyuNominal(int vdMaruyuNominal) {
    this.vdMaruyuNominal = vdMaruyuNominal;
  }

  public int getVdMaruyuNominalT1() {
    return this.vdMaruyuNominalT1;
  }

  public void setVdMaruyuNominalT1(int vdMaruyuNominalT1) {
    this.vdMaruyuNominalT1 = vdMaruyuNominalT1;
  }

  public int getVdMaruyuNominalTm1() {
    return this.vdMaruyuNominalTm1;
  }

  public void setVdMaruyuNominalTm1(int vdMaruyuNominalTm1) {
    this.vdMaruyuNominalTm1 = vdMaruyuNominalTm1;
  }

  public int getVdNominal() {
    return this.vdNominal;
  }

  public void setVdNominal(int vdNominal) {
    this.vdNominal = vdNominal;
  }

  public int getVdNominalT1() {
    return this.vdNominalT1;
  }

  public void setVdNominalT1(int vdNominalT1) {
    this.vdNominalT1 = vdNominalT1;
  }

  public int getVdNominalTm1() {
    return this.vdNominalTm1;
  }

  public void setVdNominalTm1(int vdNominalTm1) {
    this.vdNominalTm1 = vdNominalTm1;
  }

  public int getVdSellMaruyuNominalT1() {
    return this.vdSellMaruyuNominalT1;
  }

  public void setVdSellMaruyuNominalT1(int vdSellMaruyuNominalT1) {
    this.vdSellMaruyuNominalT1 = vdSellMaruyuNominalT1;
  }

  public int getVdSellNominalT1() {
    return this.vdSellNominalT1;
  }

  public void setVdSellNominalT1(int vdSellNominalT1) {
    this.vdSellNominalT1 = vdSellNominalT1;
  }
}
