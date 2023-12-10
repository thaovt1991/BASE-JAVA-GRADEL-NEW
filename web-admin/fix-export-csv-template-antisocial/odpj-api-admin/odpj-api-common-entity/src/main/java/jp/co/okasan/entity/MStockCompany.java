package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/** The persistent class for the M_STOCK_COMPANY database table. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "M_STOCK_COMPANY")
public class MStockCompany implements Serializable {

  @Id
  @Column(name = "BRAND_CD")
  private String brandCd;

  @Column(name = "CORPORATE_NAME")
  private String corporateName;

  @Column(name = "CORPORATE_KANA_NAME")
  private String corporateKanaName;

  @Column(name = "CORPORATE_NAME_EN")
  private String corporateNameEn;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
