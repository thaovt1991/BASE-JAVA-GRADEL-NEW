package jp.co.okasan.core.validator.configuable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jp.co.okasan.core.validator.configuable.domain.ValidationRule;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "okasan.common.configurable-validator")
@Accessors(chain = true)
public class ConfigurableValidatorConfig {
  private final Map<String, Map<String, List<ValidationRule>>> rules = new LinkedHashMap<>();
}
