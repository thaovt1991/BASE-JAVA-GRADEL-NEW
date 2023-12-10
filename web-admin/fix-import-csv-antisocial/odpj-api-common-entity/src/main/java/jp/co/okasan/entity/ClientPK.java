package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

/** The primary key class for the CLIENT database table. */
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class ClientPK implements Serializable {
  private static final long serialVersionUID = -3579346175408677049L;

  @NotNull @Column(name = "BRANCH_CD", nullable = false)
  private String branchCd;

  @NotNull @Column(name = "CUSTOMER_CD", nullable = false)
  private Integer customerCd;

  @NotNull @Column(name = "INSIDER_FLG", nullable = false)
  private String insiderFlg;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    ClientPK entity = (ClientPK) o;
    return Objects.equals(this.customerCd, entity.customerCd)
        && Objects.equals(this.insiderFlg, entity.insiderFlg)
        && Objects.equals(this.branchCd, entity.branchCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCd, insiderFlg, branchCd);
  }
}
