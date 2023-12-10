package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ROLE_INFO")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleInfo implements Serializable {

  @Id
  @Column(name = "ROLE_CD", nullable = false)
  private Integer id;

  @Column(name = "ROLE_NM", length = 30)
  private String roleNm;

  @Column(name = "ROLE_SHORT_NM", length = 15)
  private String roleShortNm;

  @Column(name = "TRADER_FLG")
  private Integer traderFlg;

  @Column(name = "REF_AUTH")
  private Integer refAuth;

  @Column(name = "UPDATE_AUTH")
  private Integer updateAuth;

  @Column(name = "DS_INVALID_FLG")
  private Integer dsInvalidFlg;
}
