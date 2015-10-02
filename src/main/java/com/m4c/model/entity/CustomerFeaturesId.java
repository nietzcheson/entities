package com.m4c.model.entity;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by Fernando on 31/03/2015.
 */
@Embeddable
public class CustomerFeaturesId implements Serializable{
    private Customer customer;
    private Features features;

    @ManyToOne
    @JoinColumn(name = "IDCLIENTE")
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @ManyToOne
    @JoinColumn(name = "INTERESES_ID")
    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }


}
