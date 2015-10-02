package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;

/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CCATSTATUS")
public class ReservationStatus implements IDEntity{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String status;
	private Long tipo;
	private Boolean isActive;

	@Id
	@Column(name="IDSTATUS")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="STATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name="TIPO")
	public Long getTipo() {
		return tipo;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	@Column(name="ACTIVO")
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
