package com.m4c.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CRACKRATES")
public class RackRate implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Hotel hotel;
	private String unit;
	private Date activation;
	private Date expiry;
	private Double children;
	private Double teens;
	private Double simple;
	private Double doble;
	private Double triple;
	private Double extra;
	
	
	@Id
	@Column (name="IDTARIFA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@ManyToOne
	@JoinColumn(name="IDHOTEL")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	

	
	@Column (name="IDUNIDAD")
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	@Column (name="ACTIVACION")
	public Date getActivation() {
		return activation;
	}
	public void setActivation(Date activation) {
		this.activation = activation;
	}
	
	@Column (name="CADUCIDAD")
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	@Column (name="NIÑO")
	public Double getChildren() {
		return children;
	}
	public void setChildren(Double children) {
		this.children = children;
	}
	
	@Column (name="JUNIOR")
	public Double getTeens() {
		return teens;
	}
	public void setTeens(Double teens) {
		this.teens = teens;
	}
	
	@Column (name="SIMPLE")
	public Double getSimple() {
		return simple;
	}
	public void setSimple(Double simple) {
		this.simple = simple;
	}
	
	@Column (name="DOBLE")
	public Double getDoble() {
		return doble;
	}
	public void setDoble(Double doble) {
		this.doble = doble;
	}
	
	@Column (name="TRIPLE")
	public Double getTriple() {
		return triple;
	}
	public void setTriple(Double triple) {
		this.triple = triple;
	}
	
	@Column (name="EXTRA")
	public Double getExtra() {
		return extra;
	}
	public void setExtra(Double extra) {
		this.extra = extra;
	}
	
}
