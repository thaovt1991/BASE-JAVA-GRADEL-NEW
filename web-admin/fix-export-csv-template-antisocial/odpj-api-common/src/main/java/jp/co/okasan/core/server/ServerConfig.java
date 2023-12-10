package jp.co.okasan.core.server;

import java.util.Locale;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class ServerConfig {

  /** Setting Spring Boot SetTimeZone and locale */
  @PostConstruct
  public void init() {
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
    Locale.setDefault(Locale.JAPANESE);
  }
}
