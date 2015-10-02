package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table(name="M4CTIPOCOMISIONOVERRIDE")
public class CommissionOverride implements IDEntity{
	private static final long serialVersionUID =1L;
	
	private Long id;
	private Integer idcatcommission;
	private String code;
	private String description;
	private Integer idposition;
	private Double comission;
	private String notes;
	private Integer currency;
	private Integer iddepto;
	private Double percent;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	
	@Column (name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="IDCATCOMISION")
	public Integer getIdcatcommission() {
		return idcatcommission;
	}
	public void setIdcatcommission(Integer idcatcommission) {
		this.idcatcommission = idcatcommission;
	}
	
	@Column (name="CODIGO")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Column (name="DESCRIPCION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column (name="IDPUESTO")
	public Integer getIdposition() {
		return idposition;
	}
	public void setIdposition(Integer idposition) {
		this.idposition = idposition;
	}
	
	@Column (name="COMISION")
	public Double getComission() {
		return comission;
	}
	public void setComission(Double comission) {
		this.comission = comission;
	}
	
	@Column (name="NOTAS")
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Column (name="MONEDA")
	public Integer getCurrency() {
		return currency;
	}
	public void setCurrency(Integer currency) {
		this.currency = currency;
	}
	
	@Column (name="IDDEPTO")
	public Integer getIddepto() {
		return iddepto;
	}
	public void setIddepto(Integer iddepto) {
		this.iddepto = iddepto;
	}
	
	@Column (name="PORCENTAJE")
	public Double getPercent() {
		return percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}

}
