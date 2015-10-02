package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * Created by Juan on 1/12/2015.
 */
@Entity
@Table(name = "m4coffer")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.Offer.findAll",
                query = "SELECT o FROM Offer o"
        )
})
@javax.persistence.SequenceGenerator(name = "SEQ_GEN", sequenceName = "OFFER_SEQ", allocationSize = 1)
public class Offer implements Serializable {

    public static final String TAG = Offer.class.getSimpleName();

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_GEN")
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    private long id;

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;

    @ManyToOne
    @JoinColumn(name = "meal_plan_id")
    public MealPlan getMealPlan() {
        return mealPlan;
    }
    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }
    private MealPlan mealPlan;

    @Column(name = "price")
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    private double price;

    @Column(name = "activation_fee")
    public double getActivationFee() {
        return activationFee;
    }
    public void setActivationFee(double activationFee) {
        this.activationFee = activationFee;
    }
    private double activationFee;

    @Column(name = "taxes")
    public double getTaxes() {
        return taxes;
    }
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }
    private double taxes;
//@OneToMany(fetch = FetchType.EAGER, mappedBy = "customerFeaturesId.customer", cascade=CascadeType.ALL)
//@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "offerDestinationId.offer",cascade = CascadeType.ALL )
    @Fetch(value = FetchMode.SUBSELECT )@OnDelete(action = OnDeleteAction.CASCADE)
    public Set<OfferDestination> getDestinations() {
        return destinations;
    }
    public void setDestinations(Set<OfferDestination> destinations) {
        this.destinations = destinations;
    }
    private Set<OfferDestination> destinations = new HashSet<OfferDestination>();

    @Column(name = "active")
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    private int status;

    @ManyToOne @JoinColumn(name = "transportation_id")
    public Transportation getTransportation() {
        return transportation;
    }
    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }
    private Transportation transportation;

    @Column(name = "description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    private String description;

    @ManyToOne @JoinColumn(name = "hook_id")
    public Hook getHook() {
        return hook;
    }
    public void setHook(Hook hook) {
        this.hook = hook;
    }
    private Hook hook;

    @Column(name = "nights")
    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        this.nights = nights;
    }
    private int nights;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "offer", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public Set<OfferLanguage> getTranslations() {
        return translations;
    }
    public void setTranslations(Set<OfferLanguage> translations) {
        this.translations = translations;
    }
    private Set<OfferLanguage> translations = new HashSet<OfferLanguage>();

    @Column(name = "date_created")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC")
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    private Date dateCreated;

    @Column(name = "date_updated")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
    public Date getDateUpdated() {
        return dateUpdated;
    }
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    private Date dateUpdated;

    public Offer(String name, MealPlan mealPlan, double price, double activationFee, double taxes, int status, Transportation transportation, String description, Hook hook, int nights, Date dateCreated, Date dateUpdated) {
        this.name = name;
        this.mealPlan = mealPlan;
        this.price = price;
        this.activationFee = activationFee;
        this.taxes = taxes;
        this.status = status;
        this.transportation = transportation;
        this.description = description;
        this.hook = hook;
        this.nights = nights;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Offer() {
        this.name = null;
        this.mealPlan = null;
        this.price = 0;
        this.activationFee = 0;
        this.taxes = 0;
        this.status = 0;
        this.transportation = null;
        this.description = null;
        this.hook = null;
        this.nights = 0;
        this.dateCreated = null;
        this.dateUpdated = null;
    }

}
