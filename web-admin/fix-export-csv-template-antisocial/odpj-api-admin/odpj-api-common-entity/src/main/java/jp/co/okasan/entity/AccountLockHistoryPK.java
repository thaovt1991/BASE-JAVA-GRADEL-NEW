package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import org.hibernate.Hibernate;

@Embeddable
public class AccountLockHistoryPK implements Serializable {
  private static final long serialVersionUID = -1119607887131425327L;

  @NotNull @Column(name = "AC_LOCK_SEQ_NO", nullable = false)
  private Long acLockSeqNo;

  @NotNull @Column(name = "BRANCH_CD", nullable = false)
  private Integer branchCd;

  @NotNull @Column(name = "CUSTOMER_CD", nullable = false)
  private Integer customerCd;

  public Long getAcLockSeqNo() {
    return acLockSeqNo;
  }

  public void setAcLockSeqNo(Long acLockSeqNo) {
    this.acLockSeqNo = acLockSeqNo;
  }

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
    AccountLockHistoryPK entity = (AccountLockHistoryPK) o;
    return Objects.equals(this.acLockSeqNo, entity.acLockSeqNo)
        && Objects.equals(this.customerCd, entity.customerCd)
        && Objects.equals(this.branchCd, entity.branchCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acLockSeqNo, customerCd, branchCd);
  }
}
