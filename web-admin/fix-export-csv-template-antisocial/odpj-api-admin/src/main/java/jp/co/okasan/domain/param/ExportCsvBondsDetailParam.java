package jp.co.okasan.domain.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportCsvBondsDetailParam {

    private String issueCd;

    private Integer branchCc;
}
