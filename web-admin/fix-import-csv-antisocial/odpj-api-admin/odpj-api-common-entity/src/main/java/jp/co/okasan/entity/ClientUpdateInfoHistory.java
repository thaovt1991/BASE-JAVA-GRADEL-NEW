package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The persistent class for the CLIENT_UPDATE_INFO_HISTORY database table. */
@Entity
@Table(name = "CLIENT_UPDATE_INFO_HISTORY")
@NamedQuery(
    name = "ClientUpdateInfoHistory.findAll",
    query = "SELECT c FROM ClientUpdateInfoHistory c")
public class ClientUpdateInfoHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "ACC_OPEN_REASON_DETAILS")
  private String accOpenReasonDetails;

  @Column(name = "ACC_OPEN_REASON_KBN")
  private int accOpenReasonKbn;

  @Column(name = "ACC_OPEN_REASON_MSK")
  private String accOpenReasonMsk;

  @Column(name = "ASSETS_KBN")
  private int assetsKbn;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CLIENT_HISTORY_NO")
  private int clientHistoryNo;

  @Column(name = "CLIENT_NM")
  private String clientNm;

  @Column(name = "CLIENT_NM_KANA")
  private String clientNmKana;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  @Column(name = "DEAL_TYPE_MSK")
  private String dealTypeMsk;

  @Column(name = "FAX_NO_1")
  private String faxNo1;

  @Column(name = "FOREIGN_DIGNITARIES")
  private int foreignDignitaries;

  @Column(name = "HOW_TO_KNOW_THIS_SITE_DETAILS")
  private String howToKnowThisSiteDetails;

  @Column(name = "HOW_TO_KNOW_THIS_SITE_KBN")
  private int howToKnowThisSiteKbn;

  @Column(name = "HSEHOLD_RELATION_KBN")
  private int hseholdRelationKbn;

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

  @Column(name = "INSIDER_FLG")
  private byte insiderFlg;

  @Column(name = "`INSIDER_T YPE4`")
  private byte insiderT_ype4;

  @Column(name = "INSIDER_TYPE1")
  private byte insiderType1;

  @Column(name = "INSIDER_TYPE2")
  private byte insiderType2;

  @Column(name = "INSIDER_TYPE3")
  private byte insiderType3;

  @Column(name = "INSIDER_TYPE5")
  private byte insiderType5;

  @Column(name = "INTEREST_INV_MSK")
  private String interestInvMsk;

  @Column(name = "INV_AMT_DETAILS")
  private int invAmtDetails;

  @Column(name = "INV_AMT_KBN")
  private int invAmtKbn;

  @Column(name = "INV_PURPOSE_DETAILS")
  private String invPurposeDetails;

  @Column(name = "INV_PURPOSE_KBN")
  private int invPurposeKbn;

  @Column(name = "INV_TERM_KBN")
  private int invTermKbn;

  @Column(name = "MOBILE_PHONE_NO_1")
  private String mobilePhoneNo1;

  @Column(name = "NATIONALTY")
  private byte nationalty;

  @Column(name = "OCCUPATION_TYPE")
  private byte occupationType;

  @Column(name = "`OFFICE_AD DRESS_4`")
  private String officeAd_dress4;

  @Column(name = "OFFICE_ADDRESS_1")
  private String officeAddress1;

  @Column(name = "OFFICE_ADDRESS_2")
  private String officeAddress2;

  @Column(name = "OFFICE_ADDRESS_3")
  private String officeAddress3;

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

  @Column(name = "PHONE_NO_1")
  private String phoneNo1;

  @Column(name = "PURPOSE_TYPE")
  private byte purposeType;

  @Column(name = "RESIDENT_COUNTRY_CD")
  private String residentCountryCd;

  @Column(name = "SALES_BRANCH_CD")
  private int salesBranchCd;

  @Column(name = "SALES_CLIENT_CD")
  private int salesClientCd;

  @Column(name = "SEND_ADDRESS_1")
  private String sendAddress1;

  @Column(name = "SEND_ADDRESS_2")
  private String sendAddress2;

  @Column(name = "SEND_ADDRESS_3")
  private String sendAddress3;

  @Column(name = "SEND_ADDRESS_4")
  private String sendAddress4;

  @Column(name = "SEND_DEPART_NM")
  private String sendDepartNm;

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

  @Column(name = "STK_TRF_TAX_KBN")
  private int stkTrfTaxKbn;

  @Column(name = "TEMP_SEND_USE_KBN")
  private int tempSendUseKbn;

  @Column(name = "UPD_ADDRESS_1")
  private String updAddress1;

  @Column(name = "UPD_ADDRESS_2")
  private String updAddress2;

  @Column(name = "UPD_ADDRESS_3")
  private String updAddress3;

  @Column(name = "UPD_ADDRESS_4")
  private String updAddress4;

  @Column(name = "UPD_ADDRESS_KANA_1")
  private String updAddressKana1;

  @Column(name = "UPD_ADDRESS_KANA_2")
  private String updAddressKana2;

  @Column(name = "UPD_ADDRESS_KANA_3")
  private String updAddressKana3;

  @Column(name = "UPD_ADDRESS_KANA_4")
  private String updAddressKana4;

  @Column(name = "UPD_ZIP_NO_1")
  private String updZipNo1;

  @Column(name = "UPD_ZIP_NO_2")
  private String updZipNo2;

  @Column(name = "US_TAX")
  private int usTax;

  public ClientUpdateInfoHistory() {}

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

  public int getAssetsKbn() {
    return this.assetsKbn;
  }

  public void setAssetsKbn(int assetsKbn) {
    this.assetsKbn = assetsKbn;
  }

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
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

  public String getFaxNo1() {
    return this.faxNo1;
  }

  public void setFaxNo1(String faxNo1) {
    this.faxNo1 = faxNo1;
  }

  public int getForeignDignitaries() {
    return this.foreignDignitaries;
  }

  public void setForeignDignitaries(int foreignDignitaries) {
    this.foreignDignitaries = foreignDignitaries;
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

  public int getHseholdRelationKbn() {
    return this.hseholdRelationKbn;
  }

  public void setHseholdRelationKbn(int hseholdRelationKbn) {
    this.hseholdRelationKbn = hseholdRelationKbn;
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

  public byte getInsiderFlg() {
    return this.insiderFlg;
  }

  public void setInsiderFlg(byte insiderFlg) {
    this.insiderFlg = insiderFlg;
  }

  public byte getInsiderT_ype4() {
    return this.insiderT_ype4;
  }

  public void setInsiderT_ype4(byte insiderT_ype4) {
    this.insiderT_ype4 = insiderT_ype4;
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

  public byte getInsiderType5() {
    return this.insiderType5;
  }

  public void setInsiderType5(byte insiderType5) {
    this.insiderType5 = insiderType5;
  }

  public String getInterestInvMsk() {
    return this.interestInvMsk;
  }

  public void setInterestInvMsk(String interestInvMsk) {
    this.interestInvMsk = interestInvMsk;
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

  public String getMobilePhoneNo1() {
    return this.mobilePhoneNo1;
  }

  public void setMobilePhoneNo1(String mobilePhoneNo1) {
    this.mobilePhoneNo1 = mobilePhoneNo1;
  }

  public byte getNationalty() {
    return this.nationalty;
  }

  public void setNationalty(byte nationalty) {
    this.nationalty = nationalty;
  }

  public byte getOccupationType() {
    return this.occupationType;
  }

  public void setOccupationType(byte occupationType) {
    this.occupationType = occupationType;
  }

  public String getOfficeAd_dress4() {
    return this.officeAd_dress4;
  }

  public void setOfficeAd_dress4(String officeAd_dress4) {
    this.officeAd_dress4 = officeAd_dress4;
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

  public String getPhoneNo1() {
    return this.phoneNo1;
  }

  public void setPhoneNo1(String phoneNo1) {
    this.phoneNo1 = phoneNo1;
  }

  public byte getPurposeType() {
    return this.purposeType;
  }

  public void setPurposeType(byte purposeType) {
    this.purposeType = purposeType;
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

  public int getStkTrfTaxKbn() {
    return this.stkTrfTaxKbn;
  }

  public void setStkTrfTaxKbn(int stkTrfTaxKbn) {
    this.stkTrfTaxKbn = stkTrfTaxKbn;
  }

  public int getTempSendUseKbn() {
    return this.tempSendUseKbn;
  }

  public void setTempSendUseKbn(int tempSendUseKbn) {
    this.tempSendUseKbn = tempSendUseKbn;
  }

  public String getUpdAddress1() {
    return this.updAddress1;
  }

  public void setUpdAddress1(String updAddress1) {
    this.updAddress1 = updAddress1;
  }

  public String getUpdAddress2() {
    return this.updAddress2;
  }

  public void setUpdAddress2(String updAddress2) {
    this.updAddress2 = updAddress2;
  }

  public String getUpdAddress3() {
    return this.updAddress3;
  }

  public void setUpdAddress3(String updAddress3) {
    this.updAddress3 = updAddress3;
  }

  public String getUpdAddress4() {
    return this.updAddress4;
  }

  public void setUpdAddress4(String updAddress4) {
    this.updAddress4 = updAddress4;
  }

  public String getUpdAddressKana1() {
    return this.updAddressKana1;
  }

  public void setUpdAddressKana1(String updAddressKana1) {
    this.updAddressKana1 = updAddressKana1;
  }

  public String getUpdAddressKana2() {
    return this.updAddressKana2;
  }

  public void setUpdAddressKana2(String updAddressKana2) {
    this.updAddressKana2 = updAddressKana2;
  }

  public String getUpdAddressKana3() {
    return this.updAddressKana3;
  }

  public void setUpdAddressKana3(String updAddressKana3) {
    this.updAddressKana3 = updAddressKana3;
  }

  public String getUpdAddressKana4() {
    return this.updAddressKana4;
  }

  public void setUpdAddressKana4(String updAddressKana4) {
    this.updAddressKana4 = updAddressKana4;
  }

  public String getUpdZipNo1() {
    return this.updZipNo1;
  }

  public void setUpdZipNo1(String updZipNo1) {
    this.updZipNo1 = updZipNo1;
  }

  public String getUpdZipNo2() {
    return this.updZipNo2;
  }

  public void setUpdZipNo2(String updZipNo2) {
    this.updZipNo2 = updZipNo2;
  }

  public int getUsTax() {
    return this.usTax;
  }

  public void setUsTax(int usTax) {
    this.usTax = usTax;
  }
}
