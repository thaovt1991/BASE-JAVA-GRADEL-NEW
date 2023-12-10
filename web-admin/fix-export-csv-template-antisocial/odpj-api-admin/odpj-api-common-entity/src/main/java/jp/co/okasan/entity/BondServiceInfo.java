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

/** The persistent class for the BOND_SERVICE_INFO database table. */
@Entity
@Table(name = "BOND_SERVICE_INFO")
@NamedQuery(name = "BondServiceInfo.findAll", query = "SELECT b FROM BondServiceInfo b")
public class BondServiceInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "ASCEND_NO")
  private int ascendNo;

  @Column(name = "BUY_NOMINAL_MAX")
  private int buyNominalMax;

  @Column(name = "BUY_NOMINAL_MIN")
  private int buyNominalMin;

  @Column(name = "BUY_SUSPEND_FLG")
  private int buySuspendFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "BUY_TRADE_DT")
  private Date buyTradeDt;

  @Column(name = "BUY_VALUE_DAYS")
  private int buyValueDays;

  @Temporal(TemporalType.DATE)
  @Column(name = "BUY_VALUE_DT")
  private Date buyValueDt;

  @Column(name = "BUY_WEB_LINK_FLG")
  private String buyWebLinkFlg;

  @Column(name = "COLLECT_SUSPEND_FLG")
  private int collectSuspendFlg;

  @Column(name = "EXEC_TIMING_KBN")
  private int execTimingKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "FLOAT_DISP_END_TM")
  private Date floatDispEndTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "FLOAT_DISP_START_TM")
  private Date floatDispStartTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "FLOAT_END_DT")
  private Date floatEndDt;

  @Column(name = "FLOAT_NOMINAL_MAX")
  private String floatNominalMax;

  @Column(name = "FLOAT_NOMINAL_MIN")
  private int floatNominalMin;

  @Temporal(TemporalType.DATE)
  @Column(name = "FLOAT_START_TM")
  private Date floatStartTm;

  @Column(name = "FLOAT_WEB_LINK_FLG")
  private String floatWebLinkFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_BUY_CLOSE_TM")
  private Date frontBuyCloseTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_FLOAT_CLOSE_TM")
  private Date frontFloatCloseTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "FRONT_SELL_CLOSE_TM")
  private Date frontSellCloseTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "LITERATURE_NEED_FLG")
  private int literatureNeedFlg;

  @Column(name = "SEC_DEPOSITARY_KBN")
  private int secDepositaryKbn;

  @Column(name = "SELL_NOMINAL_MAX")
  private int sellNominalMax;

  @Column(name = "SELL_NOMINAL_MIN")
  private int sellNominalMin;

  @Column(name = "SELL_SUSPEND_FLG")
  private int sellSuspendFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "SELL_TRADE_DT")
  private Date sellTradeDt;

  @Column(name = "SELL_VALUE_DAYS")
  private int sellValueDays;

  @Temporal(TemporalType.DATE)
  @Column(name = "SELL_VALUE_DT")
  private Date sellValueDt;

  @Column(name = "SELL_WEB_LINK_FLG")
  private String sellWebLinkFlg;

  @Column(name = "SUB_KBN")
  private int subKbn;

  @Column(name = "WEB_LINK_FLG")
  private int webLinkFlg;

  public BondServiceInfo() {}

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

  public int getBuyNominalMax() {
    return this.buyNominalMax;
  }

  public void setBuyNominalMax(int buyNominalMax) {
    this.buyNominalMax = buyNominalMax;
  }

  public int getBuyNominalMin() {
    return this.buyNominalMin;
  }

  public void setBuyNominalMin(int buyNominalMin) {
    this.buyNominalMin = buyNominalMin;
  }

  public int getBuySuspendFlg() {
    return this.buySuspendFlg;
  }

  public void setBuySuspendFlg(int buySuspendFlg) {
    this.buySuspendFlg = buySuspendFlg;
  }

  public Date getBuyTradeDt() {
    return this.buyTradeDt;
  }

  public void setBuyTradeDt(Date buyTradeDt) {
    this.buyTradeDt = buyTradeDt;
  }

  public int getBuyValueDays() {
    return this.buyValueDays;
  }

  public void setBuyValueDays(int buyValueDays) {
    this.buyValueDays = buyValueDays;
  }

  public Date getBuyValueDt() {
    return this.buyValueDt;
  }

  public void setBuyValueDt(Date buyValueDt) {
    this.buyValueDt = buyValueDt;
  }

  public String getBuyWebLinkFlg() {
    return this.buyWebLinkFlg;
  }

  public void setBuyWebLinkFlg(String buyWebLinkFlg) {
    this.buyWebLinkFlg = buyWebLinkFlg;
  }

  public int getCollectSuspendFlg() {
    return this.collectSuspendFlg;
  }

  public void setCollectSuspendFlg(int collectSuspendFlg) {
    this.collectSuspendFlg = collectSuspendFlg;
  }

  public int getExecTimingKbn() {
    return this.execTimingKbn;
  }

  public void setExecTimingKbn(int execTimingKbn) {
    this.execTimingKbn = execTimingKbn;
  }

  public Date getFloatDispEndTm() {
    return this.floatDispEndTm;
  }

  public void setFloatDispEndTm(Date floatDispEndTm) {
    this.floatDispEndTm = floatDispEndTm;
  }

  public Date getFloatDispStartTm() {
    return this.floatDispStartTm;
  }

  public void setFloatDispStartTm(Date floatDispStartTm) {
    this.floatDispStartTm = floatDispStartTm;
  }

  public Date getFloatEndDt() {
    return this.floatEndDt;
  }

  public void setFloatEndDt(Date floatEndDt) {
    this.floatEndDt = floatEndDt;
  }

  public String getFloatNominalMax() {
    return this.floatNominalMax;
  }

  public void setFloatNominalMax(String floatNominalMax) {
    this.floatNominalMax = floatNominalMax;
  }

  public int getFloatNominalMin() {
    return this.floatNominalMin;
  }

  public void setFloatNominalMin(int floatNominalMin) {
    this.floatNominalMin = floatNominalMin;
  }

  public Date getFloatStartTm() {
    return this.floatStartTm;
  }

  public void setFloatStartTm(Date floatStartTm) {
    this.floatStartTm = floatStartTm;
  }

  public String getFloatWebLinkFlg() {
    return this.floatWebLinkFlg;
  }

  public void setFloatWebLinkFlg(String floatWebLinkFlg) {
    this.floatWebLinkFlg = floatWebLinkFlg;
  }

  public Date getFrontBuyCloseTm() {
    return this.frontBuyCloseTm;
  }

  public void setFrontBuyCloseTm(Date frontBuyCloseTm) {
    this.frontBuyCloseTm = frontBuyCloseTm;
  }

  public Date getFrontFloatCloseTm() {
    return this.frontFloatCloseTm;
  }

  public void setFrontFloatCloseTm(Date frontFloatCloseTm) {
    this.frontFloatCloseTm = frontFloatCloseTm;
  }

  public Date getFrontSellCloseTm() {
    return this.frontSellCloseTm;
  }

  public void setFrontSellCloseTm(Date frontSellCloseTm) {
    this.frontSellCloseTm = frontSellCloseTm;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public int getLiteratureNeedFlg() {
    return this.literatureNeedFlg;
  }

  public void setLiteratureNeedFlg(int literatureNeedFlg) {
    this.literatureNeedFlg = literatureNeedFlg;
  }

  public int getSecDepositaryKbn() {
    return this.secDepositaryKbn;
  }

  public void setSecDepositaryKbn(int secDepositaryKbn) {
    this.secDepositaryKbn = secDepositaryKbn;
  }

  public int getSellNominalMax() {
    return this.sellNominalMax;
  }

  public void setSellNominalMax(int sellNominalMax) {
    this.sellNominalMax = sellNominalMax;
  }

  public int getSellNominalMin() {
    return this.sellNominalMin;
  }

  public void setSellNominalMin(int sellNominalMin) {
    this.sellNominalMin = sellNominalMin;
  }

  public int getSellSuspendFlg() {
    return this.sellSuspendFlg;
  }

  public void setSellSuspendFlg(int sellSuspendFlg) {
    this.sellSuspendFlg = sellSuspendFlg;
  }

  public Date getSellTradeDt() {
    return this.sellTradeDt;
  }

  public void setSellTradeDt(Date sellTradeDt) {
    this.sellTradeDt = sellTradeDt;
  }

  public int getSellValueDays() {
    return this.sellValueDays;
  }

  public void setSellValueDays(int sellValueDays) {
    this.sellValueDays = sellValueDays;
  }

  public Date getSellValueDt() {
    return this.sellValueDt;
  }

  public void setSellValueDt(Date sellValueDt) {
    this.sellValueDt = sellValueDt;
  }

  public String getSellWebLinkFlg() {
    return this.sellWebLinkFlg;
  }

  public void setSellWebLinkFlg(String sellWebLinkFlg) {
    this.sellWebLinkFlg = sellWebLinkFlg;
  }

  public int getSubKbn() {
    return this.subKbn;
  }

  public void setSubKbn(int subKbn) {
    this.subKbn = subKbn;
  }

  public int getWebLinkFlg() {
    return this.webLinkFlg;
  }

  public void setWebLinkFlg(int webLinkFlg) {
    this.webLinkFlg = webLinkFlg;
  }
}
