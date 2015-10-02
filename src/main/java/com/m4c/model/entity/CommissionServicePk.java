package com.m4c.model.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 *@author	Jose Antonio Arroniz
 *@version	1.0
 */


@Embeddable
public class CommissionServicePk implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Long idService;
	private Long booking;
	
	public Long getIdService() {
		return idService;
	}
	
	public void setIdService(Long idService) {
		this.idService = idService;
	}
	
	public Long getBooking() {
		return booking;
	}
	
	public void setBooking(Long booking) {
		this.booking = booking;
	}
	
	

}
