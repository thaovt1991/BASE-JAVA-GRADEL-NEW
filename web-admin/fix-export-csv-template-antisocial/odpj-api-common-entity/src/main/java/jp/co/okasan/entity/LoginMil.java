package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the LOGIN_MIL database table. */
@Entity
@Table(name = "LOGIN_MIL")
@NamedQuery(name = "LoginMil.findAll", query = "SELECT l FROM LoginMil l")
public class LoginMil implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private LoginMilPK id;

  @Column(name = "LOGIN_DATETIME")
  private int loginDatetime;

  @Column(name = "MAIL_ADDRESS")
  private String mailAddress;

  @Column(name = "MAIL_SEND_DATETIME")
  private int mailSendDatetime;

  @Column(name = "NEW_DEVICE")
  private String newDevice;

  @Column(name = "NEW_IP_ADDRESS")
  private String newIpAddress;

  @Column(name = "REASON")
  private String reason;

  @Column(name = "SEND_RESULT")
  private int sendResult;

  public LoginMil() {}

  public LoginMilPK getId() {
    return this.id;
  }

  public void setId(LoginMilPK id) {
    this.id = id;
  }

  public int getLoginDatetime() {
    return this.loginDatetime;
  }

  public void setLoginDatetime(int loginDatetime) {
    this.loginDatetime = loginDatetime;
  }

  public String getMailAddress() {
    return this.mailAddress;
  }

  public void setMailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
  }

  public int getMailSendDatetime() {
    return this.mailSendDatetime;
  }

  public void setMailSendDatetime(int mailSendDatetime) {
    this.mailSendDatetime = mailSendDatetime;
  }

  public String getNewDevice() {
    return this.newDevice;
  }

  public void setNewDevice(String newDevice) {
    this.newDevice = newDevice;
  }

  public String getNewIpAddress() {
    return this.newIpAddress;
  }

  public void setNewIpAddress(String newIpAddress) {
    this.newIpAddress = newIpAddress;
  }

  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public int getSendResult() {
    return this.sendResult;
  }

  public void setSendResult(int sendResult) {
    this.sendResult = sendResult;
  }
}
