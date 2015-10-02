package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by sistemas on 09/01/2015.
 */
@Entity
@Table(name="M4CFOLIOSCERTIFICADO")
public class FoliosCertificado implements Serializable{

    private Long id;
    private int quantity;
    private Campaign campaign;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC")
    private Date fechaCreacion;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }
    @Column(name = "CANTIDAD")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CAMPANA_ID",nullable = false)
    @JsonIgnoreProperties({"foliosCertificado"})
    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    @Column(name = "FECHACREACION")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FoliosCertificado(int quantity, Campaign campaign) {
        this.quantity = quantity;
        this.campaign = campaign;
        this.fechaCreacion = new Date();
    }
    public FoliosCertificado(int quantity) {
        this.quantity = quantity;

        this.fechaCreacion = new Date();
    }

    public FoliosCertificado() {
    }
}
