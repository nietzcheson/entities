package com.m4c.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SHARE_AGENTES")
public class AgentsShare implements Serializable {

	private static final long serialVersionUID = 1L;
	  
	private String iduser;
	private String username;
	
	
	@Id
	@Column (name="IDUSER")
	public String getIduser() {
		return iduser;
	}
	public void setIduser(String iduser) {
		this.iduser = iduser;
	}
	
	@Column (name="NOMBRE")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
