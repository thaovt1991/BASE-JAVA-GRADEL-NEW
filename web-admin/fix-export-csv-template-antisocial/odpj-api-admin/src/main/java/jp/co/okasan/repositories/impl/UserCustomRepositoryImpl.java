package jp.co.okasan.repositories.impl;

import jp.co.okasan.domain.request.SearchUserRequest;
import jp.co.okasan.domain.response.SearchUserRequestResponse;
import jp.co.okasan.repositories.UserCustomRepository;
import jp.co.okasan.utils.DateFormatUtil;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<SearchUserRequestResponse> searchUserReqInfos(SearchUserRequest userRequestDate, String fromDate, String toDate, Integer pageIndex, Integer pageSize) throws ParseException {
        StringBuilder sql = new StringBuilder();

        sql.append(" SELECT M_USER_REQUEST.COMPANY_CD,");
        sql.append("       M_USER_REQUEST.ENTRY_NO,");
        sql.append("       M_USER_REQUEST.BRANCH_CD,");
        sql.append("       ACCOUNT_OPENING_STATUS,");
        sql.append("       COLLECTING_STATUS,");
        sql.append("       COLLECTING_RESULT_FLG,");
        sql.append("       ANTISOCIAL_CHECKED_STATUS,");
        sql.append("       ANTISOCIAL_CHECKED_FLG_IN,");
        sql.append("       ANTISOCIAL_CHECKED_FLG_OUT,");
        sql.append("       MYNUMBER_STATUS,");
        sql.append("       PAYMENT_ACCOUNT_BANK_STATUS,");
        sql.append("       EKYC_CHECKED_STATUS,");
        sql.append("       EKYC_CHECKED_FLG,");
        sql.append("       EKYC_ID,");
        sql.append("       ACCOUNT_OPEN_D,");
        sql.append("       ACCOUNT_OPEN_USER,");
        sql.append("       CLIENT_NO,");
        sql.append("       NAME_SEI,");
        sql.append("       NAME_MEI,");
        sql.append("       KANA_NAME_SEI,");
        sql.append("       KANA_NAME_MEI,");
        sql.append("       ADDRESS_POSTAL_CD,");
        sql.append("       ADDRESS_PREFECTURES,");
        sql.append("       ADDRESS_MUNICIPALITIES,");
        sql.append("       ADDRESS_NUMBER,");
        sql.append("       ADDRESS_BUILDING,");
        sql.append("       HOME_PHONE,");
        sql.append("       MOBILE_NUMBER,");
        sql.append("       BIRTH_YEAR,");
        sql.append("       BIRTH_MONTH,");
        sql.append("       BIRTH_DATE,");
        sql.append("       GENDER,");
        sql.append("       CITIZENSHIP_CD,");
        sql.append("       CITIZENSHIP,");
        sql.append("       COUNTRY_OF_RESIDENCE,");
        sql.append("       FOREIGN_PEPS_FLG,");
        sql.append("       SALES_OFFICE_ACCOUNT_FLG,");
        sql.append("       CONSENT_FLG,");
        sql.append("       PROFESSION_SELECTION1,");
        sql.append("       OTHERS_PROFESSION1,");
        sql.append("       EMPLOYMENT1,");
        sql.append("       DEPARTMENT1,");
        sql.append("       POSITION1,");
        sql.append("       EMPLOYER_POSTAL_NO,");
        sql.append("       EMPLOYER_PREFECTURE,");
        sql.append("       EMPLOYER_CITY,");
        sql.append("       EMPLOYER_LAST_ADDR1,");
        sql.append("       EMPLOYER_LAST_ADDR2,");
        sql.append("       EMPLOYER_PHONE,");
        sql.append("       HOUSEHOLDER_RELATIONSHIP,");
        sql.append("       HOUSEHOLDER_NAME_SEI,");
        sql.append("       HOUSEHOLDER_NAME_MEI,");
        sql.append("       PROFESSION_SELECTION2,");
        sql.append("       FATCA,");
        sql.append("       OTHERS_PROFESSION2,");
        sql.append("       EMPLOYMENT2,");
        sql.append("       DEPARTMENT2,");
        sql.append("       POSITION2,");
        sql.append("       INSIDER_FLG,");
        sql.append("       INSIDER_BRAND1,");
        sql.append("       INSIDER_TYPE1,");
        sql.append("       INSIDER_BRAND2,");
        sql.append("       INSIDER_TYPE2,");
        sql.append("       INSIDER_BRAND3,");
        sql.append("       INSIDER_TYPE3,");
        sql.append("       INSIDER_BRAND4,");
        sql.append("       INSIDER_TYPE4,");
        sql.append("       INSIDER_BRAND5,");
        sql.append("       INSIDER_TYPE5,");
        sql.append("       POLICY_TYPE,");
        sql.append("       ASSET_DISPOSITION,");
        sql.append("       REVENUE_TYPE,");
        sql.append("       PERIOD_TYPE,");
        sql.append("       ANNUAL_INCOME_CD,");
        sql.append("       FINANCIAL_ASSET_CD,");
        sql.append("       MOTIVE_TYPE,");
        sql.append("       INITIALLY_TYPE,");
        sql.append("       EXPERIENCE_STOCK_TYPE,");
        sql.append("       EXPERIENCE_ACCUMULATIVE_INVESTMENT_TYPE,");
        sql.append("       EXPERIENCE_INVESTMENT_TRUST_TYPE,");
        sql.append("       EXPERIENCE_FUTURES_OPTION_TYPE,");
        sql.append("       EXPERIENCE_FUTURES_TYPE,");
        sql.append("       EXPERIENCE_CFD_TYPE,");
        sql.append("       EXPERIENCE_MARGIN_TYPE,");
        sql.append("       EXPERIENCE_PUBLIC_CORPORATE_TYPE,");
        sql.append("       EXPERIENCE_CB_TYPE,");
        sql.append("       EXPERIENCE_FOREIGN_SECURITIES_TYPE,");
        sql.append("       EXPERIENCE_FX_TYPE,");
        sql.append("       e.ENTRY_EMAIL");
        sql.append(" FROM M_USER_REQUEST");
        sql.append("         INNER JOIN");
        sql.append("     M_USER_REQUEST_EMAIL as e");
        sql.append("     ON");
        sql.append("         e.ENTRY_NO = M_USER_REQUEST.ENTRY_NO");
        sql.append("      WHERE 1=1 ");
        if (userRequestDate.getCitizenshipCd() != null) {
            sql.append("     AND CITIZENSHIP_CD = :citizenship_cd");
        }
        if (fromDate != null) {
            sql.append("        AND ACCOUNT_OPEN_D >= IF(:i_fromDatetime IS NULL, ACCOUNT_OPEN_D, :i_fromDatetime)");
        }
        if (toDate != null) {
            sql.append("        AND ACCOUNT_OPEN_D <= IF(:i_toDatetime IS NULL, ACCOUNT_OPEN_D, :i_toDatetime)");
        }
        if (userRequestDate.getClientNo() != null) {
            sql.append("        AND CLIENT_NO = IF(:client_no <> 0 OR :client_no IS NULL, CLIENT_NO, :client_no)");
        }
        if (userRequestDate.getNameMmei() != null) {
            sql.append("        AND NAME_MEI = IF(:name_mei IS NULL, NAME_MEI, :name_mei)");
        }
        if (userRequestDate.getNameSei() != null) {
            sql.append("        AND NAME_SEI = IF(:name_sei IS NULL, NAME_SEI, :name_sei)");
        }
        if (userRequestDate.getBrithDay() != null) {
            sql.append("        AND BIRTH_YEAR = IF(:i_birth_Year IS NULL, BIRTH_YEAR, :i_birth_Year) ");
            sql.append("        AND BIRTH_MONTH = IF(:i_birth_Month IS NULL, BIRTH_MONTH, :i_birth_Month)");
            sql.append("        AND BIRTH_DATE = IF(:i_birth_Day IS NULL, BIRTH_DATE, :i_birth_Day)");
        }
        if (userRequestDate.getMobileNumber() != null) {
            sql.append("        AND MOBILE_NUMBER = IF(:mobile_number IS NULL, MOBILE_NUMBER, :mobile_number)");
        }
        if (userRequestDate.getEntryEmail() != null) {
            sql.append("        AND e.ENTRY_EMAIL = IF(:entry_email IS NULL, e.ENTRY_EMAIL, :entry_email)");
        }
        if (userRequestDate.getAddressPrefectures() != null) {
            sql.append("        AND ADDRESS_PREFECTURES = IF(:address_prefectures IS NULL ,ADDRESS_PREFECTURES, :address_prefectures)");
        }
        if (userRequestDate.getAddressMunicipalities() != null) {
            sql.append("        AND ADDRESS_MUNICIPALITIES = IF(:address_municipalities IS NULL, ADDRESS_MUNICIPALITIES, :address_municipalities)");
        }
        sql.append("        AND ACCOUNT_OPENING_STATUS <> 8");
        sql.append("        AND (CASE");
        sql.append("                 WHEN e.OPENING_FLG = 0");
        sql.append("                     THEN e.ENTRY_URL_EXPIRY >= CURDATE()");
        sql.append("                 ELSE 1 = 1");
        sql.append(" END)");
//        sql.append("        AND (CASE");
//        sql.append("                 WHEN ISNULL(:status_filter) or :status_filter = '' THEN 1 = 1");
//        sql.append("                 ELSE OPEN_ACCOUNT_STATUS IN (:status_filter)");
//        sql.append("          END)");
        sql.append("      LIMIT 0, 10");
//        sql.append("    RowNum >=@firstRecord --@firstRecord = (Request.page_index - 1) * Request.page_size + 1");
//        sql.append("  AND");
//        sql.append("    RowNum <=@lastRecord --@lastRecord = @firstRecord + @Request.page_size - 1");

        Query query = entityManager.createNativeQuery(sql.toString());
        if (userRequestDate.getCitizenshipCd() != null) {
            query.setParameter("citizenship_cd", userRequestDate.getCitizenshipCd());
        }
        if (fromDate != null) {
            query.setParameter("i_fromDatetime", fromDate);
        }
        if (toDate != null) {
            query.setParameter("i_toDatetime", toDate);
        }
        if (userRequestDate.getClientNo() != null) {
            query.setParameter("client_no", userRequestDate.getClientNo());
        }
        if (userRequestDate.getNameMmei() != null) {
            query.setParameter("name_mei", userRequestDate.getNameMmei());
        }
        if (userRequestDate.getNameSei() != null) {
            query.setParameter("name_sei", userRequestDate.getNameSei());
        }
        if (userRequestDate.getBrithDay() != null) {
            query.setParameter("i_birth_Year", userRequestDate.getBrithDay().getYear());
            query.setParameter("i_birth_Month", userRequestDate.getBrithDay().getMonth());
            query.setParameter("i_birth_Day", userRequestDate.getBrithDay().getDay());
        }
        if (userRequestDate.getMobileNumber() != null) {
            query.setParameter("mobile_number", userRequestDate.getMobileNumber());
        }
        if (userRequestDate.getEntryEmail() != null) {
            query.setParameter("entry_email", userRequestDate.getEntryEmail());

        }
        if (userRequestDate.getAddressPrefectures() != null) {
            query.setParameter("address_prefectures", userRequestDate.getAddressPrefectures());

        }
        if (userRequestDate.getAddressMunicipalities() != null) {
            query.setParameter("address_municipalities", userRequestDate.getAddressMunicipalities());
        }
        List<Object[]> rs = query.getResultList();
        List<SearchUserRequestResponse> SearchUserRequestLs = new ArrayList<>();
        for (Object[] data : rs) {
            int i = 0;
            SearchUserRequestResponse item = SearchUserRequestResponse.builder()
                    .companyCd(String.valueOf(data[i++]))
                    .entryNo(String.valueOf(data[i++]))
                    .branchCd(String.valueOf(data[i++]))
                    .accountOpeningStatus(String.valueOf(data[i++]))
                    .collectingStatus(String.valueOf(data[i++]))
                    .collectingResultFlg(String.valueOf(data[i++]))
                    .antisocialCheckedStatus(String.valueOf(data[i++]))
                    .antisocialCheckedFlgIn(String.valueOf(data[i++]))
                    .antisocialCheckedFlgOut(String.valueOf(data[i++]))
                    .mynumberStatus(String.valueOf(data[i++]))
                    .paymentAccountBankStatus(String.valueOf(data[i++]))
                    .ekycCheckedStatus(String.valueOf(data[i++]))
                    .ekycCheckedFlg(String.valueOf(data[i++]))
                    .ekycId(String.valueOf(data[i++]))
                    .accountOpenDate(data[i] != null ? DateFormatUtil.dateFormatter(String.valueOf(data[i++])) : null)
                    .accountOpenUser(String.valueOf(data[i++]))
                    .clientNo(String.valueOf(data[i++]))
                    .nameMmei(String.valueOf(data[i++]))
                    .nameSei(String.valueOf(data[i++]))
                    .kanaNameMei(String.valueOf(data[i++]))
                    .kanaNameSei(String.valueOf(data[i++]))
                    .addressPostalCd(String.valueOf(data[i++]))
                    .addressPrefectures(String.valueOf(data[i++]))
                    .addressMunicipalities(String.valueOf(data[i++]))
                    .addressNumber(String.valueOf(data[i++]))
                    .addressBuilding(String.valueOf(data[i++]))
                    .homePhone(String.valueOf(data[i++]))
                    .mobileNumber(String.valueOf(data[i++]))
                    .birthDay(parseToBirthDay(String.valueOf(data[i++]), String.valueOf(data[i++]), String.valueOf(data[i++])))
                    .gender(String.valueOf(data[i++]))
                    .citizenshipCd(String.valueOf(data[i++]))
                    .citizenship(String.valueOf(data[i++]))
                    .countryOfResidence(String.valueOf(data[i++]))
                    .foreignPepsFlg(String.valueOf(data[i++]))
                    .salesOfficeAccountFlg(String.valueOf(data[i++]))
                    .consentFlg(String.valueOf(data[i++]))
                    .professionSelection1(String.valueOf(data[i++]))
                    .othersProfession1(String.valueOf(data[i++]))
                    .employment1(String.valueOf(data[i++]))
                    .department1(String.valueOf(data[i++]))
                    .position1(String.valueOf(data[i++]))
                    .employerPostalNo(String.valueOf(data[i++]))
                    .employerPrefecture(String.valueOf(data[i++]))
                    .employerCity(String.valueOf(data[i++]))
                    .employerLastAddr1(String.valueOf(data[i++]))
                    .employerLastAddr1(String.valueOf(data[i++]))
                    .employerPhone(String.valueOf(data[i++]))
                    .householderRelationship(String.valueOf(data[i++]))
                    .householderNameSei(String.valueOf(data[i++]))
                    .householderNameMei(String.valueOf(data[i++]))
                    .professionSelection2(String.valueOf(data[i++]))
                    .othersProfession2(String.valueOf(data[i++]))
                    .employment2(String.valueOf(data[i++]))
                    .department2(String.valueOf(data[i++]))
                    .position2(String.valueOf(data[i++]))
                    .insiderFlg(String.valueOf(data[i++]))
                    .insiderBrand1(String.valueOf(data[i++]))
                    .insiderType1(String.valueOf(data[i++]))
                    .insiderBrand2(String.valueOf(data[i++]))
                    .insiderType2(String.valueOf(data[i++]))
                    .insiderBrand3(String.valueOf(data[i++]))
                    .insiderType3(String.valueOf(data[i++]))
                    .insiderBrand4(String.valueOf(data[i++]))
                    .insiderType4(String.valueOf(data[i++]))
                    .insiderBrand5(String.valueOf(data[i++]))
                    .insiderType5(String.valueOf(data[i++]))
                    .policyType(String.valueOf(data[i++]))
                    .assetDisposition(String.valueOf(data[i++]))
                    .revenueType(String.valueOf(data[i++]))
                    .periodType(String.valueOf(data[i++]))
                    .annualIncomeCd(String.valueOf(data[i++]))
                    .financialAssetCd(String.valueOf(data[i++]))
                    .motiveType(String.valueOf(data[i++]))
                    .initiallyType(String.valueOf(data[i++]))
                    .experienceStockType(String.valueOf(data[i++]))
                    .experienceAccumulativeInvestmentType(String.valueOf(data[i++]))
                    .experienceInvestmentTrustType(String.valueOf(data[i++]))
                    .experienceFuturesOptionType(String.valueOf(data[i++]))
                    .experienceFuturesType(String.valueOf(data[i++]))
                    .experienceCfdType(String.valueOf(data[i++]))
                    .experienceMarginType(String.valueOf(data[i++]))
                    .experiencePublicCorporateType(String.valueOf(data[i++]))
                    .experienceCbType(String.valueOf(data[i++]))
                    .experienceForeignSecuritiesType(String.valueOf(data[i++]))
                    .experienceFxType(String.valueOf(data[i++]))
                    .entryEmail(String.valueOf(data[i]))
                    .build();
            SearchUserRequestLs.add(item);
        }
        return SearchUserRequestLs;
    }

    private Date parseToBirthDay(String year, String month, String date) throws ParseException {
        if (StringUtils.hasLength(year) && StringUtils.hasLength(month) && StringUtils.hasLength(date) ) {
            return DateFormatUtil.dateFormatter(year + "-" + month + "-" + date);
        }
        return null;
    }
}
