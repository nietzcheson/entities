package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table(name="M4CCATCOMISION")
public class CategoryCommission implements IDEntity{
	private static final long serialVersionUID =1L;
	
	private Long id;
	private Integer iddepto;
	private String category;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	
	@Column (name="IDCATCOMISION")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="IDDEPTO")
	public Integer getIddepto() {
		return iddepto;
	}
	public void setIddepto(Integer iddepto) {
		this.iddepto = iddepto;
	}
	
	@Column (name="CATEGORIA")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
