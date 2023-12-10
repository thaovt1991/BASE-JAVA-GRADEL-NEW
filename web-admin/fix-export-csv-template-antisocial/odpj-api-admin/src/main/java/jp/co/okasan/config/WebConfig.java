package jp.co.okasan.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private ObjectMapper mapper;

    @Autowired  // spring.jackson.* ObjectMapper's config
    public WebConfig(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void extendMessageConverters (List<HttpMessageConverter<?>> converters) {
        converters.stream()
                .filter(x -> x instanceof MappingJackson2HttpMessageConverter)
                .forEach(x -> ((MappingJackson2HttpMessageConverter) x).setObjectMapper(mapper));
    }
}
