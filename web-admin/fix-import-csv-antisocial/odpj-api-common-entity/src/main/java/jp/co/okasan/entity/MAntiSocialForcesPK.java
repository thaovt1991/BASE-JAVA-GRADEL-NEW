package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MAntiSocialForcesPK implements Serializable {
  private String companyCd;
  private Integer entryNo;
}
