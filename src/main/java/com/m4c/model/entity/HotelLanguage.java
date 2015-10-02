package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Juan on 1/28/2015.
 */

@Entity
@Table(name="m4chotel_language")
public class HotelLanguage implements Serializable {

    private Hotel hotel;

    @Id @ManyToOne
    @JoinColumn(name="hotel_id", unique=false, nullable=false, insertable=false, updatable=false) @JsonIgnore
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Id
    @ManyToOne
    @JoinColumn(name="language_code", unique=false, nullable=false, insertable=false, updatable=false)
    public Language getLanguage() {
        return language;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }
    private Language language;

    @Column(name = "website_description")
    public String getWebsiteDescription() {
        return websiteDescription;
    }
    public void setWebsiteDescription(String websiteDescription) {
        this.websiteDescription = websiteDescription;
    }
    private String websiteDescription;

    public HotelLanguage(Hotel hotel, Language language, String websiteDescription) {
        this.hotel = hotel;
        this.language = language;
        this.websiteDescription = websiteDescription;
    }

    public HotelLanguage() {
        hotel = null;
        language = null;
        websiteDescription = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Offer)) return false;

        final HotelLanguage that = (HotelLanguage) o;

        return Objects.equals(this.hotel, that.hotel) &&
                Objects.equals(this.language, that.language) &&
                Objects.equals(this.websiteDescription, that.websiteDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotel, language, websiteDescription);
    }
}
