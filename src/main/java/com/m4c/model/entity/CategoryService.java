package com.m4c.model.entity;

import javax.persistence.*;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table (name="M4CCATEGORIASERVICIOS")
public class CategoryService implements IDEntity {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String service;
	
	
	@Id
	@Column (name="IDCATSERVICIO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="CATSERVICIO")
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
}
