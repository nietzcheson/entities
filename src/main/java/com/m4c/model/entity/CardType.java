package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Fernando on 13/04/2015.
 */
@Entity
@Table(name="M4CCATTIPOSTARJETAS")
public class CardType {

    private Long id;
    private String name;
    private char type;
    private String alias;

    @Id
    @Column(name="IDTIPOTARJETA")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name="TARJETA")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="TIPO")
    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    @Column(name="ALIAS")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CardType() {
    }
}
