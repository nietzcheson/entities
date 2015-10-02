package com.m4c.model.entity;

import javax.persistence.Transient;
import javax.persistence.Embeddable;

import com.m4c.model.base.IDInvoiceDetailPk;

/**
 *@author	Elvira Aranda
 *@version	1.0
 */
@Embeddable
public class InvoiceDetailPk implements IDInvoiceDetailPk{
	private static final long serialVersionUID = 1L;
	private Long idReservation;
	private Long idInvoice;
	private String id;

	public Long getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(Long idInvoice) {
		this.idInvoice = idInvoice;
	}

	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	@Transient
	public String getId(){
		return "" +idReservation+ idInvoice;
	}
	public void setId(String id){
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((idInvoice == null) ? 0 : idInvoice.hashCode());
		result = PRIME * result + ((idReservation == null) ? 0 : idReservation.hashCode());
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
		final InvoiceDetailPk other = (InvoiceDetailPk) obj;
		if (idInvoice == null) {
			if (other.idInvoice != null)
				return false;
		} else if (!idInvoice.equals(other.idInvoice))
			return false;
		if (idReservation == null) {
			if (other.idReservation != null)
				return false;
		} else if (!idReservation.equals(other.idReservation))
			return false;
		return true;
	}

}
