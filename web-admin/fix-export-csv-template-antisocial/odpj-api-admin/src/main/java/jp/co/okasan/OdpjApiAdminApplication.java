package jp.co.okasan;

import jp.co.okasan.core.cache.DataCacheConfig;
import jp.co.okasan.core.convertor.message.MessageConverter;
import jp.co.okasan.core.errorhandler.ErrorHandlerConfig;
import jp.co.okasan.core.server.ServerConfig;
import jp.co.okasan.core.validator.configuable.ConfigurableValidatorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
public class OdpjApiAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(OdpjApiAdminApplication.class, args);
  }
}
