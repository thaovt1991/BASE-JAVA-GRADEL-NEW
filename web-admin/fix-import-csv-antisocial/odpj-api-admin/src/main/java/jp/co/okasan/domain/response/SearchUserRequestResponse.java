package jp.co.okasan.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class SearchUserRequestResponse {
    @JsonProperty("company_cd")
    private String companyCd;

    @JsonProperty("entry_no")
    private String entryNo;

    @JsonProperty("branch_cd")
    private String branchCd;

    @JsonProperty("account_opening_status")
    private String accountOpeningStatus;

    @JsonProperty("collecting_status")
    private String collectingStatus;

    @JsonProperty("collecting_result_flg")
    private String collectingResultFlg;

    @JsonProperty("antisocial_checked_status")
    private String antisocialCheckedStatus;

    @JsonProperty("antisocial_checked_flg_in")
    private String antisocialCheckedFlgIn;

    @JsonProperty("antisocial_checked_flg_out")
    private String antisocialCheckedFlgOut;

    @JsonProperty("mynumber_status")
    private String mynumberStatus;

    @JsonProperty("payment_account_bank_status")
    private String paymentAccountBankStatus;

    @JsonProperty("ekyc_checked_status")
    private String ekycCheckedStatus;

    @JsonProperty("ekyc_checked_flg")
    private String ekycCheckedFlg;

    @JsonProperty("ekyc_id")
    private String ekycId;

    @JsonProperty("account_open_d")
    private Date accountOpenDate;

    @JsonProperty("account_open_user")
    private String accountOpenUser;

    @JsonProperty("client_no")
    private String clientNo;

    @JsonProperty("name_mei")
    private String nameMmei;

    @JsonProperty("name_sei")
    private String nameSei;

    @JsonProperty("kana_name_mei")
    private String kanaNameMei;

    @JsonProperty("kana_name_sei")
    private String kanaNameSei;

    @JsonProperty("address_postal_cd")
    private String addressPostalCd;

    @JsonProperty("address_prefectures")
    private String addressPrefectures;

    @JsonProperty("address_municipalities")
    private String addressMunicipalities;

    @JsonProperty("address_number")
    private String addressNumber;

    @JsonProperty("address_building")
    private String addressBuilding;

    @JsonProperty("home_phone")
    private String homePhone;

    @JsonProperty("mobile_number")
    private String mobileNumber;

    @JsonProperty("birth_day")
    private Date birthDay;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("citizenship_cd")
    private String citizenshipCd;

    @JsonProperty("citizenship")
    private String citizenship;

    @JsonProperty("country_of_residence")
    private String countryOfResidence;

    @JsonProperty("foreign_peps_flg")
    private String foreignPepsFlg;

    @JsonProperty("sales_office_account_flg")
    private String salesOfficeAccountFlg;

    @JsonProperty("consent_flg")
    private String consentFlg;

    @JsonProperty("profession_selection1")
    private String professionSelection1;

    @JsonProperty("others_profession1")
    private String othersProfession1;

    @JsonProperty("employment1")
    private String employment1;

    @JsonProperty("department1")
    private String department1;

    @JsonProperty("position1")
    private String position1;

    @JsonProperty("employer_postal_no")
    private String employerPostalNo;

    @JsonProperty("employer_prefecture")
    private String employerPrefecture;

    @JsonProperty("employer_city")
    private String employerCity;

    @JsonProperty("employer_last_addr1")
    private String employerLastAddr1;

    @JsonProperty("employer_last_addr2")
    private String employerLastAddr2;

    @JsonProperty("employer_phone")
    private String employerPhone;

    @JsonProperty("householder_relationship")
    private String householderRelationship;

    @JsonProperty("householder_name_sei")
    private String householderNameSei;

    @JsonProperty("householder_name_mei")
    private String householderNameMei;

    @JsonProperty("profession_selection2")
    private String professionSelection2;

    @JsonProperty("fatca")
    private String fatca;

    @JsonProperty("others_profession2")
    private String othersProfession2;

    @JsonProperty("employment2")
    private String employment2;

    @JsonProperty("department2")
    private String department2;

    @JsonProperty("position2")
    private String position2;

    @JsonProperty("insider_flg")
    private String insiderFlg;

    @JsonProperty("insider_brand1")
    private String insiderBrand1;

    @JsonProperty("insider_type1")
    private String insiderType1;

    @JsonProperty("insider_brand2")
    private String insiderBrand2;

    @JsonProperty("insider_type2")
    private String insiderType2;

    @JsonProperty("insider_brand3")
    private String insiderBrand3;

    @JsonProperty("insider_type3")
    private String insiderType3;

    @JsonProperty("insider_brand4")
    private String insiderBrand4;

    @JsonProperty("insider_type4")
    private String insiderType4;

    @JsonProperty("insider_brand5")
    private String insiderBrand5;

    @JsonProperty("insider_type5")
    private String insiderType5;

    @JsonProperty("policy_type")
    private String policyType;

    @JsonProperty("asset_disposition")
    private String assetDisposition;

    @JsonProperty("revenue_type")
    private String revenueType;

    @JsonProperty("period_type")
    private String periodType;

    @JsonProperty("annual_income_cd")
    private String annualIncomeCd;

    @JsonProperty("financial_asset_cd")
    private String financialAssetCd;

    @JsonProperty("motive_type")
    private String motiveType;

    @JsonProperty("initially_type")
    private String initiallyType;

    @JsonProperty("experience_stock_type")
    private String experienceStockType;

    @JsonProperty("experience_accumulative_investment_type")
    private String experienceAccumulativeInvestmentType;

    @JsonProperty("experience_investment_trust_type")
    private String experienceInvestmentTrustType;

    @JsonProperty("experience_futures_option_type")
    private String experienceFuturesOptionType;

    @JsonProperty("experience_futures_type")
    private String experienceFuturesType;

    @JsonProperty("experience_cfd_type")
    private String experienceCfdType;

    @JsonProperty("experience_margin_type")
    private String experienceMarginType;

    @JsonProperty("experience_public_corporate_type")
    private String experiencePublicCorporateType;

    @JsonProperty("experience_cb_type")
    private String experienceCbType;

    @JsonProperty("experience_foreign_securities_type")
    private String experienceForeignSecuritiesType;

    @JsonProperty("experience_fx_type")
    private String experienceFxType;

    @JsonProperty("entry_email")
    private String entryEmail;
}
