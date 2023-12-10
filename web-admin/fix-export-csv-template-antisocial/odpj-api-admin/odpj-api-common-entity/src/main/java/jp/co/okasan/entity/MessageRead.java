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

/** The persistent class for the MESSAGE_READ database table. */
@Entity
@Table(name = "MESSAGE_READ")
@NamedQuery(name = "MessageRead.findAll", query = "SELECT m FROM MessageRead m")
public class MessageRead implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private MessageReadPK id;

  @Column(name = "CLIENT_NM")
  private String clientNm;

  @Column(name = "DELETE_FLG")
  private int deleteFlg;

  @Column(name = "INPUT_AGENT")
  private int inputAgent;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "LOGIN_ID")
  private String loginId;

  @Column(name = "MSG_NO")
  private int msgNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  @Column(name = "VIEW_FLG")
  private int viewFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "VIEW_TM")
  private Date viewTm;

  public MessageRead() {}

  public MessageReadPK getId() {
    return this.id;
  }

  public void setId(MessageReadPK id) {
    this.id = id;
  }

  public String getClientNm() {
    return this.clientNm;
  }

  public void setClientNm(String clientNm) {
    this.clientNm = clientNm;
  }

  public int getDeleteFlg() {
    return this.deleteFlg;
  }

  public void setDeleteFlg(int deleteFlg) {
    this.deleteFlg = deleteFlg;
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

  public String getLoginId() {
    return this.loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public int getMsgNo() {
    return this.msgNo;
  }

  public void setMsgNo(int msgNo) {
    this.msgNo = msgNo;
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

  public int getViewFlg() {
    return this.viewFlg;
  }

  public void setViewFlg(int viewFlg) {
    this.viewFlg = viewFlg;
  }

  public Date getViewTm() {
    return this.viewTm;
  }

  public void setViewTm(Date viewTm) {
    this.viewTm = viewTm;
  }
}
