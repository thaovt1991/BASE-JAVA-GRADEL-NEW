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

/** The persistent class for the ONETIME_INCASH_INFO database table. */
@Entity
@Table(name = "ONETIME_INCASH_INFO")
@NamedQuery(name = "OnetimeIncashInfo.findAll", query = "SELECT o FROM OnetimeIncashInfo o")
public class OnetimeIncashInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private OnetimeIncashInfoPK id;

  @Column(name = "AMOUNT")
  private int amount;

  @Column(name = "ANOTHER_AMOUNT")
  private int anotherAmount;

  @Column(name = "CANCEL_FLG")
  private int cancelFlg;

  @Column(name = "DATA_KBN")
  private String dataKbn;

  @Column(name = "EDI_INFO")
  private String ediInfo;

  @Column(name = "HD_COMPCODE")
  private int hdCompcode;

  @Column(name = "HD_DDETAILCODE")
  private int hdDdetailcode;

  @Column(name = "HD_HSAHVALUE")
  private String hdHsahvalue;

  @Temporal(TemporalType.DATE)
  @Column(name = "HD_REQ_DATETIME")
  private Date hdReqDatetime;

  @Temporal(TemporalType.DATE)
  @Column(name = "HD_RSP_DATETIME")
  private Date hdRspDatetime;

  @Column(name = "HD_TRANID")
  private String hdTranid;

  @Column(name = "KANJYO_DATE")
  private int kanjyoDate;

  @Column(name = "KISAN_DATE")
  private int kisanDate;

  @Column(name = "NYUUKIN_DATETIME")
  private String nyuukinDatetime;

  @Column(name = "ONETIME_BTN")
  private int onetimeBtn;

  @Column(name = "ONETIME_CLIENT_CD")
  private int onetimeClientCd;

  @Column(name = "OUTPUT_NAME")
  private String outputName;

  @Column(name = "P_DUMMY1")
  private String pDummy1;

  @Column(name = "PUTPUT_CODE")
  private int putputCode;

  @Column(name = "RMT_BANK_NAME")
  private String rmtBankName;

  @Column(name = "RMT_BRUNCH_NAME")
  private String rmtBrunchName;

  @Column(name = "SHOKAI_NO")
  private int shokaiNo;

  public OnetimeIncashInfo() {}

  public OnetimeIncashInfoPK getId() {
    return this.id;
  }

  public void setId(OnetimeIncashInfoPK id) {
    this.id = id;
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getAnotherAmount() {
    return this.anotherAmount;
  }

  public void setAnotherAmount(int anotherAmount) {
    this.anotherAmount = anotherAmount;
  }

  public int getCancelFlg() {
    return this.cancelFlg;
  }

  public void setCancelFlg(int cancelFlg) {
    this.cancelFlg = cancelFlg;
  }

  public String getDataKbn() {
    return this.dataKbn;
  }

  public void setDataKbn(String dataKbn) {
    this.dataKbn = dataKbn;
  }

  public String getEdiInfo() {
    return this.ediInfo;
  }

  public void setEdiInfo(String ediInfo) {
    this.ediInfo = ediInfo;
  }

  public int getHdCompcode() {
    return this.hdCompcode;
  }

  public void setHdCompcode(int hdCompcode) {
    this.hdCompcode = hdCompcode;
  }

  public int getHdDdetailcode() {
    return this.hdDdetailcode;
  }

  public void setHdDdetailcode(int hdDdetailcode) {
    this.hdDdetailcode = hdDdetailcode;
  }

  public String getHdHsahvalue() {
    return this.hdHsahvalue;
  }

  public void setHdHsahvalue(String hdHsahvalue) {
    this.hdHsahvalue = hdHsahvalue;
  }

  public Date getHdReqDatetime() {
    return this.hdReqDatetime;
  }

  public void setHdReqDatetime(Date hdReqDatetime) {
    this.hdReqDatetime = hdReqDatetime;
  }

  public Date getHdRspDatetime() {
    return this.hdRspDatetime;
  }

  public void setHdRspDatetime(Date hdRspDatetime) {
    this.hdRspDatetime = hdRspDatetime;
  }

  public String getHdTranid() {
    return this.hdTranid;
  }

  public void setHdTranid(String hdTranid) {
    this.hdTranid = hdTranid;
  }

  public int getKanjyoDate() {
    return this.kanjyoDate;
  }

  public void setKanjyoDate(int kanjyoDate) {
    this.kanjyoDate = kanjyoDate;
  }

  public int getKisanDate() {
    return this.kisanDate;
  }

  public void setKisanDate(int kisanDate) {
    this.kisanDate = kisanDate;
  }

  public String getNyuukinDatetime() {
    return this.nyuukinDatetime;
  }

  public void setNyuukinDatetime(String nyuukinDatetime) {
    this.nyuukinDatetime = nyuukinDatetime;
  }

  public int getOnetimeBtn() {
    return this.onetimeBtn;
  }

  public void setOnetimeBtn(int onetimeBtn) {
    this.onetimeBtn = onetimeBtn;
  }

  public int getOnetimeClientCd() {
    return this.onetimeClientCd;
  }

  public void setOnetimeClientCd(int onetimeClientCd) {
    this.onetimeClientCd = onetimeClientCd;
  }

  public String getOutputName() {
    return this.outputName;
  }

  public void setOutputName(String outputName) {
    this.outputName = outputName;
  }

  public String getPDummy1() {
    return this.pDummy1;
  }

  public void setPDummy1(String pDummy1) {
    this.pDummy1 = pDummy1;
  }

  public int getPutputCode() {
    return this.putputCode;
  }

  public void setPutputCode(int putputCode) {
    this.putputCode = putputCode;
  }

  public String getRmtBankName() {
    return this.rmtBankName;
  }

  public void setRmtBankName(String rmtBankName) {
    this.rmtBankName = rmtBankName;
  }

  public String getRmtBrunchName() {
    return this.rmtBrunchName;
  }

  public void setRmtBrunchName(String rmtBrunchName) {
    this.rmtBrunchName = rmtBrunchName;
  }

  public int getShokaiNo() {
    return this.shokaiNo;
  }

  public void setShokaiNo(int shokaiNo) {
    this.shokaiNo = shokaiNo;
  }
}
