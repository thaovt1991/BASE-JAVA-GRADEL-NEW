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
import lombok.Data;

@Entity
@Data
@Table(name = "MOKUROMISYO_INFO")
@NamedQuery(name = "MokuromisyoInfo.findAll", query = "SELECT m FROM MokuromisyoInfo m")
public class MokuromisyoInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ROWID")
  private int rowId;

  @Column(name = "DISP_FLG")
  private int dispFlg;

  @Column(name = "DOCUMENT_CD")
  private String documentCd;

  @Temporal(TemporalType.DATE)
  @Column(name = "DOCUMENT_DATE")
  private Date documentDate;

  @Column(name = "DOCUMENT_FILE_NAME")
  private String documentFileName;

  @Column(name = "DOCUMENT_KBN")
  private int documentKbn;

  @Column(name = "DOCUMENT_NAME")
  private String documentName;

  @Column(name = "EDITION_CD")
  private int editionCd;

  @Column(name = "POSTING_FLG")
  private int postingFlg;

  @Column(name = "SEC_TYPE_KBN")
  private int secTypeKbn;

  @Temporal(TemporalType.DATE)
  @Column(name = "VIEW_START_TM")
  private Date viewStartTm;
}
