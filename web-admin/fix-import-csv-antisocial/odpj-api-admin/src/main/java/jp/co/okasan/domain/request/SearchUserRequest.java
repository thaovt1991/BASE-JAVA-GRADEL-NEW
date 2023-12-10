package jp.co.okasan.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class SearchUserRequest {
    @JsonProperty("from_date")
    private String fromDate;

    @JsonProperty("from_time")
    private String fromTime;

    @JsonProperty("to_date")
    private String toDate;

    @JsonProperty("to_tTime")
    private String toTime;

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

    @JsonProperty("brithDay")
    private Date brithDay;

    @JsonProperty("mobile_number")
    private String mobileNumber;

    @JsonProperty("entry_email")
    private String entryEmail;

    @JsonProperty("address_prefectures")
    private String addressPrefectures;

    @JsonProperty("address_municipalities")
    private String addressMunicipalities;

    @JsonProperty("citizenship_cd")
    private String citizenshipCd;

    @JsonProperty("status_filter")
    private List<Integer> statusFilter;

    @JsonProperty("individual_corporate_cls")
    private String individualCorporateCls;
}
