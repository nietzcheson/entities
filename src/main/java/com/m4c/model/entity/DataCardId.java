package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Usuario on 28/07/2015.
 */
@Embeddable
public class DataCardId implements Serializable {
    private String idBooking;
    private String payment;

    @Column(name = "CAMPO1")
    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    @Column(name = "CAMPO2")
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public DataCardId(String payment, String idBooking) {
        this.payment = payment;
        this.idBooking = idBooking;
    }

    public DataCardId() {
    }
}
