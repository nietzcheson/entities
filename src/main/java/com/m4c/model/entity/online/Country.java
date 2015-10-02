package com.m4c.model.entity.online;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Elvira Aranda
 * 28/04/2008
 */
@Entity
@Table(name = "M4CPAIS@M4CPUBLIC")
//@Table(name = "M4CPAIS@DBLNK_ONLINEDB_TEST")
@NamedQueries({
		@NamedQuery(

				name = "com.m4c.model.entity.Country.findAll",
				query = "SELECT c FROM Country c order by c.name asc "
		)
})
public class Country implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public static final String TAG = Country.class.getSimpleName();
	private String code;
	private String name;
	private String name_esp;
	
	@Id
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


}
