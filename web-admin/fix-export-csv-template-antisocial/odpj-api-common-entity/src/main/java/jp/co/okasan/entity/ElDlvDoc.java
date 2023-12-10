package jp.co.okasan.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity(name = "EL_DLV_DOC")
@Data
public class ElDlvDoc implements Serializable {

  /** 書面コード */
  @Id
  @Column(name = "DOCUMENT_CD")
  private String documentCd;

  /** 電子書面ファイル名称 */
  @Column(name = "ELEC_DOC_FILE_TYPE_NM")
  private String elecDocFileTypeNm;

  /** 電子書面ファイル保存パス */
  @Column(name = "ELEC_DOC_FILEPASS")
  private String elecDocFilepass;

  /** 日付設定フラグ */
  @Column(name = "DATE_SETTING_FLG")
  private String dateSettingFlg;

  /** 有効フラグ */
  @Column(name = "EXPIRE_FLG")
  private Integer expireFlg;

  /** 作成日時 */
  @Column(name = "INPUT_TM")
  private Date inputTm;

  /** 作成者プログラムID */
  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  /** 更新日時 */
  @Column(name = "UPDATE_DATETIME")
  private Date updateDatetime;

  /** 更新者プログラムID */
  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;
}
