package jp.co.okasan.domain.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the CLIENT database table.
 * 
 */
@Data
@Embeddable
public class ClientPKDTO implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer branchCd;

	private Integer customerCd;

	private byte insiderFlg;


	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClientPKDTO)) {
			return false;
		}
		ClientPKDTO castOther = (ClientPKDTO)other;
		return 
			(this.branchCd == castOther.branchCd)
			&& (this.customerCd == castOther.customerCd)
			&& (this.insiderFlg == castOther.insiderFlg);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.branchCd;
		hash = hash * prime + this.customerCd;
		hash = hash * prime + ((int) this.insiderFlg);
		
		return hash;
	}
}
