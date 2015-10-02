package com.m4c.model.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 *@author	Elvira Aranda
 *@version	1.0
 */
@Embeddable
public class PaymentPk implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long idBooking;
	private Long idPayment;

	public PaymentPk(Long idBooking, Long idPayment) {
		this.idBooking = idBooking;
		this.idPayment = idPayment;
	}

	public PaymentPk() {
	}

	public Long getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(Long idBooking) {
		this.idBooking = idBooking;
	}
	public Long getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}
}