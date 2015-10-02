package com.m4c.model.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.m4c.model.base.IDEntity;
import com.m4c.model.entity.online.Country;
import com.m4c.model.entity.online.State;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CHOTEL")
@NamedQueries({
		@NamedQuery(
				name = "com.m4c.model.entity.Hotel.findAll",
				query = "SELECT h FROM Hotel h"
		)
})
@javax.persistence.SequenceGenerator(name = "SEQ_GEN", sequenceName = "IDHOTEL", allocationSize = 1)
public class Hotel implements Serializable, IDEntity {

	public static final String TAG = Hotel.class.getSimpleName();

    @Id @Column (name="hotel_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_GEN")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private Long id;

    @Column (name="nombre")
    public String getName() {
        return name.trim();
    }
    public void setName(String name) {
        this.name = name;
    }
	private String name;

    @Column(name = "activo")
    public Integer isActive() {
        return active;
    }
    public void setActive(Integer active) {
        this.active = active;
    }
    private Integer active;

    @Column(name = "direccion")
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    private String address;

    @Column(name = "website")
    @JsonProperty("website")
    public String getUrl() {
        return url;
    }
    @JsonProperty("website")
    public void setUrl(String url) {
        this.url = url;
    }
    private String url;

    @Column(name = "descripcion")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    private String description;

    @Column(name = "edadninio")
    public Integer getAgeChildren() {
        return ageChildren;
    }
    public void setAgeChildren(Integer ageChildren) {
        this.ageChildren = ageChildren;
    }
    private Integer ageChildren;

    @Column(name = "edadjunior")
    public Integer getAgeTeens() {
        return ageTeens;
    }
    public void setAgeTeens(Integer ageTeens) {
        this.ageTeens = ageTeens;
    }
    private Integer ageTeens;

    @Column(name = "edadadulto")
    public Integer getAgeAdults() {
        return ageAdults;
    }
    public void setAgeAdults(Integer ageAdults) {
        this.ageAdults = ageAdults;
    }
    private Integer ageAdults;

    @Column(name = "clase")
    public String getStars() {
        return stars;
    }
    public void setStars(String stars) {
        this.stars = stars;
    }
    private String stars;

    @ManyToOne @JoinColumn(name="destination_id")
    public Destination getDestination() {
        return destination;
    }
    public void setDestination(Destination destination) {
        this.destination = destination;
    }
	private Destination destination;
    /*
    @ManyToOne @JoinColumn(name="country_code")
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
	private Country country;

    @ManyToOne @JoinColumn(name="state_id")
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
	private State state;
*/
    @Column(name = "city")
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
	private String city;

    @Column(name = "zip_code")
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    private String zipCode;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public Set<HotelLanguage> getTranslations() {
        return translations;
    }
    public void setTranslations(Set<HotelLanguage> translations) {
        this.translations = translations;
    }
	private Set<HotelLanguage> translations = new HashSet<HotelLanguage>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public List<HotelImage> getImages() {
        return images;
    }
    public void setImages(List<HotelImage> images) {
        this.images = images;
    }
	private List<HotelImage> images = new ArrayList<HotelImage>();

    public Hotel(String name, Integer active, String address, String url, String description, Integer ageChildren, Integer ageTeens, Integer ageAdults, String stars, Destination destination, Country country, State state, String city, String zipCode) {
        this.name = name;
        this.active = active;
        this.address = address;
        this.url = url;
        this.description = description;
        this.ageChildren = ageChildren;
        this.ageTeens = ageTeens;
        this.ageAdults = ageAdults;
        this.stars = stars;
        this.destination = destination;
        this.url=url;
       /* this.country = country;
        this.state = state;*/
        this.city = city;
        this.zipCode = zipCode;
    }

    public Hotel() {
        name = null;
        active = null;
        address = null;
        url = null;
        description = null;
        ageChildren = 0;
        ageTeens = 0;
        ageAdults = 0;
        stars = null;
        destination = null;
        /*
        country = null;
        state = null;*/
        city = null;
        zipCode = null;
    }
}