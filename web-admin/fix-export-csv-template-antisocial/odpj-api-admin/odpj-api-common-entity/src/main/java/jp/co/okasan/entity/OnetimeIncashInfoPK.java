package jp.co.okasan.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** The primary key class for the ONETIME_INCASH_INFO database table. */
@Embeddable
public class OnetimeIncashInfoPK implements Serializable {
  // default serial version id, required for serializable classes.
  private static final long serialVersionUID = 1L;

  @Column(name = "HD_VL")
  private int hdVl;

  @Column(name = "HD_MSAGCLASS")
  private String hdMsagclass;

  public OnetimeIncashInfoPK() {}

  public int getHdVl() {
    return this.hdVl;
  }

  public void setHdVl(int hdVl) {
    this.hdVl = hdVl;
  }

  public String getHdMsagclass() {
    return this.hdMsagclass;
  }

  public void setHdMsagclass(String hdMsagclass) {
    this.hdMsagclass = hdMsagclass;
  }

  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof OnetimeIncashInfoPK)) {
      return false;
    }
    OnetimeIncashInfoPK castOther = (OnetimeIncashInfoPK) other;
    return (this.hdVl == castOther.hdVl) && this.hdMsagclass.equals(castOther.hdMsagclass);
  }

  public int hashCode() {
    final int prime = 31;
    int hash = 17;
    hash = hash * prime + this.hdVl;
    hash = hash * prime + this.hdMsagclass.hashCode();

    return hash;
  }
}
