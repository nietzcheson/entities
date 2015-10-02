package com.m4c.model.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
/**
 *@author	Elvira Aranda
 *@version	1.0
 */
@Embeddable
public class PaymentReservationPk implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long idReservation;
	private Long idPayment;
		
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public Long getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}
}