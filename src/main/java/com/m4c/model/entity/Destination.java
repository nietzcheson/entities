package com.m4c.model.entity;

import com.m4c.model.entity.online.Country;
import com.m4c.model.entity.online.State;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Juan on 1/12/2015.
 */
@Entity
@Table(name = "m4ccatdestinos")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.Destination.findAll",
                query = "SELECT d FROM Destination d"
        )
})
@javax.persistence.SequenceGenerator(name = "SEQ_GEN", sequenceName = "DESTINATION_SEQ", allocationSize = 1)
public class Destination implements Serializable {

    public static final String TAG = Destination.class.getSimpleName();
    private long id;
    private String name;
    private String description;
    private boolean active;
    private State state;
    private Country country;

    @Id
    @Column(name = "iddestino", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_GEN")
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "destino")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "active")
    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    @ManyToOne
    @JoinColumn(name = "ESTADO_ID")
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Destination() {
        name = null;
        this.description = null;
        this.active = false;
    }

    public boolean isActive() {
        return active;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Destination(String name, String description, boolean active,State state,Country country) {
        this.name = name;
        this.description = description;
        this.active = active;
        this.state = state;
        this.country=country;
    }
    @ManyToOne
    @JoinColumn(name="PAIS_CODE")
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
}
