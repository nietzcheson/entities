package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;


@Entity
@Table(name="VIEWRESERVACIONES")
public class ViewReservation implements IDEntity{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String names; 	
	private Date checkin;   
	private Date checkout;
	private String user; 
	private String sPackage;
	private Integer spaAI;	
	private Integer numSpa;
	private String plan;
	private String confirma; 
	private Integer oneWay; 
	private Integer days; 
	private String tarifaAI;
	private Integer adults; 
	private Integer children;
	private String ages; 
	private String booking; 
	private String logoCallcenter; 
	private String logoProgram; 
	private String description; 
	private String hotelName;
	private String address;
	private String phone;
	private Long hotelId;
	private String spas;
	private String massage;
	private String extras;
	private Long idCallcenter; 
	private String payUponArrive; 
	private String unit; 
	
	@Id
	@Column (name="IDRESERVACION")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="NOMBRES")
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	
	@Column (name="CHECKIN")
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	
	@Column (name="CHECKOUT")
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	@Column (name="S_USER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column (name="PAQUETE")
	public String getsPackage() {
		return sPackage;
	}
	public void setsPackage(String sPackage) {
		this.sPackage = sPackage;
	}
	
	@Column (name="SPAAI")
	public Integer getSpaAI() {
		return spaAI;
	}
	public void setSpaAI(Integer spaAI) {
		this.spaAI = spaAI;
	}
	
	@Column (name="NUMSPAS")
	public Integer getNumSpa() {
		return numSpa;
	}
	public void setNumSpa(Integer numSpa) {
		this.numSpa = numSpa;
	}
	
	@Column (name="PLAN_ALIMENTICIO")
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	@Column (name="NUMCONFIRMACION")
	public String getConfirma() {
		return confirma;
	}
	public void setConfirma(String confirma) {
		this.confirma = confirma;
	}
	
	
	@Column (name="ONEWAY")
	public Integer getOneWay() {
		return oneWay;
	}
	public void setOneWay(Integer oneWay) {
		this.oneWay = oneWay;
	}
	
	@Column (name="DIAS")
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	
	@Column (name="TARIFAAI")
	public String getTarifaAI() {
		return tarifaAI;
	}
	public void setTarifaAI(String tarifaAI) {
		this.tarifaAI = tarifaAI;
	}
	
	@Column (name="TOTAL_ADULTO")
	public Integer getAdults() {
		return adults;
	}
	public void setAdults(Integer adults) {
		this.adults = adults;
	}
	
	@Column (name="TOTAL_MENOR")
	public Integer getChildren() {
		return children;
	}
	public void setChildren(Integer children) {
		this.children = children;
	}
	
	@Column (name="EDADES")
	public String getAges() {
		return ages;
	}
	public void setAges(String ages) {
		this.ages = ages;
	}
	
	@Column (name="IDBOOKING")
	public String getBooking() {
		return booking;
	}
	public void setBooking(String booking) {
		this.booking = booking;
	}
	
	@Column (name="LOGOCALL")
	public String getLogoCallcenter() {
		return logoCallcenter;
	}
	public void setLogoCallcenter(String logoCallcenter) {
		this.logoCallcenter = logoCallcenter;
	}
	
	@Column (name="LOGOPROG")
	public String getLogoProgram() {
		return logoProgram;
	}
	public void setLogoProgram(String logoProgram) {
		this.logoProgram = logoProgram;
	}
	
	@Column (name="DESCRIPCION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column (name="NOMHOTEL")
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	@Column (name="DIRECCION")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column (name="TELEFONO")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column (name="IDHOTEL")
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	
	@Column (name="SPAS")
	public String getSpas() {
		return spas;
	}
	public void setSpas(String spas) {
		this.spas = spas;
	}
	
	@Column (name="MASAJES")
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	@Column (name="EXTRAS")
	public String getExtras() {
		return extras;
	}
	public void setExtras(String extras) {
		this.extras = extras;
	}
	
	@Column (name="IDCALLCENTER")
	public Long getIdCallcenter() {
		return idCallcenter;
	}
	public void setIdCallcenter(Long idCallcenter) {
		this.idCallcenter = idCallcenter;
	}
	
	
	@Column (name="PAYUPONARR")
	public String getPayUponArrive() {
		return payUponArrive;
	}
	public void setPayUponArrive(String payUponArrive) {
		this.payUponArrive = payUponArrive;
	}
	
	@Column (name="IDTIPOUNIDAD")
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
		
}
