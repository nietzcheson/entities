package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CSERVICIOS")
public class Service {

	private Long id;
	private String name;
	
	@Id
	@Column(name="IDSERVICIO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="SERVICIO")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		
}