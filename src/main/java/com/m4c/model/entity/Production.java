package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "VIEWRESERVACONCONTRATO")
public class Production {

	private Long reservationId;
	
	@Id
	@Column(name="IDRESERVACION")
	public Long getReservationId() {
		return reservationId;
	}
	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
	
}
