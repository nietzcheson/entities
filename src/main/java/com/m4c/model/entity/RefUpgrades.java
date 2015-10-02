package com.m4c.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="M4CREFERIDOSUPGRADES")
public class RefUpgrades implements Serializable {
	private static final long serialVersionUID = 1L;

	private PaymentPk pk;
	private Long booking;
	private Long payment;
	private String numPayment;
	private String bank;
	private Integer paymentType;
	private Double amount;
	private Integer currency;
	private String autorization;
	private Date insertDate;
	private String user;
	private Integer depto;
	private Long idReservation;
	private String otherCreditCard;
	private Integer idMulti;
	private Date releasedDate;
	private Double exchangeRate;
	private String consultant;
	private Date saleDate;
	private String vlo;
	private Long comissionAgent;
	private Long comissionVerifier;
	private String upgradePaq;

	 @EmbeddedId
	    @AttributeOverrides( {
	    	@AttributeOverride(name="idBooking", column=@Column(name="IDBOOKING", unique=false, nullable=false, insertable=true, updatable=true) ),
	        @AttributeOverride(name="idPayment", column=@Column(name="IDPAGO", unique=false, nullable=false, insertable=true, updatable=true) )
	        } )			
	public PaymentPk getPk() {
		return pk;
	}

	public void setPk(PaymentPk pk) {
		this.pk = pk;
	}

	@Column(name="IDBOOKING", unique=false, nullable=false, insertable=false, updatable=false)
	public Long getBooking() {
		return booking;
	}

	public void setBooking(Long booking) {
		this.booking = booking;
	}

	@Column(name="IDPAGO", unique=false, nullable=false, insertable=false, updatable=false)
	public Long getPayment() {
		return payment;
	}

	public void setPayment(Long payment) {
		this.payment = payment;
	}

	@Column(name="NUMPAGO")
	public String getNumPayment() {
		return numPayment;
	}

	public void setNumPayment(String numPayment) {
		this.numPayment = numPayment;
	}

	@Column(name="BANCO")
	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Column(name="TIPOPAGO")
	public Integer getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
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

	@Column(name="NUMAUTORIZACION")
	public String getAutorization() {
		return autorization;
	}

	public void setAutorization(String autorization) {
		this.autorization = autorization;
	}

	@Column(name="FECHA")
	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name="DEPTO")
	public Integer getDepto() {
		return depto;
	}

	public void setDepto(Integer depto) {
		this.depto = depto;
	}

	@Column(name="IDRESERVACION")
	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	@Column(name="OTRATC")
	public String getOtherCreditCard() {
		return otherCreditCard;
	}

	public void setOtherCreditCard(String otherCreditCard) {
		this.otherCreditCard = otherCreditCard;
	}

	@Column(name="IDMULTIPAGO")
	public Integer getIdMulti() {
		return idMulti;
	}

	public void setIdMulti(Integer idMulti) {
		this.idMulti = idMulti;
	}

	@Column(name="FECHA_EMISION")
	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	@Column(name="NTIPOCAMBIO")
	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@Column(name="CONSULTOR")
	public String getConsultant() {
		return consultant;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}

	@Column(name="FECHA_VENTA")
	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	@Column(name="VERIFICADOR")
	public String getVlo() {
		return vlo;
	}
	
	public void setVlo(String vlo) {
		this.vlo = vlo;
	}

	@Column(name="COMISION_CONSULTOR")
	public Long getComissionAgent() {
		return comissionAgent;
	}

	public void setComissionAgent(Long comissionAgent) {
		this.comissionAgent = comissionAgent;
	}

	@Column(name="COMISION_VERIFICADOR")
	public Long getComissionVerifier() {
		return comissionVerifier;
	}

	public void setComissionVerifier(Long comissionVerifier) {
		this.comissionVerifier = comissionVerifier;
	}

	@Column(name="UPGRADE_PAQ")
	public String getUpgradePaq() {
		return upgradePaq;
	}

	public void setUpgradePaq(String upgradePaq) {
		this.upgradePaq = upgradePaq;
	}
		
}
