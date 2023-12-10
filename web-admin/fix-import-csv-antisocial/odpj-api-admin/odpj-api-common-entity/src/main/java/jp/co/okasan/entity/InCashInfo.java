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
import lombok.Data;

/** The persistent class for the IN_CASH_INFO database table. */
@Entity
@Table(name = "IN_CASH_INFO")
@Data
@NamedQuery(name = "InCashInfo.findAll", query = "SELECT i FROM InCashInfo i")
// @IdClass(InCashInfo.class)
public class InCashInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private InCashInfoPK id;
  //    @Id
  //    @Temporal(TemporalType.DATE)
  //    @Column(name = "INPUT_DATE")
  //    private java.util.Date inputDate;
  //
  //    @Id
  //    @Temporal(TemporalType.DATE)
  //    @Column(name = "FILE_PROC_TM")
  //    private java.util.Date fileProcTm;
  //
  //    @Id
  //    @Column(name = "IN_CASH_NO")
  //    private Integer inCashNo;

  @Column(name = "ACCOUNT_NUM")
  private Integer accountNum;

  @Column(name = "BANK_BRANCH_CD")
  private Integer bankBranchCd;

  @Column(name = "BANK_CD")
  private Integer bankCd;

  @Column(name = "BANK_DEPOSIT_KBN")
  private Integer bankDepositKbn;

  @Column(name = "BRANCH_CD")
  private Integer branchCd;

  @Column(name = "CLIENT_NM_KANA")
  private String clientNmKana;

  @Column(name = "CORRES_AMOUNT")
  private Integer corresAmount;

  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_DT")
  private Date createDt;

  @Column(name = "CUSTOMER_CD")
  private Integer customerCd;

  @Column(name = "FROM_CLIENT_BANK_ACC_NO")
  private Integer fromClientBankAccNo;

  @Column(name = "FROM_CLIENT_BANK_BRANCH_NO")
  private Integer fromClientBankBranchNo;

  @Column(name = "IN_CASH_AMOUNT")
  private Integer inCashAmount;

  @Column(name = "IN_CASH_TYPE")
  private Integer inCashType;

  @Column(name = "IN_OUT_CASH_NO")
  private Integer inOutCashNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "KANJYO_DATE")
  private Integer kanjyoDate;

  @Column(name = "KISAN_DATE")
  private Integer kisanDate;

  @Column(name = "LOGIN_ID")
  private String loginId;

  @Column(name = "OUTPUT_NAME")
  private String outputName;

  @Column(name = "P_DUMMY1")
  private String pDummy1;

  @Column(name = "RECEIVE_MONEY_STS")
  private Integer receiveMoneySts;

  @Column(name = "RECEIVE_MONEY_UNMATCH_STS")
  private Integer receiveMoneyUnmatchSts;

  @Column(name = "RMT_BANK_NAME")
  private String rmtBankName;

  @Column(name = "RMT_BRUNCH_NAME")
  private String rmtBrunchName;

  @Column(name = "SHOKAI_NO")
  private Integer shokaiNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;
}
