package com.m4c.model.entity.sistemas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Fernando on 26/03/2015.
 */
@Entity
@Table(name = "TIPO_USUARIO")
public class TypeUser {
    private Long id;
    private String name;
    @Id
    @Column(name = "TIPO_USUARIO_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "TIPO_USUARIO")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
