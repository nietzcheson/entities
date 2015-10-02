package com.m4c.model.entity;

import javax.persistence.*;

/**
 * Created by Juan on 1/12/2015.
 */
@Entity
@Table(name = "m4ccathooked")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.Hook.findAll",
                query = "SELECT h FROM Hook h"
        )
})
public class Hook {
    public static final String TAG = Hook.class.getSimpleName();
    @Id
    @Column(name = "idhooked", nullable = false)
    private long id;

    @Column(name = "hooked")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
