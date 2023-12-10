package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/** The persistent class for the LOGIN_INFO database table. */
@Data
@Entity
@Table(name = "LOGIN_INFO")
public class LoginInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "LOGIN_ID")
  private String loginId;

  @Column(name = "LOGIN_PASSWD")
  private String loginPasswd;

  @Column(name = "BRANCH_CD")
  private Integer branchCd;

  @Column(name = "COUNT")
  private Integer count;

  @Column(name = "CUSTOMER_CD")
  private Integer customerCd;

  @Column(name = "DEVICE1")
  private String device1;

  @Column(name = "DEVICE2")
  private String device2;

  @Column(name = "DEVICE3")
  private String device3;

  @Column(name = "FAILURE_COUNT")
  private Integer failureCount;

  @Temporal(TemporalType.DATE)
  @Column(name = "FAILURE_TM")
  private Date failureTm;

  @Column(name = "IP_ADR1")
  private String ipAdr1;

  @Column(name = "IP_ADR2")
  private String ipAdr2;

  @Column(name = "IP_ADR3")
  private String ipAdr3;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SUCCESS_TM")
  private Date lastSuccessTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "LOGIN_PASSWD_EXPIRE_DT")
  private Date loginPasswdExpireDt;

  @Column(name = "LOGIN_STATUS")
  private Integer loginStatus;

  @Column(name = "NOTICE_APPLY_FLG")
  private Integer noticeApplyFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "NOTICE_APPLY_TM")
  private Date noticeApplyTm;

  @Column(name = "PIN_NO")
  private String pinNo;

  @Column(name = "PIN_NO_COUNT")
  private Integer pinNoCount;

  @Temporal(TemporalType.DATE)
  @Column(name = "PIN_NO_EXPIRE_DT")
  private Date pinNoExpireDt;

  @Column(name = "PIN_NO_FAILURE_COUNT")
  private Integer pinNoFailureCount;

  @Temporal(TemporalType.DATE)
  @Column(name = "PIN_NO_FAILURE_TM")
  private Date pinNoFailureTm;

  @Column(name = "PIN_NO_OMIT_FLG")
  private Integer pinNoOmitFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "PIN_NO_SUCCESS_TM")
  private Date pinNoSuccessTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "SUCCESS_TM")
  private Date successTm;
}
