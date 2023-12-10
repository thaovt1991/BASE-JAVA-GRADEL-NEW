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

/** The persistent class for the SEND_MAIL database table. */
@Entity
@Table(name = "SEND_MAIL")
@NamedQuery(name = "SendMail.findAll", query = "SELECT s FROM SendMail s")
public class SendMail implements Serializable {
  private static final long serialVersionUID = 1L;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INPUT_USER_CD")
  private int inputUserCd;

  @Lob
  @Column(name = "MAIL_DETAILS")
  private String mailDetails;

  @Id
  @Column(name = "MAIL_SEQ_NO")
  private int mailSeqNo;

  @Column(name = "MAIL_SUBJECT")
  private String mailSubject;

  @Column(name = "OP_MAIL_MASTER_NO")
  private int opMailMasterNo;

  @Column(name = "REPLY_TO_ADDRESS")
  private String replyToAddress;

  @Column(name = "SEND_FROM_ADDRESS")
  private String sendFromAddress;

  @Column(name = "SEND_FROM_NAME")
  private String sendFromName;

  @Column(name = "SEND_RESULT")
  private int sendResult;

  @Column(name = "SEND_TO_ADDRESS_TO")
  private String sendToAddressTo;

  public SendMail() {}

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public int getInputUserCd() {
    return this.inputUserCd;
  }

  public void setInputUserCd(int inputUserCd) {
    this.inputUserCd = inputUserCd;
  }

  public String getMailDetails() {
    return this.mailDetails;
  }

  public void setMailDetails(String mailDetails) {
    this.mailDetails = mailDetails;
  }

  public int getMailSeqNo() {
    return this.mailSeqNo;
  }

  public void setMailSeqNo(int mailSeqNo) {
    this.mailSeqNo = mailSeqNo;
  }

  public String getMailSubject() {
    return this.mailSubject;
  }

  public void setMailSubject(String mailSubject) {
    this.mailSubject = mailSubject;
  }

  public int getOpMailMasterNo() {
    return this.opMailMasterNo;
  }

  public void setOpMailMasterNo(int opMailMasterNo) {
    this.opMailMasterNo = opMailMasterNo;
  }

  public String getReplyToAddress() {
    return this.replyToAddress;
  }

  public void setReplyToAddress(String replyToAddress) {
    this.replyToAddress = replyToAddress;
  }

  public String getSendFromAddress() {
    return this.sendFromAddress;
  }

  public void setSendFromAddress(String sendFromAddress) {
    this.sendFromAddress = sendFromAddress;
  }

  public String getSendFromName() {
    return this.sendFromName;
  }

  public void setSendFromName(String sendFromName) {
    this.sendFromName = sendFromName;
  }

  public int getSendResult() {
    return this.sendResult;
  }

  public void setSendResult(int sendResult) {
    this.sendResult = sendResult;
  }

  public String getSendToAddressTo() {
    return this.sendToAddressTo;
  }

  public void setSendToAddressTo(String sendToAddressTo) {
    this.sendToAddressTo = sendToAddressTo;
  }
}
