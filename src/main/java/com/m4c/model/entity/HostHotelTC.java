package com.m4c.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="HOSTHOTELTC")
public class HostHotelTC implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long hotel;
	private String host;

	@Id
	@Column (name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Column (name="HOST")
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}

	
	@Column (name="IDHOTEL")
	public Long getHotel() {
		return hotel;
	}
	public void setHotel(Long hotel) {
		this.hotel = hotel;
	}



	
}
