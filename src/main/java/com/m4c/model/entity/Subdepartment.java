package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/
@Entity
@Table(name="M4CSUBDEPARTAMENTO")
public class Subdepartment implements IDEntity{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer iddepartment;
	private String subdepartment;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column (name="IDSUBDEPTO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="IDDEPTO")
	public Integer getIddepartment() {
		return iddepartment;
	}
	public void setIddepartment(Integer iddepartment) {
		this.iddepartment = iddepartment;
	}
	
	@Column (name="SUBDEPTO")
	public String getSubdepartment() {
		return subdepartment;
	}
	public void setSubdepartment(String subdepartment) {
		this.subdepartment = subdepartment;
	}
	
	

}
