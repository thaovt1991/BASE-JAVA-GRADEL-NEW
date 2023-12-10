package jp.co.okasan.domain.response;

import com.univocity.parsers.annotations.Parsed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BondDiscreptionResponse {
    private String id;

    @Parsed
    private LocalDate validDt;

    @Parsed
    private String secFullDescKanji;


    @Parsed
    private String secShortDescKanji;


    @Parsed
    private String secShortDescKana;


    @Parsed
    private String tokenAddress;


    @Parsed
    private String kaigo;


    @Parsed
    private String ccyCd;


    @Parsed
    private String countryCd;


    @Parsed
    private String issueCountryCd;

    @Parsed
    private Integer issueMarketKbn;


    @Parsed
    private String issueSecCd;


    @Parsed
    private String custodianCd;

    @Parsed
    private Integer bond1Kbn;

    @Parsed
    private Integer bond2Kbn;

    @Parsed
    private Integer bond3Kbn;

    @Parsed
    private Integer separateSelfAssessTaxFlg;

    @Parsed
    private Integer tradeUnit;

    @Parsed
    private Integer couponFormKbn;

    @Parsed
    private Integer couponRate;

    @Parsed
    private Integer nextCouponRate;

    @Parsed
    private LocalDate nextCouponRateUpdateDt;

    @Parsed
    private Integer couponRateOld;

    @Parsed
    private LocalDate couponRateChangeDt;

    @Parsed
    private Integer couponRateOld2;

    @Parsed
    private LocalDate couponRateChange2Dt;

    @Parsed
    private Integer withoutholdingApplyKbn;

    @Parsed
    private Integer accIntCalcKbn;

    @Parsed
    private Integer accIntCalcYearDays;

    @Parsed
    private Integer accIntCalcMonthDays;

    @Parsed
    private Integer accIntCalcLeapYearFlg;

    @Parsed
    private Integer secIssueFlg;

    @Parsed
    private Integer commRate;

    @Parsed
    private Integer collectCommRate;

    @Parsed
    private Integer floatCommRate;

    @Parsed
    private Integer tBuyCommRate;

    @Parsed
    private Integer tSellCommRate;

    @Parsed
    private Integer irTaxPayReportKbn;


    @Parsed
    private String couponCcyCd;


    @Parsed
    private String maturityCcyCd;

    @Parsed
    private LocalDate subTermFromDt;

    @Parsed
    private LocalDate subTermToDt;

    @Parsed
    private Integer stdPrc;

    @Parsed
    private Integer offerNominal;

    @Parsed
    private LocalDate issueDt;

    @Parsed
    private Integer issuePrc;

    @Parsed
    private LocalDate subPayDt;

    @Parsed
    private Integer annualCouponCntKbn;


    @Parsed
    private String couponDt1;


    @Parsed
    private String couponDt2;


    @Parsed
    private String couponDt3;


    @Parsed
    private String couponDt4;

    @Parsed
    private Integer holidayIntKbn;

    @Parsed
    private LocalDate firstCouponStartDt;

    @Parsed
    private LocalDate firstCouponDt;

    @Parsed
    private LocalDate prevCouponDt;

    @Parsed
    private LocalDate thisCouponDt;

    @Parsed
    private Integer foIntCalcKbn;

    @Parsed
    private Integer fractionProcessKbn;

    @Parsed
    private LocalDate maturityDt;

    @Parsed
    private Integer maturityPrc;

    @Parsed
    private Integer holidayRdmKbn;

    @Parsed
    private LocalDate callableMaturityDt;

    @Parsed
    private Integer callableMaturityPrc;

    @Parsed
    private Integer intermRdmKbn;

    @Parsed
    private Integer tradeControlKbn;

    @Parsed
    private LocalDate tradeStopStartDt;

    @Parsed
    private LocalDate tradeStopEndDt;

    @Parsed
    private Integer foreignRestricKbn;

    @Parsed
    private Integer americanRestricKbn;

    @Parsed
    private Integer doFoClassKbn;

    @Parsed
    private Integer ppPoTyp;

    @Parsed
    private LocalDate rightsOfferingDt;

    @Parsed
    private Integer capitalIncrDecrFlg;

    @Parsed
    private Integer delFlg;

    @Parsed
    private LocalDate inputTm;

    @Parsed
    private String createPrgId;

    @Parsed
    private LocalDate updateDatetime;

    @Parsed
    private String updatePrgId;
}
