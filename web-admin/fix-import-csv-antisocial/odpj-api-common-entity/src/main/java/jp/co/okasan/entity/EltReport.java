package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the ELT_REPORT database table. */
@Entity
@Table(name = "ELT_REPORT")
@NamedQuery(name = "EltReport.findAll", query = "SELECT e FROM EltReport e")
public class EltReport implements Serializable {
  private static final long serialVersionUID = 1L;

  @EmbeddedId private EltReportPK id;

  @Column(name = "ELEC_DOC_FILE_TYPE_NM")
  private String elecDocFileTypeNm;

  @Column(name = "ELEC_DOC_FILEPASS")
  private String elecDocFilepass;

  @Column(name = "REPORT_DISPLAY_FLG")
  private int reportDisplayFlg;

  public EltReport() {}

  public EltReportPK getId() {
    return this.id;
  }

  public void setId(EltReportPK id) {
    this.id = id;
  }

  public String getElecDocFileTypeNm() {
    return this.elecDocFileTypeNm;
  }

  public void setElecDocFileTypeNm(String elecDocFileTypeNm) {
    this.elecDocFileTypeNm = elecDocFileTypeNm;
  }

  public String getElecDocFilepass() {
    return this.elecDocFilepass;
  }

  public void setElecDocFilepass(String elecDocFilepass) {
    this.elecDocFilepass = elecDocFilepass;
  }

  public int getReportDisplayFlg() {
    return this.reportDisplayFlg;
  }

  public void setReportDisplayFlg(int reportDisplayFlg) {
    this.reportDisplayFlg = reportDisplayFlg;
  }
}
