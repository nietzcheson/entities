package com.m4c.model.entity.online;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Elvira Aranda
 * 28/04/2008
 */
@Entity
    @Table(name = "M4CESTADO@M4CPUBLIC")
//    @Table(name = "M4CESTADO@DBLNK_ONLINEDB_TEST")
@NamedQueries({
		@NamedQuery(
				name = "com.m4c.model.entity.State.findAll",
				query = "SELECT s FROM State s"
		)
})
public class State implements Serializable{

    public static final String TAG = State.class.getSimpleName();
    private Long id;
	private String code;
	private String name;
	private String name_esp;
	private Country country;
	
	@Id
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="CODE")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="NAME_ESP")
	public String getName_esp() {
		return name_esp;
	}
	public void setName_esp(String name_esp) {
		this.name_esp = name_esp;
	}
	
	@ManyToOne
	@JoinColumn(name="PAIS_CODE")
	@JsonIgnore
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
		
}
