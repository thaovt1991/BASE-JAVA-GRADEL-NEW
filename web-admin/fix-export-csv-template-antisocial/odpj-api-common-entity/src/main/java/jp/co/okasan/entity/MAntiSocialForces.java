package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "M_ANTISOCIAL_FORCES")
@IdClass(MAntiSocialForcesPK.class)
public class MAntiSocialForces implements Serializable {

  @Id
  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Id
  @Column(name = "ENTRY_NO")
  private Integer entryNo;

  @Column(name = "ANTISOCIAL_CHECKED_TYPE")
  private String antiSocialCheckedType;

  @Column(name = "CAPTURE_D")
  private LocalDateTime captureD;

  @Column(name = "ANTISOCIAL_FORCES_RESULT")
  private String antiSocialForcesResult;

  @Column(name = "ANTISOCIAL_FORCES_NOTE")
  private String antiSocialForcesNote;

  @CreatedDate
  @Column(name = "CREATE_DT", nullable = false, updatable = false)
  private LocalDateTime creatDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @LastModifiedDate
  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
