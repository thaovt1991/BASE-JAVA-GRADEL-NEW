package jp.co.okasan.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAntisocialForcesParam {
    private String companyCd;
    private Integer entryNo;
}
