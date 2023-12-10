package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the FUND_MEMO database table. */
@Entity
@Table(name = "FUND_MEMO")
@NamedQuery(name = "FundMemo.findAll", query = "SELECT f FROM FundMemo f")
public class FundMemo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Lob
  @Column(name = "FUND_MEMO_1")
  private String fundMemo1;

  @Lob
  @Column(name = "FUND_MEMO_2")
  private String fundMemo2;

  @Lob
  @Column(name = "FUND_MEMO_3")
  private String fundMemo3;

  public FundMemo() {}

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public String getFundMemo1() {
    return this.fundMemo1;
  }

  public void setFundMemo1(String fundMemo1) {
    this.fundMemo1 = fundMemo1;
  }

  public String getFundMemo2() {
    return this.fundMemo2;
  }

  public void setFundMemo2(String fundMemo2) {
    this.fundMemo2 = fundMemo2;
  }

  public String getFundMemo3() {
    return this.fundMemo3;
  }

  public void setFundMemo3(String fundMemo3) {
    this.fundMemo3 = fundMemo3;
  }
}
