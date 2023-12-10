package jp.co.okasan.domain.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;

/**
 * The primary key class for the FUND_PRICE database table.
 * 
 */
@Embeddable
@Data
public class FundPricePKDTO implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String issueCd;

	@Temporal(TemporalType.DATE)
	private java.util.Date stdDt;

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FundPricePKDTO)) {
			return false;
		}
		FundPricePKDTO castOther = (FundPricePKDTO)other;
		return 
			this.issueCd.equals(castOther.issueCd)
			&& this.stdDt.equals(castOther.stdDt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.issueCd.hashCode();
		hash = hash * prime + this.stdDt.hashCode();
		
		return hash;
	}
}
