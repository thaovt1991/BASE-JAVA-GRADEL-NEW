package jp.co.okasan.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchDTO {

    private Integer branchCd;

    private String branchNm;

    private String branchKanaNm;

    private Integer expireFlg;

    private Integer branchKindCd;

    private Integer plincipalFlg;

    private Integer ownBranchFlg;

    private Integer brokerCd;

    private Integer defaultSalesCd;

    private String zipNo1;

    private String zipNo2;

    private String secCoAddress1;

    private String secCoAddress2;

    private String secCoAddress3;

    private String secCoAddress4;

    private LocalDateTime inputTm;

    private String createPrgId;

    private LocalDateTime updateDatetime;

    private String updatePrgId;
}
