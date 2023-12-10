package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "M_USER_REQUEST")
public class MUserRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @EmbeddedId MUserRequestPK id;

  @Column(name = "COMPANY_CD", insertable = false, updatable = false)
  String companyCd;

  @Column(name = "ENTRY_NO", insertable = false, updatable = false)
  Integer entryNo;

  @Column(name = "BRANCH_CD")
  String branchCd;

  @Column(name = "ACCOUNT_OPENING_LIMIT_DT")
  LocalDateTime accountOpeningLimitDt;

  @Column(name = "ACCOUNT_OPENING_STATUS")
  String accountOpeningStatus;

  @Column(name = "INDIVIDUAL_CORPORATE_CLS")
  String individualCorporateCls;

  @Column(name = "COLLECTING_STATUS")
  String collectingStatus;

  @Column(name = "COLLECTING_RESULT_FLG")
  String collectingResultFlg;

  @Column(name = "ANTISOCIAL_CHECKED_STATUS")
  String antisocialCheckedStatus;

  @Column(name = "ANTISOCIAL_CHECKED_FLG_IN")
  String antisocialCheckedFlgIn;

  @Column(name = "ANTISOCIAL_CHECKED_FLG_OUT")
  String antisocialCheckedFlgOut;

  @Column(name = "MYNUMBER_STATUS")
  String mynumberStatus;

  @Column(name = "IDENTITY_DOCUMENTS_STATUS")
  String identityDocumentsStatus;

  @Column(name = "PAYMENT_ACCOUNT_BANK_STATUS")
  String paymentAccountBankStatus;

  @Column(name = "EKYC_CHECKED_STATUS")
  String ekycCheckedStatus;

  @Column(name = "EKYC_CHECKED_FLG")
  String ekycCheckedFlg;

  @Column(name = "EKYC_ID")
  String ekycId;

  @Column(name = "ACCOUNT_OPEN_D")
  LocalDateTime accountOpenD;

  @Column(name = "ACCOUNT_OPEN_USER")
  String accountOpenUser;

  @Column(name = "CLIENT_NO")
  Integer clientNo;

  @Column(name = "NAME_SEI")
  String nameSei;

  @Column(name = "NAME_MEI")
  String nameMei;

  @Column(name = "KANA_NAME_SEI")
  String kanaNameSei;

  @Column(name = "KANA_NAME_MEI")
  String kanaNameMei;

  @Column(name = "ROMAN_NAME_SEI")
  String romanNameSei;

  @Column(name = "ROMAN_NAME_MEI")
  String romanNameMei;

  @Column(name = "ADDRESS_POSTAL_CD")
  String addressPostalCd;

  @Column(name = "ADDRESS_PREFECTURES")
  String addressPrefectures;

  @Column(name = "ADDRESS_MUNICIPALITIES")
  String addressMunicipalities;

  @Column(name = "ADDRESS_NUMBER")
  String addressNumber;

  @Column(name = "ADDRESS_BUILDING")
  String addressBuilding;

  @Column(name = "HOME_PHONE")
  String homePhone;

  @Column(name = "MOBILE_NUMBER")
  String mobileNumber;

  @Column(name = "BIRTH_YEAR")
  String birthYear;

  @Column(name = "BIRTH_MONTH")
  String birthMonth;

  @Column(name = "BIRTH_DATE")
  String birthDate;

  @Column(name = "GENDER")
  String gender;

  @Column(name = "CITIZENSHIP_CD")
  String citizenshipCd;

  @Column(name = "CITIZENSHIP")
  String citizenship;

  @Column(name = "COUNTRY_OF_RESIDENCE")
  String countryOfResidence;

  @Column(name = "FOREIGN_PEPS_FLG")
  String foreignPepsFlgl;

  @Column(name = "FATCA")
  String fatca;

  @Column(name = "LOGIN_ID")
  String loginId;

  @Column(name = "SPECIFIED_ACCOUNT_OPEN_CLS")
  String specifiedAccountOpenCls;

  @Column(name = "SALES_OFFICE_ACCOUNT_FLG")
  String salesOfficeAccountFlg;

  @Column(name = "CONSENT_FLG")
  String consentFlg;

  @Column(name = "PROFESSION_SELECTION1")
  String professionSelection1;

  @Column(name = "OTHERS_PROFESSION1")
  String othersProfession1;

  @Column(name = "EMPLOYMENT1")
  String employment1;

  @Column(name = "DEPARTMENT1")
  String department1;

  @Column(name = "POSITION1")
  String position1;

  @Column(name = "EMPLOYER_POSTAL_NO")
  String employerPostalNo;

  @Column(name = "EMPLOYER_PREFECTURE")
  String employerPrefecture;

  @Column(name = "EMPLOYER_CITY")
  String employerCity;

  @Column(name = "EMPLOYER_LAST_ADDR1")
  String employerLastAddr1;

  @Column(name = "EMPLOYER_LAST_ADDR2")
  String employerLastAddr2;

  @Column(name = "EMPLOYER_PHONE")
  String employerPhone;

  @Column(name = "HOUSEHOLDER_RELATIONSHIP")
  String householderRelationship;

  @Column(name = "HOUSEHOLDER_NAME_SEI")
  String householderNameSei;

  @Column(name = "HOUSEHOLDER_NAME_MEI")
  String householderNameMei;

  @Column(name = "PROFESSION_SELECTION2")
  String professionSelection2;

  @Column(name = "OTHERS_PROFESSION2")
  String othersProfession2;

  @Column(name = "EMPLOYMENT2")
  String employment2;

  @Column(name = "DEPARTMENT2")
  String department2;

  @Column(name = "POSITION2")
  String position2;

  @Column(name = "INSIDER_FLG")
  String insiderFlg;

  @Column(name = "INSIDER_BRAND1")
  String insiderBrand1;

  @Column(name = "INSIDER_TYPE1")
  String insiderType1;

  @Column(name = "INSIDER_BRAND2")
  String insiderBrand2;

  @Column(name = "INSIDER_TYPE2")
  String insiderType2;

  @Column(name = "INSIDER_BRAND3")
  String insiderBrand3;

  @Column(name = "INSIDER_TYPE3")
  String insiderType3;

  @Column(name = "INSIDER_BRAND4")
  String insiderBrand4;

  @Column(name = "INSIDER_TYPE4")
  String insiderType4;

  @Column(name = "INSIDER_BRAND5")
  String insiderBrand5;

  @Column(name = "INSIDER_TYPE5")
  String insiderType5;

  @Column(name = "POLICY_TYPE")
  String policyType;

  @Column(name = "ASSET_DISPOSITION")
  String assetDisposition;

  @Column(name = "REVENUE_TYPE")
  String revenueType;

  @Column(name = "PERIOD_TYPE")
  String periodType;

  @Column(name = "ANNUAL_INCOME_CD")
  String annualIncomeCd;

  @Column(name = "FINANCIAL_ASSET_CD")
  String financialAssetCd;

  @Column(name = "MOTIVE_TYPE")
  String motiveType;

  @Column(name = "INITIALLY_TYPE")
  String initiallyType;

  @Column(name = "EXPERIENCE_STOCK_TYPE")
  String experienceStockType;

  @Column(name = "EXPERIENCE_ACCUMULATIVE_INVESTMENT_TYPE")
  String experienceAccumulativeInvestmentType;

  @Column(name = "EXPERIENCE_INVESTMENT_TRUST_TYPE")
  String experienceInvestmentTrustType;

  @Column(name = "EXPERIENCE_FUTURES_OPTION_TYPE")
  String experienceFuturesOptionType;

  @Column(name = "EXPERIENCE_FUTURES_TYPE")
  String experienceFuturesType;

  @Column(name = "EXPERIENCE_CFD_TYPE")
  String experienceCfdType;

  @Column(name = "EXPERIENCE_MARGIN_TYPE")
  String experienceMarginType;

  @Column(name = "EXPERIENCE_PUBLIC_CORPORATE_TYPE")
  String experiencePublicCorporateType;

  @Column(name = "EXPERIENCE_CB_TYPE")
  String experienceCbType;

  ;

  @Column(name = "EXPERIENCE_FOREIGN_SECURITIES_TYPE")
  String experienceForeignSecuritiesType;

  @Column(name = "EXPERIENCE_FX_TYPE")
  String experienceFxType;

  @Column(name = "MAIL_INFO_FLG")
  String mailInfoFlg;

  @Column(name = "CREATE_DT")
  LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  String createPrgId;

  @Column(name = "UPDATE_DT")
  LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  String updatePrgId;
}
