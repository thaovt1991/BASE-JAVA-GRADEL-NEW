package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MUserRequestPK implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "COMPANY_CD")
  String companyCd;

  @Column(name = "ENTRY_NO")
  Integer entryNo;

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof MUserRequestPK)) {
      return false;
    }
    MUserRequestPK castOther = (MUserRequestPK) other;
    return this.companyCd.equals(castOther.companyCd) && (this.entryNo == castOther.entryNo);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.companyCd.hashCode();
    hash = hash * prime + this.entryNo;

    return hash;
  }
}
