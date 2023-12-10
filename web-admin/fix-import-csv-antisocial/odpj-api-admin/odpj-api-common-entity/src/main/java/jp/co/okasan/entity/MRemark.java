package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** The persistent class for the M_REMARKS database table. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "M_REMARKS")
public class MRemark implements Serializable {

  private static final long serialVersionUID = 1L;

  // Add column with API

  @EmbeddedId private MRemarkPK id;

  @Column(name = "COMPANY_CD", insertable = false, updatable = false)
  private String companyCd;

  @Column(name = "ENTRY_NO", insertable = false, updatable = false)
  private Integer entryNo;

  @Column(name = "INPUT_ROUTE_CLS", insertable = false, updatable = false)
  private String inputRouteCls;

  @Column(name = "REMARKS_CONTENT")
  private String remarksContent;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
