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

/** The persistent class for the MYNO_INFO database table. */
@Entity
@Table(name = "MYNO_INFO")
@NamedQuery(name = "MynoInfo.findAll", query = "SELECT m FROM MynoInfo m")
public class MynoInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "MY_NUMBER_ACCPT_CNTL_SEQ")
  private int myNumberAccptCntlSeq;

  @Column(name = "ACC_NEW_CURRENT_KBN")
  private int accNewCurrentKbn;

  @Column(name = "AUTHOLIZED_USER_ID")
  private int autholizedUserId;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CANCEL_FLG")
  private int cancelFlg;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "DISOISAL_COMP_DATE")
  private Date disoisalCompDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "DISOISAL_DATE")
  private Date disoisalDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "DISOISAL_DUE_DATE")
  private Date disoisalDueDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "ENTRY_DATE")
  private Date entryDate;

  @Column(name = "FAULT_REASON_COMMENTS")
  private String faultReasonComments;

  @Column(name = "JASDEC_SEND_FLG")
  private int jasdecSendFlg;

  @Column(name = "JUDGMENT_RESULT")
  private String judgmentResult;

  @Temporal(TemporalType.DATE)
  @Column(name = "MODIFICATION_DATE")
  private Date modificationDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "MYNO_ACCEPT_DT")
  private Date mynoAcceptDt;

  @Column(name = "MYNO_DOCUMENTS_ID")
  private int mynoDocumentsId;

  @Temporal(TemporalType.DATE)
  @Column(name = "REISSUE_ENTRY_DATE")
  private Date reissueEntryDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "REISSUE_ENTRY_DATE_B")
  private Date reissueEntryDateB;

  @Temporal(TemporalType.DATE)
  @Column(name = "REISSUE_MODIFICATION_DATE")
  private Date reissueModificationDate;

  public MynoInfo() {}

  public int getMyNumberAccptCntlSeq() {
    return this.myNumberAccptCntlSeq;
  }

  public void setMyNumberAccptCntlSeq(int myNumberAccptCntlSeq) {
    this.myNumberAccptCntlSeq = myNumberAccptCntlSeq;
  }

  public int getAccNewCurrentKbn() {
    return this.accNewCurrentKbn;
  }

  public void setAccNewCurrentKbn(int accNewCurrentKbn) {
    this.accNewCurrentKbn = accNewCurrentKbn;
  }

  public int getAutholizedUserId() {
    return this.autholizedUserId;
  }

  public void setAutholizedUserId(int autholizedUserId) {
    this.autholizedUserId = autholizedUserId;
  }

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getCancelFlg() {
    return this.cancelFlg;
  }

  public void setCancelFlg(int cancelFlg) {
    this.cancelFlg = cancelFlg;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public Date getDisoisalCompDate() {
    return this.disoisalCompDate;
  }

  public void setDisoisalCompDate(Date disoisalCompDate) {
    this.disoisalCompDate = disoisalCompDate;
  }

  public Date getDisoisalDate() {
    return this.disoisalDate;
  }

  public void setDisoisalDate(Date disoisalDate) {
    this.disoisalDate = disoisalDate;
  }

  public Date getDisoisalDueDate() {
    return this.disoisalDueDate;
  }

  public void setDisoisalDueDate(Date disoisalDueDate) {
    this.disoisalDueDate = disoisalDueDate;
  }

  public Date getEntryDate() {
    return this.entryDate;
  }

  public void setEntryDate(Date entryDate) {
    this.entryDate = entryDate;
  }

  public String getFaultReasonComments() {
    return this.faultReasonComments;
  }

  public void setFaultReasonComments(String faultReasonComments) {
    this.faultReasonComments = faultReasonComments;
  }

  public int getJasdecSendFlg() {
    return this.jasdecSendFlg;
  }

  public void setJasdecSendFlg(int jasdecSendFlg) {
    this.jasdecSendFlg = jasdecSendFlg;
  }

  public String getJudgmentResult() {
    return this.judgmentResult;
  }

  public void setJudgmentResult(String judgmentResult) {
    this.judgmentResult = judgmentResult;
  }

  public Date getModificationDate() {
    return this.modificationDate;
  }

  public void setModificationDate(Date modificationDate) {
    this.modificationDate = modificationDate;
  }

  public Date getMynoAcceptDt() {
    return this.mynoAcceptDt;
  }

  public void setMynoAcceptDt(Date mynoAcceptDt) {
    this.mynoAcceptDt = mynoAcceptDt;
  }

  public int getMynoDocumentsId() {
    return this.mynoDocumentsId;
  }

  public void setMynoDocumentsId(int mynoDocumentsId) {
    this.mynoDocumentsId = mynoDocumentsId;
  }

  public Date getReissueEntryDate() {
    return this.reissueEntryDate;
  }

  public void setReissueEntryDate(Date reissueEntryDate) {
    this.reissueEntryDate = reissueEntryDate;
  }

  public Date getReissueEntryDateB() {
    return this.reissueEntryDateB;
  }

  public void setReissueEntryDateB(Date reissueEntryDateB) {
    this.reissueEntryDateB = reissueEntryDateB;
  }

  public Date getReissueModificationDate() {
    return this.reissueModificationDate;
  }

  public void setReissueModificationDate(Date reissueModificationDate) {
    this.reissueModificationDate = reissueModificationDate;
  }
}
