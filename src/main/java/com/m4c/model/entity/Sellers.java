package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CVENDEDORES")
public class Sellers implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String user;
	private String sellerType;
	private Long idCallCenter;
	private Boolean isActive;

	@Id
	@Column(name="IDVENDEDOR")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Column(name="VENDEDOR")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name="TIPO")
	public String getSellerType() {
		return sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}
	
	@Column(name="IDCALLCENTER")
	public Long getIdCallCenter() {
		return idCallCenter;
	}
	public void setIdCallCenter(Long idCallCenter) {
		this.idCallCenter = idCallCenter;
	}
    @Column(name="ACTIVO")
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}