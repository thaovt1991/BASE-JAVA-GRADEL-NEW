package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MUserPaymentBankImagePK implements Serializable {

  private Integer paymentAccountBankType;

  private String companyCd;

  private int entryNo;
}
