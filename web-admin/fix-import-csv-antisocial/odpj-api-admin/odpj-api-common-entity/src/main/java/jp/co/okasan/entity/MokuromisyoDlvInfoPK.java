package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the MOKUROMISYO_DLV_INFO database table. */
@Embeddable
public class MokuromisyoDlvInfoPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "DOCUMENT_CD")
  private String documentCd;

  @Column(name = "EDITION_CD")
  private int editionCd;

  @Column(name = "BRANCH_CD")
  private int branchCd;

  @Column(name = "CUSTOMER_CD")
  private int customerCd;

  public MokuromisyoDlvInfoPK() {}

  public String getDocumentCd() {
    return this.documentCd;
  }

  public void setDocumentCd(String documentCd) {
    this.documentCd = documentCd;
  }

  public int getEditionCd() {
    return this.editionCd;
  }

  public void setEditionCd(int editionCd) {
    this.editionCd = editionCd;
  }

  public int getBranchCd() {
    return this.branchCd;
  }

  public void setBranchCd(int branchCd) {
    this.branchCd = branchCd;
  }

  public int getCustomerCd() {
    return this.customerCd;
  }

  public void setCustomerCd(int customerCd) {
    this.customerCd = customerCd;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof MokuromisyoDlvInfoPK)) {
      return false;
    }
    MokuromisyoDlvInfoPK castOther = (MokuromisyoDlvInfoPK) other;
    return this.documentCd.equals(castOther.documentCd)
        && (this.editionCd == castOther.editionCd)
        && (this.branchCd == castOther.branchCd)
        && (this.customerCd == castOther.customerCd);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.documentCd.hashCode();
    hash = hash * prime + this.editionCd;
    hash = hash * prime + this.branchCd;
    hash = hash * prime + this.customerCd;

    return hash;
  }
}
