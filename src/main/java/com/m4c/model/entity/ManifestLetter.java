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
@Table(name="M4CCARTASPREMANIFIESTO")
public class ManifestLetter {

	private Long id;
	private Date date;
	private Date presentationDate;
	private String time;
	private String name;
	private Hotel hotel;
	private String comment;
	private String concierge;
	private String transportation;
	private Integer hooked;
	private String language;
	private String tc;
	
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="IDCARTA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="FECHA")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name="FECHAPRESENTACION")
	public Date getPresentationDate() {
		return presentationDate;
	}
	public void setPresentationDate(Date presentationDate) {
		this.presentationDate = presentationDate;
	}
	
	@Column(name="HORA")
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Column(name="NOMBRES")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	@JoinColumn(name = "HOTEL")
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	@Column(name="COMENTARIO")
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Column(name="CONCIERGE")
	public String getConcierge() {
		return concierge;
	}
	public void setConcierge(String concierge) {
		this.concierge = concierge;
	}
	
	@Column(name="TRASLADO")
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	
	@Column(name="HOOKED")
	public Integer getHooked() {
		return hooked;
	}
	public void setHooked(Integer hooked) {
		this.hooked = hooked;
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
