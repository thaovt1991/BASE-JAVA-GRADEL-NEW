package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/** The persistent class for the BOND_RATING database table. */
@Entity
@Table(name = "BOND_RATING")
@NamedQuery(name = "BondRating.findAll", query = "SELECT b FROM BondRating b")
public class BondRating implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ISSUE_CD")
  private String issueCd;

  @Column(name = "COMMENT_MEMO")
  private String commentMemo;

  @Column(name = "ISSUE_SEC")
  private String issueSec;

  @Column(name = "RATE_BOND_F")
  private String rateBondF;

  @Column(name = "RATE_BOND_J")
  private String rateBondJ;

  @Column(name = "RATE_BOND_M")
  private String rateBondM;

  @Column(name = "RATE_BOND_NOTES")
  private String rateBondNotes;

  @Column(name = "RATE_BOND_R")
  private String rateBondR;

  @Column(name = "RATE_BOND_S")
  private String rateBondS;

  public BondRating() {}

  public String getIssueCd() {
    return this.issueCd;
  }

  public void setIssueCd(String issueCd) {
    this.issueCd = issueCd;
  }

  public String getCommentMemo() {
    return this.commentMemo;
  }

  public void setCommentMemo(String commentMemo) {
    this.commentMemo = commentMemo;
  }

  public String getIssueSec() {
    return this.issueSec;
  }

  public void setIssueSec(String issueSec) {
    this.issueSec = issueSec;
  }

  public String getRateBondF() {
    return this.rateBondF;
  }

  public void setRateBondF(String rateBondF) {
    this.rateBondF = rateBondF;
  }

  public String getRateBondJ() {
    return this.rateBondJ;
  }

  public void setRateBondJ(String rateBondJ) {
    this.rateBondJ = rateBondJ;
  }

  public String getRateBondM() {
    return this.rateBondM;
  }

  public void setRateBondM(String rateBondM) {
    this.rateBondM = rateBondM;
  }

  public String getRateBondNotes() {
    return this.rateBondNotes;
  }

  public void setRateBondNotes(String rateBondNotes) {
    this.rateBondNotes = rateBondNotes;
  }

  public String getRateBondR() {
    return this.rateBondR;
  }

  public void setRateBondR(String rateBondR) {
    this.rateBondR = rateBondR;
  }

  public String getRateBondS() {
    return this.rateBondS;
  }

  public void setRateBondS(String rateBondS) {
    this.rateBondS = rateBondS;
  }
}
