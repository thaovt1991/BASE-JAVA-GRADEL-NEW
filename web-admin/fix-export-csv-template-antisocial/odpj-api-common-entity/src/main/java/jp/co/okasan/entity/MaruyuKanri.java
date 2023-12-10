package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** The persistent class for the MARUYU_KANRI database table. */
@Entity
@Table(name = "MARUYU_KANRI")
@NamedQuery(name = "MaruyuKanri.findAll", query = "SELECT m FROM MaruyuKanri m")
public class MaruyuKanri implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private MaruyuKanriPK id;

  @Column(name = "PREVD_SP_MARUYU_APPLY_AMT")
  private int prevdSpMaruyuApplyAmt;

  @Column(name = "PREVD_SP_MARUYU_SURPLUS_AMT")
  private int prevdSpMaruyuSurplusAmt;

  @Column(name = "SP_MARUYU_HANDLE_KBN")
  private int spMaruyuHandleKbn;

  @Column(name = "TODAY_SP_MARUYU_APPLY_AMT")
  private int todaySpMaruyuApplyAmt;

  @Column(name = "TODAY_SP_MARUYU_SURPLUS_AMT")
  private int todaySpMaruyuSurplusAmt;

  @Temporal(TemporalType.DATE)
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  public MaruyuKanri() {}

  public MaruyuKanriPK getId() {
    return this.id;
  }

  public void setId(MaruyuKanriPK id) {
    this.id = id;
  }

  public int getPrevdSpMaruyuApplyAmt() {
    return this.prevdSpMaruyuApplyAmt;
  }

  public void setPrevdSpMaruyuApplyAmt(int prevdSpMaruyuApplyAmt) {
    this.prevdSpMaruyuApplyAmt = prevdSpMaruyuApplyAmt;
  }

  public int getPrevdSpMaruyuSurplusAmt() {
    return this.prevdSpMaruyuSurplusAmt;
  }

  public void setPrevdSpMaruyuSurplusAmt(int prevdSpMaruyuSurplusAmt) {
    this.prevdSpMaruyuSurplusAmt = prevdSpMaruyuSurplusAmt;
  }

  public int getSpMaruyuHandleKbn() {
    return this.spMaruyuHandleKbn;
  }

  public void setSpMaruyuHandleKbn(int spMaruyuHandleKbn) {
    this.spMaruyuHandleKbn = spMaruyuHandleKbn;
  }

  public int getTodaySpMaruyuApplyAmt() {
    return this.todaySpMaruyuApplyAmt;
  }

  public void setTodaySpMaruyuApplyAmt(int todaySpMaruyuApplyAmt) {
    this.todaySpMaruyuApplyAmt = todaySpMaruyuApplyAmt;
  }

  public int getTodaySpMaruyuSurplusAmt() {
    return this.todaySpMaruyuSurplusAmt;
  }

  public void setTodaySpMaruyuSurplusAmt(int todaySpMaruyuSurplusAmt) {
    this.todaySpMaruyuSurplusAmt = todaySpMaruyuSurplusAmt;
  }

  public Date getUpdateDatetime() {
    return this.updateDatetime;
  }

  public void setUpdateDatetime(Date updateDatetime) {
    this.updateDatetime = updateDatetime;
  }
}
