package com.m4c.model.entity.tc;

import com.m4c.model.base.IDEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Usuario on 17/02/2016.
 */
@Entity
@Table(name = "contratoxmanifiesto@SUNSETDB.SUNSET.COM.MX")
public class ManifestContract implements IDEntity {
    private Long id;
    private Long idContract;

    @Id
    @Column(name = "IDMANIFIESTO")
    public Long getId() {
        return null;
    }

    public void setId(Long id) {

    }

    @Column(name = "IDCONTRATO")
    public Long getIdContract() {
        return idContract;
    }

    public void setIdContract(Long idContract) {
        this.idContract = idContract;
    }
}
