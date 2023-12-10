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

/** The persistent class for the BOND_POSITION database table. */
@Entity
@Table(name = "BOND_POSITION")
@NamedQuery(name = "BondPosition.findAll", query = "SELECT b FROM BondPosition b")
public class BondPosition implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private BondPositionPK id;

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

  @Column(name = "INTERST_TAX_BOND_KBN")
  private int interstTaxBondKbn;

  @Column(name = "PREVD_MARKET_FX_RATE")
  private int prevdMarketFxRate;

  @Column(name = "PREVD_MARKET_PRC")
  private int prevdMarketPrc;

  @Column(name = "PREVD_MARKET_PRC_FOREIGN")
  private int prevdMarketPrcForeign;

  @Temporal(TemporalType.DATE)
  @Column(name = "PREVD_STD_DT")
  private Date prevdStdDt;

  @Column(name = "PREVD_TD_AC_AV_PRC")
  private int prevdTdAcAvPrc;

  @Column(name = "PREVD_TD_AC_AV_PRC_FOREIGN")
  private int prevdTdAcAvPrcForeign;

  @Column(name = "PREVD_TD_AC_BAL")
  private int prevdTdAcBal;

  @Column(name = "PREVD_TD_MARKET_VALUE")
  private int prevdTdMarketValue;

  @Column(name = "PREVD_TD_MARKET_VALUE_FOREIGN")
  private int prevdTdMarketValueForeign;

  @Column(name = "PREVD_TD_NOMINAL")
  private int prevdTdNominal;

  @Column(name = "PREVD_TD_UNREALIZED_PL")
  private int prevdTdUnrealizedPl;

  @Column(name = "PREVD_TD_UNREALIZED_PL_FOREIGN")
  private int prevdTdUnrealizedPlForeign;

  @Column(name = "SEC_DEPOSITARY_KBN")
  private int secDepositaryKbn;

  @Column(name = "SEC_FULL_DESC")
  private String secFullDesc;

  @Column(name = "SEC_SHORT_DESC")
  private String secShortDesc;

  @Column(name = "SETLMNT_NOM_T")
  private int setlmntNomT;

  @Column(name = "SETLMNT_NOM_T1")
  private int setlmntNomT1;

  @Column(name = "SETLMNT_NOM_TM1")
  private int setlmntNomTm1;

  @Column(name = "SETLMNT_SELL_NOM_T1")
  private int setlmntSellNomT1;

  @Column(name = "SPEC_ACCOUNT_TYPE")
  private byte specAccountType;

  @Temporal(TemporalType.DATE)
  @Column(name = "TODAY_STD_DT")
  private Date todayStdDt;

  @Column(name = "TODAY_TD_NOMINAL")
  private int todayTdNominal;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  public BondPosition() {}

  public BondPositionPK getId() {
    return this.id;
  }

  public void setId(BondPositionPK id) {
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

  public int getInterstTaxBondKbn() {
    return this.interstTaxBondKbn;
  }

  public void setInterstTaxBondKbn(int interstTaxBondKbn) {
    this.interstTaxBondKbn = interstTaxBondKbn;
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

  public int getPrevdMarketPrcForeign() {
    return this.prevdMarketPrcForeign;
  }

  public void setPrevdMarketPrcForeign(int prevdMarketPrcForeign) {
    this.prevdMarketPrcForeign = prevdMarketPrcForeign;
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

  public int getPrevdTdNominal() {
    return this.prevdTdNominal;
  }

  public void setPrevdTdNominal(int prevdTdNominal) {
    this.prevdTdNominal = prevdTdNominal;
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

  public int getSetlmntNomT() {
    return this.setlmntNomT;
  }

  public void setSetlmntNomT(int setlmntNomT) {
    this.setlmntNomT = setlmntNomT;
  }

  public int getSetlmntNomT1() {
    return this.setlmntNomT1;
  }

  public void setSetlmntNomT1(int setlmntNomT1) {
    this.setlmntNomT1 = setlmntNomT1;
  }

  public int getSetlmntNomTm1() {
    return this.setlmntNomTm1;
  }

  public void setSetlmntNomTm1(int setlmntNomTm1) {
    this.setlmntNomTm1 = setlmntNomTm1;
  }

  public int getSetlmntSellNomT1() {
    return this.setlmntSellNomT1;
  }

  public void setSetlmntSellNomT1(int setlmntSellNomT1) {
    this.setlmntSellNomT1 = setlmntSellNomT1;
  }

  public byte getSpecAccountType() {
    return this.specAccountType;
  }

  public void setSpecAccountType(byte specAccountType) {
    this.specAccountType = specAccountType;
  }

  public Date getTodayStdDt() {
    return this.todayStdDt;
  }

  public void setTodayStdDt(Date todayStdDt) {
    this.todayStdDt = todayStdDt;
  }

  public int getTodayTdNominal() {
    return this.todayTdNominal;
  }

  public void setTodayTdNominal(int todayTdNominal) {
    this.todayTdNominal = todayTdNominal;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }
}
