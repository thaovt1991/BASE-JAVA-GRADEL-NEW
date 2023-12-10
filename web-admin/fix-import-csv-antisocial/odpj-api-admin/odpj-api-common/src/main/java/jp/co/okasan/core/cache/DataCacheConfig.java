package jp.co.okasan.core.cache;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.*;

@Data
@Configuration
@ConfigurationProperties(prefix = "okasan.common.cache")
@Accessors(chain = true)
public class DataCacheConfig {
  /** Cache expire. default 8h */
  private Duration ttl = Duration.ofHours(8);

  /** cache redis template bean */
  @Bean
  public RedisTemplate<String, Object> cacheRedisTemplate(
      RedisConnectionFactory redisConnectionFactory, ObjectMapper objectMapper) {
    final var serializer =
        new GenericJackson2JsonRedisSerializer(objectMapper) {
          @Override
          public Object deserialize(byte[] source) throws SerializationException {
            // not convert to other type
            return source;
          }
        };
    final var template = new RedisTemplate<String, Object>();
    template.setConnectionFactory(redisConnectionFactory);
    template.setKeySerializer(RedisSerializer.string());
    template.setKeySerializer(RedisSerializer.string());
    template.setValueSerializer(serializer);
    template.setValueSerializer(serializer);
    return template;
  }
}
