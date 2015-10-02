package com.m4c.model.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *@author	Elvira Aranda
 *@version	1.0
 */

@Embeddable
public class PaxPk implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long reservation;
	private Long idPax;

	public Long getIdPax() {
		return idPax;
	}

	public void setIdPax(Long idPax) {
		this.idPax = idPax;
	}

	public Long getReservation() {
		return reservation;
	}
	public void setReservation(Long reservation) {
		this.reservation = reservation;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((idPax == null) ? 0 : idPax.hashCode());
		result = PRIME * result + ((reservation == null) ? 0 : reservation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final PaxPk other = (PaxPk) obj;
		if (idPax == null) {
			if (other.idPax != null)
				return false;
		} else if (!idPax.equals(other.idPax))
			return false;
		if (reservation == null) {
			if (other.reservation != null)
				return false;
		} else if (!reservation.equals(other.reservation))
			return false;
		return true;
	}

}
