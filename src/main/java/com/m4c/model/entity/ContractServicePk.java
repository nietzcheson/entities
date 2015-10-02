package com.m4c.model.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 *@author	Elvira Aranda
 *@version	1.0
 */
@Embeddable
public class ContractServicePk implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long idService;
	private Long idBooking;
	
	
	public Long getIdService() {
		return idService;
	}
	public void setIdService(Long idService) {
		this.idService = idService;
	}
	
	public Long getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(Long idBooking) {
		this.idBooking = idBooking;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((idService == null) ? 0 : idService.hashCode());
		result = PRIME * result + ((idBooking == null) ? 0 : idBooking.hashCode());
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
		final ContractServicePk other = (ContractServicePk) obj;
		if (idService == null) {
			if (other.idService != null)
				return false;
		} else if (!idService.equals(other.idService))
			return false;
		if (idBooking == null) {
			if (other.idBooking != null)
				return false;
		} else if (!idBooking.equals(other.idBooking))
			return false;
		return true;
	}

}
