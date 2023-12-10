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

/** The persistent class for the FUND_SERVICE_INFO database table. */
@Entity
@Table(name = "FUND_SERVICE_INFO")
@NamedQuery(name = "FundServiceInfo.findAll", query = "SELECT f FROM FundServiceInfo f")
public class FundServiceInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "ASCEND_NO")
  private int ascendNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "BUY_APPLY_DT")
  private Date buyApplyDt;

  @Column(name = "BUY_CMT")
  private String buyCmt;

  @Temporal(TemporalType.DATE)
  @Column(name = "BUY_TRADE_DT")
  private Date buyTradeDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "BUY_VALUE_DT")
  private Date buyValueDt;

  @Column(name = "DO_FO_CLASS_KBN")
  private int doFoClassKbn;

  @Column(name = "EXEC_TIMING_KBN")
  private int execTimingKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_BUY_CLOSE_TM")
  private Date frontBuyCloseTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_BUY_CLOSE_TM_HALF")
  private Date frontBuyCloseTmHalf;

  @Column(name = "FRONT_BUY_COMMITION_CMT")
  private String frontBuyCommitionCmt;

  @Column(name = "FRONT_BUY_KBN")
  private int frontBuyKbn;

  @Column(name = "FRONT_BUYBACK_FLG")
  private int frontBuybackFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_DIV_DT")
  private Date frontDivDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_SELL_CLOSE_TM")
  private Date frontSellCloseTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_SELL_CLOSE_TM_HALF")
  private Date frontSellCloseTmHalf;

  @Column(name = "FRONT_SELL_COMMITION_CMT")
  private String frontSellCommitionCmt;

  @Column(name = "FRONT_SELL_FLG")
  private int frontSellFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INV_TRUST_GROUP_CD")
  private int invTrustGroupCd;

  @Column(name = "LITERATURE_MEIGARA_COURSE")
  private String literatureMeigaraCourse;

  @Column(name = "RATE_KBN")
  private int rateKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "SELL_APPLY_DT")
  private Date sellApplyDt;

  @Column(name = "SELL_CMT")
  private String sellCmt;

  @Temporal(TemporalType.DATE)
  @Column(name = "SELL_TRADE_DT")
  private Date sellTradeDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "SELL_VALUE_DT")
  private Date sellValueDt;

  @Column(name = "SUB_CMT")
  private String subCmt;

  @Column(name = "WEB_LINK_FLG")
  private int webLinkFlg;

  public FundServiceInfo() {}

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public int getAscendNo() {
    return this.ascendNo;
  }

  public void setAscendNo(int ascendNo) {
    this.ascendNo = ascendNo;
  }

  public Date getBuyApplyDt() {
    return this.buyApplyDt;
  }

  public void setBuyApplyDt(Date buyApplyDt) {
    this.buyApplyDt = buyApplyDt;
  }

  public String getBuyCmt() {
    return this.buyCmt;
  }

  public void setBuyCmt(String buyCmt) {
    this.buyCmt = buyCmt;
  }

  public Date getBuyTradeDt() {
    return this.buyTradeDt;
  }

  public void setBuyTradeDt(Date buyTradeDt) {
    this.buyTradeDt = buyTradeDt;
  }

  public Date getBuyValueDt() {
    return this.buyValueDt;
  }

  public void setBuyValueDt(Date buyValueDt) {
    this.buyValueDt = buyValueDt;
  }

  public int getDoFoClassKbn() {
    return this.doFoClassKbn;
  }

  public void setDoFoClassKbn(int doFoClassKbn) {
    this.doFoClassKbn = doFoClassKbn;
  }

  public int getExecTimingKbn() {
    return this.execTimingKbn;
  }

  public void setExecTimingKbn(int execTimingKbn) {
    this.execTimingKbn = execTimingKbn;
  }

  public Date getFrontBuyCloseTm() {
    return this.frontBuyCloseTm;
  }

  public void setFrontBuyCloseTm(Date frontBuyCloseTm) {
    this.frontBuyCloseTm = frontBuyCloseTm;
  }

  public Date getFrontBuyCloseTmHalf() {
    return this.frontBuyCloseTmHalf;
  }

  public void setFrontBuyCloseTmHalf(Date frontBuyCloseTmHalf) {
    this.frontBuyCloseTmHalf = frontBuyCloseTmHalf;
  }

  public String getFrontBuyCommitionCmt() {
    return this.frontBuyCommitionCmt;
  }

  public void setFrontBuyCommitionCmt(String frontBuyCommitionCmt) {
    this.frontBuyCommitionCmt = frontBuyCommitionCmt;
  }

  public int getFrontBuyKbn() {
    return this.frontBuyKbn;
  }

  public void setFrontBuyKbn(int frontBuyKbn) {
    this.frontBuyKbn = frontBuyKbn;
  }

  public int getFrontBuybackFlg() {
    return this.frontBuybackFlg;
  }

  public void setFrontBuybackFlg(int frontBuybackFlg) {
    this.frontBuybackFlg = frontBuybackFlg;
  }

  public Date getFrontDivDt() {
    return this.frontDivDt;
  }

  public void setFrontDivDt(Date frontDivDt) {
    this.frontDivDt = frontDivDt;
  }

  public Date getFrontSellCloseTm() {
    return this.frontSellCloseTm;
  }

  public void setFrontSellCloseTm(Date frontSellCloseTm) {
    this.frontSellCloseTm = frontSellCloseTm;
  }

  public Date getFrontSellCloseTmHalf() {
    return this.frontSellCloseTmHalf;
  }

  public void setFrontSellCloseTmHalf(Date frontSellCloseTmHalf) {
    this.frontSellCloseTmHalf = frontSellCloseTmHalf;
  }

  public String getFrontSellCommitionCmt() {
    return this.frontSellCommitionCmt;
  }

  public void setFrontSellCommitionCmt(String frontSellCommitionCmt) {
    this.frontSellCommitionCmt = frontSellCommitionCmt;
  }

  public int getFrontSellFlg() {
    return this.frontSellFlg;
  }

  public void setFrontSellFlg(int frontSellFlg) {
    this.frontSellFlg = frontSellFlg;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public int getInvTrustGroupCd() {
    return this.invTrustGroupCd;
  }

  public void setInvTrustGroupCd(int invTrustGroupCd) {
    this.invTrustGroupCd = invTrustGroupCd;
  }

  public String getLiteratureMeigaraCourse() {
    return this.literatureMeigaraCourse;
  }

  public void setLiteratureMeigaraCourse(String literatureMeigaraCourse) {
    this.literatureMeigaraCourse = literatureMeigaraCourse;
  }

  public int getRateKbn() {
    return this.rateKbn;
  }

  public void setRateKbn(int rateKbn) {
    this.rateKbn = rateKbn;
  }

  public Date getSellApplyDt() {
    return this.sellApplyDt;
  }

  public void setSellApplyDt(Date sellApplyDt) {
    this.sellApplyDt = sellApplyDt;
  }

  public String getSellCmt() {
    return this.sellCmt;
  }

  public void setSellCmt(String sellCmt) {
    this.sellCmt = sellCmt;
  }

  public Date getSellTradeDt() {
    return this.sellTradeDt;
  }

  public void setSellTradeDt(Date sellTradeDt) {
    this.sellTradeDt = sellTradeDt;
  }

  public Date getSellValueDt() {
    return this.sellValueDt;
  }

  public void setSellValueDt(Date sellValueDt) {
    this.sellValueDt = sellValueDt;
  }

  public String getSubCmt() {
    return this.subCmt;
  }

  public void setSubCmt(String subCmt) {
    this.subCmt = subCmt;
  }

  public int getWebLinkFlg() {
    return this.webLinkFlg;
  }

  public void setWebLinkFlg(int webLinkFlg) {
    this.webLinkFlg = webLinkFlg;
  }
}
