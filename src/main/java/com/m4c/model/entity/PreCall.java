package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;

/**
* @author Elvira Aranda
* @version 1.0
*/
@Entity
@Table(name="M4CPRECALL")
@javax.persistence.SequenceGenerator(name="SEQ_GEN", sequenceName="IDPRECALL")
public class PreCall implements IDEntity{
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date datePreCall;
	private String user;
	private String note;
	private String qualify;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	@Column(name="IDPRECALL")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="FECHA")
	public Date getDatePreCall() {
		return datePreCall;
	}
	public void setDatePreCall(Date datePreCall) {
		this.datePreCall = datePreCall;
	}
	
	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name="NOTA")
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Column(name="CALIFICA")
	public String getQualify() {
		return qualify;
	}
	public void setQualify(String qualify) {
		this.qualify = qualify;
	}
	

}
