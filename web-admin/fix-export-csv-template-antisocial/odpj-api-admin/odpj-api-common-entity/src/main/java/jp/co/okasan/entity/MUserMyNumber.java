package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "M_USER_MYNUMBER")
@IdClass(MUserMyNumberPK.class)
public class MUserMyNumber implements Serializable {

  /** */
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Id
  @Column(name = "ENTRY_NO")
  private Integer entryNo;

  @Column(name = "CLIENT_NO")
  private Integer clientNo;

  @Column(name = "PERSONAL_NO")
  private String personalNo;

  @Column(name = "MYNUMBER_SEQ_NO")
  private Integer myNumberSeqNo;

  @Column(name = "MYNUMBER_DOCUMENTS_TYPE")
  private String myNumberDocumentType;

  @Column(name = "MYNUMBER_DOCUMENTS_D")
  private LocalDateTime myNumberDocumnentsD;

  @Column(name = "MYNUMBER_DOCUMENTS_STATUS")
  private String myNumberStatus;

  @Column(name = "STATUS_DATE")
  private LocalDateTime statusDate;

  @Column(name = "STATUS_USER")
  private String statusUser;

  @Column(name = "REUPLOAD_STATUS")
  private String reUploadStatus;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
