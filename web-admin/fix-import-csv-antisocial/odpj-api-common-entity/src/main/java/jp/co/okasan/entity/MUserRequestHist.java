package jp.co.okasan.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "M_USER_REQUEST_HIST")
public class MUserRequestHist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SEQ_NO")
  private Integer seqNo;

  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Column(name = "ENTRY_NO")
  private Integer entryNo;

  @Column(name = "BRANCH_CD")
  private String branchCd;

  @Column(name = "ACCOUNT_OPENING_LIMIT_DT")
  private LocalDateTime accountOpeningLimitDt;

  @Column(name = "ACCOUNT_OPENING_STATUS")
  private String accountOpeningStatus;

  @Column(name = "INDIVIDUAL_CORPORATE_CLS")
  private String individualCorporateCls;

  @Column(name = "COLLECTING_STATUS")
  private String collectingStatus;

  @Column(name = "COLLECTING_RESULT_FLG")
  private String collectionResultFlg;

  @Column(name = "ANTISOCIAL_CHECKED_STATUS")
  private String antisocialCheckedStatus;

  @Column(name = "ANTISOCIAL_CHECKED_FLG_IN")
  private String antisocialCheckedFlgIn;

  @Column(name = "ANTISOCIAL_CHECKED_FLG_OUT")
  private String antisocialCheckedFlgOut;

  @Column(name = "MYNUMBER_STATUS")
  private String mynumberStatus;

  @Column(name = "IDENTITY_DOCUMENTS_STATUS")
  private String identityDocumentsStatus;

  @Column(name = "PAYMENT_ACCOUNT_BANK_STATUS")
  private String paymentAccountBankStatus;

  @Column(name = "EKYC_CHECKED_STATUS")
  private String ekycCheckedStatus;

  @Column(name = "EKYC_CHECKED_FLG")
  private String ekycCheckedFlg;

  @Column(name = "EKYC_ID")
  private String ekycId;

  @Column(name = "ACCOUNT_OPEN_D")
  private LocalDateTime accountOpenD;

  @Column(name = "ACCOUNT_OPEN_USER")
  private String accountOpenUser;

  @Column(name = "CLIENT_NO")
  private Integer clientNo;

  @Column(name = "NAME_SEI")
  private String nameSei;

  @Column(name = "NAME_MEI")
  private String nameMei;

  @Column(name = "KANA_NAME_SEI")
  private String kanaNameSei;

  @Column(name = "KANA_NAME_MEI")
  private String kanaNameMei;

  @Column(name = "ROMAN_NAME_SEI")
  private String romanNameSei;

  @Column(name = "ROMAN_NAME_MEI")
  private String romanNameMei;

  @Column(name = "ADDRESS_POSTAL_CD")
  private String addressPostalCd;

  @Column(name = "ADDRESS_PREFECTURES")
  private String addressPrefectures;

  @Column(name = "ADDRESS_MUNICIPALITIES")
  private String addressMunicipalities;

  @Column(name = "ADDRESS_NUMBER")
  private String addressNumber;

  @Column(name = "ADDRESS_BUILDING")
  private String addressBuilding;

  @Column(name = "HOME_PHONE")
  private String homePhone;

  @Column(name = "MOBILE_NUMBER")
  private String mobileNumber;

  @Column(name = "BIRTH_YEAR")
  private String birthYear;

  @Column(name = "BIRTH_MONTH")
  private String birthMonth;

  @Column(name = "BIRTH_DATE")
  private String birthDate;

  @Column(name = "GENDER")
  private String gender;

  @Column(name = "CITIZENSHIP_CD")
  private String citizenshipCd;

  @Column(name = "CITIZENSHIP")
  private String citizenship;

  @Column(name = "COUNTRY_OF_RESIDENCE")
  private String countryOfResidence;

  @Column(name = "FOREIGN_PEPS_FLG")
  private String foreignPepsFlg;

  @Column(name = "FATCA")
  private String fatca;

  @Column(name = "LOGIN_ID")
  private String loginId;

  @Column(name = "SPECIFIED_ACCOUNT_OPEN_CLS")
  private String specifiedAccountOpenCls;

  @Column(name = "SALES_OFFICE_ACCOUNT_FLG")
  private String salesOfficeAccountFlg;

  @Column(name = "CONSENT_FLG")
  private String consentFlg;

  @Column(name = "PROFESSION_SELECTION1")
  private String professionSelection1;

  @Column(name = "OTHERS_PROFESSION1")
  private String othersProfession1;

  @Column(name = "EMPLOYMENT1")
  private String employment1;

  @Column(name = "DEPARTMENT1")
  private String department1;

  @Column(name = "POSITION1")
  private String position1;

  @Column(name = "EMPLOYER_POSTAL_NO")
  private String employerPostalNo;

  @Column(name = "EMPLOYER_PREFECTURE")
  private String employerPrefecture;

  @Column(name = "EMPLOYER_CITY")
  private String employerCity;

  @Column(name = "EMPLOYER_LAST_ADDR1")
  private String employerLastAddr1;

  @Column(name = "EMPLOYER_LAST_ADDR2")
  private String employerLastAddr2;

  @Column(name = "EMPLOYER_PHONE")
  private String employerPhone;

  @Column(name = "HOUSEHOLDER_RELATIONSHIP")
  private String householderRelationship;

  @Column(name = "HOUSEHOLDER_NAME_SEI")
  private String householderNameSei;

  @Column(name = "HOUSEHOLDER_NAME_MEI")
  private String householderNameMei;

  @Column(name = "PROFESSION_SELECTION2")
  private String professionSelection2;

  @Column(name = "OTHERS_PROFESSION2")
  private String othersProfession2;

  @Column(name = "EMPLOYMENT2")
  private String employment2;

  @Column(name = "DEPARTMENT2")
  private String department2;

  @Column(name = "POSITION2")
  private String position2;

  @Column(name = "INSIDER_FLG")
  private String insiderFlg;

  @Column(name = "INSIDER_BRAND1")
  private String insiderBrand1;

  @Column(name = "INSIDER_TYPE1")
  private String insiderType1;

  @Column(name = "INSIDER_BRAND2")
  private String insiderBrand2;

  @Column(name = "INSIDER_TYPE2")
  private String insiderType2;

  @Column(name = "INSIDER_BRAND3")
  private String insiderBrand3;

  @Column(name = "INSIDER_TYPE3")
  private String insiderType3;

  @Column(name = "INSIDER_BRAND4")
  private String insiderBrand4;

  @Column(name = "INSIDER_TYPE4")
  private String insiderType4;

  @Column(name = "INSIDER_BRAND5")
  private String insiderBrand5;

  @Column(name = "INSIDER_TYPE5")
  private String insiderType5;

  @Column(name = "POLICY_TYPE")
  private String policyType;

  @Column(name = "ASSET_DISPOSITION")
  private String assetDisposition;

  @Column(name = "REVENUE_TYPE")
  private String revenueType;

  @Column(name = "PERIOD_TYPE")
  private String periodType;

  @Column(name = "ANNUAL_INCOME_CD")
  private String annualIncomeCd;

  @Column(name = "FINANCIAL_ASSET_CD")
  private String financialAssetCd;

  @Column(name = "MOTIVE_TYPE")
  private String motiveType;

  @Column(name = "INITIALLY_TYPE")
  private String initiallyType;

  @Column(name = "EXPERIENCE_STOCK_TYPE")
  private String experienceStockType;

  @Column(name = "EXPERIENCE_ACCUMULATIVE_INVESTMENT_TYPE")
  private String experienceAccumulativeInvestmentType;

  @Column(name = "EXPERIENCE_INVESTMENT_TRUST_TYPE")
  private String experienceInvestmentTrustType;

  @Column(name = "EXPERIENCE_FUTURES_OPTION_TYPE")
  private String experienceFuturesOptionType;

  @Column(name = "EXPERIENCE_FUTURES_TYPE")
  private String experienceFuturesType;

  @Column(name = "EXPERIENCE_CFD_TYPE")
  private String experienceCfdType;

  @Column(name = "EXPERIENCE_MARGIN_TYPE")
  private String experienceMarginType;

  @Column(name = "EXPERIENCE_PUBLIC_CORPORATE_TYPE")
  private String experiencePublicCorporateType;

  @Column(name = "EXPERIENCE_CB_TYPE")
  private String experienceCbType;

  ;

  @Column(name = "EXPERIENCE_FOREIGN_SECURITIES_TYPE")
  private String experienceForeignSecuritiesType;

  @Column(name = "EXPERIENCE_FX_TYPE")
  private String experienceFxType;

  @Column(name = "MAIL_INFO_FLG")
  private String mailInfoFlg;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
