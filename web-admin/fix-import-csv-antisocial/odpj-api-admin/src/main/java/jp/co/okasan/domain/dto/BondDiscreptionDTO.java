package jp.co.okasan.domain.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class BondDiscreptionDTO {
    @Size(max = 2)
    @CsvBindByName(column = "issueCd")
    private String issueCd;
    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByName(column = "validDt")
    private LocalDate validDt;
    @CsvBindByName(column = "secFullDescKanji")
    private String secFullDescKanji;
    @CsvBindByName(column = "secShortDescKanji")
    private String secShortDescKanji;
    @CsvBindByName(column = "secShortDescKana")
    private String secShortDescKana;
    @CsvBindByName(column = "tokenAddress")
    private String tokenAddress;
    @CsvBindByName(column = "kaigo")
    private String kaigo;
    @CsvBindByName(column = "ccyCd")
    private String ccyCd;
    @CsvBindByName(column = "countryCd")
    private String countryCd;
    @CsvBindByName(column = "issueCountryCd")
    private String issueCountryCd;
    @CsvBindByName(column = "issueMarketKbn")
    private Integer issueMarketKbn;
    @CsvBindByName(column = "issueSecCd")
    private String issueSecCd;
    @CsvBindByName(column = "custodianCd")
    private String custodianCd;
    @CsvBindByName(column = "bond1Kbn")
    private Integer bond1Kbn;
    @CsvBindByName(column = "bond2Kbn")
    private Integer bond2Kbn;
    @CsvBindByName(column = "bond3Kbn")
    private Integer bond3Kbn;
    @CsvBindByName(column = "separateSelfAssessTaxFlg")
    private Integer separateSelfAssessTaxFlg;
    @CsvBindByName(column = "tradeUnit")
    private Integer tradeUnit;
    @CsvBindByName(column = "couponFormKbn")
    private Integer couponFormKbn;
    @CsvBindByName(column = "couponRate")
    private Integer couponRate;
    @CsvBindByName(column = "nextCouponRate")
    private Integer nextCouponRate;
    @CsvBindByName(column = "nextCouponRateUpdateDt")
    private LocalDate nextCouponRateUpdateDt;
    @CsvBindByName(column = "couponRateOld")
    private Integer couponRateOld;
    @CsvBindByName(column = "couponRateChangeDt")
    private LocalDate couponRateChangeDt;
    @CsvBindByName(column = "couponRateOld2")
    private Integer couponRateOld2;
    @CsvBindByName(column = "couponRateChange2Dt")
    private LocalDate couponRateChange2Dt;
    @CsvBindByName(column = "withoutholdingApplyKbn")
    private Integer withoutholdingApplyKbn;
    @CsvBindByName(column = "accIntCalcKbn")
    private Integer accIntCalcKbn;
    @CsvBindByName(column = "accIntCalcYearDays")
    private Integer accIntCalcYearDays;
    @CsvBindByName(column = "accIntCalcMonthDays")
    private Integer accIntCalcMonthDays;
    @CsvBindByName(column = "accIntCalcLeapYearFlg")
    private Integer accIntCalcLeapYearFlg;
    @CsvBindByName(column = "secIssueFlg")
    private Integer secIssueFlg;
    @CsvBindByName(column = "commRate")
    private Integer commRate;
    @CsvBindByName(column = "collectCommRate")
    private Integer collectCommRate;
    @CsvBindByName(column = "floatCommRate")
    private Integer floatCommRate;
    @CsvBindByName(column = "tBuyCommRate")
    private Integer tBuyCommRate;
    @CsvBindByName(column = "tSellCommRate")
    private Integer tSellCommRate;
    @CsvBindByName(column = "irTaxPayReportKbn")
    private Integer irTaxPayReportKbn;
    @CsvBindByName(column = "couponCcyCd")
    private String couponCcyCd;
    @CsvBindByName(column = "maturityCcyCd")
    private String maturityCcyCd;
    @CsvBindByName(column = "subTermFromDt")
    private LocalDate subTermFromDt;
    @CsvBindByName(column = "subTermToDt")
    private LocalDate subTermToDt;
    @CsvBindByName(column = "stdPrc")
    private Integer stdPrc;
    @CsvBindByName(column = "offerNominal")
    private Integer offerNominal;
    @CsvBindByName(column = "issueDt")
    private LocalDate issueDt;
    @CsvBindByName(column = "issuePrc")
    private Integer issuePrc;
    @CsvBindByName(column = "subPayDt")
    private LocalDate subPayDt;
    @CsvBindByName(column = "annualCouponCntKbn")
    private Integer annualCouponCntKbn;
    @CsvBindByName(column = "couponDt1")
    private String couponDt1;
    @CsvBindByName(column = "couponDt2")
    private String couponDt2;
    @CsvBindByName(column = "couponDt3")
    private String couponDt3;
    @CsvBindByName(column = "couponDt4")
    private String couponDt4;
    @CsvBindByName(column = "holidayIntKbn")
    private Integer holidayIntKbn;
    @CsvBindByName(column = "firstCouponStartDt")
    private LocalDate firstCouponStartDt;
    @CsvBindByName(column = "firstCouponDt")
    private LocalDate firstCouponDt;
    @CsvBindByName(column = "prevCouponDt")
    private LocalDate prevCouponDt;
    @CsvBindByName(column = "thisCouponDt")
    private LocalDate thisCouponDt;
    @CsvBindByName(column = "foIntCalcKbn")
    private Integer foIntCalcKbn;
    @CsvBindByName(column = "fractionProcessKbn")
    private Integer fractionProcessKbn;
    @CsvBindByName(column = "maturityDt")
    private LocalDate maturityDt;
    @CsvBindByName(column = "maturityPrc")
    private Integer maturityPrc;
    @CsvBindByName(column = "holidayRdmKbn")
    private Integer holidayRdmKbn;
    @CsvBindByName(column = "callableMaturityDt")
    private LocalDate callableMaturityDt;
    @CsvBindByName(column = "callableMaturityPrc")
    private Integer callableMaturityPrc;
    @CsvBindByName(column = "intermRdmKbn")
    private Integer intermRdmKbn;
    @CsvBindByName(column = "tradeControlKbn")
    private Integer tradeControlKbn;
    @CsvBindByName(column = "tradeStopStartDt")
    private LocalDate tradeStopStartDt;
    @CsvBindByName(column = "tradeStopEndDt")
    private LocalDate tradeStopEndDt;
    @CsvBindByName(column = "foreignRestricKbn")
    private Integer foreignRestricKbn;
    @CsvBindByName(column = "americanRestricKbn")
    private Integer americanRestricKbn;
    @CsvBindByName(column = "doFoClassKbn")
    private Integer doFoClassKbn;
    @CsvBindByName(column = "ppPoTyp")
    private Integer ppPoTyp;
    @CsvBindByName(column = "rightsOfferingDt")
    private LocalDate rightsOfferingDt;
}
