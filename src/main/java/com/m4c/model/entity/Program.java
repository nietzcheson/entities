package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;

/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CCATPROGRAMAS")
public class Program implements IDEntity{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String program;
	private Integer active;

	@Id
	@Column (name="IDPROGRAMA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Column (name="PROGRAMA")
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}

	@Column (name="ACTIVO")
	public Integer isActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((program == null) ? 0 : program.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Program other = (Program) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (program == null) {
			if (other.program != null)
				return false;
		} else if (!program.equals(other.program))
			return false;
		return true;
	}
	
	

}
