package jp.co.okasan.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResouceInfoDto {
    private Integer branchCd;
    private Integer customerCd;
    private Date valueDt;
    private Integer prevdCashBalance;
    private Integer todayVdInCashStock;
    private Integer todayVdOutCashSimple;
    private Integer todayVdInCashForOffset;
    private Integer todayCashBalance;
    private Integer outCashRestLoop;
    private Integer outCashRestComm;
    private Integer simpleSellNetAmt;
    private Integer moneyToSpare;
    private Integer clientBuyingPower;
    private String nameMei;
    private String nameSei;
}
