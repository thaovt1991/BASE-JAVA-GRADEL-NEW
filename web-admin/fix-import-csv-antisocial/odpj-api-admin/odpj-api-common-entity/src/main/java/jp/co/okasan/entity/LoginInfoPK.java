package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the LOGIN_INFO database table. */
@Embeddable
public class LoginInfoPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "LOGIN_ID")
  private String loginId;

  @Column(name = "LOGIN_PASSWD")
  private String loginPasswd;

  public LoginInfoPK() {}

  public String getLoginId() {
    return this.loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public String getLoginPasswd() {
    return this.loginPasswd;
  }

  public void setLoginPasswd(String loginPasswd) {
    this.loginPasswd = loginPasswd;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof LoginInfoPK)) {
      return false;
    }
    LoginInfoPK castOther = (LoginInfoPK) other;
    return this.loginId.equals(castOther.loginId) && this.loginPasswd.equals(castOther.loginPasswd);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.loginId.hashCode();
    hash = hash * prime + this.loginPasswd.hashCode();

    return hash;
  }
}
