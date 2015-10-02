package com.m4c.model.entity;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by sistemas on 05/01/2015.
 */
@Entity
@Table(name="M4CRESERVATIONGROUP")
public class ReservationGroup {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
