package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The persistent class for the HONNINKAKUNIN_INFO database table. */
@Entity
@Table(name = "HONNINKAKUNIN_INFO")
@NamedQuery(name = "HonninkakuninInfo.findAll", query = "SELECT h FROM HonninkakuninInfo h")
public class HonninkakuninInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "SEQ_NO")
  private String seqNo;

  @Column(name = "ADDRESS_1")
  private String address1;

  @Column(name = "ADDRESS_2")
  private String address2;

  @Column(name = "ADDRESS_3")
  private String address3;

  @Column(name = "ADDRESS_4")
  private String address4;

  @Temporal(TemporalType.DATE)
  @Column(name = "BIRTH_DT")
  private Date birthDt;

  @Column(name = "CITY")
  private String city;

  @Column(name = "CONFIRM_STS")
  private int confirmSts;

  @Column(name = "`FI RST_NM`")
  private String fi_rstNm;

  @Lob
  @Column(name = "FILE_IMG")
  private byte[] fileImg;

  @Column(name = "FILE_SEND_STS_KBN")
  private int fileSendStsKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_DATE")
  private Date inputDate;

  @Column(name = "LAST_NM")
  private String lastNm;

  @Column(name = "OTHER")
  private String other;

  @Column(name = "POSTAL_CD")
  private String postalCd;

  @Column(name = "PREFECTURE")
  private String prefecture;

  @Column(name = "STREET")
  private String street;

  @Temporal(TemporalType.DATE)
  @Column(name = "TERM_DT")
  private Date termDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  public HonninkakuninInfo() {}

  public String getSeqNo() {
    return this.seqNo;
  }

  public void setSeqNo(String seqNo) {
    this.seqNo = seqNo;
  }

  public String getAddress1() {
    return this.address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return this.address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAddress3() {
    return this.address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public String getAddress4() {
    return this.address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Date getBirthDt() {
    return this.birthDt;
  }

  public void setBirthDt(Date birthDt) {
    this.birthDt = birthDt;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getConfirmSts() {
    return this.confirmSts;
  }

  public void setConfirmSts(int confirmSts) {
    this.confirmSts = confirmSts;
  }

  public String getFi_rstNm() {
    return this.fi_rstNm;
  }

  public void setFi_rstNm(String fi_rstNm) {
    this.fi_rstNm = fi_rstNm;
  }

  public byte[] getFileImg() {
    return this.fileImg;
  }

  public void setFileImg(byte[] fileImg) {
    this.fileImg = fileImg;
  }

  public int getFileSendStsKbn() {
    return this.fileSendStsKbn;
  }

  public void setFileSendStsKbn(int fileSendStsKbn) {
    this.fileSendStsKbn = fileSendStsKbn;
  }

  public Date getInputDate() {
    return this.inputDate;
  }

  public void setInputDate(Date inputDate) {
    this.inputDate = inputDate;
  }

  public String getLastNm() {
    return this.lastNm;
  }

  public void setLastNm(String lastNm) {
    this.lastNm = lastNm;
  }

  public String getOther() {
    return this.other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public String getPostalCd() {
    return this.postalCd;
  }

  public void setPostalCd(String postalCd) {
    this.postalCd = postalCd;
  }

  public String getPrefecture() {
    return this.prefecture;
  }

  public void setPrefecture(String prefecture) {
    this.prefecture = prefecture;
  }

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Date getTermDt() {
    return this.termDt;
  }

  public void setTermDt(Date termDt) {
    this.termDt = termDt;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }
}
