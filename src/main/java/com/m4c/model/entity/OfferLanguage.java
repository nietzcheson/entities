package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Juan on 2/4/2015.
 */
@Entity
@Table(name="m4coffer_language")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.OfferLanguage.findAll",
                query = "SELECT o FROM OfferLanguage o"
        )
})
public class OfferLanguage implements Serializable {

    private Offer offer;
    private Language language;
    private String websiteDescription;
    private String websiteDetails;
    private String websiteTerms;

    @Id
    @ManyToOne
    @JoinColumn(name="language_code", unique=false, nullable=false, insertable=false, updatable=false)
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Id
    @ManyToOne
    @JoinColumn(name="offer_id", unique=false, nullable=false, insertable=false, updatable=false)
    @JsonIgnore
    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Column(name = "website_description")
    public String getWebsiteDescription() {
        return websiteDescription;
    }

    public void setWebsiteDescription(String websiteDescription) {
        this.websiteDescription = websiteDescription;
    }

    @Column(name = "website_details")
    public String getWebsiteDetails() {
        return websiteDetails;
    }

    public void setWebsiteDetails(String websiteDetails) {
        this.websiteDetails = websiteDetails;
    }

    @Column(name = "terms")
    public String getWebsiteTerms() {
        return websiteTerms;
    }

    public void setWebsiteTerms(String websiteTerms) {
        this.websiteTerms = websiteTerms;
    }

    public OfferLanguage(Offer offer, Language language, String websiteDescription, String websiteDetails, String websiteTerms) {
        this.offer = offer;
        this.language = language;
        this.websiteDescription = websiteDescription;
        this.websiteDetails = websiteDetails;
        this.websiteTerms = websiteTerms;
    }

    public OfferLanguage() {
        offer = null;
        language = null;
        websiteDescription = null;
        websiteDetails = null;
        websiteTerms = null;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfferLanguage that = (OfferLanguage) o;

        return Objects.equal(this.offer, that.offer) &&
                Objects.equal(this.language, that.language) &&
                Objects.equal(this.websiteDescription, that.websiteDescription) &&
                Objects.equal(this.websiteDetails, that.websiteDetails) &&
                Objects.equal(this.websiteTerms, that.websiteTerms);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(offer, language, websiteDescription, websiteDetails, websiteTerms);
    }
}
