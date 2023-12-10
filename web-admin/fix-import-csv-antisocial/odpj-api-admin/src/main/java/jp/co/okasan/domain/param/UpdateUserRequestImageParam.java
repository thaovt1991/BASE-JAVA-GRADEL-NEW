package jp.co.okasan.domain.param;

import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurableValidation
public class UpdateUserRequestImageParam {
    private Integer entryNo;

    private String identityDocumentsType;

    private String imageData1;

    private String imageData2;

    private String createPrgId;

}
