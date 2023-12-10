package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** The persistent class for the CLIENT database table. */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CLIENT")
@IdClass(ClientPK.class)
public class Client implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "BRANCH_CD")
  private String branchCd;

  @Id
  @Column(name = "CUSTOMER_CD")
  private Integer customerCd;

  @Id
  @Column(name = "INSIDER_FLG")
  private String insiderFlg;

  @Column(name = "AC_OPEN_CHANNEL")
  private String acOpenChannel;

  @Column(name = "ACC_DELETE_DT")
  private LocalDateTime accDeleteDt;

  @Column(name = "ACC_OPEN_APPLY_TM")
  private LocalDateTime accOpenApplyTm;

  @Column(name = "ACC_OPEN_DT")
  private LocalDateTime accOpenDt;

  @Column(name = "ACC_OPEN_FLG")
  private Integer accOpenFlg;

  @Column(name = "ACC_OPEN_REASON_DETAILS")
  private String accOpenReasonDetails;

  @Column(name = "ACC_OPEN_REASON_KBN")
  private String accOpenReasonKbn;

  @Column(name = "ACC_OPEN_REASON_MSK")
  private String accOpenReasonMsk;

  @Column(name = "ACC_STS")
  private Integer accSts;

  @Column(name = "ACC_STS_UPD_TM")
  private LocalDateTime accStsUpdTm;

  @Column(name = "ADD_CHG_NOTICE_MAKE_FLG")
  private Integer addChgNoticeMakeFlg;

  @Column(name = "ADDRESS_1")
  private String address1;

  @Column(name = "ADDRESS_2")
  private String address2;

  @Column(name = "ADDRESS_3")
  private String address3;

  @Column(name = "ADDRESS_4")
  private String address4;

  @Column(name = "ADDRESS_KANA_1")
  private String addressKana1;

  @Column(name = "ADDRESS_KANA_2")
  private String addressKana2;

  @Column(name = "ADDRESS_KANA_3")
  private String addressKana3;

  @Column(name = "ADDRESS_KANA_4")
  private String addressKana4;

  @Column(name = "ADDRESS_UPD_DT")
  private LocalDateTime addressUpdDt;

  @Column(name = "AREA_CD")
  private String areaCd;

  @Column(name = "ASSETS_CHAR_DETAILS")
  private String assetsCharDetails;

  @Column(name = "ASSETS_CHAR_KBN")
  private String assetsCharKbn;

  @Column(name = "ASSETS_KBN")
  private String assetsKbn;

  @Column(name = "ATTENTIVE_CLIENT_FLG")
  private Integer attentiveClientFlg;

  @Column(name = "ATTENTIVE_REASON")
  private String attentiveReason;

  @Column(name = "BIRTH_DT")
  private String birthDt;

  @Column(name = "CAMPAIGN_CD")
  private String campaignCd;

  @Column(name = "CAPITAL")
  private Integer capital;

  @Column(name = "CHARGE_BIRTH_DT")
  private LocalDateTime chargeBirthDt;

  @Column(name = "CHARGE_DEPART_NM")
  private String chargeDepartNm;

  @Column(name = "CHARGE_ID_DOC_KBN")
  private Integer chargeIdDocKbn;

  @Column(name = "CHARGE_ID_DOC_VALID_DT")
  private LocalDateTime chargeIdDocValidDt;

  @Column(name = "CHARGE_NM")
  private String chargeNm;

  @Column(name = "CHARGE_NM_KANA")
  private String chargeNmKana;

  @Column(name = "CHARGE_POST")
  private String chargePost;

  @Column(name = "CHARGE_TEL_NO_1")
  private String chargeTelNo1;

  @Column(name = "CHARGE1_MAIL_SEND_CONFIRM_KBN")
  private Integer charge1MailSendConfirmKbn;

  //  @Column(name = "CHARGE2_BIRTH_DT")
  //  private LocalDateTime charge2BirthDt;

  //  @Column(name = "CHARGE2_DEPART_NM")
  //  private String charge2DepartNm;

  //  @Column(name = "CHARGE2_ID_DOC_KBN")
  //  private Integer charge2IdDocKbn;

  //  @Column(name = "CHARGE2_ID_DOC_VALID_DT")
  //  private LocalDateTime charge2IdDocValidDt;

  @Column(name = "CHARGE2_MAIL_SEND_CONFIRM_KBN")
  private Integer charge2MailSendConfirmKbn;

  //  @Column(name = "CHARGE2_NM")
  //  private String charge2Nm;

  //  @Column(name = "CHARGE2_NM_KANA")
  //  private String charge2NmKana;

  //  @Column(name = "CHARGE2_POST")
  //  private String charge2Post;

  //  @Column(name = "CHARGE2_SELECT_FLG")
  //  private Integer charge2SelectFlg;

  //  @Column(name = "CHARGE2_TEL_NO_1")
  //  private String charge2TelNo1;

  @Column(name = "CLIENT_NM")
  private String clientNm;

  @Column(name = "CLIENT_NM_KANA")
  private String clientNmKana;

  @Column(name = "CLT_INFO_UPD_APPLY_TM")
  private LocalDateTime cltInfoUpdApplyTm;

  @Column(name = "CLT_INFO_UPD_TM")
  private LocalDateTime cltInfoUpdTm;

  @Column(name = "COMM_GROUP_CD")
  private Integer commGroupCd;

  @Column(name = "COMM_GROUP_INPUT_CNL")
  private Integer commGroupInputCnl;

  @Column(name = "COMPANY_REP_BIRTH_DT")
  private LocalDateTime companyRepBirthDt;

  @Column(name = "COMPANY_REP_NM")
  private String companyRepNm;

  @Column(name = "COMPANY_REP_NM_KANA")
  private String companyRepNmKana;

  @Column(name = "COMPANY_REP_NM_UPD_DT")
  private LocalDateTime companyRepNmUpdDt;

  @Column(name = "COMPANY_REP_POST_NM")
  private String companyRepPostNm;

  @Column(name = "COMPANY_REP_POST_NM_UPD_DT")
  private LocalDateTime companyRepPostNmUpdDt;

  @Column(name = "CONTACT_TURN_1")
  private Integer contactTurn1;

  @Column(name = "CONTACT_TURN_2")
  private Integer contactTurn2;

  @Column(name = "CONTACT_TURN_3")
  private Integer contactTurn3;

  @Column(name = "CONTACT_TURN_4")
  private Integer contactTurn4;

  @Column(name = "CORP_BUSINESS_DETAILS")
  private String corpBusinessDetails;

  @Column(name = "CORP_CHARGE_MAIL_ADDRESS")
  private String corpChargeMailAddress;

  @Column(name = "CORP_CHARGE_MOBILE_PHONE_1")
  private String corpChargeMobilePhone1;

  @Column(name = "CORP_CHARGE_OFFICE_ADDRESS_1")
  private String corpChargeOfficeAddress1;

  @Column(name = "CORP_CHARGE_OFFICE_ADDRESS_2")
  private String corpChargeOfficeAddress2;

  @Column(name = "CORP_CHARGE_OFFICE_ADDRESS_3")
  private String corpChargeOfficeAddress3;

  @Column(name = "CORP_CHARGE_OFFICE_ADDRESS_4")
  private String corpChargeOfficeAddress4;

  @Column(name = "CORP_CHARGE_OFFICE_ZIP_NO_1")
  private String corpChargeOfficeZipNo1;

  @Column(name = "CORP_CHARGE_OFFICE_ZIP_NO_2")
  private String corpChargeOfficeZipNo2;

  //  @Column(name = "CORP_CHARGE2_MAIL_ADDRESS")
  //  private String corpCharge2MailAddress;
  //
  //  @Column(name = "CORP_CHARGE2_MOBILE_PHONE_1")
  //  private String corpCharge2MobilePhone1;
  //
  //  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_1")
  //  private String corpCharge2OfficeAddress1;
  //
  //  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_2")
  //  private String corpCharge2OfficeAddress2;
  //
  //  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_3")
  //  private String corpCharge2OfficeAddress3;
  //
  //  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_4")
  //  private String corpCharge2OfficeAddress4;
  //
  //  @Column(name = "CORP_CHARGE2_OFFICE_ZIP_NO_1")
  //  private String corpCharge2OfficeZipNo1;
  //
  //  @Column(name = "CORP_CHARGE2_OFFICE_ZIP_NO_2")
  //  private String corpCharge2OfficeZipNo2;
  //
  @Column(name = "CORP_CLIENT_TYPE_DETAILS")
  private String corpClientTypeDetails;

  @Column(name = "CORP_CLIENT_TYPE_MSK")
  private String corpClientTypeMsk;

  @Column(name = "CORP_KBN")
  private Integer corpKbn;

  @Column(name = "CORP_KBN_UPD_TM")
  private LocalDateTime corpKbnUpdTm;

  @Column(name = "CORP_SHORT_NM")
  private String corpShortNm;

  @Column(name = "CUSTODY_TRANS_KBN")
  private Integer custodyTransKbn;

  @Column(name = "DEAL_TYPE_MSK")
  private String dealTypeMsk;

  @Column(name = "DIV_REC_KBN_CHG_NOTICE_FLG")
  private Integer divRecKbnChgNoticeFlg;

  @Column(name = "DIVIDEND_RECEIVE_KBN")
  private Integer dividendReceiveKbn;

  @Column(name = "DIVIDEND_RECEIVE_KBN_CHG_DT")
  private LocalDateTime dividendReceiveKbnChgDt;

  @Column(name = "DIVIDENDS_ACCEPT_END_DT")
  private LocalDateTime dividendsAcceptEndDt;

  @Column(name = "DIVIDENDS_ACCEPT_KBN")
  private Integer dividendsAcceptKbn;

  @Column(name = "DIVIDENDS_ACCEPT_START_DT")
  private LocalDateTime dividendsAcceptStartDt;

  @Column(name = "DIVIDENDS_ACCEPT_UPD_TM")
  private LocalDateTime dividendsAcceptUpdTm;

  @Column(name = "EMPLOYEE_CNT_KBN")
  private Integer employeeCntKbn;

  @Column(name = "ENGLISH_CLIENT_ADDRESS")
  private String englishClientAddress;

  @Column(name = "ENGLISH_CLIENT_NM")
  private String englishClientNm;

  @Column(name = "EOHY_MD_1")
  private String eohyMd1;

  @Column(name = "EOHY_MD_2")
  private String eohyMd2;

  @Column(name = "EOHY_MD_3")
  private String eohyMd3;

  @Column(name = "EOY_MD")
  private String eoyMd;

  @Column(name = "FAMILY_NURTURER_NM")
  private String familyNurturerNm;

  @Column(name = "FAMILY_NURTURER_OFFICE_NM")
  private String familyNurturerOfficeNm;

  @Column(name = "FAMILY_RELATION_CD")
  private Integer familyRelationCd;

  @Column(name = "FATCA_FLG")
  private Integer fatcaFlg;

  @Column(name = "FAX_NO_1")
  private String faxNo1;

  @Column(name = "FI_SALES_LAW_BOND_KBN")
  private Integer fiSalesLawBondKbn;

  @Column(name = "FI_SALES_LAW_BOND_KBN_UPD_DT")
  private LocalDateTime fiSalesLawBondKbnUpdDt;

  @Column(name = "FI_SALES_LAW_INV_KBN")
  private Integer fiSalesLawInvKbn;

  @Column(name = "FI_SALES_LAW_INV_KBN_UPD_DT")
  private LocalDateTime fiSalesLawInvKbnUpdDt;

  @Column(name = "FIRST_NM_KANA")
  private String firstNmKana;

  @Column(name = "FIRST_NM_KANJI")
  private String firstNmKanji;

  @Column(name = "FOREIGN_DIGNITARIES")
  private Integer foreignDignitaries;

  @Column(name = "FOREIGN_STK_ACC_DEL_DT")
  private LocalDateTime foreignStkAccDelDt;

  @Column(name = "FOREIGN_STK_ACC_DOC_RECEIPT_DT")
  private LocalDateTime foreignStkAccDocReceiptDt;

  @Column(name = "FOREIGN_STK_ACC_OPEN_APP_TM")
  private LocalDateTime foreignStkAccOpenAppTm;

  @Column(name = "FOREIGN_STK_ACC_OPEN_DT")
  private LocalDateTime foreignStkAccOpenDt;

  @Column(name = "FOREIGN_STK_ACC_OPEN_FLG")
  private Integer foreignStkAccOpenFlg;

  @Column(name = "FOREIGN_STK_ACC_STS")
  private Integer foreignStkAccSts;

  @Column(name = "FOREIGN_STK_ACC_STS_UPD_TM")
  private LocalDateTime foreignStkAccStsUpdTm;

  @Column(name = "FX_SETTL_DIV_TRANS_INST_FLG")
  private Integer fxSettlDivTransInstFlg;

  @Column(name = "GENDER_KBN")
  private String genderKbn;

  @Column(name = "HOW_TO_KNOW_THIS_SITE_DETAILS")
  private String howToKnowThisSiteDetails;

  @Column(name = "HOW_TO_KNOW_THIS_SITE_KBN")
  private Integer howToKnowThisSiteKbn;

  @Column(name = "HSEHOLD_OCCUPATION_KBN")
  private String hseholdOccupationKbn;

  @Column(name = "HSEHOLD_OCCUPATION_KBN_DETAILS")
  private String hseholdOccupationKbnDetails;

  @Column(name = "HSEHOLD_RELATION_KBN")
  private String hseholdRelationKbn;

  @Column(name = "HSEHOLD_RELATION_KBN_DETAILS")
  private String hseholdRelationKbnDetails;

  @Column(name = "ID_DOC_KBN")
  private Integer idDocKbn;

  @Column(name = "ID_DOC_KBN_DETAILS")
  private String idDocKbnDetails;

  @Column(name = "ID_DOC_VALID_DT")
  private LocalDateTime idDocValidDt;

  @Column(name = "ID_DOC_VALID_DT_2")
  private LocalDateTime idDocValidDt2;

  @Column(name = "IDENTITY_DOCUMENTS_TYPE_2")
  private Byte identityDocumentsType2;

  @Column(name = "IN_BANK_ACC_NM")
  private String inBankAccNm;

  @Column(name = "IN_BANK_ACC_NO")
  private Integer inBankAccNo;

  @Column(name = "IN_BANK_ACC_OPEN_DT")
  private LocalDateTime inBankAccOpenDt;

  @Column(name = "IN_BANK_BRANCH_ADDITIONAL_CD")
  private Integer inBankBranchAdditionalCd;

  @Column(name = "IN_BANK_BRANCH_CD")
  private Integer inBankBranchCd;

  @Column(name = "IN_BANK_CD")
  private Integer inBankCd;

  @Column(name = "IN_BANK_CHG_NOTICE_MAKE_FLG")
  private Integer inBankChgNoticeMakeFlg;

  @Column(name = "IN_BANK_DEPOSIT_KBN")
  private Integer inBankDepositKbn;

  @Column(name = "INCOME_KBN")
  private String incomeKbn;

  @Column(name = "INPUT_BRANCH_CD")
  private Integer inputBranchCd;

  @Column(name = "INPUT_CLIENT_CD")
  private String inputClientCd;

  @Column(name = "INPUT_TM")
  private LocalDateTime inputTm;

  @Column(name = "INSIDER_BRAND_CD1")
  private String insiderBrandCd1;

  @Column(name = "INSIDER_BRAND_CD2")
  private String insiderBrandCd2;

  @Column(name = "INSIDER_BRAND_CD3")
  private String insiderBrandCd3;

  @Column(name = "INSIDER_BRAND_CD4")
  private String insiderBrandCd4;

  @Column(name = "INSIDER_BRAND_CD5")
  private String insiderBrandCd5;

  @Column(name = "INSIDER_BRAND_NAME1")
  private String insiderBrandName1;

  @Column(name = "INSIDER_BRAND_NAME2")
  private String insiderBrandName2;

  @Column(name = "INSIDER_BRAND_NAME3")
  private String insiderBrandName3;

  @Column(name = "INSIDER_BRAND_NAME4")
  private String insiderBrandName4;

  @Column(name = "INSIDER_BRAND_NAME5")
  private String insiderBrandName5;

  @Column(name = "INSIDER_TYPE1")
  private Byte insiderType1;

  @Column(name = "INSIDER_TYPE2")
  private Byte insiderType2;

  @Column(name = "INSIDER_TYPE3")
  private Byte insiderType3;

  @Column(name = "INSIDER_TYPE4")
  private Byte insiderType4;

  @Column(name = "INSIDER_TYPE5")
  private Byte insiderType5;

  @Column(name = "INTEREST_INV_MSK")
  private String interestInvMsk;

  @Column(name = "INV_AMT_DETAILS")
  private Integer invAmtDetails;

  @Column(name = "INV_AMT_KBN")
  private Integer invAmtKbn;

  @Column(name = "INV_ASSET_VALUE")
  private Integer invAssetValue;

  @Column(name = "INV_PURPOSE_DETAILS")
  private String invPurposeDetails;

  @Column(name = "INV_PURPOSE_KBN")
  private String invPurposeKbn;

  @Column(name = "INV_TERM_KBN")
  private String invTermKbn;

  @Column(name = "INVEX_CB_KBN")
  private Integer invexCbKbn;

  @Column(name = "INVEX_DBOND_KBN")
  private String invexDbondKbn;

  @Column(name = "INVEX_DEBENTURE_KBN")
  private String invexDebentureKbn;

  @Column(name = "INVEX_FBOND_KBN")
  private Integer invexFbondKbn;

  @Column(name = "INVEX_FX_SEC_KBN")
  private String invexFxSecKbn;

  @Column(name = "INVEX_INVTR_KBN")
  private String invexInvtrKbn;

  @Column(name = "INVEX_MMFMRF_KBN")
  private String invexMmfmrfKbn;

  @Column(name = "INVEX_OTHERS_KBN")
  private Integer invexOthersKbn;

  @Column(name = "ISSUE_ACCOUNT_WAY_KBN")
  private Integer issueAccountWayKbn;

  @Column(name = "JASDEC_REPORT_TARGET_FLG")
  private Integer jasdecReportTargetFlg;

  @Column(name = "KOJIN_HOJIN_TYPE")
  private String kojinHojinType;

  //  @Column(name = "`LAST _SEC_SHIFT_ADMIN_DT`")
  //  private LocalDateTime last_SecShiftAdminDt;

  @Column(name = "LAST_COMM_GROUP_CD")
  private Integer lastCommGroupCd;

  @Column(name = "LAST_COMM_GROUP_INPUT_CNL")
  private Integer lastCommGroupInputCnl;

  @Column(name = "LAST_NM_KANA")
  private String lastNmKana;

  @Column(name = "LAST_NM_KANJI")
  private String lastNmKanji;

  @Column(name = "LAST_SEC_ADVANCE_NOTICE_DT")
  private LocalDateTime lastSecAdvanceNoticeDt;

  @Column(name = "LAST_SEC_APPROVAL_USER_CD")
  private Integer lastSecApprovalUserCd;

  @Column(name = "LAST_SEC_PRO_AMA_KBN")
  private Integer lastSecProAmaKbn;

  @Column(name = "LAST_SEC_RETURN_ADMIN_DT")
  private LocalDateTime lastSecReturnAdminDt;

  @Column(name = "LAST_SEC_RETURN_AGREE_ISSUE_DT")
  private LocalDateTime lastSecReturnAgreeIssueDt;

  @Column(name = "LAST_SEC_RETURN_DOC_ISSUE_DT")
  private LocalDateTime lastSecReturnDocIssueDt;

  @Column(name = "LAST_SEC_SHIFT_AGREE_ISSUE_DT")
  private LocalDateTime lastSecShiftAgreeIssueDt;

  @Column(name = "LAST_SEC_SHIFT_DOC_ISSUE_DT")
  private LocalDateTime lastSecShiftDocIssueDt;

  @Column(name = "LAST_SEC_UPD_ADMIN_DT")
  private LocalDateTime lastSecUpdAdminDt;

  @Column(name = "LEAVE_COUNTRY_DATE")
  private LocalDateTime leaveCountryDate;

  @Column(name = "LEAVE_COUNTRY_FLG")
  private Integer leaveCountryFlg;

  @Column(name = "LOCAL_TAX_KBN")
  private Integer localTaxKbn;

  @Column(name = "LOCK_INFO")
  private String lockInfo;

  @Column(name = "LOCK_REASON_CD")
  private Integer lockReasonCd;

  @Column(name = "LOCK_REASON_DETAILS")
  private String lockReasonDetails;

  @Column(name = "LOCK_TM")
  private LocalDateTime lockTm;

  @Column(name = "LOCK_UPD_USER_CD")
  private Integer lockUpdUserCd;

  @Column(name = "LST_DPT_KBN")
  private Integer lstDptKbn;

  @Column(name = "MAIL_ADDRESS")
  private String mailAddress;

  @Column(name = "MAIL_SEND_CONFIRM_KBN")
  private Integer mailSendConfirmKbn;

  @Column(name = "MEMBER_KBN")
  private Integer memberKbn;

  @Lob
  @Column(name = "MEMO")
  private String memo;

  @Column(name = "MOBILE_PHONE_NO_1")
  private String mobilePhoneNo1;

  @Column(name = "NATIONALITY_KBN")
  private String nationalityKbn;

  @Column(name = "NET_ASSET_VALUE")
  private Integer netAssetValue;

  @Column(name = "NEXT_COMM_GROUP_CD")
  private Integer nextCommGroupCd;

  @Column(name = "NEXT_COMM_GROUP_DT")
  private LocalDateTime nextCommGroupDt;

  @Column(name = "NEXT_COMM_GROUP_INPUT_CNL")
  private Integer nextCommGroupInputCnl;

  @Column(name = "NEXT_DIVIDENDS_ACCEPT_END_DT")
  private LocalDateTime nextDividendsAcceptEndDt;

  @Column(name = "NEXT_DIVIDENDS_ACCEPT_KBN")
  private Integer nextDividendsAcceptKbn;

  @Column(name = "NEXT_DIVIDENDS_ACCEPT_START_DT")
  private LocalDateTime nextDividendsAcceptStartDt;

  @Column(name = "NEXT_DIVIDENDS_ACCEPT_UPD_TM")
  private LocalDateTime nextDividendsAcceptUpdTm;

  @Column(name = "NEXT_STK_TRF_TAX_KBN")
  private Integer nextStkTrfTaxKbn;

  @Column(name = "NEXT_STK_TRF_TAX_KBN_UPD_TM")
  private LocalDateTime nextStkTrfTaxKbnUpdTm;

  @Column(name = "NM_CHG_NOTICE_MAKE_FLG")
  private Integer nmChgNoticeMakeFlg;

  @Column(name = "NM_UPD_DT")
  private LocalDateTime nmUpdDt;

  @Column(name = "NON_RESIDENT_FLG")
  private Integer nonResidentFlg;

  @Column(name = "NONRESIDSENT_INSTITUTION_KBN")
  private Integer nonresidsentInstitutionKbn;

  @Column(name = "OCCUPATION_DETAILS")
  private String occupationDetails;

  @Column(name = "OCCUPATION_TYPE")
  private String occupationType;

  @Column(name = "OFFICE_ADDRESS_1")
  private String officeAddress1;

  @Column(name = "OFFICE_ADDRESS_2")
  private String officeAddress2;

  @Column(name = "OFFICE_ADDRESS_3")
  private String officeAddress3;

  @Column(name = "OFFICE_ADDRESS_4")
  private String officeAddress4;

  @Column(name = "OFFICE_DEPARTMENT")
  private String officeDepartment;

  @Column(name = "OFFICE_NM")
  private String officeNm;

  @Column(name = "OFFICE_PHONE_NO")
  private String officePhoneNo;

  @Column(name = "OFFICE_POST")
  private String officePost;

  @Column(name = "OFFICE_WORKS_DETAILS")
  private String officeWorksDetails;

  @Column(name = "OFFICE_ZIP_NO_1")
  private String officeZipNo1;

  @Column(name = "OFFICE_ZIP_NO_2")
  private String officeZipNo2;

  @Column(name = "OPEN_DATE")
  private LocalDateTime openDate;

  @Lob
  @Column(name = "PARENT_REMARKS")
  private String parentRemarks;

  @Column(name = "PARENTS_AGREE_FLG")
  private Integer parentsAgreeFlg;

  @Column(name = "PARENTS_BIRTH_DT")
  private LocalDateTime parentsBirthDt;

  @Column(name = "PARENTS_BRANCH_CD")
  private Integer parentsBranchCd;

  @Column(name = "PARENTS_CLIENT_CD")
  private Integer parentsClientCd;

  @Column(name = "PARENTS_NM")
  private String parentsNm;

  @Column(name = "PHONE_NO_1")
  private String phoneNo1;

  @Column(name = "PREV_DIVIDENDS_ACCEPT_END_DT")
  private LocalDateTime prevDividendsAcceptEndDt;

  @Column(name = "PREV_DIVIDENDS_ACCEPT_KBN")
  private Integer prevDividendsAcceptKbn;

  @Column(name = "PREV_DIVIDENDS_ACCEPT_START_DT")
  private LocalDateTime prevDividendsAcceptStartDt;

  //  @Column(name = "`PREV_STK_TRF_TA X_KBN`")
  //  private Integer prevStkTrfTa_xKbn;

  @Column(name = "PURPOSE_TYPE")
  private Byte purposeType;

  @Column(name = "QUALIFIED_INST_INVESTOR_KBN")
  private Integer qualifiedInstInvestorKbn;

  @Column(name = "RECEIPT_DOC_KBN")
  private Integer receiptDocKbn;

  @Column(name = "RESIDENT_COUNTRY_CD")
  private String residentCountryCd;

  @Column(name = "SALES_BRANCH_CD")
  private Integer salesBranchCd;

  @Column(name = "SALES_CLIENT_CD")
  private Integer salesClientCd;

  @Column(name = "SEAL_CHG_NOTICE_MAKE_FLG")
  private Integer sealChgNoticeMakeFlg;

  @Column(name = "SEC_ADVANCE_NOTICE_DT")
  private LocalDateTime secAdvanceNoticeDt;

  @Column(name = "SEC_PRO_AMA_KBN")
  private Integer secProAmaKbn;

  @Column(name = "SEC_PRO_AMA_UPD_DT")
  private LocalDateTime secProAmaUpdDt;

  @Column(name = "SEND_ADDRESS1")
  private String sendAddress1;

  @Column(name = "SEND_ADDRESS2")
  private String sendAddress2;

  @Column(name = "SEND_ADDRESS3")
  private String sendAddress3;

  @Column(name = "SEND_ADDRESS4")
  private String sendAddress4;

  @Column(name = "SEND_DEPART_NM")
  private String sendDepartNm;

  @Column(name = "SEND_KBN")
  private Integer sendKbn;

  @Column(name = "SEND_NM")
  private String sendNm;

  @Column(name = "SEND_NM_KANA")
  private String sendNmKana;

  @Column(name = "SEND_OFFICE_NM")
  private String sendOfficeNm;

  @Column(name = "SEND_PHONE_NO_1")
  private String sendPhoneNo1;

  @Column(name = "SEND_POST")
  private String sendPost;

  @Column(name = "SEND_ZIP_NO_1")
  private String sendZipNo1;

  @Column(name = "SEND_ZIP_NO_2")
  private String sendZipNo2;

  @Column(name = "SHOUKAI_CD")
  private String shoukaiCd;

  @Column(name = "SP_ACC_OPEN_APPLY_TM")
  private LocalDateTime spAccOpenApplyTm;

  @Column(name = "STAFF_CD")
  private String staffCd;

  @Column(name = "STAFF_KBN")
  private Integer staffKbn;

  @Column(name = "STAMP_UPD_DT")
  private LocalDateTime stampUpdDt;

  @Column(name = "STANDING_AGENT_FLG")
  private Integer standingAgentFlg;

  @Column(name = "STK_SP_ACC_DEL_DT")
  private LocalDateTime stkSpAccDelDt;

  @Column(name = "STK_SP_ACC_OPEN_DT")
  private LocalDateTime stkSpAccOpenDt;

  @Column(name = "STK_SP_ACC_OPEN_FLG")
  private String stkSpAccOpenFlg;

  @Column(name = "STK_SP_ACC_STS")
  private Integer stkSpAccSts;

  @Column(name = "STK_SP_ACC_STS_UPD_TM")
  private LocalDateTime stkSpAccStsUpdTm;

  @Column(name = "STK_TRF_TAX_KBN")
  private Integer stkTrfTaxKbn;

  @Column(name = "STK_TRF_TAX_KBN_UPD_TM")
  private LocalDateTime stkTrfTaxKbnUpdTm;

  @Column(name = "TAX_EXCEPTION_APPLY_DT")
  private LocalDateTime taxExceptionApplyDt;

  @Column(name = "TAX_EXCEPTION_EXPIRARION_DT")
  private LocalDateTime taxExceptionExpirarionDt;

  @Column(name = "TRADE_RULE_CONFIRM_KBN")
  private Integer tradeRuleConfirmKbn;

  @Column(name = "UNDER_AGE_KBN")
  private Integer underAgeKbn;

  @Column(name = "UNKNOWN_ADDRESS_DT")
  private LocalDateTime unknownAddressDt;

  @Column(name = "UNKNOWN_ADDRESS_FLG")
  private Integer unknownAddressFlg;

  @Column(name = "UPDATE_BRANCH_CD")
  private Integer updateBranchCd;

  @Column(name = "UPDATE_DATETIME")
  private LocalDateTime updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private Integer updateUserCd;

  @Column(name = "US_TAX")
  private String usTax;

  @Column(name = "USING_OTHER_IT_KBN")
  private Integer usingOtherItKbn;

  @Column(name = "WALLET_ADR")
  private String walletAdr;

  @Column(name = "YEN_SETTL_DIV_TRANS_INST_FLG")
  private Integer yenSettlDivTransInstFlg;

  @Column(name = "ZIP_NO_1")
  private String zipNo1;

  @Column(name = "ZIP_NO_2")
  private String zipNo2;

  @Column(name = "NAME_SEI")
  private String nameSei;

  @Column(name = "NAME_MEI")
  private String nameMei;

  @Column(name = "KANA_NAME_SEI")
  private String kanaNameSei;

  @Column(name = "KANA_NAME_MEI")
  private String kanaNameMei;

  @Column(name = "BIRTH_DATE")
  private Integer birthDate;

  @Column(name = "SEX")
  private Integer sex;
}
