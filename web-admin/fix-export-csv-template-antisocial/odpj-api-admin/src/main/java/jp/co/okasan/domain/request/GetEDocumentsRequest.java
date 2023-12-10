package jp.co.okasan.domain.request;

import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

@Data
@ConfigurableValidation
public class GetEDocumentsRequest {

    private Integer issueCd;

    private Integer pageIndex;

    private Integer pageNumber;
}
