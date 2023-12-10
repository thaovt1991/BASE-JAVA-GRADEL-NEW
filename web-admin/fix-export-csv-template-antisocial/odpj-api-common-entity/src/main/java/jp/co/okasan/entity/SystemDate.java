package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The persistent class for the SYSTEM_DATE database table. */
@Entity
@Table(name = "SYSTEM_DATE")
@NamedQuery(name = "SystemDate.findAll", query = "SELECT s FROM SystemDate s")
public class SystemDate implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Temporal(TemporalType.DATE)
  @Column(name = "NEXT_BUSS_DT")
  private Date nextBussDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "PREV_BUSS_DT")
  private Date prevBussDt;

  @Temporal(TemporalType.DATE)
  @Column(name = "SYS_DT")
  private Date sysDt;

  public SystemDate() {}

  public Date getNextBussDt() {
    return this.nextBussDt;
  }

  public void setNextBussDt(Date nextBussDt) {
    this.nextBussDt = nextBussDt;
  }

  public Date getPrevBussDt() {
    return this.prevBussDt;
  }

  public void setPrevBussDt(Date prevBussDt) {
    this.prevBussDt = prevBussDt;
  }

  public Date getSysDt() {
    return this.sysDt;
  }

  public void setSysDt(Date sysDt) {
    this.sysDt = sysDt;
  }
}
