package com.m4c.model.entity.sistemas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Fernando on 26/03/2015.
 */
@Entity
@Table(name = "LOCACION")
public class Location {
    private Long id;
    private String name;
    private String fax;
    private String fax_en;
    @Id
    @Column(name = "LOCACION_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "LOCACION")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "FAXLOC")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    @Column(name = "FAXLOC_INGLES")
    public String getFax_en() {
        return fax_en;
    }

    public void setFax_en(String fax_en) {
        this.fax_en = fax_en;
    }
}
