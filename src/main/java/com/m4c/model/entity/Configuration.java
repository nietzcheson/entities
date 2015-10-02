package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table (name="M4CCONFIGURACION")
public class Configuration implements IDEntity{
	private static final long serialVersionUID = 1L;
	
	private Double pashosp;
	private Double tc;
	private Double commissionmin;
	private Double comprecallun5;
	private Double comvercallo;
	private Double comprecallup5;
	private Double tcintern;
	private Double tcbank;
	private Date datefin;
	private Date dateini;
	private String pathpl;
	private String pathlc;
	private Double tcshare;
	private Long id;
	
		
	@Column (name="PASHOSP")
	public Double getPashosp() {
		return pashosp;
	}
	public void setPashosp(Double pashosp) {
		this.pashosp = pashosp;
	}
	
	@Column (name="TIPOCAMBIO")
	public Double getTc() {
		return tc;
	}
	public void setTc(Double tc) {
		this.tc = tc;
	}
	
	@Column (name="COMISIONMIN")
	public Double getCommissionmin() {
		return commissionmin;
	}
	public void setCommissionmin(Double commissionmin) {
		this.commissionmin = commissionmin;
	}
	
	@Column (name="COMPRECALLUN5")
	public Double getComprecallun5() {
		return comprecallun5;
	}
	public void setComprecallun5(Double comprecallun5) {
		this.comprecallun5 = comprecallun5;
	}
	
	@Column (name="COMVERCALLO")
	public Double getComvercallo() {
		return comvercallo;
	}
	public void setComvercallo(Double comvercallo) {
		this.comvercallo = comvercallo;
	}
	
	@Column (name="COMPRECALLUP5")
	public Double getComprecallup5() {
		return comprecallup5;
	}
	public void setComprecallup5(Double comprecallup5) {
		this.comprecallup5 = comprecallup5;
	}
	
	@Column (name="TIPOCAMBIOINTERNO")
	public Double getTcintern() {
		return tcintern;
	}
	public void setTcintern(Double tcintern) {
		this.tcintern = tcintern;
	}
	
	@Column (name="TIPOCAMBIOBANCARIO")
	public Double getTcbank() {
		return tcbank;
	}
	public void setTcbank(Double tcbank) {
		this.tcbank = tcbank;
	}
	
	@Column (name="FECHACORTE")
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	
	@Column (name="FECHAINICIAL")
	public Date getDateini() {
		return dateini;
	}
	public void setDateini(Date dateini) {
		this.dateini = dateini;
	}
	
	@Column (name="PATHPL")
	public String getPathpl() {
		return pathpl;
	}
	public void setPathpl(String pathpl) {
		this.pathpl = pathpl;
	}
	
	@Column (name="PATHLC")
	public String getPathlc() {
		return pathlc;
	}
	public void setPathlc(String pathlc) {
		this.pathlc = pathlc;
	}
	
	@Column (name="TCSHARE")
	public Double getTcshare() {
		return tcshare;
	}
	public void setTcshare(Double tcshare) {
		this.tcshare = tcshare;
	}
	
	@Id
	@Column (name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}
