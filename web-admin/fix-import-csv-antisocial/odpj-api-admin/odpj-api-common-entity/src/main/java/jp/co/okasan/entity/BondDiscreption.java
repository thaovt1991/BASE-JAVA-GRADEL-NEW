package jp.co.okasan.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "BOND_DISCREPTION")
public class BondDiscreption {
  @Id
  @Size(max = 12)
  @Column(name = "ISSUE_CD", nullable = false, length = 12)
  private String id;

  @Column(name = "VALID_DT")
  private LocalDate validDt;

  @Size(max = 120)
  @Column(name = "SEC_FULL_DESC_KANJI", length = 120)
  private String secFullDescKanji;

  @Size(max = 48)
  @Column(name = "SEC_SHORT_DESC_KANJI", length = 48)
  private String secShortDescKanji;

  @Size(max = 48)
  @Column(name = "SEC_SHORT_DESC_KANA", length = 48)
  private String secShortDescKana;

  @Size(max = 42)
  @Column(name = "TOKEN_ADDRESS", length = 42)
  private String tokenAddress;

  @Size(max = 10)
  @Column(name = "KAIGO", length = 10)
  private String kaigo;

  @Size(max = 3)
  @Column(name = "CCY_CD", length = 3)
  private String ccyCd;

  @Size(max = 3)
  @Column(name = "COUNTRY_CD", length = 3)
  private String countryCd;

  @Size(max = 3)
  @Column(name = "ISSUE_COUNTRY_CD", length = 3)
  private String issueCountryCd;

  @Column(name = "ISSUE_MARKET_KBN")
  private Integer issueMarketKbn;

  @Size(max = 12)
  @Column(name = "ISSUE_SEC_CD", length = 12)
  private String issueSecCd;

  @Size(max = 4)
  @Column(name = "CUSTODIAN_CD", length = 4)
  private String custodianCd;

  @Column(name = "BOND1_KBN")
  private Integer bond1Kbn;

  @Column(name = "BOND2_KBN")
  private Integer bond2Kbn;

  @Column(name = "BOND3_KBN")
  private Integer bond3Kbn;

  @Column(name = "SEPARATE_SELF_ASSESS_TAX_FLG")
  private Integer separateSelfAssessTaxFlg;

  @Column(name = "TRADE_UNIT")
  private Integer tradeUnit;

  @Column(name = "COUPON_FORM_KBN")
  private Integer couponFormKbn;

  @Column(name = "COUPON_RATE")
  private Integer couponRate;

  @Column(name = "NEXT_COUPON_RATE")
  private Integer nextCouponRate;

  @Column(name = "NEXT_COUPON_RATE_UPDATE_DT")
  private LocalDate nextCouponRateUpdateDt;

  @Column(name = "COUPON_RATE_OLD")
  private Integer couponRateOld;

  @Column(name = "COUPON_RATE_CHANGE_DT")
  private LocalDate couponRateChangeDt;

  @Column(name = "COUPON_RATE_OLD2")
  private Integer couponRateOld2;

  @Column(name = "COUPON_RATE_CHANGE2_DT")
  private LocalDate couponRateChange2Dt;

  @Column(name = "WITHOUTHOLDING_APPLY_KBN")
  private Integer withoutholdingApplyKbn;

  @Column(name = "ACC_INT_CALC_KBN")
  private Integer accIntCalcKbn;

  @Column(name = "ACC_INT_CALC_YEAR_DAYS")
  private Integer accIntCalcYearDays;

  @Column(name = "ACC_INT_CALC_MONTH_DAYS")
  private Integer accIntCalcMonthDays;

  @Column(name = "ACC_INT_CALC_LEAP_YEAR_FLG")
  private Integer accIntCalcLeapYearFlg;

  @Column(name = "SEC_ISSUE_FLG")
  private Integer secIssueFlg;

  @Column(name = "COMM_RATE")
  private Integer commRate;

  @Column(name = "COLLECT_COMM_RATE")
  private Integer collectCommRate;

