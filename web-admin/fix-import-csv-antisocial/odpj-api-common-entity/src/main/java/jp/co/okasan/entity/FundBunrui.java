package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the FUND_BUNRUI database table. */
@Entity
@Table(name = "FUND_BUNRUI")
@NamedQuery(name = "FundBunrui.findAll", query = "SELECT f FROM FundBunrui f")
public class FundBunrui implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "INV_TRUST_GROUP_CD")
  private int invTrustGroupCd;

  @Column(name = "INV_ASS_GROUP_CD")
  private int invAssGroupCd;

  @Column(name = "INV_ASS_GROUP_NM")
  private String invAssGroupNm;

  @Column(name = "INV_TRUST_COMM")
  private String invTrustComm;

  @Column(name = "INV_TRUST_GROUP_NM")
  private String invTrustGroupNm;

  public FundBunrui() {}

  public int getInvTrustGroupCd() {
    return this.invTrustGroupCd;
  }

  public void setInvTrustGroupCd(int invTrustGroupCd) {
    this.invTrustGroupCd = invTrustGroupCd;
  }

  public int getInvAssGroupCd() {
    return this.invAssGroupCd;
  }

  public void setInvAssGroupCd(int invAssGroupCd) {
    this.invAssGroupCd = invAssGroupCd;
  }

  public String getInvAssGroupNm() {
    return this.invAssGroupNm;
  }

  public void setInvAssGroupNm(String invAssGroupNm) {
    this.invAssGroupNm = invAssGroupNm;
  }

  public String getInvTrustComm() {
    return this.invTrustComm;
  }

  public void setInvTrustComm(String invTrustComm) {
    this.invTrustComm = invTrustComm;
  }

  public String getInvTrustGroupNm() {
    return this.invTrustGroupNm;
  }

  public void setInvTrustGroupNm(String invTrustGroupNm) {
    this.invTrustGroupNm = invTrustGroupNm;
  }
}
