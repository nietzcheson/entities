package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table(name="M4CEQUIPOS")
@javax.persistence.SequenceGenerator(name="SEQ_GEN", sequenceName="IDCALLCENTER")
public class Teams implements IDEntity{
	private static final long serialVersionUID =1L;
	
	private Long id;
	private String team;
	private Integer iddepartment;
	private String programa;
	private Integer metasemanal;
		
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	@Column (name="IDEQUIPO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="EQUIPO")
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	@Column (name="IDDEPTO")
	public Integer getIddepartment() {
		return iddepartment;
	}
	public void setIddepartment(Integer iddepartment) {
		this.iddepartment = iddepartment;
	}
	
	@Column (name="PROGRAMA")
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	@Column (name="META_SEMANAL")
	public Integer getMetasemanal() {
		return metasemanal;
	}
	public void setMetasemanal(Integer metasemanal) {
		this.metasemanal = metasemanal;
	}
}
