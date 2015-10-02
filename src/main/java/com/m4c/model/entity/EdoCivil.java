package com.m4c.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by desarrollo1 on 07/04/2015.
 */
@Entity
@Table(name = "M4CCATEDOCIVIL")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.EdoCivil.findAll",
                query = "SELECT e FROM EdoCivil e"
        )
})
public class EdoCivil implements Serializable {
    public static final String TAG = Title.class.getSimpleName();
    private String id;
    private String civil;
    private String civilEng;
    @Id
    @Column(name = "IDEDOCIVIL")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "EDOCIVIL")
    public String getCivil() {
        return civil;
    }
    public void setCivil(String civil) {
        this.civil = civil;
    }

    @Column(name = "EDOCIVILENG")
    public String getCivilEng() {
        return civilEng;
    }
    public void setCivilEng(String civilEng) {
        this.civilEng = civilEng;
    }
}

