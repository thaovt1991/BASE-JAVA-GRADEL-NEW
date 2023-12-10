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

/** The persistent class for the KTMEL_DLV_DOC_INFO database table. */
@Entity
@Table(name = "KTMEL_DLV_DOC_INFO")
@NamedQuery(name = "KtmelDlvDocInfo.findAll", query = "SELECT k FROM KtmelDlvDocInfo k")
public class KtmelDlvDocInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "DATE_SETTING_FLG")
  private String dateSettingFlg;

  @Column(name = "DOCUMENT_CD")
  private String documentCd;

  @Column(name = "ELEC_DOC_FILE_TYPE_NM")
  private String elecDocFileTypeNm;

  @Column(name = "ELEC_DOC_FILEPASS")
  private String elecDocFilepass;

  @Column(name = "EXPIRE_FLG")
  private int expireFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  public KtmelDlvDocInfo() {}

  public String getDateSettingFlg() {
    return this.dateSettingFlg;
  }

  public void setDateSettingFlg(String dateSettingFlg) {
    this.dateSettingFlg = dateSettingFlg;
  }

  public String getDocumentCd() {
    return this.documentCd;
  }

  public void setDocumentCd(String documentCd) {
    this.documentCd = documentCd;
  }

  public String getElecDocFileTypeNm() {
    return this.elecDocFileTypeNm;
  }

  public void setElecDocFileTypeNm(String elecDocFileTypeNm) {
    this.elecDocFileTypeNm = elecDocFileTypeNm;
  }

  public String getElecDocFilepass() {
    return this.elecDocFilepass;
  }

  public void setElecDocFilepass(String elecDocFilepass) {
    this.elecDocFilepass = elecDocFilepass;
  }

  public int getExpireFlg() {
    return this.expireFlg;
  }

  public void setExpireFlg(int expireFlg) {
    this.expireFlg = expireFlg;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }
}
