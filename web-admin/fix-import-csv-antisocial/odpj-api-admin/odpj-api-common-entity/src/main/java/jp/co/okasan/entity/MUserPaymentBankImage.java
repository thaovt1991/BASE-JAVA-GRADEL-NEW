package jp.co.okasan.entity;

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
@Table(name = "M_USER_PAYMENT_BANK_IMAGE")
@IdClass(MUserPaymentBankImagePK.class)
public class MUserPaymentBankImage {

  @Id
  @Column(name = "PAYMENT_ACCOUNT_BANK_TYPE")
  private Integer paymentAccountBankType;

  @Id
  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Id
  @Column(name = "ENTRY_NO")
  private int entryNo;

  @Column(name = "CLIENT_NO")
  private Integer clientNo;

  @Column(name = "IMAGE_DATA")
  private String imageData;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;
}
