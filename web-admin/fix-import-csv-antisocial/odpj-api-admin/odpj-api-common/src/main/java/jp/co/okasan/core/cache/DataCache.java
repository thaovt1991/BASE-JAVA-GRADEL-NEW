package jp.co.okasan.core.cache;

import java.util.function.Supplier;
import org.springframework.lang.NonNull;

public interface DataCache {
  <T> T get(@NonNull String key, @NonNull Class<T> tClass, @NonNull Supplier<T> supplier);

  void remove(@NonNull String key);
}
