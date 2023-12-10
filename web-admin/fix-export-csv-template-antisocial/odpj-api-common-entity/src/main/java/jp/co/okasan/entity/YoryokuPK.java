package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Embeddable
@Data
public class YoryokuPK implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "BRANCH_CD")
  private String branchCd;

  @Column(name = "CUSTOMER_CD")
  private Integer customerCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "VALUE_DT")
  private Date valueDt;
}
