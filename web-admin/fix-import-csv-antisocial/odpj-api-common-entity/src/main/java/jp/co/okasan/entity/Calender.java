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

/** The persistent class for the CALENDER database table. */
@Entity
@Table(name = "CALENDER")
@NamedQuery(name = "Calender.findAll", query = "SELECT c FROM Calender c")
public class Calender implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Temporal(TemporalType.DATE)
  @Column(name = "STD_DT")
  private Date stdDt;

  @Column(name = "BANK_HOLIDAY_FLG")
  private int bankHolidayFlg;

  @Column(name = "MONTHEND_FLG")
  private int monthendFlg;

  @Column(name = "NATIONAL_HOLIDAY_FLG")
  private int nationalHolidayFlg;

  @Column(name = "SEC_CO_HOLIDAY_FLG")
  private int secCoHolidayFlg;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  @Column(name = "WEEKEND_FLG")
  private int weekendFlg;

  public Calender() {}

  public Date getStdDt() {
    return this.stdDt;
  }

  public void setStdDt(Date stdDt) {
    this.stdDt = stdDt;
  }

  public int getBankHolidayFlg() {
    return this.bankHolidayFlg;
  }

  public void setBankHolidayFlg(int bankHolidayFlg) {
    this.bankHolidayFlg = bankHolidayFlg;
  }

  public int getMonthendFlg() {
    return this.monthendFlg;
  }

  public void setMonthendFlg(int monthendFlg) {
    this.monthendFlg = monthendFlg;
  }

  public int getNationalHolidayFlg() {
    return this.nationalHolidayFlg;
  }

  public void setNationalHolidayFlg(int nationalHolidayFlg) {
    this.nationalHolidayFlg = nationalHolidayFlg;
  }

  public int getSecCoHolidayFlg() {
    return this.secCoHolidayFlg;
  }

  public void setSecCoHolidayFlg(int secCoHolidayFlg) {
    this.secCoHolidayFlg = secCoHolidayFlg;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }

  public int getWeekendFlg() {
    return this.weekendFlg;
  }

  public void setWeekendFlg(int weekendFlg) {
    this.weekendFlg = weekendFlg;
  }
}
