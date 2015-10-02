package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Juan on 2/10/2015.
 */
@Entity
@Table(name="m4coffer_destination",uniqueConstraints ={@UniqueConstraint(columnNames ="offer_id" ),@UniqueConstraint(columnNames = "destination_id")})
public class OfferDestination {
    @JsonIgnoreProperties({"offer"})
    private OfferDestinationId offerDestinationId=new OfferDestinationId();
    @EmbeddedId
    public OfferDestinationId getOfferDestinationId() {
        return offerDestinationId;
    }

    public void setOfferDestinationId(OfferDestinationId offerDestinationId) {
        this.offerDestinationId = offerDestinationId;
    }
    @Transient
    public Offer getOffer(){
        return offerDestinationId.getOffer();
    }
    @Transient
    public Destination getDestination(){
        return offerDestinationId.getDestination();
    }

    public OfferDestination(Offer offer,Destination destination) {
        offerDestinationId.setDestination(destination);
        offerDestinationId.setOffer(offer);
    }
    public OfferDestination() {
    }


}
