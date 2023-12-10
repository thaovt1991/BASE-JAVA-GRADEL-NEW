package jp.co.okasan.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CODE_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CodeMaster implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "FIELD")
  private String field;

  @Column(name = "CODE_VALUE")
  private String codeValue;

  @Column(name = "CODE_NAME")
  private String codeName;

  @Column(name = "CREATE_DT")
  private LocalDateTime createDt;

  @Column(name = "CREATE_PRG_ID")
  private String createPrgId;

  @Column(name = "UPDATE_DT")
  private LocalDateTime updateDt;

  @Column(name = "UPDATE_PRG_ID")
  private String updatePrgId;

  @Column(name = "DELETE_FLG")
  private String deleteFlg;
}
