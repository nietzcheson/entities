package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;

@Entity
@Table(name = "M4CCONCIERGE")
public class Concierge implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Integer code;
	private Boolean active;
	private String phone;
	
	@Id	
	@Column(name="IDCONCIERGE")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="NOMBRE")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="CLAVE")
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	@Column(name="ACTIVO")
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	@Column(name="TELEFONO")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
