package com.m4c.model.entity.sistemas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Fernando on 26/03/2015.
 */
@Entity
@Table(name = "PUESTO")
public class Position {
    private Long id;
    private Long positionId;
    private String name;
    private String name_en;
    @Id
    @Column(name = "PUESTO_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "PUE_PUESTO_ID")
    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }
    @Column(name = "PUESTO")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "PUESTO_INGLES")
    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
}
