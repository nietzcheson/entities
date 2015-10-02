package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;

/**
 * @author Elvira Aranda
 * @version 1.1
 */
@Entity
@Table(name = "M4CSEGMENTO")
public class Segment implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;

    @Id
    @Column(name = "IDSEGMENTO")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="NOMBRESEGMENTO")    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}