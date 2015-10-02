package com.m4c.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;


@Entity
@Table(name = "SEGUIMIENTO_SOCIOS")
@javax.persistence.SequenceGenerator(name="SEQ_GENFOLLOWUP", sequenceName="IDSEGUIMIENTO")
public class MemberFollowup implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String comments;
	private Date date;
	private Long contract;
	private String user;
	private String type;
	private Long alert;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GENFOLLOWUP")	    
	@Column(name="IDSEGUIMIENTO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="COMENTARIOS")
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Column(name="COMENTARIOS")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	@Column(name="IDCONTRATO")
	public Long getContract() {
		return contract;
	}
	
	public void setContract(Long contract) {
		this.contract = contract;
	}	
	
	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name="TIPO")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Column(name="IDALERTA")
	public Long getAlert() {
		return alert;
	}
	public void setAlert(Long alert) {
		this.alert = alert;
	}
	
	
}
