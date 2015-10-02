package com.m4c.model.entity;

import javax.persistence.*;

/**
 * Created by Juan on 1/12/2015.
 */
@Entity
@Table(name = "m4ccattransportation")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.Transportation.findAll",
                query = "SELECT t FROM Transportation t"
        )
})
public class Transportation {
    public static final String TAG = Transportation.class.getSimpleName();
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
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
