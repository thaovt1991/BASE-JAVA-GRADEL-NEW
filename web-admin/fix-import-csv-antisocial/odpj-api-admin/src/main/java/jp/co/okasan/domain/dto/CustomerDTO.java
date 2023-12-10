package jp.co.okasan.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Integer customerCd;

    private String nameMei;

    private String nameSei;

    private String kanaNameMei;

    private String kanaNameSei;

    private Integer birthDate;

    private Integer sex;

    private LocalDate lastSuccessTm;

    private String logData;

    private String ipAddress;

}
