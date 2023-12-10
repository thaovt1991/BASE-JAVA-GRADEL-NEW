package jp.co.okasan.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "FUND_DIV_PROFIT")
public class FundDivProfit {
  @Id
  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "BASE_DT")
  private String baseDt;

  @Column(name = "SETTL_TYP")
  private Integer settlTyp;

  @Column(name = "DIVIDEND_PRICE")
  private Integer dividendPrice;

  @Column(name = "TERM")
  private Integer term;

  @Column(name = "INPUT_TM")
  private Date inputTm;

  @Transient private String secShortDescKanji;

  public void setSecShortDescKanji(String secShortDescKanji) {
    this.secShortDescKanji = secShortDescKanji;
  }
}
