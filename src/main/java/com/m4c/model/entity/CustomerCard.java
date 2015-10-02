package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
 * Datos de tarjeta de credito que envia summerbay para hacer el cobro por el consultor M4SG
 * @author Elvira Aranda
 *
 */
@Entity
@Table(name = "M4CDATOS_CLIENTE")
public class CustomerCard implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Customer customer;
	private String card;
	private String name;
	private String expiry;
	private Double total;
	private String type;
	private String securityCode;
	private Date date;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")    
	@Column(name="IDDATO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="IDCLIENTE")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	@Column(name="DATO1")
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	
	@Column(name="NOMBRE")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Column(name="DATO2")
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	
	@Column(name="TOTAL")
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	@Column(name="DATO3")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name="DATO4")
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	@Column(name="FECHA")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
