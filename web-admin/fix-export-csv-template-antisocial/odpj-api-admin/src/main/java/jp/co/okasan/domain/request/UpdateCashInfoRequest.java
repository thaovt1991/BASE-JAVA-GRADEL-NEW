package jp.co.okasan.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCashInfoRequest {

    @JsonProperty("input_date")
    private Date inputDate;

    @JsonProperty("file_proc_tm")
    private Date fileProcTm;

    @JsonProperty("in_cash_no")
    private Integer inCashNo;

    @JsonProperty("account_num")
    private Integer accountNum;

    @JsonProperty("bank_branch_cd")
    private Integer bankBranchCd;

    @JsonProperty("bank_cd")
    private Integer bankCd;

    @JsonProperty("bank_deposit_kbn")
    private Integer bankDepositKbn;

    @JsonProperty("branch_cd")
    private Integer branchCd;

    @JsonProperty("client_nm_kana")
    private String clientNmKana;

    @JsonProperty("corres_amount")
    private Integer corresAmount;

    @JsonProperty("create_dt")
    private Date createDt;

    @JsonProperty("customer_cd")
    private Integer customerCd;

    @JsonProperty("from_client_bank_acc_no")
    private Integer fromClientBankAccNo;

    @JsonProperty("from_client_bank_branch_no")
    private Integer fromClientBankBranchNo;

    @JsonProperty("in_cash_amount")
    private Integer inCashAmount;

    @JsonProperty("in_cash_type")
    private Integer inCashType;

    @JsonProperty("in_out_cash_no")
    private Integer inOutCashNo;

    @JsonProperty("kanjyo_date")
    private Integer kanjyoDate;

    @JsonProperty("kisan_date")
    private Integer kisanDate;

    @JsonProperty("login_id")
    private String loginId;

    @JsonProperty("output_name")
    private String outputName;

    @JsonProperty("p_dummy1")
    private String pDummy1;

    @JsonProperty("receive_money_sts")
    private Integer receiveMoneySts;

    @JsonProperty("receive_money_unmatch_sts")
    private Integer receiveMoneyUnmatchSts;

    @JsonProperty("rmt_bank_name")
    private String rmtBankName;

    @JsonProperty("rmt_brunch_name")
    private String rmtBrunchName;

    @JsonProperty("shokai_no")
    private Integer shokaiNo;

    @JsonProperty("update_datetime")
    private Date updateDatetime;

}
