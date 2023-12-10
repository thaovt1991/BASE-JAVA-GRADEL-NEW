package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import org.hibernate.Hibernate;

@Embeddable
public class AccountLockPK implements Serializable {
  private static final long serialVersionUID = 1156820568164864009L;

  @NotNull @Column(name = "BRANCH_CD", nullable = false)
  private Integer branchCd;

  @NotNull @Column(name = "CUSTOMER_CD", nullable = false)
  private Integer customerCd;

  public Integer getBranchCd() {
    return branchCd;
  }

  public void setBranchCd(Integer branchCd) {
    this.branchCd = branchCd;
  }

  public Integer getCustomerCd() {
    return customerCd;
  }

  public void setCustomerCd(Integer customerCd) {
    this.customerCd = customerCd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    AccountLockPK entity = (AccountLockPK) o;
    return Objects.equals(this.customerCd, entity.customerCd)
        && Objects.equals(this.branchCd, entity.branchCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCd, branchCd);
  }
}
