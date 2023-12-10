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

/** The persistent class for the MOKUROMISYO_DLV_INFO database table. */
@Entity
@Table(name = "MOKUROMISYO_DLV_INFO")
@NamedQuery(name = "MokuromisyoDlvInfo.findAll", query = "SELECT m FROM MokuromisyoDlvInfo m")
public class MokuromisyoDlvInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private MokuromisyoDlvInfoPK id;

  @Column(name = "DOCUMENT_KBN")
  private int documentKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "FIRST_READ_TM")
  private Date firstReadTm;

  @Column(name = "FIRST_READ_WAY")
  private int firstReadWay;

  @Temporal(TemporalType.DATE)
  @Column(name = "FORWARD_DT")
  private Date forwardDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "NEW_READ_TM")
  private Date newReadTm;

  @Column(name = "NEW_READ_WAY")
  private int newReadWay;

  @Temporal(TemporalType.DATE)
  @Column(name = "READ_LIMIT_DT")
  private Date readLimitDt;

  @Column(name = "SEC_TYPE_KBN")
  private int secTypeKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "SEND_DATE")
  private Date sendDate;

  public MokuromisyoDlvInfo() {}

  public MokuromisyoDlvInfoPK getId() {
    return this.id;
  }

  public void setId(MokuromisyoDlvInfoPK id) {
    this.id = id;
  }

  public int getDocumentKbn() {
    return this.documentKbn;
  }

  public void setDocumentKbn(int documentKbn) {
    this.documentKbn = documentKbn;
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

  public Date getForwardDt() {
    return this.forwardDt;
  }

  public void setForwardDt(Date forwardDt) {
    this.forwardDt = forwardDt;
  }

  public Date getNewReadTm() {
    return this.newReadTm;
  }

  public void setNewReadTm(Date newReadTm) {
    this.newReadTm = newReadTm;
  }

  public int getNewReadWay() {
    return this.newReadWay;
  }

  public void setNewReadWay(int newReadWay) {
    this.newReadWay = newReadWay;
  }

  public Date getReadLimitDt() {
    return this.readLimitDt;
  }

  public void setReadLimitDt(Date readLimitDt) {
    this.readLimitDt = readLimitDt;
  }

  public int getSecTypeKbn() {
    return this.secTypeKbn;
  }

  public void setSecTypeKbn(int secTypeKbn) {
    this.secTypeKbn = secTypeKbn;
  }

  public Date getSendDate() {
    return this.sendDate;
  }

  public void setSendDate(Date sendDate) {
    this.sendDate = sendDate;
  }
}
