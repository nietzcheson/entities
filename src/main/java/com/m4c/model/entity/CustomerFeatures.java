package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Fernando on 31/03/2015.
 */
@Entity
@Table(name = "CLIENTE_INTERESES",uniqueConstraints ={@UniqueConstraint(columnNames ="IDCLIENTE" ),@UniqueConstraint(columnNames = "INTERESES_ID")} )
public class CustomerFeatures {
    @JsonIgnoreProperties({"customer"})
    private CustomerFeaturesId customerFeaturesId=new CustomerFeaturesId();

    @EmbeddedId
    public CustomerFeaturesId getCustomerFeaturesId() {
        return customerFeaturesId;
    }

    public void setCustomerFeaturesId(CustomerFeaturesId customerFeaturesId) {
        this.customerFeaturesId = customerFeaturesId;
    }
    public void setCustomer(Customer customer){
        customerFeaturesId.setCustomer(customer);
    }
    public void setFeatures(Features features){
        customerFeaturesId.setFeatures(features);
    }
    @Transient
    public Customer getCustomer(){
     return    customerFeaturesId.getCustomer();
    }
    @Transient
    public Features getFeatures(){
        return customerFeaturesId.getFeatures();
    }

    public CustomerFeatures(Customer customer,Features features) {

        customerFeaturesId.setFeatures(features);
        customerFeaturesId.setCustomer(customer);
    }

    public CustomerFeatures() {
    }



}
