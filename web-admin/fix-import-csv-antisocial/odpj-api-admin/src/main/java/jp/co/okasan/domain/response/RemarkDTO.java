package jp.co.okasan.domain.response;

import jp.co.okasan.entity.MRemark;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RemarkDTO {

    private String companyCd;

    private Integer entryNo;

    private String inputRouteCls;

    private String remarksContent;

    private LocalDateTime createDt;

    private String createPrgId;

    private LocalDateTime updateDt;

    private String updatePrgId;

}
