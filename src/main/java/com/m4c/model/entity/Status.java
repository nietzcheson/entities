package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;

@Entity
@Table(name="M4CCATESTADOS")
public class Status implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String status;
	private String statusEng;
	private String keyword;
	
	@Id
	@Column(name="IDESTADO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="ESTADOANIMO")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name="ESTADOANIMOENG")
	public String getStatusEng() {
		return statusEng;
	}
	public void setStatusEng(String statusEng) {
		this.statusEng = statusEng;
	}

	@Column(name="CLAVE")
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
