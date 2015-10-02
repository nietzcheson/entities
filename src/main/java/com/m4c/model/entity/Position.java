package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table(name="M4CPUESTOS")
public class Position implements IDEntity{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer iddepartment;
	private String position;
	private String code;
	
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column (name="IDPUESTO")
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
	
	@Column (name="PUESTO")
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Column (name="CODIGO")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
