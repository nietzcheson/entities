package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="M4CCOMENTARIOSCONCIERGE")
public class ConciergeComment {
	private Long id;
	private Customer customer;
	private Date date;
	private String attitude;
	private String infoAttitude; 
	private String issues;
	private Boolean presentation;
	private String time;
	private String gifts;
	private String reasonNoPres;
	private String otherReasonNoPres; 
	private String nq;
	private String flightInfo;
	private Boolean disclaimer;
	private String room;
	private Boolean openToOtherPres;
	private Boolean purchase;
	private String reasonNoPurchase;
	private String otherReasonNoPurchase; 
	private Reservation reservation;
	private Boolean firstComment;
	private String qualification;
	private String concierge;
	private Date datePres;
	private String transportation;
	private String language;
	private String tc;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="IDCOMENTARIO")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="IDCLIENTE")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Column(name="FECHA")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name="ACTITUD")
	public String getAttitude() {
		return attitude;
	}
	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}
	
	@Column(name="INFOACTITUD")
	public String getInfoAttitude() {
		return infoAttitude;
	}
	public void setInfoAttitude(String infoAttitude) {
		this.infoAttitude = infoAttitude;
	}
	
	@Column(name="PROBLEMAS")
	public String getIssues() {
		return issues;
	}
	public void setIssues(String issues) {
		this.issues = issues;
	}
	
	@Column(name="PRESENTACION")
	public Boolean getPresentation() {
		return presentation;
	}
	public void setPresentation(Boolean presentation) {
		this.presentation = presentation;
	}
	
	@Column(name="HORA")
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Column(name="REGALOS")
	public String getGifts() {
		return gifts;
	}
	public void setGifts(String gifts) {
		this.gifts = gifts;
	}
	
	@Column(name="RAZONDENOPRES")
	public String getReasonNoPres() {
		return reasonNoPres;
	}
	public void setReasonNoPres(String reasonNoPres) {
		this.reasonNoPres = reasonNoPres;
	}
	
	@Column(name="OTRARAZONDENOPRES")
	public String getOtherReasonNoPres() {
		return otherReasonNoPres;
	}
	public void setOtherReasonNoPres(String otherReasonNoPres) {
		this.otherReasonNoPres = otherReasonNoPres;
	}
	
	@Column(name="NQ")
	public String getNq() {
		return nq;
	}
	public void setNq(String nq) {
		this.nq = nq;
	}
	
	@Column(name="INFODEVUELO")
	public String getFlightInfo() {
		return flightInfo;
	}
	public void setFlightInfo(String flightInfo) {
		this.flightInfo = flightInfo;
	}
	
	@Column(name="DESLINDE")
	public Boolean getDisclaimer() {
		return disclaimer;
	}
	public void setDisclaimer(Boolean disclaimer) {
		this.disclaimer = disclaimer;
	}
	
	@Column(name="HABITACION")
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
	@Column(name="ABIERTOAOTRAPRES")
	public Boolean getOpenToOtherPres() {
		return openToOtherPres;
	}
	public void setOpenToOtherPres(Boolean openToOtherPres) {
		this.openToOtherPres = openToOtherPres;
	}
	
	@Column(name="COMPRA")
	public Boolean getPurchase() {
		return purchase;
	}
	public void setPurchase(Boolean purchase) {
		this.purchase = purchase;
	}
	
	@Column(name="RAZONNOCOMPRA")
	public String getReasonNoPurchase() {
		return reasonNoPurchase;
	}
	public void setReasonNoPurchase(String reasonNoPurchase) {
		this.reasonNoPurchase = reasonNoPurchase;
	}
	
	@Column(name="OTRARAZONNOCOMPRA")
	public String getOtherReasonNoPurchase() {
		return otherReasonNoPurchase;
	}
	public void setOtherReasonNoPurchase(String otherReasonNoPurchase) {
		this.otherReasonNoPurchase = otherReasonNoPurchase;
	}
	
	@ManyToOne
	@JoinColumn(name="IDRESERVACION")
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	@Column(name="COMENTARIOLLEGADA")	
	public Boolean getFirstComment() {
		return firstComment;
	}
	public void setFirstComment(Boolean firstComment) {
		this.firstComment = firstComment;
	}
	
	@Column(name="CALIFICACION")	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	@Column(name="CONCIERGE")
	public String getConcierge() {
		return concierge;
	}
	public void setConcierge(String concierge) {
		this.concierge = concierge;
	}
	
	@Column(name="FECHAPRESENTACION")
	public Date getDatePres() {
		return datePres;
	}
	public void setDatePres(Date datePres) {
		this.datePres = datePres;
	}
	
	@Column(name="TRASLADO")
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	
	@Column(name="IDIOMA")
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Column(name="TC")
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	
	
}
