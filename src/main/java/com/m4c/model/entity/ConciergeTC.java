package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;

@Entity
@Table(name = "M4CCONCIERGETC")
public class ConciergeTC implements IDEntity {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String status;
	
	@Id	
	@Column(name="IDVENDEDOR")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="NOMBREVENDEDOR")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="ESTATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
		
}
