package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BRANCH")
@NamedQuery(name = "Branch.findAll", query = "SELECT b FROM Branch b")
public class Branch implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "BRANCH_CD")
  private Integer branchCd;

  @Column(name = "BRANCH_NM")
  private String branchNm;

  @Column(name = "BRANCH_KANA_NM")
  private String branchKanaNm;

  @Column(name = "EXPIRE_FLG")
  private Integer expireFlg;

  @Column(name = "BRANCH_KIND_CD")
  private Integer branchKindCd;

  @Column(name = "PLINCIPAL_FLG")
  private Integer plincipalFlg;

  @Column(name = "OWN_BRANCH_FLG")
  private Integer ownBranchFlg;

  @Column(name = "BROKER_CD")
  private Integer brokerCd;

  @Column(name = "DEFAULT_SALES_CD")
  private Integer defaultSalesCd;

  @Column(name = "ZIP_NO_1")
  private String zipNo1;

  @Column(name = "ZIP_NO_2")
  private String zipNo2;

  @Column(name = "SEC_CO_ADDRESS1")
  private String secCoAddress1;

  @Column(name = "SEC_CO_ADDRESS2")
  private String secCoAddress2;

  @Column(name = "SEC_CO_ADDRESS3")
  private String secCoAddress3;

  @Column(name = "SEC_CO_ADDRESS4")
  private String secCoAddress4;

  @Column(name = "INPUT_TM")
  private LocalDateTime inputTm;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DATETIME")
  private LocalDateTime updateDatetime;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
