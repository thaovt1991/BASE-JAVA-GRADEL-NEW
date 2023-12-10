package jp.co.okasan.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "GS_SYS_LOG")
public class GsSysLog {
  @EmbeddedId private GsSysLogPK id;

  @Column(name = "DAY")
  private LocalDate day;

  @Size(max = 100)
  @Column(name = "FORM_ID", length = 100)
  private String formId;

  @Column(name = "BRANCH_CD")
  private Integer branchCd;

  @Column(name = "USER_CD")
  private Integer userCd;

  @Size(max = 3)
  @Column(name = "PRIV_GROUP_ID", length = 3)
  private String privGroupId;

  @Size(max = 15)
  @Column(name = "IP_ADDRESS", length = 15)
  private String ipAddress;

  @Size(max = 70)
  @Column(name = "COMPUTER_NM", length = 70)
  private String computerNm;

  @Size(max = 2000)
  @Column(name = "LOG_DATA", length = 2000)
  private String logData;

  public GsSysLogPK getId() {
    return id;
  }

  public void setId(GsSysLogPK id) {
    this.id = id;
  }

  public LocalDate getDay() {
    return day;
  }

  public void setDay(LocalDate day) {
    this.day = day;
  }

  public String getFormId() {
    return formId;
  }

  public void setFormId(String formId) {
    this.formId = formId;
  }

  public Integer getBranchCd() {
    return branchCd;
  }

  public void setBranchCd(Integer branchCd) {
    this.branchCd = branchCd;
  }

  public Integer getUserCd() {
    return userCd;
  }

  public void setUserCd(Integer userCd) {
    this.userCd = userCd;
  }

  public String getPrivGroupId() {
    return privGroupId;
  }

  public void setPrivGroupId(String privGroupId) {
    this.privGroupId = privGroupId;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getComputerNm() {
    return computerNm;
  }

  public void setComputerNm(String computerNm) {
    this.computerNm = computerNm;
  }

  public String getLogData() {
    return logData;
  }

  public void setLogData(String logData) {
    this.logData = logData;
  }
}
