package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;


/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CTARIFARIO")
public class Rate implements IDEntity{

	private static final long serialVersionUID = 1L;
	private Long id;
	private int nigths; //4				//1				//0
	private int adults; //2				//1				//
	private int child;  //2				//0
	private String plan; // AI			//AI
	private CallCenter callCenter; //SUMMER
	private Campaign campaign;
	private double price; //375			//89
	private Hotel hotel; //NULL			//NULL
	private Integer maxAge;
	private Integer minAge;
	private String type; //REGULAR O EXTRA
	private Program program;//M4C o M4SG
    private String country;

    @Id
	@Column(name="IDTARIFARIO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	@Column(name="ADULTOS")
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}

	@ManyToOne
	@JoinColumn(name="IDCALLCENTER")
	public CallCenter getCallCenter() {
		return callCenter;
	}
	public void setCallCenter(CallCenter callCenter) {
		this.callCenter = callCenter;
	}

	@Column(name="NINOS")
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}

	@ManyToOne
	@JoinColumn(name="IDHOTEL")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Column(name="EDADMAX")
	public Integer getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	@Column(name="EDADMIN")
	public Integer getMinAge() {
		return minAge;
	}
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	@Column(name="NOCHES")
	public int getNigths() {
		return nigths;
	}
	public void setNigths(int nigths) {
		this.nigths = nigths;
	}

	@Column(name="PLAN")
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Column(name="PRECIO")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@ManyToOne
	@JoinColumn(name="IDPROGRAMA")
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}

	@Column(name="TIPO")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@ManyToOne
	@JoinColumn(name="IDCAMPANA")
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
    
    @Column(name="PAIS")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