  @Column(name = "FLOAT_COMM_RATE")
  private Integer floatCommRate;

  @Column(name = "T_BUY_COMM_RATE")
  private Integer tBuyCommRate;

  @Column(name = "T_SELL_COMM_RATE")
  private Integer tSellCommRate;

  @Column(name = "IR_TAX_PAY_REPORT_KBN")
  private Integer irTaxPayReportKbn;

  @Size(max = 3)
  @Column(name = "COUPON_CCY_CD", length = 3)
  private String couponCcyCd;

  @Size(max = 3)
  @Column(name = "MATURITY_CCY_CD", length = 3)
  private String maturityCcyCd;

  @Column(name = "SUB_TERM_FROM_DT")
  private LocalDate subTermFromDt;

  @Column(name = "SUB_TERM_TO_DT")
  private LocalDate subTermToDt;

  @Column(name = "STD_PRC")
  private Integer stdPrc;

  @Column(name = "OFFER_NOMINAL")
  private Integer offerNominal;

  @Column(name = "ISSUE_DT")
  private LocalDate issueDt;

  @Column(name = "ISSUE_PRC")
  private Integer issuePrc;

  @Column(name = "SUB_PAY_DT")
  private LocalDate subPayDt;

  @Column(name = "ANNUAL_COUPON_CNT_KBN")
  private Integer annualCouponCntKbn;

  @Size(max = 4)
  @Column(name = "COUPON_DT1", length = 4)
  private String couponDt1;

  @Size(max = 4)
  @Column(name = "COUPON_DT2", length = 4)
  private String couponDt2;

  @Size(max = 4)
  @Column(name = "COUPON_DT3", length = 4)
  private String couponDt3;

  @Size(max = 4)
  @Column(name = "COUPON_DT4", length = 4)
  private String couponDt4;

  @Column(name = "HOLIDAY_INT_KBN")
  private Integer holidayIntKbn;

  @Column(name = "FIRST_COUPON_START_DT")
  private LocalDate firstCouponStartDt;

  @Column(name = "FIRST_COUPON_DT")
  private LocalDate firstCouponDt;

  @Column(name = "PREV_COUPON_DT")
  private LocalDate prevCouponDt;

  @Column(name = "THIS_COUPON_DT")
  private LocalDate thisCouponDt;

  @Column(name = "FO_INT_CALC_KBN")
  private Integer foIntCalcKbn;

  @Column(name = "FRACTION_PROCESS_KBN")
  private Integer fractionProcessKbn;

  @Column(name = "MATURITY_DT")
  private LocalDate maturityDt;

  @Column(name = "MATURITY_PRC")
  private Integer maturityPrc;

  @Column(name = "HOLIDAY_RDM_KBN")
  private Integer holidayRdmKbn;

  @Column(name = "CALLABLE_MATURITY_DT")
  private LocalDate callableMaturityDt;

  @Column(name = "CALLABLE_MATURITY_PRC")
  private Integer callableMaturityPrc;

  @Column(name = "INTERM_RDM_KBN")
  private Integer intermRdmKbn;

  @Column(name = "TRADE_CONTROL_KBN")
  private Integer tradeControlKbn;

  @Column(name = "TRADE_STOP_START_DT")
  private LocalDate tradeStopStartDt;

  @Column(name = "TRADE_STOP_END_DT")
  private LocalDate tradeStopEndDt;

  @Column(name = "FOREIGN_RESTRIC_KBN")
  private Integer foreignRestricKbn;

  @Column(name = "AMERICAN_RESTRIC_KBN")
  private Integer americanRestricKbn;

  @Column(name = "DO_FO_CLASS_KBN")
  private Integer doFoClassKbn;

  @Column(name = "PP_PO_TYP")
  private Integer ppPoTyp;

  @Column(name = "RIGHTS_OFFERING_DT")
  private LocalDate rightsOfferingDt;

  @Column(name = "CAPITAL_INCR_DECR_FLG")
  private Integer capitalIncrDecrFlg;

  @Column(name = "DEL_FLG")
  private Integer delFlg;

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
