package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "YORYOKU")
@IdClass(YoryokuPK.class)
public class Yoryoku implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "BRANCH_CD")
  private String branchCd;

  @Id
  @Column(name = "CUSTOMER_CD")
  private Integer customerCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "VALUE_DT")
  private Date valueDt;

  @Column(name = "PREVD_CASH_BALANCE")
  private Integer prevdCashBalance;

  @Column(name = "TODAY_VD_IN_CASH_STOCK")
  private Integer todayVdInCashStock;

  @Column(name = "TODAY_VD_OUT_CASH_SIMPLE")
  private Integer todayVdOutCashSimple;

  @Column(name = "TODAY_VD_IN_CASH_FOR_OFFSET")
  private Integer todayVdInCashForOffset;

  @Column(name = "TODAY_CASH_BALANCE")
  private Integer todayCashBalance;

  @Column(name = "OUT_CASH_REST_LOOP")
  private Integer outCashRestLoop;

  @Column(name = "OUT_CASH_REST_COMM")
  private Integer outCashRestComm;

  @Column(name = "SIMPLE_SELL_NET_AMT")
  private Integer simpleSellNetAmt;

  @Column(name = "MONEY_TO_SPARE")
  private Integer moneyToSpare;

  @Column(name = "CLIENT_BUYING_POWER")
  private Integer clientBuyingPower;

  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
