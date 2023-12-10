package jp.co.okasan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** The persistent class for the M_NAME_IDENTIFICATION database table. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "M_NAME_IDENTIFICATION")
// @NamedQuery(name = "MNameIdentification.findAll", query = "SELECT m FROM MNameIdentification m")
public class MNameIdentification implements Serializable {

  private static final long serialVersionUID = 1L;

  // Add column with API

  @EmbeddedId private MNameIdentificationPK id;

  @Column(name = "COMPANY_CD", insertable = false, updatable = false)
  private String companyCd;

  @Column(name = "ENTRY_NO", insertable = false, updatable = false)
  private Integer entryNo;

  @Column(name = "SERIAL_NUMBER", insertable = false, updatable = false)
  private BigDecimal serialNumber;

  @Column(name = "CLIENT_NO")
  private Integer clientNo;

  @Column(name = "NAME_RESULT_FLG")
  private String nameResultFlg;

  @Column(name = "CLIENT_NAME")
  private String clientName;

  @Column(name = "KANA_NAME_RESULT_FLG")
  private String kanaNameResultFlg;

  @Column(name = "CLIENT_KANA_NAME")
  private String clientKanaName;

  @Column(name = "BIRTH_D_RESULT_FLG")
  private String birthDResultFlg;

  @Column(name = "BIRTH_D")
  private LocalDateTime birthD;

  @Column(name = "PERSONAL_NO_RESULT_FLG")
  private String personalNoResultFlg;

  @Column(name = "ADDRESS_RESULT_FLG")
  private String addressResultFlg;

  @Column(name = "CLIENT_ADDRESS")
  private String clientAddress;

  @Column(name = "HOME_PHONE_NO_RESULT_FLG")
  private String homePhoneNoResultFlg;

  @Column(name = "HOME_PHONE")
  private String homePhone;

  @Column(name = "MOBILE_NUMBER_RESULT_FLG")
  private String mobileNumberResultFlg;

  @Column(name = "MOBILE_NUMBER")
  private String mobileNumber;

  @Column(name = "ENTRY_EMAIL")
  private String entryEmail;

  @Column(name = "IP_ADDRESS")
  private String ipAddress;

  @Column(name = "CITIZENSHIP_CD")
  private String citizenshipCd;

  @Column(name = "CITIZENSHIP")
  private String citizenship;

  @Column(name = "EMPLOYMENT2")
  private String employment2;

  @Column(name = "DEPARTMENT2")
  private String department2;

  @Column(name = "EMPLOYER_ADDRESS_RESULT_FLG")
  private String employerAddressResultFlg;

  @Column(name = "EMPLOYER_ADDRESS")
  private String employerAddress;

  @Column(name = "EMPLOYER_PHONE_RESULT_FLG")
  private String employerPhoneResultFlg;

  @Column(name = "EMPLOYER_PHONE")
  private String employerPhone;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
