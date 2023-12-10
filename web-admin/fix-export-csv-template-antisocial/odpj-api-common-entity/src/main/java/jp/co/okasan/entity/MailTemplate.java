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

/** The persistent class for the MAIL_TEMPLATE database table. */
@Entity
@Table(name = "MAIL_TEMPLATE")
@NamedQuery(name = "MailTemplate.findAll", query = "SELECT m FROM MailTemplate m")
public class MailTemplate implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "MAIL_KIND_KBN")
  private int mailKindKbn;

  @Lob
  @Column(name = "BODY")
  private String body;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  public MailTemplate() {}

  public int getMailKindKbn() {
    return this.mailKindKbn;
  }

  public void setMailKindKbn(int mailKindKbn) {
    this.mailKindKbn = mailKindKbn;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }
}
