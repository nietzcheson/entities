package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;

@Entity
@Table(name="M4CPROMOCION")
public class Promocion implements IDEntity {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String promocion;
	private Long descuento;
	private Integer hooked;
	private Integer hookbr;
	private Integer hookbc;
	
	@Id	
	@Column (name="IDPROMOCION")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="PROMOCION")
	public String getPromocion() {
		return promocion;
	}
	public void setPromocion(String promocion) {
		this.promocion = promocion;
	}
	
	@Column (name="DESCUENTO")
	public Long getDescuento() {
		return descuento;
	}
	public void setDescuento(Long descuento) {
		this.descuento = descuento;
	}
	
	@Column (name="HOOKED")
	public Integer getHooked() {
		return hooked;
	}
	public void setHooked(Integer hooked) {
		this.hooked = hooked;
	}
	
	@Column (name="HOOKBR")
	public Integer getHookbr() {
		return hookbr;
	}
	public void setHookbr(Integer hookbr) {
		this.hookbr = hookbr;
	}
	
	@Column (name="HOOKBC")
	public Integer getHookbc() {
		return hookbc;
	}
	public void setHookbc(Integer hookbc) {
		this.hookbc = hookbc;
	}

}
