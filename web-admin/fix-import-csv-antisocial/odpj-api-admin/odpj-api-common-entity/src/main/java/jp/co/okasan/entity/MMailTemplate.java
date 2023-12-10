package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** The persistent class for the M_MAIL_TEMPLATE database table. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "M_MAIL_TEMPLATE")
@NamedQuery(name = "MMailTemplate.findAll", query = "SELECT m FROM MMailTemplate m")
public class MMailTemplate implements Serializable {

  private static final long serialVersionUID = 1L;

  // Add column with API

  @EmbeddedId private MMailTemplatePK id;

  @Column(name = "MAIL_CLS")
  private String mailCls;

  @Column(name = "MAIL_TYPE")
  private String mailType;

  @Column(name = "SUBJECT")
  private String subject;

  @Column(name = "BODY_TEXT")
  private String bodyText;

  @Column(name = "FROM_MAIL_ADDR")
  private String fromMailAddr;

  @Column(name = "REPLY_TO_MAIL_ADDR")
  private String replyToMailAddr;

  @Column(name = "CC_MAIL_ADDR")
  private String ccMailAddr;

  @Column(name = "BCC_MAIL_ADDR")
  private String bccMailAddr;

  @Column(name = "RETRY_COUNT")
  private Integer retryCount;

  //	@Temporal(TemporalType.DATE)
  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  //	@Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
