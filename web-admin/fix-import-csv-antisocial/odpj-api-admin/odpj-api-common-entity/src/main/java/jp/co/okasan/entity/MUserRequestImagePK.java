package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MUserRequestImagePK implements Serializable {

  private Integer identityDocumentsSeqNo;

  private String companyCd;

  private Integer entryNo;
}
