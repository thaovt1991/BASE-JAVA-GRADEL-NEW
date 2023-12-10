package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the BOND_CALENDER database table. */
@Entity
@Table(name = "BOND_CALENDER")
@NamedQuery(name = "BondCalender.findAll", query = "SELECT b FROM BondCalender b")
public class BondCalender implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private BondCalenderPK id;

  @Column(name = "HOLIDAY_REASON")
  private String holidayReason;

  @Column(name = "SEC_CO_HOLIDAY_FLG")
  private int secCoHolidayFlg;

  public BondCalender() {}

  public BondCalenderPK getId() {
    return this.id;
  }

  public void setId(BondCalenderPK id) {
    this.id = id;
  }

  public String getHolidayReason() {
    return this.holidayReason;
  }

  public void setHolidayReason(String holidayReason) {
    this.holidayReason = holidayReason;
  }

  public int getSecCoHolidayFlg() {
    return this.secCoHolidayFlg;
  }

  public void setSecCoHolidayFlg(int secCoHolidayFlg) {
    this.secCoHolidayFlg = secCoHolidayFlg;
  }
}
