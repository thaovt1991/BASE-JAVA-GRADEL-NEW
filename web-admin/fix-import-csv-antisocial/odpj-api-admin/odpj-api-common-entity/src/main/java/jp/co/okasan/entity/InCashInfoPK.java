package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/** The primary key class for the IN_CASH_INFO database table. */
@Embeddable
@Data
public class InCashInfoPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Temporal(TemporalType.DATE)
  @Column(name = "INPUT_DATE")
  private java.util.Date inputDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "FILE_PROC_TM")
  private java.util.Date fileProcTm;

  @Column(name = "IN_CASH_NO")
  private Integer inCashNo;
}
