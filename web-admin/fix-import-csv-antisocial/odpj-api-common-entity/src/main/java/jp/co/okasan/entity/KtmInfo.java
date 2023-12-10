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

/** The persistent class for the KTM_INFO database table. */
@Entity
@Table(name = "KTM_INFO")
@NamedQuery(name = "KtmInfo.findAll", query = "SELECT k FROM KtmInfo k")
public class KtmInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DOCUMENT_CD")
  private String documentCd;

  @Column(name = "EDITION_CD")
  private int editionCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "FIRST_READ_TM")
  private Date firstReadTm;

  @Column(name = "FIRST_READ_WAY")
  private int firstReadWay;

  @Temporal(TemporalType.DATE)
  @Column(name = "READ_LIMIT_DT")
  private Date readLimitDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "SEND_DATE")
  private Date sendDate;

  public KtmInfo() {}

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public String getDocumentCd() {
    return this.documentCd;
  }

  public void setDocumentCd(String documentCd) {
    this.documentCd = documentCd;
  }

  public int getEditionCd() {
    return this.editionCd;
  }

  public void setEditionCd(int editionCd) {
    this.editionCd = editionCd;
  }

  public Date getFirstReadTm() {
    return this.firstReadTm;
  }

  public void setFirstReadTm(Date firstReadTm) {
    this.firstReadTm = firstReadTm;
  }

  public int getFirstReadWay() {
    return this.firstReadWay;
  }

  public void setFirstReadWay(int firstReadWay) {
    this.firstReadWay = firstReadWay;
  }

  public Date getReadLimitDt() {
    return this.readLimitDt;
  }

  public void setReadLimitDt(Date readLimitDt) {
    this.readLimitDt = readLimitDt;
  }

  public Date getSendDate() {
    return this.sendDate;
  }

  public void setSendDate(Date sendDate) {
    this.sendDate = sendDate;
  }
}
