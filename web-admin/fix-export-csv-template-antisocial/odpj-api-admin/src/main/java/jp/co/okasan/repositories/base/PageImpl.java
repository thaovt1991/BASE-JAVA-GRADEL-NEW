package jp.co.okasan.repositories.base;

import java.util.List;
import org.springframework.data.domain.Pageable;

public class PageImpl<T> extends org.springframework.data.domain.PageImpl<T> {

  private long totalElement;

  public PageImpl(List<T> content, Pageable pageable,
      long total) {
    super(content, pageable, total);
    this.totalElement = total;
  }

  @Override
  public long getTotalElements() {
    return totalElement;
  }

  public PageImpl(List<T> content) {
    super(content);
  }
}
