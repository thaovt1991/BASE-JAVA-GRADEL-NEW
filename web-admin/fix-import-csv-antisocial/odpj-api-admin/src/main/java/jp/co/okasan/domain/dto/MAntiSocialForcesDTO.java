package jp.co.okasan.domain.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MAntiSocialForcesDTO {

    @CsvBindByName(column = "companyCd")
    private String companyCd;

    @CsvBindByName(column = "entryNo")
    private Integer entryNo;

    @CsvBindByName(column = "antisocialForcesResult")
    private String antisocialForcesResult;

    @CsvBindByName(column = "antisocialForcesNote")
    private String antisocialForcesNote;

}
