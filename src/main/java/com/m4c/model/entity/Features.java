package com.m4c.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Fernando on 30/03/2015.
 */
@Entity
@Table(name = "M4CCATINTERESES")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.Features.findAll",
                query = "SELECT f FROM Features f"
        )
})
public class Features implements Serializable {
    public static final String TAG = Title.class.getSimpleName();
    private Long id;
    private String name;
    private Integer active;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "NOMBRE")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "ACTIVO")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
