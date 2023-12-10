package jp.co.okasan.domain.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserInfoDTO {
    private Integer roleCd;
    private Integer userCd;
    private String userNm;
    private String userNmKana;
    private Integer branchCd;
    private Integer traderCd;
    private Integer pinNo;
    private String secCoNm;
    private String participantNm;
}
