package com.m4c.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GenericGenerator;
import com.m4c.model.base.IDEntity;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.loader.plan.spi.Fetch;


/**
 * @author Elvira Aranda
 * @version 1.1
 */

@Entity
@Table(name = "M4CRESONLINECONFIG")
@javax.persistence.SequenceGenerator(name="SEQ_CONF", sequenceName="IDRESONLINECONFIG")
public class ResOnlineConfig implements IDEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
	@JsonManagedReference
    private CallCenter callCenter;
    private Campaign campaign;
    private Integer calendar;
    private Integer authorization;
    private Integer spaUnit;
    private Integer epPlan;
    private Integer nights;
    private Double taxes;
    private Double activation;
    private Integer plan;
    private List<Hotel> hotels = new ArrayList<Hotel>();
    private List<Bonus> bonuses = new ArrayList<Bonus>();
    private List<MealPlan> plans = new ArrayList<MealPlan>();
    private String reservationGroup;
    private User user;
    private Integer cardInformation;
    private Integer production;
    private Double allinclusive;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CONF")	
    @Column(name="IDCONF")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToOne
	@JoinColumn(name="IDCALLCENTER")
	public CallCenter getCallCenter() {
		return callCenter;
	}
	public void setCallCenter(CallCenter callCenter) {
		this.callCenter = callCenter;
	}
	
	@OneToOne
	@JoinColumn(name="IDCAMPANIA")
	@LazyCollection(LazyCollectionOption.TRUE)
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	@Column(name="CALENDARIO")
	public Integer getCalendar() {
		return calendar;
	}
	public void setCalendar(Integer calendar) {
		this.calendar = calendar;
	}
	
	@Column(name="AUTORIZACION")
	public Integer getAuthorization() {
		return authorization;
	}
	public void setAuthorization(Integer authorization) {
		this.authorization = authorization;
	}    	
	
	@Column(name="UNIDADSPA")
	public Integer getSpaUnit() {
		return spaUnit;
	}
	public void setSpaUnit(Integer spaUnit) {
		this.spaUnit = spaUnit;
	}
	
	@Column(name="PLANEPDEFAULT")
	public Integer getEpPlan() {
		return epPlan;
	}
	public void setEpPlan(Integer epPlan) {
		this.epPlan = epPlan;
	}
	
	@Column(name="NOCHES")	
	public Integer getNights() {
		return nights;
	}
	public void setNights(Integer nights) {
		this.nights = nights;
	}
	
	@Column(name="IMPUESTOS")	
	public Double getTaxes() {
		return taxes;
	}
	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}
	
	@Column(name="ACTIVACION")
	public Double getActivation() {
		return activation;
	}
	public void setActivation(Double activation) {
		this.activation = activation;
	}
	
	@Column(name="PLANDEFAULT")
	public Integer getPlan() {
		return plan;
	}
	public void setPlan(Integer plan) {
		this.plan = plan;
	}
	
	@Column(name="GRUPO")
	public String getReservationGroup() {
		return reservationGroup;
	}
	public void setReservationGroup(String reservationGroup) {
		this.reservationGroup = reservationGroup;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IDUSER")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	@ManyToMany(
	            targetEntity = Hotel.class,
	            fetch = FetchType.EAGER,// EAGER para reservaciones y certificados LAZY para factura
	            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
	    )
	@JoinTable(
	            name = "M4CHOTELXCONFIG",
	            joinColumns = {@JoinColumn(name = "IDCONFIG", nullable=true)},
	            inverseJoinColumns = {@JoinColumn(name = "IDHOTEL")}
	    )	 
	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}	
	
	public boolean addHotel(Hotel o){
		return hotels.add(o);
	}	
	
	@ManyToMany(
            targetEntity = Bonus.class,
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
	@JoinTable(
            name = "M4CBONOSXCONFIG",
            joinColumns = {@JoinColumn(name = "IDCONFIG", nullable=true)},            
            inverseJoinColumns = {@JoinColumn(name = "IDBONO")}
    )
	public List<Bonus> getBonuses() {
		return bonuses;
	}
	
	public void setBonuses(List<Bonus> bonuses) {
		this.bonuses = bonuses;
	}
	
	public boolean addBonus(Bonus arg0) {
		return bonuses.add(arg0);
	}
	
	@ManyToMany(
            targetEntity = MealPlan.class,
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
	@JoinTable(
            name = "M4CPLANXCONFIG",
            joinColumns = {@JoinColumn(name = "IDCONFIG", nullable=true)},            
            inverseJoinColumns = {@JoinColumn(name = "IDPLAN")}
    )
	public List<MealPlan> getPlans() {
		return plans;
	}
	public void setPlans(List<MealPlan> plans) {
		this.plans = plans;
	}
	
	public boolean add(MealPlan arg0) {
		return plans.add(arg0);
	}
	
	@Column(name="INFORMACIONTARJETA")
	public Integer getCardInformation() {
		return cardInformation;
	}
	public void setCardInformation(Integer cardInformation) {
		this.cardInformation = cardInformation;
	}
	
	@Column(name="PRODUCCION")
	public Integer getProduction() {
		return production;
	}
	public void setProduction(Integer production) {
		this.production = production;
	}
        
        @Column(name="ALLINCLUSIVE")
        public Double getAllInclusive(){
               return allinclusive;
        }
        public void setAllInclusive(Double allinclusive){
               this.allinclusive = allinclusive;
        }
	
	
	
}
