package com.m4c.model.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;

@Entity
@Table(name = "M4CPOLIZA_CLIENTE")
@javax.persistence.SequenceGenerator(name="SEQ_GENPOLICY", sequenceName="IDPOLIZA")
public class TravelInsurance implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Customer customer;
	private String number;
	private Date date;
	private String user;
	private Date expiry;
	private Double cost;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GENPOLICY")	    
	@Column(name="IDPOLIZA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="USUARIO")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
	@Column(name="FECHACOMPRA")
	public Date getDate() {		
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}	
	
	@ManyToOne()
    @JoinColumn(name = "IDCLIENTE")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	@Column(name="NUMEROPOLIZA")
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Column(name="VIGENCIA")
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	@Column(name="COSTO")
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
		

}
