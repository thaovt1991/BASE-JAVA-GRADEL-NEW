package jp.co.okasan.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "M_USER_REQUEST_IMAGE")
@Entity
@IdClass(MUserRequestImagePK.class)
public class MUserRequestImage {

  @Id
  @Column(name = "IDENTITY_DOCUMENTS_SEQ_NO")
  private Integer identityDocumentsSeqNo;

  @Id
  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Id
  @Column(name = "ENTRY_NO")
  private Integer entryNo;

  @Column(name = "CLIENT_NO")
  private Integer clientNo;

  @Column(name = "IDENTITY_DOCUMENTS_TYPE")
  private String identityDocumentsType;

  @Column(name = "EKYC_ID")
  private String eKycId;

  @Column(name = "IMAGE_DATA1")
  private String imageData1;

  @Column(name = "IMAGE_DATA2")
  private String imageData2;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;
}
