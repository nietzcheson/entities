package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;


@Entity
@Table(name = "M4CBANCOS")
public class Bank implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double exchangeRate;
	private Boolean active;


	@Id
	@Column(name = "IDBANCO")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="BANCO")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="DTIPOCAMBIO")
	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@Column(name="ACTIVO")
	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
