package com.m4c.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table (name="M4CVIEWREFERIDOS")
public class RefCustomer implements Serializable{
	private static final long serialVersionUID = 1L;		
	
	private Long idcustomer;
	private String name;
	private String lastname;
	private String addres;
	private String city;
	private String state;
	private String country;
	private String cp;
	private String phone;
	private String celphone;
	private String email;
	private String contract;
	private Long idm4customer;
	private String user;
	private Date date;
	private Integer nonmember;
	private Date dateupdate;
	private String comments;
	private Integer tpmember;
	private String source;
	private String idhit;
	private String language;
	private String phone2;
	private String origen;
	
	@Id
	@Column (name="IDCLIENTE")
	public Long getIdCustomer() {
		return idcustomer;
	}
	public void setIdCustomer(Long idcustomer) {
		this.idcustomer = idcustomer;
	}
	
	@Column (name="NOMBRE")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column (name="APELLIDO")
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column (name="DIRECCION")
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	@Column (name="CIUDAD")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column (name="IDESTADO")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column (name="IDPAIS")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column (name="CP")
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	@Column (name="TELEFONO")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column (name="CELULAR")
	public String getCelphone() {
		return celphone;
	}
	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}
	
	@Column (name="EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column (name="IDCONTRATO")
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	
	@Column (name="IDM4CLIENTE")
	public Long getIdm4customer() {
		return idm4customer;
	}
	public void setIdm4customer(Long idm4customer) {
		this.idm4customer = idm4customer;
	}
	
	@Column (name="IDUSER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column (name="FECHA")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column (name="TIPONOSOCIO")
	public Integer getNonmember() {
		return nonmember;
	}
	public void setNonmember(Integer nonmember) {
		this.nonmember = nonmember;
	}
	
	@Column (name="FECHAUPDATE")
	public Date getDateupdate() {
		return dateupdate;
	}
	public void setDateupdate(Date dateupdate) {
		this.dateupdate = dateupdate;
	}
	
	@Column (name="COMENTARIOS")
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Column (name="TPSOCIO")
	public Integer getTpmember() {
		return tpmember;
	}
	public void setTpmember(Integer tpmember) {
		this.tpmember = tpmember;
	}
	
	@Column (name="PROCEDENCIA")
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	@Column (name="IDHIT")
	public String getIdhit() {
		return idhit;
	}
	public void setIdhit(String idhit) {
		this.idhit = idhit;
	}
	
	@Column (name="LENGUAJE_PREFERENTE")
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Column (name="TELEFONO2")
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	
	@Column (name="ORIGEN")
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
