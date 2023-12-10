package jp.co.okasan.domain.dto;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
	
	@NotEmpty
    private Integer customerCd;

    private String nameMei;

    private String nameSei;

    private String kanaNameMei;

    private String kanaNameSei;

}
