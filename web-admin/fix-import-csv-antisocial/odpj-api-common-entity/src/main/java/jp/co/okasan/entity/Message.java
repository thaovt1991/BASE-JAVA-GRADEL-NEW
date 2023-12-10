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

/** The persistent class for the MESSAGE database table. */
@Entity
@Table(name = "MESSAGE")
@NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m")
public class Message implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "ADDRESS_GRP")
  private int addressGrp;

  @Column(name = "AFTER_READ_FLG")
  private int afterReadFlg;

  @Column(name = "APPROVAL_FLG")
  private int approvalFlg;

  @Column(name = "ARCHIVE_FLG")
  private int archiveFlg;

  @Column(name = "ASCEND_NO")
  private int ascendNo;

  @Column(name = "CATEGORY")
  private int category;

  @Column(name = "COACTION_FLG")
  private int coactionFlg;

  @Column(name = "COMMENT_MEMO")
  private String commentMemo;

  @Temporal(TemporalType.DATE)
  @Column(name = "CONFIRM_DT")
  private Date confirmDt;

  @Column(name = "CONFIRM_KBN")
  private int confirmKbn;

  @Column(name = "CONTENT_CATEGORY")
  private int contentCategory;

  @Column(name = "DELETE_FLG")
  private int deleteFlg;

  @Column(name = "DISP_KBN")
  private int dispKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "DISPLAY_END_TM")
  private Date displayEndTm;

  @Column(name = "DISPLAY_KBN")
  private int displayKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "DISPLAY_START_TM")
  private Date displayStartTm;

  @Column(name = "DSP_CATEGORY_KBN")
  private int dspCategoryKbn;

  @Column(name = "ERASURE_METHOD")
  private int erasureMethod;

  @Column(name = "IMPORTANT_KBN")
  private int importantKbn;

  @Column(name = "INPUT_AGENT")
  private int inputAgent;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "INSERT_FLG")
  private int insertFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "INVALID_END_DT")
  private Date invalidEndDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "INVALID_START_DT")
  private Date invalidStartDt;

  @Column(name = "`MAIL _PROC_FLG`")
  private int mail_ProcFlg;

  @Lob
  @Column(name = "MAIL_DETAILS_1")
  private String mailDetails1;

  @Lob
  @Column(name = "MAIL_DETAILS_2")
  private String mailDetails2;

  @Lob
  @Column(name = "MAIL_DETAILS_3")
  private String mailDetails3;

  @Column(name = "MAIL_SEND_FLG")
  private int mailSendFlg;

  @Column(name = "MAIL_SEND_STS")
  private int mailSendSts;

  @Column(name = "MAIL_TITLE")
  private String mailTitle;

  @Lob
  @Column(name = "MOBILE_MSG_DETAILS_1")
  private String mobileMsgDetails1;

  @Lob
  @Column(name = "MOBILE_MSG_DETAILS_2")
  private String mobileMsgDetails2;

  @Lob
  @Column(name = "MOBILE_MSG_DETAILS_3")
  private String mobileMsgDetails3;

  @Column(name = "MOBILE_MSG_TITLE")
  private String mobileMsgTitle;

  @Lob
  @Column(name = "MSG_DETAILS_1")
  private String msgDetails1;

  @Lob
  @Column(name = "MSG_DETAILS_2")
  private String msgDetails2;

  @Lob
  @Column(name = "MSG_DETAILS_3")
  private String msgDetails3;

  @Id
  @Column(name = "MSG_NO")
  private int msgNo;

  @Column(name = "MSG_TITLE")
  private String msgTitle;

  @Column(name = "MSG_TYPE")
  private int msgType;

  @Column(name = "MUST_CONFIRM_FLG")
  private int mustConfirmFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  @Column(name = "WEEKDAY_INVALID_END_TM")
  private String weekdayInvalidEndTm;

  @Column(name = "WEEKDAY_INVALID_START_TM")
  private String weekdayInvalidStartTm;

  public Message() {}

  public int getAddressGrp() {
    return this.addressGrp;
  }

  public void setAddressGrp(int addressGrp) {
    this.addressGrp = addressGrp;
  }

  public int getAfterReadFlg() {
    return this.afterReadFlg;
  }

  public void setAfterReadFlg(int afterReadFlg) {
    this.afterReadFlg = afterReadFlg;
  }

  public int getApprovalFlg() {
    return this.approvalFlg;
  }

  public void setApprovalFlg(int approvalFlg) {
    this.approvalFlg = approvalFlg;
  }

  public int getArchiveFlg() {
    return this.archiveFlg;
  }

  public void setArchiveFlg(int archiveFlg) {
    this.archiveFlg = archiveFlg;
  }

  public int getAscendNo() {
    return this.ascendNo;
  }

  public void setAscendNo(int ascendNo) {
    this.ascendNo = ascendNo;
  }

  public int getCategory() {
    return this.category;
  }

  public void setCategory(int category) {
    this.category = category;
  }

  public int getCoactionFlg() {
    return this.coactionFlg;
  }

  public void setCoactionFlg(int coactionFlg) {
    this.coactionFlg = coactionFlg;
  }

  public String getCommentMemo() {
    return this.commentMemo;
  }

  public void setCommentMemo(String commentMemo) {
    this.commentMemo = commentMemo;
  }

  public Date getConfirmDt() {
    return this.confirmDt;
  }

  public void setConfirmDt(Date confirmDt) {
    this.confirmDt = confirmDt;
  }

  public int getConfirmKbn() {
    return this.confirmKbn;
  }

  public void setConfirmKbn(int confirmKbn) {
    this.confirmKbn = confirmKbn;
  }

  public int getContentCategory() {
    return this.contentCategory;
  }

  public void setContentCategory(int contentCategory) {
    this.contentCategory = contentCategory;
  }

  public int getDeleteFlg() {
    return this.deleteFlg;
  }

  public void setDeleteFlg(int deleteFlg) {
    this.deleteFlg = deleteFlg;
  }

  public int getDispKbn() {
    return this.dispKbn;
  }

  public void setDispKbn(int dispKbn) {
    this.dispKbn = dispKbn;
  }

  public Date getDisplayEndTm() {
    return this.displayEndTm;
  }

  public void setDisplayEndTm(Date displayEndTm) {
    this.displayEndTm = displayEndTm;
  }

  public int getDisplayKbn() {
    return this.displayKbn;
  }

  public void setDisplayKbn(int displayKbn) {
    this.displayKbn = displayKbn;
  }

  public Date getDisplayStartTm() {
    return this.displayStartTm;
  }

  public void setDisplayStartTm(Date displayStartTm) {
    this.displayStartTm = displayStartTm;
  }

  public int getDspCategoryKbn() {
    return this.dspCategoryKbn;
  }

  public void setDspCategoryKbn(int dspCategoryKbn) {
    this.dspCategoryKbn = dspCategoryKbn;
  }

  public int getErasureMethod() {
    return this.erasureMethod;
  }

  public void setErasureMethod(int erasureMethod) {
    this.erasureMethod = erasureMethod;
  }

  public int getImportantKbn() {
    return this.importantKbn;
  }

  public void setImportantKbn(int importantKbn) {
    this.importantKbn = importantKbn;
  }

  public int getInputAgent() {
    return this.inputAgent;
  }

  public void setInputAgent(int inputAgent) {
    this.inputAgent = inputAgent;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public int getInsertFlg() {
    return this.insertFlg;
  }

  public void setInsertFlg(int insertFlg) {
    this.insertFlg = insertFlg;
  }

  public Date getInvalidEndDt() {
    return this.invalidEndDt;
  }

  public void setInvalidEndDt(Date invalidEndDt) {
    this.invalidEndDt = invalidEndDt;
  }

  public Date getInvalidStartDt() {
    return this.invalidStartDt;
  }

  public void setInvalidStartDt(Date invalidStartDt) {
    this.invalidStartDt = invalidStartDt;
  }

  public int getMail_ProcFlg() {
    return this.mail_ProcFlg;
  }

  public void setMail_ProcFlg(int mail_ProcFlg) {
    this.mail_ProcFlg = mail_ProcFlg;
  }

  public String getMailDetails1() {
    return this.mailDetails1;
  }

  public void setMailDetails1(String mailDetails1) {
    this.mailDetails1 = mailDetails1;
  }

  public String getMailDetails2() {
    return this.mailDetails2;
  }

  public void setMailDetails2(String mailDetails2) {
    this.mailDetails2 = mailDetails2;
  }

  public String getMailDetails3() {
    return this.mailDetails3;
  }

  public void setMailDetails3(String mailDetails3) {
    this.mailDetails3 = mailDetails3;
  }

  public int getMailSendFlg() {
    return this.mailSendFlg;
  }

  public void setMailSendFlg(int mailSendFlg) {
    this.mailSendFlg = mailSendFlg;
  }

  public int getMailSendSts() {
    return this.mailSendSts;
  }

  public void setMailSendSts(int mailSendSts) {
    this.mailSendSts = mailSendSts;
  }

  public String getMailTitle() {
    return this.mailTitle;
  }

  public void setMailTitle(String mailTitle) {
    this.mailTitle = mailTitle;
  }

  public String getMobileMsgDetails1() {
    return this.mobileMsgDetails1;
  }

  public void setMobileMsgDetails1(String mobileMsgDetails1) {
    this.mobileMsgDetails1 = mobileMsgDetails1;
  }

  public String getMobileMsgDetails2() {
    return this.mobileMsgDetails2;
  }

  public void setMobileMsgDetails2(String mobileMsgDetails2) {
    this.mobileMsgDetails2 = mobileMsgDetails2;
  }

  public String getMobileMsgDetails3() {
    return this.mobileMsgDetails3;
  }

  public void setMobileMsgDetails3(String mobileMsgDetails3) {
    this.mobileMsgDetails3 = mobileMsgDetails3;
  }

  public String getMobileMsgTitle() {
    return this.mobileMsgTitle;
  }

  public void setMobileMsgTitle(String mobileMsgTitle) {
    this.mobileMsgTitle = mobileMsgTitle;
  }

  public String getMsgDetails1() {
    return this.msgDetails1;
  }

  public void setMsgDetails1(String msgDetails1) {
    this.msgDetails1 = msgDetails1;
  }

  public String getMsgDetails2() {
    return this.msgDetails2;
  }

  public void setMsgDetails2(String msgDetails2) {
    this.msgDetails2 = msgDetails2;
  }

  public String getMsgDetails3() {
    return this.msgDetails3;
  }

  public void setMsgDetails3(String msgDetails3) {
    this.msgDetails3 = msgDetails3;
  }

  public int getMsgNo() {
    return this.msgNo;
  }

  public void setMsgNo(int msgNo) {
    this.msgNo = msgNo;
  }

  public String getMsgTitle() {
    return this.msgTitle;
  }

  public void setMsgTitle(String msgTitle) {
    this.msgTitle = msgTitle;
  }

  public int getMsgType() {
    return this.msgType;
  }

  public void setMsgType(int msgType) {
    this.msgType = msgType;
  }

  public int getMustConfirmFlg() {
    return this.mustConfirmFlg;
  }

  public void setMustConfirmFlg(int mustConfirmFlg) {
    this.mustConfirmFlg = mustConfirmFlg;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }

  public int getUpdateUserCd() {
    return this.updateUserCd;
  }

  public void setUpdateUserCd(int updateUserCd) {
    this.updateUserCd = updateUserCd;
  }

  public String getWeekdayInvalidEndTm() {
    return this.weekdayInvalidEndTm;
  }

  public void setWeekdayInvalidEndTm(String weekdayInvalidEndTm) {
    this.weekdayInvalidEndTm = weekdayInvalidEndTm;
  }

  public String getWeekdayInvalidStartTm() {
    return this.weekdayInvalidStartTm;
  }

  public void setWeekdayInvalidStartTm(String weekdayInvalidStartTm) {
    this.weekdayInvalidStartTm = weekdayInvalidStartTm;
  }
}
