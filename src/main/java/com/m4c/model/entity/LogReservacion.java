package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "M4CLOGSRVAS")
public class LogReservacion {

	private Integer reservationID;
	private String userID;
	private Date createDate;
	private String activity;
	private String detail;
	
	@Column(name="IDRESERVACION")
	public Integer getReservationID() {
		return reservationID;
	}
	public void setReservationID(Integer reservationID) {
		this.reservationID = reservationID;
	}
	
	@Column(name="IDUSER")
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	@Column(name="FECHA")
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Column(name="ACTIVIDAD")
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	@Column(name="DETALLE")
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}	
	
}
