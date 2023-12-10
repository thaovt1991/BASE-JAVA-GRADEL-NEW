package jp.co.okasan.core.cache;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Objects;
import java.util.function.Supplier;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class RedisDataCache implements DataCache {
  private final DataCacheConfig dataCacheConfig;
  private final RedisTemplate<String, Object> redisTemplate;
  private final ObjectMapper objectMapper;

  @Override
  public <T> T get(@NonNull String key, @NonNull Class<T> tClass, @NonNull Supplier<T> supplier) {
    return Objects.requireNonNullElseGet(
        getFromCache(key, tClass), () -> updateCache(key, supplier.get()));
  }

  @Override
  public void remove(String key) {
    redisTemplate.delete(key);
  }

  protected <T> T getFromCache(String key, @NonNull Class<T> tClass) {
    final var cached = (byte[]) redisTemplate.opsForValue().get(key);
    if (cached == null || cached.length == 0) {
      return null;
    }
    log.debug("deserialize key={} to {}", key, tClass);
    try {
      return objectMapper.readValue(cached, tClass);
    } catch (IOException e) {
      log.warn("get cached value failed", e);
      return null;
    }
  }

  protected <T> T updateCache(String key, T value) {
    redisTemplate.opsForValue().set(key, value, dataCacheConfig.getTtl());
    return value;
  }
}
