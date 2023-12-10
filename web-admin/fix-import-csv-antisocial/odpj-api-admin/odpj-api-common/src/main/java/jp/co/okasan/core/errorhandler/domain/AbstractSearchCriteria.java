package jp.co.okasan.core.errorhandler.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@Data
@NoArgsConstructor
public class AbstractSearchCriteria {

  @JsonProperty(value = "page_index")
  Integer page = 0;

  @JsonProperty(value = "page_size")
  Integer size = Integer.MAX_VALUE;

  Integer offset;
  String key;
  String sortField = "id";
  Sort.Direction sortOrder = Sort.DEFAULT_DIRECTION;
  String timeZone;

  @JsonIgnore
  public PageRequest pageRequest() {
    return PageRequest.of(this.page, this.size, Sort.by(sortOrder, sortField));
  }

  public AbstractSearchCriteria(String sortField) {
    this.sortField = sortField;
  }
}
