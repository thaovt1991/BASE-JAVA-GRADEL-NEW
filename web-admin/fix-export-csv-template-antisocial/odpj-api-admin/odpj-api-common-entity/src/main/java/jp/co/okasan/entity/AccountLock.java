package jp.co.okasan.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "ACCOUNT_LOCK")
public class AccountLock {
  @EmbeddedId private AccountLockPK id;

  @NotNull @Column(name = "BRANCH_CD", insertable = false, updatable = false)
  private Integer branchCd;

  @NotNull @Column(name = "CUSTOMER_CD", insertable = false, updatable = false)
  private Integer customerCd;

  @Column(name = "ACC_LOCK_FLG")
  private Integer accLockFlg;

  @Size(max = 100)
  @Column(name = "ACC_LOCK_REASON", length = 100)
  private String accLockReason;

  @Column(name = "ACC_LOCK_LOGIN_STS")
  private Integer accLockLoginSts;

  @Column(name = "ACC_LOCK_REQ_STS")
  private Integer accLockReqSts;

  @Column(name = "ACC_LOCK_TRD_STS")
  private Integer accLockTrdSts;

  @Column(name = "AC_LOCK_FLG")
  private Integer acLockFlg;

  @Size(max = 100)
  @Column(name = "AC_LOCK_REASON", length = 100)
  private String acLockReason;

  @Column(name = "AC_LOCK_LOGIN_STS")
  private Integer acLockLoginSts;

  @Column(name = "AC_LOCK_REQ_STS")
  private Integer acLockReqSts;

  @Column(name = "AC_LOCK_TRD_STS")
  private Integer acLockTrdSts;

  @Column(name = "SS_LOCK_FLG")
  private Integer ssLockFlg;

  @Size(max = 100)
  @Column(name = "SS_LOCK_REASON", length = 100)
  private String ssLockReason;

  @Column(name = "SS_LOCK_LOGIN_STS")
  private Integer ssLockLoginSts;

  @Column(name = "SS_LOCK_REQ_STS")
  private Integer ssLockReqSts;

  @Column(name = "SS_LOCK_TRD_STS")
  private Integer ssLockTrdSts;

  @Column(name = "BAIBAI_TEISI_FLG")
  private Integer baibaiTeisiFlg;

  @Size(max = 100)
  @Column(name = "BAIBAI_TEISI_REASON", length = 100)
  private String baibaiTeisiReason;

  @Column(name = "KAITUKE_KINSI_FLG")
  private Integer kaitukeKinsiFlg;

  @Size(max = 100)
  @Column(name = "KATUKE_KINSI_REASON", length = 100)
  private String katukeKinsiReason;

  @Column(name = "BAIKYAKU_KINSI_FLG")
  private Integer baikyakuKinsiFlg;

  @Size(max = 100)
  @Column(name = "BAIKYAKU_KINSI_REASON", length = 100)
  private String baikyakuKinsiReason;

  @Column(name = "NYUUKINN_TEISI_FLG")
  private Integer nyuukinnTeisiFlg;

  @Size(max = 100)
  @Column(name = "NYUUKIN_TEISI_REASON", length = 100)
  private String nyuukinTeisiReason;

  @Column(name = "SYUKKINN_TEISI_FLG")
  private Integer syukkinnTeisiFlg;

  @Size(max = 100)
  @Column(name = "SYUKKIN_TEISI_REASON", length = 100)
  private String syukkinTeisiReason;

  @Column(name = "SYUKKO_TEISI_FLG")
  private Integer syukkoTeisiFlg;

  @Size(max = 100)
  @Column(name = "SYUKKO_TEISO_REASON", length = 100)
  private String syukkoTeisoReason;

  @Column(name = "INPUT_TM")
  private LocalDate inputTm;

  @Size(max = 32)
  @Column(name = "CREATE_PRG_ID", length = 32)
  private String createPrgId;

  @Column(name = "UPDATE_DATETIME")
  private LocalDate updateDatetime;

  @Size(max = 32)
  @Column(name = "UPDATE_PRG_ID", length = 32)
  private String updatePrgId;
}
