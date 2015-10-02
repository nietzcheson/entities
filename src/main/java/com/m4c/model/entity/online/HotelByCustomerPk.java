package com.m4c.model.entity.online;

import java.io.Serializable;

public class HotelByCustomerPk implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long idCustomer;
	private Long idHotel;
	
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	
	
	
	
	
}
