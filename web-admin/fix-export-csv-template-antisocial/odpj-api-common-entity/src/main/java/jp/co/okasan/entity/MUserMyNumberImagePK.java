package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MUserMyNumberImagePK implements Serializable {

  private static final long serialVersionUID = 1234567890123456789L;

  private String companyCd;

  private Integer entryNo;

  private Integer myNumberSeqNo;
}
