package jp.co.okasan.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "okasan.odpi-api-admin")
public class AppConfig {
  // TODO app config input here
}
