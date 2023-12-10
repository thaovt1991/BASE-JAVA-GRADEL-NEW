package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/** The persistent class for the CORPORATE_INFO database table. */
@Entity
@Table(name = "CORPORATE_INFO")
@Data
@NamedQuery(name = "CorporateInfo.findAll", query = "SELECT c FROM CorporateInfo c")
public class CorporateInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "COMPANY_CD")
  private String companyCd;

  @Column(name = "BANK_CD")
  private int bankCd;

  @Column(name = "PARTICIPANT_CD")
  private String participantCd;

  @Column(name = "PARTICIPANT_CD_HOFURI")
  private String participantCdHofuri;

  @Column(name = "PARTICIPANT_NM")
  private String participantNm;

  @Column(name = "REP_ACC_KBN")
  private int repAccKbn;

  @Column(name = "SEC_CO_ADDRESS1")
  private String secCoAddress1;

  @Column(name = "SEC_CO_ADDRESS2")
  private String secCoAddress2;

  @Column(name = "SEC_CO_ADDRESS3")
  private String secCoAddress3;

  @Column(name = "SEC_CO_ADDRESS4")
  private String secCoAddress4;

  @Column(name = "SEC_CO_E_NM")
  private String secCoENm;

  @Column(name = "SEC_CO_E_SHORT_NM")
  private String secCoEShortNm;

  @Column(name = "SEC_CO_KANA_NM")
  private String secCoKanaNm;

  @Column(name = "SEC_CO_NM")
  private String secCoNm;

  @Column(name = "SEC_CO_SHORT_NM")
  private String secCoShortNm;

  @Column(name = "SEC_CO_ZIP_CD")
  private String secCoZipCd;

  @Column(name = "SP_STHOLD_REPORT_ENTRST_FLG")
  private int spStholdReportEntrstFlg;

  @Column(name = "STOCK_JASDEC_ACCT_TYP")
  private int stockJasdecAcctTyp;

  @Column(name = "SUBSCRIBER_ADDRESS")
  private String subscriberAddress;

  @Column(name = "SUBSCRIBER_NM_KANA")
  private String subscriberNmKana;

  @Column(name = "UMI_KBN")
  private int umiKbn;
}
