package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;

/**
* @author Elvira Aranda
* @version 2.1
*/

@Entity
@Table(name="M4CPROMOCIONES")
public class Promotion implements IDEntity{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private Date initialDate;
	private Date finalDate;
	private Date date;
	
	@Id	
	@Column (name="IDPROMOCION")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="PROMOCION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column (name="INICIO")
	public Date getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	
	@Column (name="FIN")
	public Date getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	
	@Column (name="FECHA_CREACION")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
		
}
