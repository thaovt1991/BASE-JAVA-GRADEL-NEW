package jp.co.okasan.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountLockDTO {

    private int branchCd;
    private int customerCd;
    private int accLockFlg;
    private String accLockReason;
    private int accLockLoginSts;
    private int accLockReqSts;
    private int accLockTrdSts;
    private int acLockFlg;
    private String acLockReason;
    private int acLockLoginSts;
    private int acLockReqSts;
    private int acLockTrdSts;
    private int ssLockFlg;
    private String ssLockReason;
    private int ssLockLoginSts;
    private int ssLockReqSts;
    private int ssLockTrdSts;
    private LocalDate inputTm;
    private String createPrgId;
}
