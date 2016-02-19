package com.m4c.model.entity;

import javax.persistence.*;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/
@Entity
@Table(name="M4CDEPARTAMENTO")
public class Department implements IDEntity {
	private static final long serialVersionUID = 1L;
	public static final String TAG = Department.class.getSimpleName();
	private Long id;
	private String department;
	private String clave;
	private String contexto;
	
	@Id
	@Column (name="IDDEPTO")
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	@Column (name="DEPTO")
	public String getDepartment(){
		return department;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}

	@Column (name="CLAVEDEPTO")
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column (name="CONTEXTO")
	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}


}
