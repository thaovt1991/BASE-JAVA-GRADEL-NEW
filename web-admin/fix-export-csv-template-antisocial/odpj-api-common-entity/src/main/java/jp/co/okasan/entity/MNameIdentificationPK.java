package jp.co.okasan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** The primary key class for the M_NAME_IDENTIFICATION database table. */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MNameIdentificationPK implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Column(name = "ENTRY_NO")
  private Integer entryNo;

  @Column(name = "SERIAL_NUMBER")
  private BigDecimal serialNumber;
}
