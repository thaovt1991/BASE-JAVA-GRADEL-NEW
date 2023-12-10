package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/** The persistent class for the USER_INFO database table. */
@Entity
@Table(name = "USER_INFO")
@Data
public class UserInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private UserInfoPK id;

  @Column(name = "BRANCH_CD")
  private Integer branchCd;

  @Column(name = "ROLE_CD")
  private Integer roleCd;

  @Column(name = "TRADER_CD")
  private Integer traderCd;

  @Column(name = "USER_NM")
  private String userNm;

  @Column(name = "USER_NM_KANA")
  private String userNmKana;

  @Column(name = "PASSWORD")
  private String password;

  @Temporal(TemporalType.DATE)
  @Column(name = "PASSWORD_TERM")
  private Date passwordTerm;

  @Column(name = "PRE_PASSWORD")
  private String prePassword;

  @Column(name = "PRE_PRE_PASSWORD")
  private String prePrePassword;

  @Column(name = "PIN_NO")
  private Integer pinNo;

  @Column(name = "LOCK_FLG")
  private Integer lockFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "START_DT")
  private Date startDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "END_DT")
  private Date endDt;

  @Column(name = "DELETE_FLG")
  private Boolean deleteFlag;

  @Column(name = "CREATE_USER_CD")
  private Integer createUserCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_DT")
  private Date createDt;

  @Column(name = "UPDATE_USER_CD")
  private Integer updateUserCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DT")
  private Date updateDt;
}
