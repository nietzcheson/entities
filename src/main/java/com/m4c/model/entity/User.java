package com.m4c.model.entity;

import org.hibernate.annotations.Formula;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="M4CUSUARIOS")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String extension;
	private String group;
	private String role;
	private Integer active;
	private Integer iddepartment;
	private Integer idposition;
	private String idsupervisor;
	private Long idteam;
	private Date dateini;
	private String name;
	private String email;
	private String access;

	@Id
	@Column (name="IDUSER")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id=id;
	}
	@Column (name="ACCESO")
	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}


	@Column (name="EXTENSION")
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}


	@Column (name="GRUPO")
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Column (name="PUESTO")
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column (name="ACTIVO")
	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
	
	@Column(name="IDDEPTO")
	  public Integer getIddepartment() {
	    return this.iddepartment;
	  }

	  public void setIddepartment(Integer iddepartment) {
	    this.iddepartment = iddepartment;
	  }

	  @Column(name="IDPUESTO")
	  public Integer getIdposition() {
	    return this.idposition;
	  }

	  public void setIdposition(Integer idposition) {
	    this.idposition = idposition;
	  }

	  @Column(name="SUPERVISOR")
	  public String getIdsupervisor() {
	    return this.idsupervisor;
	  }

	  public void setIdsupervisor(String idsupervisor) {
	    this.idsupervisor = idsupervisor;
	  }

	  @Column(name="IDEQUIPO")
	  public Long getIdteam() {
	    return this.idteam;
	  }
	  public void setIdteam(Long idteam) {
	    this.idteam = idteam;
	  }

	  @Column(name="FECHAINICIO")
	  public Date getDateini() {
	    return this.dateini;
	  }

	  public void setDateini(Date dateini) {
	    this.dateini = dateini;
	  }

	@Formula("(select uwer.NOMBRE from USUARIO@INVENTARIOM4C uwer where uwer.USUARIO_ID= IDUSER)")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

@Formula("(select u.EMAIL from USUARIO@INVENTARIOM4C u where u.USUARIO_ID= IDUSER)")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
