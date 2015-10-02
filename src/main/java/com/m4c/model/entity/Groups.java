package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table(name="M4CGRUPOS")
public class Groups implements IDEntity{
	private static final long serialVersionUID =1L;
	
	private Long id;
	private Integer iddepartment;
	private String group;
	private String description;
	private Integer idsubdepartment;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	
	@Column (name="IDGRUPO")
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
	
	@Column (name="GRUPO")
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	@Column (name="DESCRIPCION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column (name="IDSUBDEPTO")
	public Integer getIdsubdepartment() {
		return idsubdepartment;
	}
	public void setIdsubdepartment(Integer idsubdepartment) {
		this.idsubdepartment = idsubdepartment;
	}
	
	
}
