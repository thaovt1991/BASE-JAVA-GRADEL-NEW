package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** The primary key class for the M_MAIL_TEMPLATE database table. */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MMailTemplatePK implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Column(name = "MAIL_TEMPLATE_CLS")
  private String mailTemplateCls;

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof MMailTemplatePK)) {
      return false;
    }
    MMailTemplatePK castOther = (MMailTemplatePK) other;
    return this.companyCd.equals(castOther.companyCd)
        && (this.mailTemplateCls == castOther.mailTemplateCls);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.companyCd.hashCode();
    hash = hash * prime + this.mailTemplateCls.hashCode();

    return hash;
  }
}
