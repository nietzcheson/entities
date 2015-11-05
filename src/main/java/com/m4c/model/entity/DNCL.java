package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Fernando on 05/11/2015.
 */
@Entity
@Table(name = "DNCL_M4SG")
public class DNCL implements Serializable {


    private Long phone;
    private Integer lada;
    private Long number;
    private String countryCode;

    public DNCL() {
    }

    @Id
    @Column(name = "TELEFONO")
    public Long getPhone() {
        return phone;
    }
    @Column(name = "LADA")
    public Integer getLada() {
        return lada;
    }
    @Column(name = "NUMERO")
    public Long getNumber() {
        return number;
    }
    @Column(name = "PAIS")
    public String getCountryCode() {
        return countryCode;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setLada(Integer lada) {
        this.lada = lada;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
