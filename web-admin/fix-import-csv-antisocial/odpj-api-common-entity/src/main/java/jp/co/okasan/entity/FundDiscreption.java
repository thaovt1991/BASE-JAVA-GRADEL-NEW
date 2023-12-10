package jp.co.okasan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "FUND_DISCREPTION")
public class FundDiscreption {
  @Id
  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "SEC_SHORT_DESC_KANJI")
  private String secShortDescKanji;
}
