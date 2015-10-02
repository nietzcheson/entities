package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;


@Entity
@Table(name = "M4CCONFIGCARTA")
public class Letter implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String callcenters;
	private String campaigns;
	private String hotels;
	private String language;
	private String sectionA;
	private String sectionB;
	private String sectionC;
	private String sectionD;
	private String sectionE;
	private String sectionF0;
	private String sectionF1;
	private String sectionF2;
	private String sectionF3;
	private String sectionG0;
	private String sectionG1;
	private String sectionG2;
	private String sectionH;
	private String sectionI;
	
	@Id
	@Column(name="IDCONFIG")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="CALLCENTERS")
	public String getCallcenters() {
		return callcenters;
	}
	public void setCallcenters(String callcenters) {
		this.callcenters = callcenters;
	}
	
	@Column(name="CAMPANIAS")
	public String getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(String campaigns) {
		this.campaigns = campaigns;
	}
	
	@Column(name="HOTELES")
	public String getHotels() {
		return hotels;
	}
	public void setHotels(String hotels) {
		this.hotels = hotels;
	}
	
	@Column(name="IDIOMA")
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Column(name="SECCIONA")
	public String getSectionA() {
		return sectionA;
	}
	public void setSectionA(String sectionA) {
		this.sectionA = sectionA;
	}
	
	@Column(name="SECCIONB")
	public String getSectionB() {
		return sectionB;
	}
	public void setSectionB(String sectionB) {
		this.sectionB = sectionB;
	}
	
	@Column(name="SECCIONC")
	public String getSectionC() {
		return sectionC;
	}
	public void setSectionC(String sectionC) {
		this.sectionC = sectionC;
	}
	
	@Column(name="SECCIOND")
	public String getSectionD() {
		return sectionD;
	}
	public void setSectionD(String sectionD) {
		this.sectionD = sectionD;
	}
	
	@Column(name="SECCIONE")
	public String getSectionE() {
		return sectionE;
	}
	public void setSectionE(String sectionE) {
		this.sectionE = sectionE;
	}
	
	
	@Column(name="SECCIONF0")
	public String getSectionF0() {
		return sectionF0;
	}
	public void setSectionF0(String sectionF0) {
		this.sectionF0 = sectionF0;
	}
	
	@Column(name="SECCIONF1")
	public String getSectionF1() {
		return sectionF1;
	}
	public void setSectionF1(String sectionF1) {
		this.sectionF1 = sectionF1;
	}
	
	@Column(name="SECCIONF2")
	public String getSectionF2() {
		return sectionF2;
	}
	public void setSectionF2(String sectionF2) {
		this.sectionF2 = sectionF2;
	}
	
	@Column(name="SECCIONF3")
	public String getSectionF3() {
		return sectionF3;
	}
	public void setSectionF3(String sectionF3) {
		this.sectionF3 = sectionF3;
	}
	
	@Column(name="SECCIONG0")
	public String getSectionG0() {
		return sectionG0;
	}
	public void setSectionG0(String sectionG0) {
		this.sectionG0 = sectionG0;
	}
	
	@Column(name="SECCIONG1")
	public String getSectionG1() {
		return sectionG1;
	}
	public void setSectionG1(String sectionG1) {
		this.sectionG1 = sectionG1;
	}
	
	@Column(name="SECCIONG2")
	public String getSectionG2() {
		return sectionG2;
	}
	public void setSectionG2(String sectionG2) {
		this.sectionG2 = sectionG2;
	}
	
	@Column(name="SECCIONH")
	public String getSectionH() {
		return sectionH;
	}
	public void setSectionH(String sectionH) {
		this.sectionH = sectionH;
	}
	
	@Column(name="SECCIONI")
	public String getSectionI() {
		return sectionI;
	}
	public void setSectionI(String sectionI) {
		this.sectionI = sectionI;
	}
	
	
	
	
	

}
