package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The persistent class for the CLIENT_HISTORY database table. */
@Entity
@Table(name = "CLIENT_HISTORY")
@NamedQuery(name = "ClientHistory.findAll", query = "SELECT c FROM ClientHistory c")
public class ClientHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "INSIDER_FLG")
  private byte insiderFlg;

  @Column(name = "AC_OPEN_CHANNEL")
  private String acOpenChannel;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACC_DELETE_DT")
  private Date accDeleteDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACC_OPEN_APPLY_TM")
  private Date accOpenApplyTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACC_OPEN_DT")
  private Date accOpenDt;

  @Column(name = "ACC_OPEN_FLG")
  private int accOpenFlg;

  @Column(name = "ACC_OPEN_REASON_DETAILS")
  private String accOpenReasonDetails;

  @Column(name = "ACC_OPEN_REASON_KBN")
  private int accOpenReasonKbn;

  @Column(name = "ACC_OPEN_REASON_MSK")
  private String accOpenReasonMsk;

  @Column(name = "ACC_STS")
  private int accSts;

  @Temporal(TemporalType.DATE)
  @Column(name = "ACC_STS_UPD_TM")
  private Date accStsUpdTm;

  @Column(name = "`ADD_CHG_NOTICE_MAKE_ FLG`")
  private int addChgNoticeMake_flg;

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

  @Temporal(TemporalType.DATE)
  @Column(name = "ADDRESS_UPD_DT")
  private Date addressUpdDt;

  @Column(name = "AREA_CD")
  private String areaCd;

  @Column(name = "ASSETS_CHAR_DETAILS")
  private String assetsCharDetails;

  @Column(name = "ASSETS_CHAR_KBN")
  private int assetsCharKbn;

  @Column(name = "ASSETS_KBN")
  private int assetsKbn;

  @Column(name = "ATTENTIVE_CLIENT_FLG")
  private int attentiveClientFlg;

  @Column(name = "ATTENTIVE_REASON")
  private String attentiveReason;

  @Temporal(TemporalType.DATE)
  @Column(name = "BIRTH_DT")
  private Date birthDt;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "`C ONTACT_TURN_2`")
  private int c_ontactTurn2;

  @Column(name = "CAMPAIGN_CD")
  private String campaignCd;

  @Column(name = "CAPITAL")
  private int capital;

  @Temporal(TemporalType.DATE)
  @Column(name = "CHARGE_BIRTH_DT")
  private Date chargeBirthDt;

  @Column(name = "CHARGE_DEPART_NM")
  private String chargeDepartNm;

  @Column(name = "CHARGE_ID_DOC_KBN")
  private int chargeIdDocKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "CHARGE_ID_DOC_VALID_DT")
  private Date chargeIdDocValidDt;

  @Column(name = "CHARGE_NM")
  private String chargeNm;

  @Column(name = "CHARGE_NM_KANA")
  private String chargeNmKana;

  @Column(name = "CHARGE_POST")
  private String chargePost;

  @Column(name = "CHARGE_TEL_NO_1")
  private String chargeTelNo1;

  @Column(name = "CHARGE1_MAIL_SEND_CONFIRM_KBN")
  private int charge1MailSendConfirmKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "CHARGE2_BIRTH_DT")
  private Date charge2BirthDt;

  @Column(name = "CHARGE2_DEPART_NM")
  private String charge2DepartNm;

  @Column(name = "CHARGE2_ID_DOC_KBN")
  private int charge2IdDocKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "CHARGE2_ID_DOC_VALID_DT")
  private Date charge2IdDocValidDt;

  @Column(name = "CHARGE2_MAIL_SEND_CONFIRM_KBN")
  private int charge2MailSendConfirmKbn;

  @Column(name = "CHARGE2_NM")
  private String charge2Nm;

  @Column(name = "CHARGE2_NM_KANA")
  private String charge2NmKana;

  @Column(name = "CHARGE2_POST")
  private String charge2Post;

  @Column(name = "CHARGE2_SELECT_FLG")
  private int charge2SelectFlg;

  @Column(name = "CHARGE2_TEL_NO_1")
  private String charge2TelNo1;

  @Column(name = "CLIENT_HISTORY_NO")
  private int clientHistoryNo;

  @Column(name = "CLIENT_NM")
  private String clientNm;

  @Column(name = "CLIENT_NM_KANA")
  private String clientNmKana;

  @Temporal(TemporalType.DATE)
  @Column(name = "CLT_INFO_UPD_APPLY_TM")
  private Date cltInfoUpdApplyTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "CLT_INFO_UPD_TM")
  private Date cltInfoUpdTm;

  @Column(name = "COMM_GROUP_CD")
  private int commGroupCd;

  @Column(name = "COMM_GROUP_INPUT_CNL")
  private int commGroupInputCnl;

  @Temporal(TemporalType.DATE)
  @Column(name = "COMPANY_REP_BIRTH_DT")
  private Date companyRepBirthDt;

  @Column(name = "COMPANY_REP_NM")
  private String companyRepNm;

  @Column(name = "COMPANY_REP_NM_KANA")
  private String companyRepNmKana;

  @Temporal(TemporalType.DATE)
  @Column(name = "COMPANY_REP_NM_UPD_DT")
  private Date companyRepNmUpdDt;

  @Column(name = "COMPANY_REP_POST_NM")
  private String companyRepPostNm;

  @Temporal(TemporalType.DATE)
  @Column(name = "COMPANY_REP_POST_NM_UPD_DT")
  private Date companyRepPostNmUpdDt;

  @Column(name = "CONTACT_TURN_1")
  private int contactTurn1;

  @Column(name = "CONTACT_TURN_3")
  private int contactTurn3;

  @Column(name = "CONTACT_TURN_4")
  private int contactTurn4;

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

  @Column(name = "CORP_CHARGE2_MAIL_ADDRESS")
  private String corpCharge2MailAddress;

  @Column(name = "CORP_CHARGE2_MOBILE_PHONE_1")
  private String corpCharge2MobilePhone1;

  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_1")
  private String corpCharge2OfficeAddress1;

  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_2")
  private String corpCharge2OfficeAddress2;

  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_3")
  private String corpCharge2OfficeAddress3;

  @Column(name = "CORP_CHARGE2_OFFICE_ADDRESS_4")
  private String corpCharge2OfficeAddress4;

  @Column(name = "CORP_CHARGE2_OFFICE_ZIP_NO_1")
  private String corpCharge2OfficeZipNo1;

  @Column(name = "CORP_CHARGE2_OFFICE_ZIP_NO_2")
  private String corpCharge2OfficeZipNo2;

  @Column(name = "CORP_CLIENT_TYPE_DETAILS")
  private String corpClientTypeDetails;

  @Column(name = "CORP_CLIENT_TYPE_MSK")
  private String corpClientTypeMsk;

  @Column(name = "CORP_KBN")
  private int corpKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "CORP_KBN_UPD_TM")
  private Date corpKbnUpdTm;

  @Column(name = "CORP_SHORT_NM")
  private String corpShortNm;

  @Column(name = "CUSTODY_TRANS_KBN")
  private int custodyTransKbn;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DEAL_TYPE_MSK")
  private String dealTypeMsk;

  @Column(name = "DIV_REC_KBN_CHG_NOTICE_FLG")
  private int divRecKbnChgNoticeFlg;

  @Column(name = "DIVIDEND_RECEIVE_KBN")
  private int dividendReceiveKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "DIVIDEND_RECEIVE_KBN_CHG_DT")
  private Date dividendReceiveKbnChgDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "DIVIDENDS_ACCEPT_END_DT")
  private Date dividendsAcceptEndDt;

  @Column(name = "DIVIDENDS_ACCEPT_KBN")
  private int dividendsAcceptKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "DIVIDENDS_ACCEPT_START_DT")
  private Date dividendsAcceptStartDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "DIVIDENDS_ACCEPT_UPD_TM")
  private Date dividendsAcceptUpdTm;

  @Column(name = "EMPLOYEE_CNT_KBN")
  private int employeeCntKbn;

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
  private int familyRelationCd;

  @Column(name = "FATCA_FLG")
  private int fatcaFlg;

  @Column(name = "FAX_NO_1")
  private String faxNo1;

  @Column(name = "FI_SALES_LAW_BOND_KBN")
  private int fiSalesLawBondKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "FI_SALES_LAW_BOND_KBN_UPD_DT")
  private Date fiSalesLawBondKbnUpdDt;

  @Column(name = "FI_SALES_LAW_INV_KBN")
  private int fiSalesLawInvKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "FI_SALES_LAW_INV_KBN_UPD_DT")
  private Date fiSalesLawInvKbnUpdDt;

  @Column(name = "FIRST_NM_KANA")
  private String firstNmKana;

  @Column(name = "FIRST_NM_KANJI")
  private String firstNmKanji;

  @Column(name = "FOREIGN_DIGNITARIES")
  private int foreignDignitaries;

  @Temporal(TemporalType.DATE)
  @Column(name = "FOREIGN_STK_ACC_DEL_DT")
  private Date foreignStkAccDelDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "FOREIGN_STK_ACC_DOC_RECEIPT_DT")
  private Date foreignStkAccDocReceiptDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "FOREIGN_STK_ACC_OPEN_APP_TM")
  private Date foreignStkAccOpenAppTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "FOREIGN_STK_ACC_OPEN_DT")
  private Date foreignStkAccOpenDt;

  @Column(name = "FOREIGN_STK_ACC_OPEN_FLG")
  private int foreignStkAccOpenFlg;

  @Column(name = "FOREIGN_STK_ACC_STS")
  private int foreignStkAccSts;

  @Temporal(TemporalType.DATE)
  @Column(name = "FOREIGN_STK_ACC_STS_UPD_TM")
  private Date foreignStkAccStsUpdTm;

  @Column(name = "FX_SETTL_DIV_TRANS_INST_FLG")
  private int fxSettlDivTransInstFlg;

  @Column(name = "GENDER_KBN")
  private int genderKbn;

  @Column(name = "HOW_TO_KNOW_THIS_SITE_DETAILS")
  private String howToKnowThisSiteDetails;

  @Column(name = "HOW_TO_KNOW_THIS_SITE_KBN")
  private int howToKnowThisSiteKbn;

  @Column(name = "HSEHOLD_OCCUPATION_KBN")
  private int hseholdOccupationKbn;

  @Column(name = "HSEHOLD_OCCUPATION_KBN_DETAILS")
  private String hseholdOccupationKbnDetails;

  @Column(name = "`HSEHOLD_RELATION_K BN_DETAILS`")
  private String hseholdRelationK_bnDetails;

  @Column(name = "HSEHOLD_RELATION_KBN")
  private int hseholdRelationKbn;

  @Column(name = "ID_DOC_KBN")
  private int idDocKbn;

  @Column(name = "ID_DOC_KBN_DETAILS")
  private String idDocKbnDetails;

  @Temporal(TemporalType.DATE)
  @Column(name = "ID_DOC_VALID_DT")
  private Date idDocValidDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "ID_DOC_VALID_DT_2")
  private Date idDocValidDt2;

  @Column(name = "IDENTITY_DOCUMENTS_TYPE_2")
  private byte identityDocumentsType2;

  @Column(name = "IN_BANK_ACC_NM")
  private String inBankAccNm;

  @Column(name = "IN_BANK_ACC_NO")
  private int inBankAccNo;

  @Temporal(TemporalType.DATE)
  @Column(name = "IN_BANK_ACC_OPEN_DT")
  private Date inBankAccOpenDt;

  @Column(name = "IN_BANK_BRANCH_ADDITIONAL_CD")
  private int inBankBranchAdditionalCd;

  @Column(name = "IN_BANK_BRANCH_CD")
  private int inBankBranchCd;

  @Column(name = "IN_BANK_CD")
  private int inBankCd;

  @Column(name = "IN_BANK_CHG_NOTICE_MAKE_FLG")
  private int inBankChgNoticeMakeFlg;

  @Column(name = "IN_BANK_DEPOSIT_KBN")
  private int inBankDepositKbn;

  @Column(name = "INCOME_KBN")
  private int incomeKbn;

  @Column(name = "INPUT_BRANCH_CD")
  private int inputBranchCd;

  @Column(name = "INPUT_CLIENT_CD")
  private int inputClientCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_TM")
  private Date inputTm;

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
  private byte insiderType1;

  @Column(name = "INSIDER_TYPE2")
  private byte insiderType2;

  @Column(name = "INSIDER_TYPE3")
  private byte insiderType3;

  @Column(name = "INSIDER_TYPE4")
  private byte insiderType4;

  @Column(name = "INSIDER_TYPE5")
  private byte insiderType5;

  @Column(name = "`INTE REST_INV_MSK`")
  private String inte_restInvMsk;

  @Column(name = "INV_AMT_DETAILS")
  private int invAmtDetails;

  @Column(name = "INV_AMT_KBN")
  private int invAmtKbn;

  @Column(name = "INV_ASSET_VALUE")
  private int invAssetValue;

  @Column(name = "INV_PURPOSE_DETAILS")
  private String invPurposeDetails;

  @Column(name = "INV_PURPOSE_KBN")
  private int invPurposeKbn;

  @Column(name = "INV_TERM_KBN")
  private int invTermKbn;

  @Column(name = "INVEX_CB_KBN")
  private int invexCbKbn;

  @Column(name = "INVEX_DBOND_KBN")
  private int invexDbondKbn;

  @Column(name = "INVEX_DEBENTURE_KBN")
  private int invexDebentureKbn;

  @Column(name = "INVEX_FBOND_KBN")
  private int invexFbondKbn;

  @Column(name = "INVEX_FX_SEC_KBN")
  private int invexFxSecKbn;

  @Column(name = "INVEX_INVTR_KBN")
  private int invexInvtrKbn;

  @Column(name = "INVEX_MMFMRF_KBN")
  private int invexMmfmrfKbn;

  @Column(name = "INVEX_OTHERS_KBN")
  private int invexOthersKbn;

  @Column(name = "ISSUE_ACCOUNT_WAY_KBN")
  private int issueAccountWayKbn;

  @Column(name = "JASDEC_REPORT_TARGET_FLG")
  private int jasdecReportTargetFlg;

  @Column(name = "KOJIN_HOJIN_TYPE")
  private byte kojinHojinType;

  @Column(name = "LAST_COMM_GROUP_CD")
  private int lastCommGroupCd;

  @Column(name = "LAST_COMM_GROUP_INPUT_CNL")
  private int lastCommGroupInputCnl;

  @Column(name = "LAST_NM_KANA")
  private String lastNmKana;

  @Column(name = "LAST_NM_KANJI")
  private String lastNmKanji;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_ADVANCE_NOTICE_DT")
  private Date lastSecAdvanceNoticeDt;

  @Column(name = "LAST_SEC_APPROVAL_USER_CD")
  private int lastSecApprovalUserCd;

  @Column(name = "LAST_SEC_PRO_AMA_KBN")
  private int lastSecProAmaKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_RETURN_ADMIN_DT")
  private Date lastSecReturnAdminDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_RETURN_AGREE_ISSUE_DT")
  private Date lastSecReturnAgreeIssueDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_RETURN_DOC_ISSUE_DT")
  private Date lastSecReturnDocIssueDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_SHIFT_ADMIN_DT")
  private Date lastSecShiftAdminDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_SHIFT_AGREE_ISSUE_DT")
  private Date lastSecShiftAgreeIssueDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_SHIFT_DOC_ISSUE_DT")
  private Date lastSecShiftDocIssueDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_SEC_UPD_ADMIN_DT")
  private Date lastSecUpdAdminDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LEAVE_COUNTRY_DATE")
  private Date leaveCountryDate;

  @Column(name = "LEAVE_COUNTRY_FLG")
  private int leaveCountryFlg;

  @Column(name = "LOCAL_TAX_KBN")
  private int localTaxKbn;

  @Column(name = "LOCK_INFO")
  private String lockInfo;

  @Column(name = "LOCK_REASON_CD")
  private int lockReasonCd;

  @Column(name = "LOCK_REASON_DETAILS")
  private String lockReasonDetails;

  @Temporal(TemporalType.DATE)
  @Column(name = "LOCK_TM")
  private Date lockTm;

  @Column(name = "LOCK_UPD_USER_CD")
  private int lockUpdUserCd;

  @Column(name = "LST_DPT_KBN")
  private int lstDptKbn;

  @Column(name = "MAIL_ADDRESS")
  private String mailAddress;

  @Column(name = "MAIL_SEND_CONFIRM_KBN")
  private int mailSendConfirmKbn;

  @Column(name = "MEMBER_KBN")
  private int memberKbn;

  @Lob
  @Column(name = "MEMO")
  private String memo;

  @Column(name = "MOBILE_PHONE_NO_1")
  private String mobilePhoneNo1;

  @Column(name = "NATIONALITY_KBN")
  private int nationalityKbn;

  @Column(name = "NET_ASSET_VALUE")
  private int netAssetValue;

  @Column(name = "NEXT_COMM_GROUP_CD")
  private int nextCommGroupCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "NEXT_COMM_GROUP_DT")
  private Date nextCommGroupDt;

  @Column(name = "NEXT_COMM_GROUP_INPUT_CNL")
  private int nextCommGroupInputCnl;

  @Temporal(TemporalType.DATE)
  @Column(name = "NEXT_DIVIDENDS_ACCEPT_END_DT")
  private Date nextDividendsAcceptEndDt;

  @Column(name = "NEXT_DIVIDENDS_ACCEPT_KBN")
  private int nextDividendsAcceptKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "NEXT_DIVIDENDS_ACCEPT_START_DT")
  private Date nextDividendsAcceptStartDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "NEXT_DIVIDENDS_ACCEPT_UPD_TM")
  private Date nextDividendsAcceptUpdTm;

  @Column(name = "NEXT_STK_TRF_TAX_KBN")
  private int nextStkTrfTaxKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "NEXT_STK_TRF_TAX_KBN_UPD_TM")
  private Date nextStkTrfTaxKbnUpdTm;

  @Column(name = "NM_CHG_NOTICE_MAKE_FLG")
  private int nmChgNoticeMakeFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "NM_UPD_DT")
  private Date nmUpdDt;

  @Column(name = "NON_RESIDENT_FLG")
  private int nonResidentFlg;

  @Column(name = "NONRESIDSENT_INSTITUTION_KBN")
  private int nonresidsentInstitutionKbn;

  @Column(name = "OCCUPATION_DETAILS")
  private String occupationDetails;

  @Column(name = "OCCUPATION_TYPE")
  private byte occupationType;

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

  @Temporal(TemporalType.DATE)
  @Column(name = "OPEN_DATE")
  private Date openDate;

  @Lob
  @Column(name = "PARENT_REMARKS")
  private String parentRemarks;

  @Column(name = "PARENTS_AGREE_FLG")
  private int parentsAgreeFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "PARENTS_BIRTH_DT")
  private Date parentsBirthDt;

  @Column(name = "PARENTS_BRANCH_CD")
  private int parentsBranchCd;

  @Column(name = "PARENTS_CLIENT_CD")
  private int parentsClientCd;

  @Column(name = "PARENTS_NM")
  private String parentsNm;

  @Column(name = "PHONE_NO_1")
  private String phoneNo1;

  @Temporal(TemporalType.DATE)
  @Column(name = "PREV_DIVIDENDS_ACCEPT_END_DT")
  private Date prevDividendsAcceptEndDt;

  @Column(name = "PREV_DIVIDENDS_ACCEPT_KBN")
  private int prevDividendsAcceptKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "PREV_DIVIDENDS_ACCEPT_START_DT")
  private Date prevDividendsAcceptStartDt;

  @Column(name = "PREV_STK_TRF_TAX_KBN")
  private int prevStkTrfTaxKbn;

  @Column(name = "PURPOSE_TYPE")
  private byte purposeType;

  @Column(name = "QUALIFIED_INST_INVESTOR_KBN")
  private int qualifiedInstInvestorKbn;

  @Column(name = "RECEIPT_DOC_KBN")
  private int receiptDocKbn;

  @Column(name = "RESIDENT_COUNTRY_CD")
  private String residentCountryCd;

  @Column(name = "SALES_BRANCH_CD")
  private int salesBranchCd;

  @Column(name = "SALES_CLIENT_CD")
  private int salesClientCd;

  @Column(name = "SEAL_CHG_NOTICE_MAKE_FLG")
  private int sealChgNoticeMakeFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "SEC_ADVANCE_NOTICE_DT")
  private Date secAdvanceNoticeDt;

  @Column(name = "SEC_PRO_AMA_KBN")
  private int secProAmaKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "SEC_PRO_AMA_UPD_DT")
  private Date secProAmaUpdDt;

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
  private int sendKbn;

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

  @Temporal(TemporalType.DATE)
  @Column(name = "SP_ACC_OPEN_APPLY_TM")
  private Date spAccOpenApplyTm;

  @Column(name = "STAFF_CD")
  private String staffCd;

  @Column(name = "STAFF_KBN")
  private int staffKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "STAMP_UPD_DT")
  private Date stampUpdDt;

  @Column(name = "STANDING_AGENT_FLG")
  private int standingAgentFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "STK_SP_ACC_DEL_DT")
  private Date stkSpAccDelDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "STK_SP_ACC_OPEN_DT")
  private Date stkSpAccOpenDt;

  @Column(name = "STK_SP_ACC_OPEN_FLG")
  private int stkSpAccOpenFlg;

  @Column(name = "STK_SP_ACC_STS")
  private int stkSpAccSts;

  @Temporal(TemporalType.DATE)
  @Column(name = "STK_SP_ACC_STS_UPD_TM")
  private Date stkSpAccStsUpdTm;

  @Column(name = "STK_TRF_TAX_KBN")
  private int stkTrfTaxKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "STK_TRF_TAX_KBN_UPD_TM")
  private Date stkTrfTaxKbnUpdTm;

  @Temporal(TemporalType.DATE)
  @Column(name = "TAX_EXCEPTION_APPLY_DT")
  private Date taxExceptionApplyDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "TAX_EXCEPTION_EXPIRARION_DT")
  private Date taxExceptionExpirarionDt;

  @Column(name = "TRADE_RULE_CONFIRM_KBN")
  private int tradeRuleConfirmKbn;

  @Column(name = "UNDER_AGE_KBN")
  private int underAgeKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "UNKNOWN_ADDRESS_DT")
  private Date unknownAddressDt;

  @Column(name = "UNKNOWN_ADDRESS_FLG")
  private int unknownAddressFlg;

  @Column(name = "UPDATE_BRANCH_CD")
  private int updateBranchCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "UPDATE_USER_CD")
  private int updateUserCd;

  @Column(name = "US_TAX")
  private int usTax;

  @Column(name = "USING_OTHER_IT_KBN")
  private int usingOtherItKbn;

  @Column(name = "WALLET_ADR")
  private String walletAdr;

  @Column(name = "YEN_SETTL_DIV_TRANS_INST_FLG")
  private int yenSettlDivTransInstFlg;

  @Column(name = "ZIP_NO_1")
  private String zipNo1;

  @Column(name = "ZIP_NO_2")
  private String zipNo2;

  public ClientHistory() {}

  public byte getInsiderFlg() {
    return this.insiderFlg;
  }

  public void setInsiderFlg(byte insiderFlg) {
    this.insiderFlg = insiderFlg;
  }

  public String getAcOpenChannel() {
    return this.acOpenChannel;
  }

  public void setAcOpenChannel(String acOpenChannel) {
    this.acOpenChannel = acOpenChannel;
  }

  public Date getAccDeleteDt() {
    return this.accDeleteDt;
  }

  public void setAccDeleteDt(Date accDeleteDt) {
    this.accDeleteDt = accDeleteDt;
  }

  public Date getAccOpenApplyTm() {
    return this.accOpenApplyTm;
  }

  public void setAccOpenApplyTm(Date accOpenApplyTm) {
    this.accOpenApplyTm = accOpenApplyTm;
  }

  public Date getAccOpenDt() {
    return this.accOpenDt;
  }

  public void setAccOpenDt(Date accOpenDt) {
    this.accOpenDt = accOpenDt;
  }

  public int getAccOpenFlg() {
    return this.accOpenFlg;
  }

  public void setAccOpenFlg(int accOpenFlg) {
    this.accOpenFlg = accOpenFlg;
  }

  public String getAccOpenReasonDetails() {
    return this.accOpenReasonDetails;
  }

  public void setAccOpenReasonDetails(String accOpenReasonDetails) {
    this.accOpenReasonDetails = accOpenReasonDetails;
  }

  public int getAccOpenReasonKbn() {
    return this.accOpenReasonKbn;
  }

  public void setAccOpenReasonKbn(int accOpenReasonKbn) {
    this.accOpenReasonKbn = accOpenReasonKbn;
  }

  public String getAccOpenReasonMsk() {
    return this.accOpenReasonMsk;
  }

  public void setAccOpenReasonMsk(String accOpenReasonMsk) {
    this.accOpenReasonMsk = accOpenReasonMsk;
  }

  public int getAccSts() {
    return this.accSts;
  }

  public void setAccSts(int accSts) {
    this.accSts = accSts;
  }

  public Date getAccStsUpdTm() {
    return this.accStsUpdTm;
  }

  public void setAccStsUpdTm(Date accStsUpdTm) {
    this.accStsUpdTm = accStsUpdTm;
  }

  public int getAddChgNoticeMake_flg() {
    return this.addChgNoticeMake_flg;
  }

  public void setAddChgNoticeMake_flg(int addChgNoticeMake_flg) {
    this.addChgNoticeMake_flg = addChgNoticeMake_flg;
  }

  public String getAddress1() {
    return this.address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return this.address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAddress3() {
    return this.address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public String getAddress4() {
    return this.address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public String getAddressKana1() {
    return this.addressKana1;
  }

  public void setAddressKana1(String addressKana1) {
    this.addressKana1 = addressKana1;
  }

  public String getAddressKana2() {
    return this.addressKana2;
  }

  public void setAddressKana2(String addressKana2) {
    this.addressKana2 = addressKana2;
  }

  public String getAddressKana3() {
    return this.addressKana3;
  }

  public void setAddressKana3(String addressKana3) {
    this.addressKana3 = addressKana3;
  }

  public String getAddressKana4() {
    return this.addressKana4;
  }

  public void setAddressKana4(String addressKana4) {
    this.addressKana4 = addressKana4;
  }

  public Date getAddressUpdDt() {
    return this.addressUpdDt;
  }

  public void setAddressUpdDt(Date addressUpdDt) {
    this.addressUpdDt = addressUpdDt;
  }

  public String getAreaCd() {
    return this.areaCd;
  }

  public void setAreaCd(String areaCd) {
    this.areaCd = areaCd;
  }

  public String getAssetsCharDetails() {
    return this.assetsCharDetails;
  }

  public void setAssetsCharDetails(String assetsCharDetails) {
    this.assetsCharDetails = assetsCharDetails;
  }

  public int getAssetsCharKbn() {
    return this.assetsCharKbn;
  }

  public void setAssetsCharKbn(int assetsCharKbn) {
    this.assetsCharKbn = assetsCharKbn;
  }

  public int getAssetsKbn() {
    return this.assetsKbn;
  }

  public void setAssetsKbn(int assetsKbn) {
    this.assetsKbn = assetsKbn;
  }

  public int getAttentiveClientFlg() {
    return this.attentiveClientFlg;
  }

  public void setAttentiveClientFlg(int attentiveClientFlg) {
    this.attentiveClientFlg = attentiveClientFlg;
  }

  public String getAttentiveReason() {
    return this.attentiveReason;
  }

  public void setAttentiveReason(String attentiveReason) {
    this.attentiveReason = attentiveReason;
  }

  public Date getBirthDt() {
    return this.birthDt;
  }

  public void setBirthDt(Date birthDt) {
    this.birthDt = birthDt;
  }

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getC_ontactTurn2() {
    return this.c_ontactTurn2;
  }

  public void setC_ontactTurn2(int c_ontactTurn2) {
    this.c_ontactTurn2 = c_ontactTurn2;
  }

  public String getCampaignCd() {
    return this.campaignCd;
  }

  public void setCampaignCd(String campaignCd) {
    this.campaignCd = campaignCd;
  }

  public int getCapital() {
    return this.capital;
  }

  public void setCapital(int capital) {
    this.capital = capital;
  }

  public Date getChargeBirthDt() {
    return this.chargeBirthDt;
  }

  public void setChargeBirthDt(Date chargeBirthDt) {
    this.chargeBirthDt = chargeBirthDt;
  }

  public String getChargeDepartNm() {
    return this.chargeDepartNm;
  }

  public void setChargeDepartNm(String chargeDepartNm) {
    this.chargeDepartNm = chargeDepartNm;
  }

  public int getChargeIdDocKbn() {
    return this.chargeIdDocKbn;
  }

  public void setChargeIdDocKbn(int chargeIdDocKbn) {
    this.chargeIdDocKbn = chargeIdDocKbn;
  }

  public Date getChargeIdDocValidDt() {
    return this.chargeIdDocValidDt;
  }

  public void setChargeIdDocValidDt(Date chargeIdDocValidDt) {
    this.chargeIdDocValidDt = chargeIdDocValidDt;
  }

  public String getChargeNm() {
    return this.chargeNm;
  }

  public void setChargeNm(String chargeNm) {
    this.chargeNm = chargeNm;
  }

  public String getChargeNmKana() {
    return this.chargeNmKana;
  }

  public void setChargeNmKana(String chargeNmKana) {
    this.chargeNmKana = chargeNmKana;
  }

  public String getChargePost() {
    return this.chargePost;
  }

  public void setChargePost(String chargePost) {
    this.chargePost = chargePost;
  }

  public String getChargeTelNo1() {
    return this.chargeTelNo1;
  }

  public void setChargeTelNo1(String chargeTelNo1) {
    this.chargeTelNo1 = chargeTelNo1;
  }

  public int getCharge1MailSendConfirmKbn() {
    return this.charge1MailSendConfirmKbn;
  }

  public void setCharge1MailSendConfirmKbn(int charge1MailSendConfirmKbn) {
    this.charge1MailSendConfirmKbn = charge1MailSendConfirmKbn;
  }

  public Date getCharge2BirthDt() {
    return this.charge2BirthDt;
  }

  public void setCharge2BirthDt(Date charge2BirthDt) {
    this.charge2BirthDt = charge2BirthDt;
  }

  public String getCharge2DepartNm() {
    return this.charge2DepartNm;
  }

  public void setCharge2DepartNm(String charge2DepartNm) {
    this.charge2DepartNm = charge2DepartNm;
  }

  public int getCharge2IdDocKbn() {
    return this.charge2IdDocKbn;
  }

  public void setCharge2IdDocKbn(int charge2IdDocKbn) {
    this.charge2IdDocKbn = charge2IdDocKbn;
  }

  public Date getCharge2IdDocValidDt() {
    return this.charge2IdDocValidDt;
  }

  public void setCharge2IdDocValidDt(Date charge2IdDocValidDt) {
    this.charge2IdDocValidDt = charge2IdDocValidDt;
  }

  public int getCharge2MailSendConfirmKbn() {
    return this.charge2MailSendConfirmKbn;
  }

  public void setCharge2MailSendConfirmKbn(int charge2MailSendConfirmKbn) {
    this.charge2MailSendConfirmKbn = charge2MailSendConfirmKbn;
  }

  public String getCharge2Nm() {
    return this.charge2Nm;
  }

  public void setCharge2Nm(String charge2Nm) {
    this.charge2Nm = charge2Nm;
  }

  public String getCharge2NmKana() {
    return this.charge2NmKana;
  }

  public void setCharge2NmKana(String charge2NmKana) {
    this.charge2NmKana = charge2NmKana;
  }

  public String getCharge2Post() {
    return this.charge2Post;
  }

  public void setCharge2Post(String charge2Post) {
    this.charge2Post = charge2Post;
  }

  public int getCharge2SelectFlg() {
    return this.charge2SelectFlg;
  }

  public void setCharge2SelectFlg(int charge2SelectFlg) {
    this.charge2SelectFlg = charge2SelectFlg;
  }

  public String getCharge2TelNo1() {
    return this.charge2TelNo1;
  }

  public void setCharge2TelNo1(String charge2TelNo1) {
    this.charge2TelNo1 = charge2TelNo1;
  }

  public int getClientHistoryNo() {
    return this.clientHistoryNo;
  }

  public void setClientHistoryNo(int clientHistoryNo) {
    this.clientHistoryNo = clientHistoryNo;
  }

  public String getClientNm() {
    return this.clientNm;
  }

  public void setClientNm(String clientNm) {
    this.clientNm = clientNm;
  }

  public String getClientNmKana() {
    return this.clientNmKana;
  }

  public void setClientNmKana(String clientNmKana) {
    this.clientNmKana = clientNmKana;
  }

  public Date getCltInfoUpdApplyTm() {
    return this.cltInfoUpdApplyTm;
  }

  public void setCltInfoUpdApplyTm(Date cltInfoUpdApplyTm) {
    this.cltInfoUpdApplyTm = cltInfoUpdApplyTm;
  }

  public Date getCltInfoUpdTm() {
    return this.cltInfoUpdTm;
  }

  public void setCltInfoUpdTm(Date cltInfoUpdTm) {
    this.cltInfoUpdTm = cltInfoUpdTm;
  }

  public int getCommGroupCd() {
    return this.commGroupCd;
  }

  public void setCommGroupCd(int commGroupCd) {
    this.commGroupCd = commGroupCd;
  }

  public int getCommGroupInputCnl() {
    return this.commGroupInputCnl;
  }

  public void setCommGroupInputCnl(int commGroupInputCnl) {
    this.commGroupInputCnl = commGroupInputCnl;
  }

  public Date getCompanyRepBirthDt() {
    return this.companyRepBirthDt;
  }

  public void setCompanyRepBirthDt(Date companyRepBirthDt) {
    this.companyRepBirthDt = companyRepBirthDt;
  }

  public String getCompanyRepNm() {
    return this.companyRepNm;
  }

  public void setCompanyRepNm(String companyRepNm) {
    this.companyRepNm = companyRepNm;
  }

  public String getCompanyRepNmKana() {
    return this.companyRepNmKana;
  }

  public void setCompanyRepNmKana(String companyRepNmKana) {
    this.companyRepNmKana = companyRepNmKana;
  }

  public Date getCompanyRepNmUpdDt() {
    return this.companyRepNmUpdDt;
  }

  public void setCompanyRepNmUpdDt(Date companyRepNmUpdDt) {
    this.companyRepNmUpdDt = companyRepNmUpdDt;
  }

  public String getCompanyRepPostNm() {
    return this.companyRepPostNm;
  }

  public void setCompanyRepPostNm(String companyRepPostNm) {
    this.companyRepPostNm = companyRepPostNm;
  }

  public Date getCompanyRepPostNmUpdDt() {
    return this.companyRepPostNmUpdDt;
  }

  public void setCompanyRepPostNmUpdDt(Date companyRepPostNmUpdDt) {
    this.companyRepPostNmUpdDt = companyRepPostNmUpdDt;
  }

  public int getContactTurn1() {
    return this.contactTurn1;
  }

  public void setContactTurn1(int contactTurn1) {
    this.contactTurn1 = contactTurn1;
  }

  public int getContactTurn3() {
    return this.contactTurn3;
  }

  public void setContactTurn3(int contactTurn3) {
    this.contactTurn3 = contactTurn3;
  }

  public int getContactTurn4() {
    return this.contactTurn4;
  }

  public void setContactTurn4(int contactTurn4) {
    this.contactTurn4 = contactTurn4;
  }

  public String getCorpBusinessDetails() {
    return this.corpBusinessDetails;
  }

  public void setCorpBusinessDetails(String corpBusinessDetails) {
    this.corpBusinessDetails = corpBusinessDetails;
  }

  public String getCorpChargeMailAddress() {
    return this.corpChargeMailAddress;
  }

  public void setCorpChargeMailAddress(String corpChargeMailAddress) {
    this.corpChargeMailAddress = corpChargeMailAddress;
  }

  public String getCorpChargeMobilePhone1() {
    return this.corpChargeMobilePhone1;
  }

  public void setCorpChargeMobilePhone1(String corpChargeMobilePhone1) {
    this.corpChargeMobilePhone1 = corpChargeMobilePhone1;
  }

  public String getCorpChargeOfficeAddress1() {
    return this.corpChargeOfficeAddress1;
  }

  public void setCorpChargeOfficeAddress1(String corpChargeOfficeAddress1) {
    this.corpChargeOfficeAddress1 = corpChargeOfficeAddress1;
  }

  public String getCorpChargeOfficeAddress2() {
    return this.corpChargeOfficeAddress2;
  }

  public void setCorpChargeOfficeAddress2(String corpChargeOfficeAddress2) {
    this.corpChargeOfficeAddress2 = corpChargeOfficeAddress2;
  }

  public String getCorpChargeOfficeAddress3() {
    return this.corpChargeOfficeAddress3;
  }

  public void setCorpChargeOfficeAddress3(String corpChargeOfficeAddress3) {
    this.corpChargeOfficeAddress3 = corpChargeOfficeAddress3;
  }

  public String getCorpChargeOfficeAddress4() {
    return this.corpChargeOfficeAddress4;
  }

  public void setCorpChargeOfficeAddress4(String corpChargeOfficeAddress4) {
    this.corpChargeOfficeAddress4 = corpChargeOfficeAddress4;
  }

  public String getCorpChargeOfficeZipNo1() {
    return this.corpChargeOfficeZipNo1;
  }

  public void setCorpChargeOfficeZipNo1(String corpChargeOfficeZipNo1) {
    this.corpChargeOfficeZipNo1 = corpChargeOfficeZipNo1;
  }

  public String getCorpChargeOfficeZipNo2() {
    return this.corpChargeOfficeZipNo2;
  }

  public void setCorpChargeOfficeZipNo2(String corpChargeOfficeZipNo2) {
    this.corpChargeOfficeZipNo2 = corpChargeOfficeZipNo2;
  }

  public String getCorpCharge2MailAddress() {
    return this.corpCharge2MailAddress;
  }

  public void setCorpCharge2MailAddress(String corpCharge2MailAddress) {
    this.corpCharge2MailAddress = corpCharge2MailAddress;
  }

  public String getCorpCharge2MobilePhone1() {
    return this.corpCharge2MobilePhone1;
  }

  public void setCorpCharge2MobilePhone1(String corpCharge2MobilePhone1) {
    this.corpCharge2MobilePhone1 = corpCharge2MobilePhone1;
  }

  public String getCorpCharge2OfficeAddress1() {
    return this.corpCharge2OfficeAddress1;
  }

  public void setCorpCharge2OfficeAddress1(String corpCharge2OfficeAddress1) {
    this.corpCharge2OfficeAddress1 = corpCharge2OfficeAddress1;
  }

  public String getCorpCharge2OfficeAddress2() {
    return this.corpCharge2OfficeAddress2;
  }

  public void setCorpCharge2OfficeAddress2(String corpCharge2OfficeAddress2) {
    this.corpCharge2OfficeAddress2 = corpCharge2OfficeAddress2;
  }

  public String getCorpCharge2OfficeAddress3() {
    return this.corpCharge2OfficeAddress3;
  }

  public void setCorpCharge2OfficeAddress3(String corpCharge2OfficeAddress3) {
    this.corpCharge2OfficeAddress3 = corpCharge2OfficeAddress3;
  }

  public String getCorpCharge2OfficeAddress4() {
    return this.corpCharge2OfficeAddress4;
  }

  public void setCorpCharge2OfficeAddress4(String corpCharge2OfficeAddress4) {
    this.corpCharge2OfficeAddress4 = corpCharge2OfficeAddress4;
  }

  public String getCorpCharge2OfficeZipNo1() {
    return this.corpCharge2OfficeZipNo1;
  }

  public void setCorpCharge2OfficeZipNo1(String corpCharge2OfficeZipNo1) {
    this.corpCharge2OfficeZipNo1 = corpCharge2OfficeZipNo1;
  }

  public String getCorpCharge2OfficeZipNo2() {
    return this.corpCharge2OfficeZipNo2;
  }

  public void setCorpCharge2OfficeZipNo2(String corpCharge2OfficeZipNo2) {
    this.corpCharge2OfficeZipNo2 = corpCharge2OfficeZipNo2;
  }

  public String getCorpClientTypeDetails() {
    return this.corpClientTypeDetails;
  }

  public void setCorpClientTypeDetails(String corpClientTypeDetails) {
    this.corpClientTypeDetails = corpClientTypeDetails;
  }

  public String getCorpClientTypeMsk() {
    return this.corpClientTypeMsk;
  }

  public void setCorpClientTypeMsk(String corpClientTypeMsk) {
    this.corpClientTypeMsk = corpClientTypeMsk;
  }

  public int getCorpKbn() {
    return this.corpKbn;
  }

  public void setCorpKbn(int corpKbn) {
    this.corpKbn = corpKbn;
  }

  public Date getCorpKbnUpdTm() {
    return this.corpKbnUpdTm;
  }

  public void setCorpKbnUpdTm(Date corpKbnUpdTm) {
    this.corpKbnUpdTm = corpKbnUpdTm;
  }

  public String getCorpShortNm() {
    return this.corpShortNm;
  }

  public void setCorpShortNm(String corpShortNm) {
    this.corpShortNm = corpShortNm;
  }

  public int getCustodyTransKbn() {
    return this.custodyTransKbn;
  }

  public void setCustodyTransKbn(int custodyTransKbn) {
    this.custodyTransKbn = custodyTransKbn;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public String getDealTypeMsk() {
    return this.dealTypeMsk;
  }

  public void setDealTypeMsk(String dealTypeMsk) {
    this.dealTypeMsk = dealTypeMsk;
  }

  public int getDivRecKbnChgNoticeFlg() {
    return this.divRecKbnChgNoticeFlg;
  }

  public void setDivRecKbnChgNoticeFlg(int divRecKbnChgNoticeFlg) {
    this.divRecKbnChgNoticeFlg = divRecKbnChgNoticeFlg;
  }

  public int getDividendReceiveKbn() {
    return this.dividendReceiveKbn;
  }

  public void setDividendReceiveKbn(int dividendReceiveKbn) {
    this.dividendReceiveKbn = dividendReceiveKbn;
  }

  public Date getDividendReceiveKbnChgDt() {
    return this.dividendReceiveKbnChgDt;
  }

  public void setDividendReceiveKbnChgDt(Date dividendReceiveKbnChgDt) {
    this.dividendReceiveKbnChgDt = dividendReceiveKbnChgDt;
  }

  public Date getDividendsAcceptEndDt() {
    return this.dividendsAcceptEndDt;
  }

  public void setDividendsAcceptEndDt(Date dividendsAcceptEndDt) {
    this.dividendsAcceptEndDt = dividendsAcceptEndDt;
  }

  public int getDividendsAcceptKbn() {
    return this.dividendsAcceptKbn;
  }

  public void setDividendsAcceptKbn(int dividendsAcceptKbn) {
    this.dividendsAcceptKbn = dividendsAcceptKbn;
  }

  public Date getDividendsAcceptStartDt() {
    return this.dividendsAcceptStartDt;
  }

  public void setDividendsAcceptStartDt(Date dividendsAcceptStartDt) {
    this.dividendsAcceptStartDt = dividendsAcceptStartDt;
  }

  public Date getDividendsAcceptUpdTm() {
    return this.dividendsAcceptUpdTm;
  }

  public void setDividendsAcceptUpdTm(Date dividendsAcceptUpdTm) {
    this.dividendsAcceptUpdTm = dividendsAcceptUpdTm;
  }

  public int getEmployeeCntKbn() {
    return this.employeeCntKbn;
  }

  public void setEmployeeCntKbn(int employeeCntKbn) {
    this.employeeCntKbn = employeeCntKbn;
  }

  public String getEnglishClientAddress() {
    return this.englishClientAddress;
  }

  public void setEnglishClientAddress(String englishClientAddress) {
    this.englishClientAddress = englishClientAddress;
  }

  public String getEnglishClientNm() {
    return this.englishClientNm;
  }

  public void setEnglishClientNm(String englishClientNm) {
    this.englishClientNm = englishClientNm;
  }

  public String getEohyMd1() {
    return this.eohyMd1;
  }

  public void setEohyMd1(String eohyMd1) {
    this.eohyMd1 = eohyMd1;
  }

  public String getEohyMd2() {
    return this.eohyMd2;
  }

  public void setEohyMd2(String eohyMd2) {
    this.eohyMd2 = eohyMd2;
  }

  public String getEohyMd3() {
    return this.eohyMd3;
  }

  public void setEohyMd3(String eohyMd3) {
    this.eohyMd3 = eohyMd3;
  }

  public String getEoyMd() {
    return this.eoyMd;
  }

  public void setEoyMd(String eoyMd) {
    this.eoyMd = eoyMd;
  }

  public String getFamilyNurturerNm() {
    return this.familyNurturerNm;
  }

  public void setFamilyNurturerNm(String familyNurturerNm) {
    this.familyNurturerNm = familyNurturerNm;
  }

  public String getFamilyNurturerOfficeNm() {
    return this.familyNurturerOfficeNm;
  }

  public void setFamilyNurturerOfficeNm(String familyNurturerOfficeNm) {
    this.familyNurturerOfficeNm = familyNurturerOfficeNm;
  }

  public int getFamilyRelationCd() {
    return this.familyRelationCd;
  }

  public void setFamilyRelationCd(int familyRelationCd) {
    this.familyRelationCd = familyRelationCd;
  }

  public int getFatcaFlg() {
    return this.fatcaFlg;
  }

  public void setFatcaFlg(int fatcaFlg) {
    this.fatcaFlg = fatcaFlg;
  }

  public String getFaxNo1() {
    return this.faxNo1;
  }

  public void setFaxNo1(String faxNo1) {
    this.faxNo1 = faxNo1;
  }

  public int getFiSalesLawBondKbn() {
    return this.fiSalesLawBondKbn;
  }

  public void setFiSalesLawBondKbn(int fiSalesLawBondKbn) {
    this.fiSalesLawBondKbn = fiSalesLawBondKbn;
  }

  public Date getFiSalesLawBondKbnUpdDt() {
    return this.fiSalesLawBondKbnUpdDt;
  }

  public void setFiSalesLawBondKbnUpdDt(Date fiSalesLawBondKbnUpdDt) {
    this.fiSalesLawBondKbnUpdDt = fiSalesLawBondKbnUpdDt;
  }

  public int getFiSalesLawInvKbn() {
    return this.fiSalesLawInvKbn;
  }

  public void setFiSalesLawInvKbn(int fiSalesLawInvKbn) {
    this.fiSalesLawInvKbn = fiSalesLawInvKbn;
  }

  public Date getFiSalesLawInvKbnUpdDt() {
    return this.fiSalesLawInvKbnUpdDt;
  }

  public void setFiSalesLawInvKbnUpdDt(Date fiSalesLawInvKbnUpdDt) {
    this.fiSalesLawInvKbnUpdDt = fiSalesLawInvKbnUpdDt;
  }

  public String getFirstNmKana() {
    return this.firstNmKana;
  }

  public void setFirstNmKana(String firstNmKana) {
    this.firstNmKana = firstNmKana;
  }

  public String getFirstNmKanji() {
    return this.firstNmKanji;
  }

  public void setFirstNmKanji(String firstNmKanji) {
    this.firstNmKanji = firstNmKanji;
  }

  public int getForeignDignitaries() {
    return this.foreignDignitaries;
  }

  public void setForeignDignitaries(int foreignDignitaries) {
    this.foreignDignitaries = foreignDignitaries;
  }

  public Date getForeignStkAccDelDt() {
    return this.foreignStkAccDelDt;
  }

  public void setForeignStkAccDelDt(Date foreignStkAccDelDt) {
    this.foreignStkAccDelDt = foreignStkAccDelDt;
  }

  public Date getForeignStkAccDocReceiptDt() {
    return this.foreignStkAccDocReceiptDt;
  }

  public void setForeignStkAccDocReceiptDt(Date foreignStkAccDocReceiptDt) {
    this.foreignStkAccDocReceiptDt = foreignStkAccDocReceiptDt;
  }

  public Date getForeignStkAccOpenAppTm() {
    return this.foreignStkAccOpenAppTm;
  }

  public void setForeignStkAccOpenAppTm(Date foreignStkAccOpenAppTm) {
    this.foreignStkAccOpenAppTm = foreignStkAccOpenAppTm;
  }

  public Date getForeignStkAccOpenDt() {
    return this.foreignStkAccOpenDt;
  }

  public void setForeignStkAccOpenDt(Date foreignStkAccOpenDt) {
    this.foreignStkAccOpenDt = foreignStkAccOpenDt;
  }

  public int getForeignStkAccOpenFlg() {
    return this.foreignStkAccOpenFlg;
  }

  public void setForeignStkAccOpenFlg(int foreignStkAccOpenFlg) {
    this.foreignStkAccOpenFlg = foreignStkAccOpenFlg;
  }

  public int getForeignStkAccSts() {
    return this.foreignStkAccSts;
  }

  public void setForeignStkAccSts(int foreignStkAccSts) {
    this.foreignStkAccSts = foreignStkAccSts;
  }

  public Date getForeignStkAccStsUpdTm() {
    return this.foreignStkAccStsUpdTm;
  }

  public void setForeignStkAccStsUpdTm(Date foreignStkAccStsUpdTm) {
    this.foreignStkAccStsUpdTm = foreignStkAccStsUpdTm;
  }

  public int getFxSettlDivTransInstFlg() {
    return this.fxSettlDivTransInstFlg;
  }

  public void setFxSettlDivTransInstFlg(int fxSettlDivTransInstFlg) {
    this.fxSettlDivTransInstFlg = fxSettlDivTransInstFlg;
  }

  public int getGenderKbn() {
    return this.genderKbn;
  }

  public void setGenderKbn(int genderKbn) {
    this.genderKbn = genderKbn;
  }

  public String getHowToKnowThisSiteDetails() {
    return this.howToKnowThisSiteDetails;
  }

  public void setHowToKnowThisSiteDetails(String howToKnowThisSiteDetails) {
    this.howToKnowThisSiteDetails = howToKnowThisSiteDetails;
  }

  public int getHowToKnowThisSiteKbn() {
    return this.howToKnowThisSiteKbn;
  }

  public void setHowToKnowThisSiteKbn(int howToKnowThisSiteKbn) {
    this.howToKnowThisSiteKbn = howToKnowThisSiteKbn;
  }

  public int getHseholdOccupationKbn() {
    return this.hseholdOccupationKbn;
  }

  public void setHseholdOccupationKbn(int hseholdOccupationKbn) {
    this.hseholdOccupationKbn = hseholdOccupationKbn;
  }

  public String getHseholdOccupationKbnDetails() {
    return this.hseholdOccupationKbnDetails;
  }

  public void setHseholdOccupationKbnDetails(String hseholdOccupationKbnDetails) {
    this.hseholdOccupationKbnDetails = hseholdOccupationKbnDetails;
  }

  public String getHseholdRelationK_bnDetails() {
    return this.hseholdRelationK_bnDetails;
  }

  public void setHseholdRelationK_bnDetails(String hseholdRelationK_bnDetails) {
    this.hseholdRelationK_bnDetails = hseholdRelationK_bnDetails;
  }

  public int getHseholdRelationKbn() {
    return this.hseholdRelationKbn;
  }

  public void setHseholdRelationKbn(int hseholdRelationKbn) {
    this.hseholdRelationKbn = hseholdRelationKbn;
  }

  public int getIdDocKbn() {
    return this.idDocKbn;
  }

  public void setIdDocKbn(int idDocKbn) {
    this.idDocKbn = idDocKbn;
  }

  public String getIdDocKbnDetails() {
    return this.idDocKbnDetails;
  }

  public void setIdDocKbnDetails(String idDocKbnDetails) {
    this.idDocKbnDetails = idDocKbnDetails;
  }

  public Date getIdDocValidDt() {
    return this.idDocValidDt;
  }

  public void setIdDocValidDt(Date idDocValidDt) {
    this.idDocValidDt = idDocValidDt;
  }

  public Date getIdDocValidDt2() {
    return this.idDocValidDt2;
  }

  public void setIdDocValidDt2(Date idDocValidDt2) {
    this.idDocValidDt2 = idDocValidDt2;
  }

  public byte getIdentityDocumentsType2() {
    return this.identityDocumentsType2;
  }

  public void setIdentityDocumentsType2(byte identityDocumentsType2) {
    this.identityDocumentsType2 = identityDocumentsType2;
  }

  public String getInBankAccNm() {
    return this.inBankAccNm;
  }

  public void setInBankAccNm(String inBankAccNm) {
    this.inBankAccNm = inBankAccNm;
  }

  public int getInBankAccNo() {
    return this.inBankAccNo;
  }

  public void setInBankAccNo(int inBankAccNo) {
    this.inBankAccNo = inBankAccNo;
  }

  public Date getInBankAccOpenDt() {
    return this.inBankAccOpenDt;
  }

  public void setInBankAccOpenDt(Date inBankAccOpenDt) {
    this.inBankAccOpenDt = inBankAccOpenDt;
  }

  public int getInBankBranchAdditionalCd() {
    return this.inBankBranchAdditionalCd;
  }

  public void setInBankBranchAdditionalCd(int inBankBranchAdditionalCd) {
    this.inBankBranchAdditionalCd = inBankBranchAdditionalCd;
  }

  public int getInBankBranchCd() {
    return this.inBankBranchCd;
  }

  public void setInBankBranchCd(int inBankBranchCd) {
    this.inBankBranchCd = inBankBranchCd;
  }

  public int getInBankCd() {
    return this.inBankCd;
  }

  public void setInBankCd(int inBankCd) {
    this.inBankCd = inBankCd;
  }

  public int getInBankChgNoticeMakeFlg() {
    return this.inBankChgNoticeMakeFlg;
  }

  public void setInBankChgNoticeMakeFlg(int inBankChgNoticeMakeFlg) {
    this.inBankChgNoticeMakeFlg = inBankChgNoticeMakeFlg;
  }

  public int getInBankDepositKbn() {
    return this.inBankDepositKbn;
  }

  public void setInBankDepositKbn(int inBankDepositKbn) {
    this.inBankDepositKbn = inBankDepositKbn;
  }

  public int getIncomeKbn() {
    return this.incomeKbn;
  }

  public void setIncomeKbn(int incomeKbn) {
    this.incomeKbn = incomeKbn;
  }

  public int getInputBranchCd() {
    return this.inputBranchCd;
  }

  public void setInputBranchCd(int inputBranchCd) {
    this.inputBranchCd = inputBranchCd;
  }

  public int getInputClientCd() {
    return this.inputClientCd;
  }

  public void setInputClientCd(int inputClientCd) {
    this.inputClientCd = inputClientCd;
  }

  public Date getInputTm() {
    return this.inputTm;
  }

  public void setInputTm(Date inputTm) {
    this.inputTm = inputTm;
  }

  public String getInsiderBrandCd1() {
    return this.insiderBrandCd1;
  }

  public void setInsiderBrandCd1(String insiderBrandCd1) {
    this.insiderBrandCd1 = insiderBrandCd1;
  }

  public String getInsiderBrandCd2() {
    return this.insiderBrandCd2;
  }

  public void setInsiderBrandCd2(String insiderBrandCd2) {
    this.insiderBrandCd2 = insiderBrandCd2;
  }

  public String getInsiderBrandCd3() {
    return this.insiderBrandCd3;
  }

  public void setInsiderBrandCd3(String insiderBrandCd3) {
    this.insiderBrandCd3 = insiderBrandCd3;
  }

  public String getInsiderBrandCd4() {
    return this.insiderBrandCd4;
  }

  public void setInsiderBrandCd4(String insiderBrandCd4) {
    this.insiderBrandCd4 = insiderBrandCd4;
  }

  public String getInsiderBrandCd5() {
    return this.insiderBrandCd5;
  }

  public void setInsiderBrandCd5(String insiderBrandCd5) {
    this.insiderBrandCd5 = insiderBrandCd5;
  }

  public String getInsiderBrandName1() {
    return this.insiderBrandName1;
  }

  public void setInsiderBrandName1(String insiderBrandName1) {
    this.insiderBrandName1 = insiderBrandName1;
  }

  public String getInsiderBrandName2() {
    return this.insiderBrandName2;
  }

  public void setInsiderBrandName2(String insiderBrandName2) {
    this.insiderBrandName2 = insiderBrandName2;
  }

  public String getInsiderBrandName3() {
    return this.insiderBrandName3;
  }

  public void setInsiderBrandName3(String insiderBrandName3) {
    this.insiderBrandName3 = insiderBrandName3;
  }

  public String getInsiderBrandName4() {
    return this.insiderBrandName4;
  }

  public void setInsiderBrandName4(String insiderBrandName4) {
    this.insiderBrandName4 = insiderBrandName4;
  }

  public String getInsiderBrandName5() {
    return this.insiderBrandName5;
  }

  public void setInsiderBrandName5(String insiderBrandName5) {
    this.insiderBrandName5 = insiderBrandName5;
  }

  public byte getInsiderType1() {
    return this.insiderType1;
  }

  public void setInsiderType1(byte insiderType1) {
    this.insiderType1 = insiderType1;
  }

  public byte getInsiderType2() {
    return this.insiderType2;
  }

  public void setInsiderType2(byte insiderType2) {
    this.insiderType2 = insiderType2;
  }

  public byte getInsiderType3() {
    return this.insiderType3;
  }

  public void setInsiderType3(byte insiderType3) {
    this.insiderType3 = insiderType3;
  }

  public byte getInsiderType4() {
    return this.insiderType4;
  }

  public void setInsiderType4(byte insiderType4) {
    this.insiderType4 = insiderType4;
  }

  public byte getInsiderType5() {
    return this.insiderType5;
  }

  public void setInsiderType5(byte insiderType5) {
    this.insiderType5 = insiderType5;
  }

  public String getInte_restInvMsk() {
    return this.inte_restInvMsk;
  }

  public void setInte_restInvMsk(String inte_restInvMsk) {
    this.inte_restInvMsk = inte_restInvMsk;
  }

  public int getInvAmtDetails() {
    return this.invAmtDetails;
  }

  public void setInvAmtDetails(int invAmtDetails) {
    this.invAmtDetails = invAmtDetails;
  }

  public int getInvAmtKbn() {
    return this.invAmtKbn;
  }

  public void setInvAmtKbn(int invAmtKbn) {
    this.invAmtKbn = invAmtKbn;
  }

  public int getInvAssetValue() {
    return this.invAssetValue;
  }

  public void setInvAssetValue(int invAssetValue) {
    this.invAssetValue = invAssetValue;
  }

  public String getInvPurposeDetails() {
    return this.invPurposeDetails;
  }

  public void setInvPurposeDetails(String invPurposeDetails) {
    this.invPurposeDetails = invPurposeDetails;
  }

  public int getInvPurposeKbn() {
    return this.invPurposeKbn;
  }

  public void setInvPurposeKbn(int invPurposeKbn) {
    this.invPurposeKbn = invPurposeKbn;
  }

  public int getInvTermKbn() {
    return this.invTermKbn;
  }

  public void setInvTermKbn(int invTermKbn) {
    this.invTermKbn = invTermKbn;
  }

  public int getInvexCbKbn() {
    return this.invexCbKbn;
  }

  public void setInvexCbKbn(int invexCbKbn) {
    this.invexCbKbn = invexCbKbn;
  }

  public int getInvexDbondKbn() {
    return this.invexDbondKbn;
  }

  public void setInvexDbondKbn(int invexDbondKbn) {
    this.invexDbondKbn = invexDbondKbn;
  }

  public int getInvexDebentureKbn() {
    return this.invexDebentureKbn;
  }

  public void setInvexDebentureKbn(int invexDebentureKbn) {
    this.invexDebentureKbn = invexDebentureKbn;
  }

  public int getInvexFbondKbn() {
    return this.invexFbondKbn;
  }

  public void setInvexFbondKbn(int invexFbondKbn) {
    this.invexFbondKbn = invexFbondKbn;
  }

  public int getInvexFxSecKbn() {
    return this.invexFxSecKbn;
  }

  public void setInvexFxSecKbn(int invexFxSecKbn) {
    this.invexFxSecKbn = invexFxSecKbn;
  }

  public int getInvexInvtrKbn() {
    return this.invexInvtrKbn;
  }

  public void setInvexInvtrKbn(int invexInvtrKbn) {
    this.invexInvtrKbn = invexInvtrKbn;
  }

  public int getInvexMmfmrfKbn() {
    return this.invexMmfmrfKbn;
  }

  public void setInvexMmfmrfKbn(int invexMmfmrfKbn) {
    this.invexMmfmrfKbn = invexMmfmrfKbn;
  }

  public int getInvexOthersKbn() {
    return this.invexOthersKbn;
  }

  public void setInvexOthersKbn(int invexOthersKbn) {
    this.invexOthersKbn = invexOthersKbn;
  }

  public int getIssueAccountWayKbn() {
    return this.issueAccountWayKbn;
  }

  public void setIssueAccountWayKbn(int issueAccountWayKbn) {
    this.issueAccountWayKbn = issueAccountWayKbn;
  }

  public int getJasdecReportTargetFlg() {
    return this.jasdecReportTargetFlg;
  }

  public void setJasdecReportTargetFlg(int jasdecReportTargetFlg) {
    this.jasdecReportTargetFlg = jasdecReportTargetFlg;
  }

  public byte getKojinHojinType() {
    return this.kojinHojinType;
  }

  public void setKojinHojinType(byte kojinHojinType) {
    this.kojinHojinType = kojinHojinType;
  }

  public int getLastCommGroupCd() {
    return this.lastCommGroupCd;
  }

  public void setLastCommGroupCd(int lastCommGroupCd) {
    this.lastCommGroupCd = lastCommGroupCd;
  }

  public int getLastCommGroupInputCnl() {
    return this.lastCommGroupInputCnl;
  }

  public void setLastCommGroupInputCnl(int lastCommGroupInputCnl) {
    this.lastCommGroupInputCnl = lastCommGroupInputCnl;
  }

  public String getLastNmKana() {
    return this.lastNmKana;
  }

  public void setLastNmKana(String lastNmKana) {
    this.lastNmKana = lastNmKana;
  }

  public String getLastNmKanji() {
    return this.lastNmKanji;
  }

  public void setLastNmKanji(String lastNmKanji) {
    this.lastNmKanji = lastNmKanji;
  }

  public Date getLastSecAdvanceNoticeDt() {
    return this.lastSecAdvanceNoticeDt;
  }

  public void setLastSecAdvanceNoticeDt(Date lastSecAdvanceNoticeDt) {
    this.lastSecAdvanceNoticeDt = lastSecAdvanceNoticeDt;
  }

  public int getLastSecApprovalUserCd() {
    return this.lastSecApprovalUserCd;
  }

  public void setLastSecApprovalUserCd(int lastSecApprovalUserCd) {
    this.lastSecApprovalUserCd = lastSecApprovalUserCd;
  }

  public int getLastSecProAmaKbn() {
    return this.lastSecProAmaKbn;
  }

  public void setLastSecProAmaKbn(int lastSecProAmaKbn) {
    this.lastSecProAmaKbn = lastSecProAmaKbn;
  }

  public Date getLastSecReturnAdminDt() {
    return this.lastSecReturnAdminDt;
  }

  public void setLastSecReturnAdminDt(Date lastSecReturnAdminDt) {
    this.lastSecReturnAdminDt = lastSecReturnAdminDt;
  }

  public Date getLastSecReturnAgreeIssueDt() {
    return this.lastSecReturnAgreeIssueDt;
  }

  public void setLastSecReturnAgreeIssueDt(Date lastSecReturnAgreeIssueDt) {
    this.lastSecReturnAgreeIssueDt = lastSecReturnAgreeIssueDt;
  }

  public Date getLastSecReturnDocIssueDt() {
    return this.lastSecReturnDocIssueDt;
  }

  public void setLastSecReturnDocIssueDt(Date lastSecReturnDocIssueDt) {
    this.lastSecReturnDocIssueDt = lastSecReturnDocIssueDt;
  }

  public Date getLastSecShiftAdminDt() {
    return this.lastSecShiftAdminDt;
  }

  public void setLastSecShiftAdminDt(Date lastSecShiftAdminDt) {
    this.lastSecShiftAdminDt = lastSecShiftAdminDt;
  }

  public Date getLastSecShiftAgreeIssueDt() {
    return this.lastSecShiftAgreeIssueDt;
  }

  public void setLastSecShiftAgreeIssueDt(Date lastSecShiftAgreeIssueDt) {
    this.lastSecShiftAgreeIssueDt = lastSecShiftAgreeIssueDt;
  }

  public Date getLastSecShiftDocIssueDt() {
    return this.lastSecShiftDocIssueDt;
  }

  public void setLastSecShiftDocIssueDt(Date lastSecShiftDocIssueDt) {
    this.lastSecShiftDocIssueDt = lastSecShiftDocIssueDt;
  }

  public Date getLastSecUpdAdminDt() {
    return this.lastSecUpdAdminDt;
  }

  public void setLastSecUpdAdminDt(Date lastSecUpdAdminDt) {
    this.lastSecUpdAdminDt = lastSecUpdAdminDt;
  }

  public Date getLeaveCountryDate() {
    return this.leaveCountryDate;
  }

  public void setLeaveCountryDate(Date leaveCountryDate) {
    this.leaveCountryDate = leaveCountryDate;
  }

  public int getLeaveCountryFlg() {
    return this.leaveCountryFlg;
  }

  public void setLeaveCountryFlg(int leaveCountryFlg) {
    this.leaveCountryFlg = leaveCountryFlg;
  }

  public int getLocalTaxKbn() {
    return this.localTaxKbn;
  }

  public void setLocalTaxKbn(int localTaxKbn) {
    this.localTaxKbn = localTaxKbn;
  }

  public String getLockInfo() {
    return this.lockInfo;
  }

  public void setLockInfo(String lockInfo) {
    this.lockInfo = lockInfo;
  }

  public int getLockReasonCd() {
    return this.lockReasonCd;
  }

  public void setLockReasonCd(int lockReasonCd) {
    this.lockReasonCd = lockReasonCd;
  }

  public String getLockReasonDetails() {
    return this.lockReasonDetails;
  }

  public void setLockReasonDetails(String lockReasonDetails) {
    this.lockReasonDetails = lockReasonDetails;
  }

  public Date getLockTm() {
    return this.lockTm;
  }

  public void setLockTm(Date lockTm) {
    this.lockTm = lockTm;
  }

  public int getLockUpdUserCd() {
    return this.lockUpdUserCd;
  }

  public void setLockUpdUserCd(int lockUpdUserCd) {
    this.lockUpdUserCd = lockUpdUserCd;
  }

  public int getLstDptKbn() {
    return this.lstDptKbn;
  }

  public void setLstDptKbn(int lstDptKbn) {
    this.lstDptKbn = lstDptKbn;
  }

  public String getMailAddress() {
    return this.mailAddress;
  }

  public void setMailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
  }

  public int getMailSendConfirmKbn() {
    return this.mailSendConfirmKbn;
  }

  public void setMailSendConfirmKbn(int mailSendConfirmKbn) {
    this.mailSendConfirmKbn = mailSendConfirmKbn;
  }

  public int getMemberKbn() {
    return this.memberKbn;
  }

  public void setMemberKbn(int memberKbn) {
    this.memberKbn = memberKbn;
  }

  public String getMemo() {
    return this.memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public String getMobilePhoneNo1() {
    return this.mobilePhoneNo1;
  }

  public void setMobilePhoneNo1(String mobilePhoneNo1) {
    this.mobilePhoneNo1 = mobilePhoneNo1;
  }

  public int getNationalityKbn() {
    return this.nationalityKbn;
  }

  public void setNationalityKbn(int nationalityKbn) {
    this.nationalityKbn = nationalityKbn;
  }

  public int getNetAssetValue() {
    return this.netAssetValue;
  }

  public void setNetAssetValue(int netAssetValue) {
    this.netAssetValue = netAssetValue;
  }

  public int getNextCommGroupCd() {
    return this.nextCommGroupCd;
  }

  public void setNextCommGroupCd(int nextCommGroupCd) {
    this.nextCommGroupCd = nextCommGroupCd;
  }

  public Date getNextCommGroupDt() {
    return this.nextCommGroupDt;
  }

  public void setNextCommGroupDt(Date nextCommGroupDt) {
    this.nextCommGroupDt = nextCommGroupDt;
  }

  public int getNextCommGroupInputCnl() {
    return this.nextCommGroupInputCnl;
  }

  public void setNextCommGroupInputCnl(int nextCommGroupInputCnl) {
    this.nextCommGroupInputCnl = nextCommGroupInputCnl;
  }

  public Date getNextDividendsAcceptEndDt() {
    return this.nextDividendsAcceptEndDt;
  }

  public void setNextDividendsAcceptEndDt(Date nextDividendsAcceptEndDt) {
    this.nextDividendsAcceptEndDt = nextDividendsAcceptEndDt;
  }

  public int getNextDividendsAcceptKbn() {
    return this.nextDividendsAcceptKbn;
  }

  public void setNextDividendsAcceptKbn(int nextDividendsAcceptKbn) {
    this.nextDividendsAcceptKbn = nextDividendsAcceptKbn;
  }

  public Date getNextDividendsAcceptStartDt() {
    return this.nextDividendsAcceptStartDt;
  }

  public void setNextDividendsAcceptStartDt(Date nextDividendsAcceptStartDt) {
    this.nextDividendsAcceptStartDt = nextDividendsAcceptStartDt;
  }

  public Date getNextDividendsAcceptUpdTm() {
    return this.nextDividendsAcceptUpdTm;
  }

  public void setNextDividendsAcceptUpdTm(Date nextDividendsAcceptUpdTm) {
    this.nextDividendsAcceptUpdTm = nextDividendsAcceptUpdTm;
  }

  public int getNextStkTrfTaxKbn() {
    return this.nextStkTrfTaxKbn;
  }

  public void setNextStkTrfTaxKbn(int nextStkTrfTaxKbn) {
    this.nextStkTrfTaxKbn = nextStkTrfTaxKbn;
  }

  public Date getNextStkTrfTaxKbnUpdTm() {
    return this.nextStkTrfTaxKbnUpdTm;
  }

  public void setNextStkTrfTaxKbnUpdTm(Date nextStkTrfTaxKbnUpdTm) {
    this.nextStkTrfTaxKbnUpdTm = nextStkTrfTaxKbnUpdTm;
  }

  public int getNmChgNoticeMakeFlg() {
    return this.nmChgNoticeMakeFlg;
  }

  public void setNmChgNoticeMakeFlg(int nmChgNoticeMakeFlg) {
    this.nmChgNoticeMakeFlg = nmChgNoticeMakeFlg;
  }

  public Date getNmUpdDt() {
    return this.nmUpdDt;
  }

  public void setNmUpdDt(Date nmUpdDt) {
    this.nmUpdDt = nmUpdDt;
  }

  public int getNonResidentFlg() {
    return this.nonResidentFlg;
  }

  public void setNonResidentFlg(int nonResidentFlg) {
    this.nonResidentFlg = nonResidentFlg;
  }

  public int getNonresidsentInstitutionKbn() {
    return this.nonresidsentInstitutionKbn;
  }

  public void setNonresidsentInstitutionKbn(int nonresidsentInstitutionKbn) {
    this.nonresidsentInstitutionKbn = nonresidsentInstitutionKbn;
  }

  public String getOccupationDetails() {
    return this.occupationDetails;
  }

  public void setOccupationDetails(String occupationDetails) {
    this.occupationDetails = occupationDetails;
  }

  public byte getOccupationType() {
    return this.occupationType;
  }

  public void setOccupationType(byte occupationType) {
    this.occupationType = occupationType;
  }

  public String getOfficeAddress1() {
    return this.officeAddress1;
  }

  public void setOfficeAddress1(String officeAddress1) {
    this.officeAddress1 = officeAddress1;
  }

  public String getOfficeAddress2() {
    return this.officeAddress2;
  }

  public void setOfficeAddress2(String officeAddress2) {
    this.officeAddress2 = officeAddress2;
  }

  public String getOfficeAddress3() {
    return this.officeAddress3;
  }

  public void setOfficeAddress3(String officeAddress3) {
    this.officeAddress3 = officeAddress3;
  }

  public String getOfficeAddress4() {
    return this.officeAddress4;
  }

  public void setOfficeAddress4(String officeAddress4) {
    this.officeAddress4 = officeAddress4;
  }

  public String getOfficeDepartment() {
    return this.officeDepartment;
  }

  public void setOfficeDepartment(String officeDepartment) {
    this.officeDepartment = officeDepartment;
  }

  public String getOfficeNm() {
    return this.officeNm;
  }

  public void setOfficeNm(String officeNm) {
    this.officeNm = officeNm;
  }

  public String getOfficePhoneNo() {
    return this.officePhoneNo;
  }

  public void setOfficePhoneNo(String officePhoneNo) {
    this.officePhoneNo = officePhoneNo;
  }

  public String getOfficePost() {
    return this.officePost;
  }

  public void setOfficePost(String officePost) {
    this.officePost = officePost;
  }

  public String getOfficeWorksDetails() {
    return this.officeWorksDetails;
  }

  public void setOfficeWorksDetails(String officeWorksDetails) {
    this.officeWorksDetails = officeWorksDetails;
  }

  public String getOfficeZipNo1() {
    return this.officeZipNo1;
  }

  public void setOfficeZipNo1(String officeZipNo1) {
    this.officeZipNo1 = officeZipNo1;
  }

  public String getOfficeZipNo2() {
    return this.officeZipNo2;
  }

  public void setOfficeZipNo2(String officeZipNo2) {
    this.officeZipNo2 = officeZipNo2;
  }

  public Date getOpenDate() {
    return this.openDate;
  }

  public void setOpenDate(Date openDate) {
    this.openDate = openDate;
  }

  public String getParentRemarks() {
    return this.parentRemarks;
  }

  public void setParentRemarks(String parentRemarks) {
    this.parentRemarks = parentRemarks;
  }

  public int getParentsAgreeFlg() {
    return this.parentsAgreeFlg;
  }

  public void setParentsAgreeFlg(int parentsAgreeFlg) {
    this.parentsAgreeFlg = parentsAgreeFlg;
  }

  public Date getParentsBirthDt() {
    return this.parentsBirthDt;
  }

  public void setParentsBirthDt(Date parentsBirthDt) {
    this.parentsBirthDt = parentsBirthDt;
  }

  public int getParentsBranchCd() {
    return this.parentsBranchCd;
  }

  public void setParentsBranchCd(int parentsBranchCd) {
    this.parentsBranchCd = parentsBranchCd;
  }

  public int getParentsClientCd() {
    return this.parentsClientCd;
  }

  public void setParentsClientCd(int parentsClientCd) {
    this.parentsClientCd = parentsClientCd;
  }

  public String getParentsNm() {
    return this.parentsNm;
  }

  public void setParentsNm(String parentsNm) {
    this.parentsNm = parentsNm;
  }

  public String getPhoneNo1() {
    return this.phoneNo1;
  }

  public void setPhoneNo1(String phoneNo1) {
    this.phoneNo1 = phoneNo1;
  }

  public Date getPrevDividendsAcceptEndDt() {
    return this.prevDividendsAcceptEndDt;
  }

  public void setPrevDividendsAcceptEndDt(Date prevDividendsAcceptEndDt) {
    this.prevDividendsAcceptEndDt = prevDividendsAcceptEndDt;
  }

  public int getPrevDividendsAcceptKbn() {
    return this.prevDividendsAcceptKbn;
  }

  public void setPrevDividendsAcceptKbn(int prevDividendsAcceptKbn) {
    this.prevDividendsAcceptKbn = prevDividendsAcceptKbn;
  }

  public Date getPrevDividendsAcceptStartDt() {
    return this.prevDividendsAcceptStartDt;
  }

  public void setPrevDividendsAcceptStartDt(Date prevDividendsAcceptStartDt) {
    this.prevDividendsAcceptStartDt = prevDividendsAcceptStartDt;
  }

  public int getPrevStkTrfTaxKbn() {
    return this.prevStkTrfTaxKbn;
  }

  public void setPrevStkTrfTaxKbn(int prevStkTrfTaxKbn) {
    this.prevStkTrfTaxKbn = prevStkTrfTaxKbn;
  }

  public byte getPurposeType() {
    return this.purposeType;
  }

  public void setPurposeType(byte purposeType) {
    this.purposeType = purposeType;
  }

  public int getQualifiedInstInvestorKbn() {
    return this.qualifiedInstInvestorKbn;
  }

  public void setQualifiedInstInvestorKbn(int qualifiedInstInvestorKbn) {
    this.qualifiedInstInvestorKbn = qualifiedInstInvestorKbn;
  }

  public int getReceiptDocKbn() {
    return this.receiptDocKbn;
  }

  public void setReceiptDocKbn(int receiptDocKbn) {
    this.receiptDocKbn = receiptDocKbn;
  }

  public String getResidentCountryCd() {
    return this.residentCountryCd;
  }

  public void setResidentCountryCd(String residentCountryCd) {
    this.residentCountryCd = residentCountryCd;
  }

  public int getSalesBranchCd() {
    return this.salesBranchCd;
  }

  public void setSalesBranchCd(int salesBranchCd) {
    this.salesBranchCd = salesBranchCd;
  }

  public int getSalesClientCd() {
    return this.salesClientCd;
  }

  public void setSalesClientCd(int salesClientCd) {
    this.salesClientCd = salesClientCd;
  }

  public int getSealChgNoticeMakeFlg() {
    return this.sealChgNoticeMakeFlg;
  }

  public void setSealChgNoticeMakeFlg(int sealChgNoticeMakeFlg) {
    this.sealChgNoticeMakeFlg = sealChgNoticeMakeFlg;
  }

  public Date getSecAdvanceNoticeDt() {
    return this.secAdvanceNoticeDt;
  }

  public void setSecAdvanceNoticeDt(Date secAdvanceNoticeDt) {
    this.secAdvanceNoticeDt = secAdvanceNoticeDt;
  }

  public int getSecProAmaKbn() {
    return this.secProAmaKbn;
  }

  public void setSecProAmaKbn(int secProAmaKbn) {
    this.secProAmaKbn = secProAmaKbn;
  }

  public Date getSecProAmaUpdDt() {
    return this.secProAmaUpdDt;
  }

  public void setSecProAmaUpdDt(Date secProAmaUpdDt) {
    this.secProAmaUpdDt = secProAmaUpdDt;
  }

  public String getSendAddress1() {
    return this.sendAddress1;
  }

  public void setSendAddress1(String sendAddress1) {
    this.sendAddress1 = sendAddress1;
  }

  public String getSendAddress2() {
    return this.sendAddress2;
  }

  public void setSendAddress2(String sendAddress2) {
    this.sendAddress2 = sendAddress2;
  }

  public String getSendAddress3() {
    return this.sendAddress3;
  }

  public void setSendAddress3(String sendAddress3) {
    this.sendAddress3 = sendAddress3;
  }

  public String getSendAddress4() {
    return this.sendAddress4;
  }

  public void setSendAddress4(String sendAddress4) {
    this.sendAddress4 = sendAddress4;
  }

  public String getSendDepartNm() {
    return this.sendDepartNm;
  }

  public void setSendDepartNm(String sendDepartNm) {
    this.sendDepartNm = sendDepartNm;
  }

  public int getSendKbn() {
    return this.sendKbn;
  }

  public void setSendKbn(int sendKbn) {
    this.sendKbn = sendKbn;
  }

  public String getSendNm() {
    return this.sendNm;
  }

  public void setSendNm(String sendNm) {
    this.sendNm = sendNm;
  }

  public String getSendNmKana() {
    return this.sendNmKana;
  }

  public void setSendNmKana(String sendNmKana) {
    this.sendNmKana = sendNmKana;
  }

  public String getSendOfficeNm() {
    return this.sendOfficeNm;
  }

  public void setSendOfficeNm(String sendOfficeNm) {
    this.sendOfficeNm = sendOfficeNm;
  }

  public String getSendPhoneNo1() {
    return this.sendPhoneNo1;
  }

  public void setSendPhoneNo1(String sendPhoneNo1) {
    this.sendPhoneNo1 = sendPhoneNo1;
  }

  public String getSendPost() {
    return this.sendPost;
  }

  public void setSendPost(String sendPost) {
    this.sendPost = sendPost;
  }

  public String getSendZipNo1() {
    return this.sendZipNo1;
  }

  public void setSendZipNo1(String sendZipNo1) {
    this.sendZipNo1 = sendZipNo1;
  }

  public String getSendZipNo2() {
    return this.sendZipNo2;
  }

  public void setSendZipNo2(String sendZipNo2) {
    this.sendZipNo2 = sendZipNo2;
  }

  public String getShoukaiCd() {
    return this.shoukaiCd;
  }

  public void setShoukaiCd(String shoukaiCd) {
    this.shoukaiCd = shoukaiCd;
  }

  public Date getSpAccOpenApplyTm() {
    return this.spAccOpenApplyTm;
  }

  public void setSpAccOpenApplyTm(Date spAccOpenApplyTm) {
    this.spAccOpenApplyTm = spAccOpenApplyTm;
  }

  public String getStaffCd() {
    return this.staffCd;
  }

  public void setStaffCd(String staffCd) {
    this.staffCd = staffCd;
  }

  public int getStaffKbn() {
    return this.staffKbn;
  }

  public void setStaffKbn(int staffKbn) {
    this.staffKbn = staffKbn;
  }

  public Date getStampUpdDt() {
    return this.stampUpdDt;
  }

  public void setStampUpdDt(Date stampUpdDt) {
    this.stampUpdDt = stampUpdDt;
  }

  public int getStandingAgentFlg() {
    return this.standingAgentFlg;
  }

  public void setStandingAgentFlg(int standingAgentFlg) {
    this.standingAgentFlg = standingAgentFlg;
  }

  public Date getStkSpAccDelDt() {
    return this.stkSpAccDelDt;
  }

  public void setStkSpAccDelDt(Date stkSpAccDelDt) {
    this.stkSpAccDelDt = stkSpAccDelDt;
  }

  public Date getStkSpAccOpenDt() {
    return this.stkSpAccOpenDt;
  }

  public void setStkSpAccOpenDt(Date stkSpAccOpenDt) {
    this.stkSpAccOpenDt = stkSpAccOpenDt;
  }

  public int getStkSpAccOpenFlg() {
    return this.stkSpAccOpenFlg;
  }

  public void setStkSpAccOpenFlg(int stkSpAccOpenFlg) {
    this.stkSpAccOpenFlg = stkSpAccOpenFlg;
  }

  public int getStkSpAccSts() {
    return this.stkSpAccSts;
  }

  public void setStkSpAccSts(int stkSpAccSts) {
    this.stkSpAccSts = stkSpAccSts;
  }

  public Date getStkSpAccStsUpdTm() {
    return this.stkSpAccStsUpdTm;
  }

  public void setStkSpAccStsUpdTm(Date stkSpAccStsUpdTm) {
    this.stkSpAccStsUpdTm = stkSpAccStsUpdTm;
  }

  public int getStkTrfTaxKbn() {
    return this.stkTrfTaxKbn;
  }

  public void setStkTrfTaxKbn(int stkTrfTaxKbn) {
    this.stkTrfTaxKbn = stkTrfTaxKbn;
  }

  public Date getStkTrfTaxKbnUpdTm() {
    return this.stkTrfTaxKbnUpdTm;
  }

  public void setStkTrfTaxKbnUpdTm(Date stkTrfTaxKbnUpdTm) {
    this.stkTrfTaxKbnUpdTm = stkTrfTaxKbnUpdTm;
  }

  public Date getTaxExceptionApplyDt() {
    return this.taxExceptionApplyDt;
  }

  public void setTaxExceptionApplyDt(Date taxExceptionApplyDt) {
    this.taxExceptionApplyDt = taxExceptionApplyDt;
  }

  public Date getTaxExceptionExpirarionDt() {
    return this.taxExceptionExpirarionDt;
  }

  public void setTaxExceptionExpirarionDt(Date taxExceptionExpirarionDt) {
    this.taxExceptionExpirarionDt = taxExceptionExpirarionDt;
  }

  public int getTradeRuleConfirmKbn() {
    return this.tradeRuleConfirmKbn;
  }

  public void setTradeRuleConfirmKbn(int tradeRuleConfirmKbn) {
    this.tradeRuleConfirmKbn = tradeRuleConfirmKbn;
  }

  public int getUnderAgeKbn() {
    return this.underAgeKbn;
  }

  public void setUnderAgeKbn(int underAgeKbn) {
    this.underAgeKbn = underAgeKbn;
  }

  public Date getUnknownAddressDt() {
    return this.unknownAddressDt;
  }

  public void setUnknownAddressDt(Date unknownAddressDt) {
    this.unknownAddressDt = unknownAddressDt;
  }

  public int getUnknownAddressFlg() {
    return this.unknownAddressFlg;
  }

  public void setUnknownAddressFlg(int unknownAddressFlg) {
    this.unknownAddressFlg = unknownAddressFlg;
  }

  public int getUpdateBranchCd() {
    return this.updateBranchCd;
  }

  public void setUpdateBranchCd(int updateBranchCd) {
    this.updateBranchCd = updateBranchCd;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }

  public int getUpdateUserCd() {
    return this.updateUserCd;
  }

  public void setUpdateUserCd(int updateUserCd) {
    this.updateUserCd = updateUserCd;
  }

  public int getUsTax() {
    return this.usTax;
  }

  public void setUsTax(int usTax) {
    this.usTax = usTax;
  }

  public int getUsingOtherItKbn() {
    return this.usingOtherItKbn;
  }

  public void setUsingOtherItKbn(int usingOtherItKbn) {
    this.usingOtherItKbn = usingOtherItKbn;
  }

  public String getWalletAdr() {
    return this.walletAdr;
  }

  public void setWalletAdr(String walletAdr) {
    this.walletAdr = walletAdr;
  }

  public int getYenSettlDivTransInstFlg() {
    return this.yenSettlDivTransInstFlg;
  }

  public void setYenSettlDivTransInstFlg(int yenSettlDivTransInstFlg) {
    this.yenSettlDivTransInstFlg = yenSettlDivTransInstFlg;
  }

  public String getZipNo1() {
    return this.zipNo1;
  }

  public void setZipNo1(String zipNo1) {
    this.zipNo1 = zipNo1;
  }

  public String getZipNo2() {
    return this.zipNo2;
  }

  public void setZipNo2(String zipNo2) {
    this.zipNo2 = zipNo2;
  }
}
