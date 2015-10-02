package com.m4c.model.entity.online;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.m4c.model.base.IDEntity;


@Entity
@Table(name = "M4CCERTSCONFIG@M4CPUBLIC")
//@Table(name = "M4CCERTSCONFIG@DBLNK_ONLINEDB_TEST")
@javax.persistence.SequenceGenerator(name="SEQ_CERTS_CONFIG", sequenceName="SEQ_CERTS_CONFIG",allocationSize=1)
public class CertsConfig implements IDEntity {
	public static final String TAG = CertsConfig.class.getSimpleName();
	private static final long serialVersionUID = 1L;
	private Long id;
	private CertCustomer certCustomer;
	private Long campaign;
	private String imagencert;
	private String certificate;
	private String logo;
	private Long callcenter;
	private String promosite;
	private String promocert;
	private String title;
	private String descripsite;
	private String descripcert;
	private String phone;
	private String email;
    @JsonProperty("url")
    private String url;

	@Id
	@Column(name="IDCONFIG")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CERTS_CONFIG")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="IDCLIENTE",/* unique=false, nullable=false,*/ insertable=false, updatable=false)
//    @Column(name="IDCLIENTE")
	public CertCustomer getCertCustomer() {
		return certCustomer;
	}

	public void setCertCustomer(CertCustomer certCustomer) {
		this.certCustomer=certCustomer;
	}
	
	

	@Column (name = "IDCAMPANA")
	public Long getCampaign() {
		return campaign;
	}
	
	public void setCampaign(Long campaign) {
		this.campaign=campaign;
	}
	
	@Column (name = "IMAGENCERT")
	public String getImagencert() {
		return imagencert;
	}
	
	public void setImagencert(String imagencert) {
		this.imagencert=imagencert;
	}

	@Column (name = "CERTIFICATE")
	public String getCertificate() {
		return certificate;
	}
	
	public void setCertificate(String certificate) {
		this.certificate=certificate;
	}
	
	@Column (name = "LOGO")
	public String getLogo() {
		return logo;
	}
	
	public void setLogo(String logo) {
		this.logo=logo;
	}
	
	@Column (name = "IDCALLCENTER")
	public Long getCallcenter(){
		return callcenter;
	}
	
	public void setCallcenter(Long callcenter){
		this.callcenter=callcenter;
	}
	
	@Column (name = "PROMOCIONSITIO")
	public String getPromosite(){
		return promosite;
	}
	
	public void setPromosite(String promosite){
		this.promosite=promosite;
	}
	
	@Column (name = "PROMOCIONCERT")
	public String getPromocert(){
		return promocert;
	}
	
	public void setPromocert(String promocert){
		this.promocert=promocert;
	}
	
	@Column (name = "TITULOSITIO")
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	@Column (name = "DESCRIPCIONSITIO")
	public String getDescripsite(){
		return descripsite;
	}
	
	public void setDescripsite(String descripsite){
		this.descripsite=descripsite;
	}
	
	
	@Column (name = "DESCRIPCIONCERT")
	public String getDescripcert(){
		return descripcert;
	}
	
	public void setDescripcert(String descripcert){
		this.descripcert=descripcert;
	}
	
	@Column (name = "TELEFONOCONTACTO")
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone=phone;
	}
	
	@Column (name = "EMAILCONTACTO")
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}

    @Transient
    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }

	public CertsConfig() {
	}

	public CertsConfig(CertCustomer certCustomer, Long campaign, String imagencert, String certificate, String logo) {
		this.certCustomer = certCustomer;
		this.campaign = campaign;
		this.imagencert = imagencert;
		this.certificate = certificate;
		this.logo = logo;
	}
}
