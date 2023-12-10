package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** The primary key class for the USER_INFO database table. */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "USER_CD")
  private Integer userCd;

  @Column(name = "CORP_CD")
  private String corpCd;
}
