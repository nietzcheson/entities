package com.m4c.model.entity;

import com.m4c.model.base.IDEntity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Date: 3/10/2007
 *
 * @author Elvira Aranda
 * @version 1.1
 */
@Entity
@Table(name="M4COPERADOR")
public class Operator implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String firstName;
    private String lastName;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="NOMBRE")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="APELLIDO")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Transient
    public String getName(){
       return firstName + " " + lastName;  
    }
}
