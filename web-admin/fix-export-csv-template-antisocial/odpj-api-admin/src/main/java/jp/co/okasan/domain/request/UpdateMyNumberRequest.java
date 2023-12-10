package jp.co.okasan.domain.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@ConfigurableValidation
public class UpdateMyNumberRequest {

    private String companyCd;

    private Integer entryNo;

    private Integer clientNo;

    private String personalNo;

    private Integer myNumberSeqNo;

    private String myNumberDocumentType;

    private LocalDate myNumberDocumnentsD;

    private String myNumberStatus;

    private LocalDate statusDate;

    private String statusUser;

    private String reUploadStatus;
}
