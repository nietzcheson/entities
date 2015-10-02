package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;

@Entity
@Table(name="M4CCATTIPONOTAS")
public class NoteType implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String type;
	private Long depto;
	private String typeEng;
	
	@Id
	@Column(name="IDTIPONOTA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="TIPONOTA")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="DEPTO")
	public Long getDepto() {
		return depto;
	}
	public void setDepto(Long depto) {
		this.depto = depto;
	}
	
	@Column(name="TIPONOTAENG")
	public String getTypeEng() {
		return typeEng;
	}
	public void setTypeEng(String typeEng) {
		this.typeEng = typeEng;
	}	
}
