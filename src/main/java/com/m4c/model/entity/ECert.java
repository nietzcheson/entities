package com.m4c.model.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * Created by jhon on 15/05/15.
 */
@Entity
@Table(name = "M4CCATECERTS")
public class ECert implements Serializable {

    private Long id;
    private String name;
    private Set<ECertConfig> configLst;
    private Integer enable;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "certConfigId.cert",cascade = CascadeType.ALL )
    @Fetch(value = FetchMode.SUBSELECT )@OnDelete(action = OnDeleteAction.CASCADE)
    public Set<ECertConfig> getConfigLst() {
        return configLst;
    }

    public void setConfigLst(Set<ECertConfig> configLst) {
        this.configLst = configLst;
    }
    @Column(name = "ACTIVO")
    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}
