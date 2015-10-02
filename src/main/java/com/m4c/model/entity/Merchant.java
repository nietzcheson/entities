package com.m4c.model.entity;

import com.m4c.model.base.IDEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by sistemas on 07/01/2015.
 */
@Entity
@Table(name = "M4CMERCHANTS")
public class Merchant {

    @Column(name = "MERCHANT")
    private String description;
    @Id
    @Column(name = "CLAVEMERCHANT")
    private String clave;
    @Column(name = "ACTIVO")
    private Integer active;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
