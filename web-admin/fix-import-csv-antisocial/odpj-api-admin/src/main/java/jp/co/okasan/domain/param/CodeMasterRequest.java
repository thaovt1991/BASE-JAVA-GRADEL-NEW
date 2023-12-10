package jp.co.okasan.domain.param;

import jp.co.okasan.core.validator.configuable.ConfigurableValidation;
import lombok.Data;

import java.util.List;

@Data
@ConfigurableValidation
public class CodeMasterRequest {
    private List<String> fields;
}
