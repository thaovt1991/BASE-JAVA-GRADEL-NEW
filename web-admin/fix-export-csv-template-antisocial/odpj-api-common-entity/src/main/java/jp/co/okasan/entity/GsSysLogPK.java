package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import org.hibernate.Hibernate;

@Embeddable
public class GsSysLogPK implements Serializable {
  private static final long serialVersionUID = 2078212583653973017L;

  @NotNull @Column(name = "GS_CATEGORY", nullable = false)
  private Integer gsCategory;

  @NotNull @Column(name = "NO", nullable = false)
  private Integer no;

  public Integer getGsCategory() {
    return gsCategory;
  }

  public void setGsCategory(Integer gsCategory) {
    this.gsCategory = gsCategory;
  }

  public Integer getNo() {
    return no;
  }

  public void setNo(Integer no) {
    this.no = no;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    GsSysLogPK entity = (GsSysLogPK) o;
    return Objects.equals(this.no, entity.no) && Objects.equals(this.gsCategory, entity.gsCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(no, gsCategory);
  }
}
