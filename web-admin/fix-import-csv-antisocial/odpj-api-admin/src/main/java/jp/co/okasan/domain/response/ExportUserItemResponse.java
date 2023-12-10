package jp.co.okasan.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExportUserItemResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String companyCd;

    private Integer entryNo;

    private String branchCd;

    private LocalDateTime accountOpeningLimitDt;

    private String accountOpeningStatus;

    private String individualCorporateCls;

    private String collectingStatus;

    private String collectingResultFlg;

    private String antisocialCheckedStatus;

    private String antisocialCheckedFlgIn;

    private String antisocialCheckedFlgOut;

    private String mynumberStatus;

    private String identityDocumentsStatus;

    private String paymentAccountBankStatus;

    private String ekycCheckedStatus;

    private String ekycCheckedFlg;

    private String ekycId;

    private LocalDateTime accountOpenD;

    private String accountOpenUser;

    private Integer clientNo;

    private String nameMei;

    private String nameSei;

    private String kanaNameSei;

    private String kanaNameMei;

    private String romanNameSei;

    private String romanNameMei;

    private String addressPostalCd;

    private String addressPrefectures;

    private String addressMunicipalities;

    private String addressNumber;

    private String addressBuilding;

    private String homePhone;

    private String mobileNumber;

    private String birthYear;

    private String birthMonth;

    private String birthDate;

    private String gender;

    private String citizenshipCd;

    private String citizenship;

    private String countryOfResidence;

    private String foreignPepsFlgl;

    private String fatca;

    private String loginId;

    private String specifiedAccountOpenCls;

    private String salesOfficeAccountFlg;

    private String consentFlg;

    private String professionSelection1;

    private String othersProfession1;

    private String employment1;

    private String department1;

    private String position1;

    private String employerPostalNo;

    private String employerPrefecture;

    private String employerCity;

    private String employerLastAddr1;

    private String employerLastAddr2;

    private String employerPhone;

    private String householderRelationship;

    private String householderNameSei;

    private String householderNameMei;

    private String professionSelection2;

    private String othersProfession2;

    private String employment2;

    private String department2;

    private String position2;

    private String insiderFlg;

    private String insiderBrand1;

    private String insiderType1;

    private String insiderBrand2;

    private String insiderType2;

    private String insiderBrand3;

    private String insiderType3;

    private String insiderBrand4;

    private String insiderType4;

    private String insiderBrand5;

    private String insiderType5;

    private String policyType;

    private String assetDisposition;

    private String revenueType;

    private String periodType;

    private String annualIncomeCd;

    private String financialAssetCd;

    private String motiveType;

    private String initiallyType;

    private String experienceStockType;

    private String experienceAccumulativeInvestmentType;

    private String experienceInvestmentTrustType;

    private String experienceFuturesOptionType;

    private String experienceFuturesType;

    private String experienceCfdType;

    private String experienceMarginType;

    private String experiencePublicCorporateType;

    private String experienceCbType;

    private String experienceForeignSecuritiesType;

    private String experienceFxType;

    private String mailInfoFlg;

    private LocalDateTime createDt;

    private String createPrgId;

    private LocalDateTime updateDt;

    private String updatePrgId;
}
