package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the FUND_COMPANY_URL database table. */
@Entity
@Table(name = "FUND_COMPANY_URL")
@NamedQuery(name = "FundCompanyUrl.findAll", query = "SELECT f FROM FundCompanyUrl f")
public class FundCompanyUrl implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "INV_COMPANY_CD")
  private String invCompanyCd;

  @Column(name = "ASCEND_NO")
  private int ascendNo;

  @Lob
  @Column(name = "LINK_URL_INV_COMPANY")
  private String linkUrlInvCompany;

  public FundCompanyUrl() {}

  public String getInvCompanyCd() {
    return this.invCompanyCd;
  }

  public void setInvCompanyCd(String invCompanyCd) {
    this.invCompanyCd = invCompanyCd;
  }

  public int getAscendNo() {
    return this.ascendNo;
  }

  public void setAscendNo(int ascendNo) {
    this.ascendNo = ascendNo;
  }

  public String getLinkUrlInvCompany() {
    return this.linkUrlInvCompany;
  }

  public void setLinkUrlInvCompany(String linkUrlInvCompany) {
    this.linkUrlInvCompany = linkUrlInvCompany;
  }
}
