package com.arca.mongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Dto che rappresenta la tabella DB2 AVT005TB
 * 
 * @author Giuseppe Giordano - Addavalue
 */
@Document(collection = "avt005tb")
public class Avt005Tb {

	@Id
	private Long id;

	private Integer codsoc;

	private String codpgm;

	private Date datScar1;

	private Date datScar2;

	private String userOper;

	private Date datOper;

	@Override
	public String toString() {
		return "Avt005Tb [codSoc=" + codsoc + ", codPgm=" + codpgm
				+ ", datScar1=" + datScar1 + ", datScar2=" + datScar2
				+ ", userOper=" + userOper + ", datOper=" + datOper + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codpgm == null) ? 0 : codpgm.hashCode());
		result = prime * result + ((codsoc == null) ? 0 : codsoc.hashCode());
		result = prime * result + ((datOper == null) ? 0 : datOper.hashCode());
		result = prime * result
				+ ((datScar1 == null) ? 0 : datScar1.hashCode());
		result = prime * result
				+ ((datScar2 == null) ? 0 : datScar2.hashCode());
		result = prime * result
				+ ((userOper == null) ? 0 : userOper.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Avt005Tb other = (Avt005Tb) obj;
		if (codpgm == null) {
			if (other.codpgm != null) {
				return false;
			}
		} else {
			if (!codpgm.equals(other.codpgm)) {
				return false;
			}
		}
		if (codsoc == null) {
			if (other.codsoc != null) {
				return false;
			}
		} else {
			if (!codsoc.equals(other.codsoc)) {
				return false;
			}
		}
		if (datOper == null) {
			if (other.datOper != null) {
				return false;
			}
		} else {
			if (!datOper.equals(other.datOper)) {
				return false;
			}
		}
		if (datScar1 == null) {
			if (other.datScar1 != null) {
				return false;
			}
		} else {
			if (!datScar1.equals(other.datScar1)) {
				return false;
			}
		}
		if (datScar2 == null) {
			if (other.datScar2 != null) {
				return false;
			}
		} else {
			if (!datScar2.equals(other.datScar2)) {
				return false;
			}
		}
		if (userOper == null) {
			if (other.userOper != null) {
				return false;
			}
		} else {
			if (!userOper.equals(other.userOper)) {
				return false;
			}
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodpgm() {
		return codpgm;
	}

	public void setCodpgm(String codpgm) {
		this.codpgm = codpgm;
	}

	public Integer getCodsoc() {
		return codsoc;
	}

	public void setCodsoc(Integer codsoc) {
		this.codsoc = codsoc;
	}

	public String getCodPgm() {
		return codpgm;
	}

	public void setCodPgm(String codPgm) {
		this.codpgm = codPgm;
	}

	public Date getDatScar1() {
		return datScar1;
	}

	public void setDatScar1(Date datScar1) {
		this.datScar1 = datScar1;
	}

	public Date getDatScar2() {
		return datScar2;
	}

	public void setDatScar2(Date datScar2) {
		this.datScar2 = datScar2;
	}

	public String getUserOper() {
		return userOper;
	}

	public void setUserOper(String userOper) {
		this.userOper = userOper;
	}

	public Date getDatOper() {
		return datOper;
	}

	public void setDatOper(Date datOper) {
		this.datOper = datOper;
	}

}
