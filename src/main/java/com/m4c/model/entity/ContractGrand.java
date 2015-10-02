package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;


@Entity
@Table(name = "M4CCONTRATOGRAND")
public class ContractGrand  implements IDEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long customer;
    private Double price;
    private Double initial;
    private Double first;
    private Double monthly;
    private Date actualDate;
    private String contract;
    
    
    @Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="IDCLIENTE")
	public Long getCustomer() {
		return customer;
	}
	public void setCustomer(Long customer) {
		this.customer = customer;
	}
	
	@Column(name="PRICE")
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Column(name="INITAMNT")
	public Double getInitial() {
		return initial;
	}
	public void setInitial(Double initial) {
		this.initial = initial;
	}
	
	@Column(name="FIRSTDUE")
	public Double getFirst() {
		return first;
	}
	public void setFirst(Double first) {
		this.first = first;
	}
	
	@Column(name="MONTHLY")
	public Double getMonthly() {
		return monthly;
	}
	public void setMonthly(Double monthly) {
		this.monthly = monthly;
	}
	
	@Column(name="FECHA")
	public Date getActualDate() {
		return actualDate;
	}
	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}
	
	@Column(name="IDCONTRATO")
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	
	

}
