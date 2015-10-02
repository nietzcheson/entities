package com.m4c.model.entity.sistemas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Fernando on 26/03/2015.
 */
@Entity
@Table(name = "DEPARTAMENTO")
public class Area {
    private Long id;
    private String name;
    private String name_en;
    private String fax;
    @Id
    @Column(name = "DEPTO_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "DEPTO")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "DEPTO_INGLES")
    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
    @Column(name = "FAXDEPTO")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
