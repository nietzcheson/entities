package com.m4c.model.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by Fernando on 15/04/2015.
 */
@Embeddable
public class OfferDestinationId implements Serializable {
    private Offer offer;
    private Destination destination;
    @ManyToOne @JoinColumn(name = "offer_id")
    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
    @ManyToOne @JoinColumn(name = "destination_id")
    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
