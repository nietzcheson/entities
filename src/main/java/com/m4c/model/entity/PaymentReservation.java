package com.m4c.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CRESPAGOS")
public class PaymentReservation implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idPayment;
	private PaymentReservationPk pk;
	private Reservation reservation;
	private String bank;
	private Integer type;
	private Double amount;
	private Integer currency;
	private String creditCard;
	private String cardType;
	private String expiration;
	private String authorization;
	private Date paymentDate;
	private String user;
	private Integer department;
	private Integer multi;
	private Double exchangeRateTC;
	private Double amountMXN;
	private Double exchangeRate;

		
	@EmbeddedId
    @AttributeOverrides( {
    	@AttributeOverride(name="idReservation", column=@Column(name="IDRESERVACION", unique=false, nullable=false, insertable=true, updatable=true) ),
        @AttributeOverride(name="idPayment", column=@Column(name="IDPAGO", unique=false, nullable=false, insertable=true, updatable=true) )
        } )	
	public PaymentReservationPk getPk() {
		return pk;
	}
	public void setPk(PaymentReservationPk pk) {
		this.pk = pk;
	}
	
	@Column(name="IDPAGO", unique=false, nullable=false, insertable=false, updatable=false)
	public Integer getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(Integer idPayment) {
		this.idPayment = idPayment;
	}
	
	@ManyToOne
	@JoinColumn(name="IDRESERVACION", unique=false, nullable=false, insertable=false, updatable=false)
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	@Column(name="BANCO")
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	@Column(name="TIPOPAGO")
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	@Column(name="IMPORTE")
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Column(name="MONEDA")
	public Integer getCurrency() {
		return currency;
	}
	public void setCurrency(Integer currency) {
		this.currency = currency;
	}
	
	@Column(name="TARJETA")
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	@Column(name="TIPOCC")
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	@Column(name="EXPIRA")
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	@Column(name="NUMAUTORIZACION")
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	
	@Column(name="FECHA")
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name="DEPTO")
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	
	@Column(name="IDMULTIPAGO")
	public Integer getMulti() {
		return multi;
	}
	public void setMulti(Integer multi) {
		this.multi = multi;
	}
	
	@Column(name="TC")
	public Double getExchangeRateTC() {
		return exchangeRateTC;
	}
	public void setExchangeRateTC(Double exchangeRateTC) {
		this.exchangeRateTC = exchangeRateTC;
	}
	
	@Column(name="IMPORTEPESOS")
	public Double getAmountMXN() {
		return amountMXN;
	}
	public void setAmountMXN(Double amountMXN) {
		this.amountMXN = amountMXN;
	}
	
	@Column(name="NTIPOCAMBIO")
	public Double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}