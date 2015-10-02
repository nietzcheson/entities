package com.m4c.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="M4CSUBSERVICIOS")
public class SubService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Service service;
	private String name;
	private Double price;
	private Date activation;
	private Date expiry;
	private CallCenter callCenter;
	private Long idCampaign;
	private Double type;
	private String currency;
	private String description;
	private Integer nights;
	private String nameEng;
	private Integer adults;
	private Integer children;
	private Hotel hotel;
	private CategoryService category;
	
	@Id
	@Column(name="IDSUBSERVICIO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="IDSERVICIO")
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	@Column(name="SUBSERVICIO")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="IMPORTE")
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Column(name="ACTIVACION")
	public Date getActivation() {
		return activation;
	}
	public void setActivation(Date activation) {
		this.activation = activation;
	}
	
	@Column(name="CADUCIDAD")
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	@ManyToOne
	@JoinColumn(name="IDCALLCENTER")
	public CallCenter getCallCenter() {
		return callCenter;
	}
	public void setCallCenter(CallCenter callCenter) {
		this.callCenter = callCenter;
	}
	
	@Column(name="IDCAMPANIA")
	public Long getIdCampaign() {
		return idCampaign;
	}
	public void setIdCampaign(Long idCampaign) {
		this.idCampaign = idCampaign;
	}
	
	@Column(name="TIPO")
	public Double getType() {
		return type;
	}
	public void setType(Double type) {
		this.type = type;
	}
	
	@Column(name="MONEDA")
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Column(name="DESCRIPCION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="NOCHES")
	public Integer getNights() {
		return nights;
	}
	public void setNights(Integer nights) {
		this.nights = nights;
	}
	
	@Column(name="ENGLISHNAME")
	public String getNameEng() {
		return nameEng;
	}
	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}
	
	@Column(name="ADULTOS")
	public Integer getAdults() {
		return adults;
	}
	public void setAdults(Integer adults) {
		this.adults = adults;
	}
	
	@Column(name="NINIOS")
	public Integer getChildren() {
		return children;
	}
	public void setChildren(Integer children) {
		this.children = children;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IDHOTEL")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	@ManyToOne
	@JoinColumn(name="IDCATSERVICIO")
	public CategoryService getCategory() {
		return category;
	}
	public void setCategory(CategoryService category) {
		this.category = category;
	}

}
