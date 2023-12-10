package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@ToString
public class MUserRequestEmailPK implements Serializable {
  String companyCd;
  Integer entryNo;
}
