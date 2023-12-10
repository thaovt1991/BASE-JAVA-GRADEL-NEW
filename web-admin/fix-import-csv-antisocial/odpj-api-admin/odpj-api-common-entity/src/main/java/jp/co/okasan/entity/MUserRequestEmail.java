package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "M_USER_REQUEST_EMAIL")
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(MUserRequestEmailPK.class)
public class MUserRequestEmail implements Serializable {

  @Id
  @Column(name = "COMPANY_CD", insertable = false, updatable = false)
  String companyCd;

  @Id
  @Column(name = "ENTRY_NO", insertable = false, updatable = false)
  Integer entryNo;

  @Column(name = "BRANCH_CD")
  String branchCd;

  @Column(name = "ENTRY_EMAIL")
  String entryEmail;

  @Column(name = "CONFIRMATION_NO")
  Integer confirmationNo;

  @Column(name = "CONFIRMATION_NO_EXPIRY")
  LocalDateTime confirmationNoExpiry;

  @Column(name = "ENTRY_URL")
  String entryUrl;

  @Column(name = "ENTRY_URL_ISSUE_D")
  LocalDateTime entryUrlIssueD;

  @Column(name = "ENTRY_URL_EXPIRY")
  LocalDateTime entryUrlExpiry;

  @Column(name = "OPENING_FLG")
  String openingFlg;

  @Column(name = "EXPIRY_FLG")
  String expiryFlg;

  @Column(name = "CREATE_DT")
  LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  String createPrgId;

  @Column(name = "UPDATE_DT")
  LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  String updatePrgId;
}
