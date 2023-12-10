package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the FUND_CALENDER database table. */
@Entity
@Table(name = "FUND_CALENDER")
@NamedQuery(name = "FundCalender.findAll", query = "SELECT f FROM FundCalender f")
public class FundCalender implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private FundCalenderPK id;

  @Column(name = "SEC_CO_HOLIDAY_FLG")
  private int secCoHolidayFlg;

  public FundCalender() {}

  public FundCalenderPK getId() {
    return this.id;
  }

  public void setId(FundCalenderPK id) {
    this.id = id;
  }

  public int getSecCoHolidayFlg() {
    return this.secCoHolidayFlg;
  }

  public void setSecCoHolidayFlg(int secCoHolidayFlg) {
    this.secCoHolidayFlg = secCoHolidayFlg;
  }
}
