package com.m4c.model.entity.tc;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.m4c.model.base.IDEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Usuario on 16/02/2016.
 */
@Entity
@Table(name = "CONTRATO@SUNSETDB.SUNSET.COM.MX")
public class Contract implements IDEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date cancelDate;

    @Id
    @Column(name = "IDCONTRATO")
    public Long getId() {
        return null;
    }

    public void setId(Long id) {

    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
    @Column(name="FECHACANCELACION")
    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }
}
