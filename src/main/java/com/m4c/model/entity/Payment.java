package com.m4c.model.entity;

import org.hibernate.annotations.Formula;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CPAGOSSERVICIOS")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private PaymentPk pk;
    private Long booking;
    private Long payment;
    private String numPayment;
    private Bank bank;
    private Integer paymentType;
    private Double amount;
    private Integer currency;
    private String descCurrency;
    private String autorization;
    private Date insertDate;
    private String userPayment;
    private String userComission;
    private Integer depto;
    private Long idReservation;
    private String otherCreditCard;
    private Integer idMulti;
    private Date releasedDate;
    private Double exchangeRate;

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

    @ManyToOne
    @JoinColumn(name = "BANCO")
    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
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
    public String getUserPayment() {
        return userPayment;
    }

    public void setUserPayment(String userPayment) {
        this.userPayment = userPayment;
    }




    @Column(name="IDUSERCOMISION")
    public String getUserComission() {
        return userComission;
    }

    public void setUserComission(String userComission) {
        this.userComission = userComission;
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

    @Formula(value = "(CASE WHEN(moneda = 0) THEN 'MXN' WHEN(moneda = 1) THEN 'USD' ELSE 'NREG' END)")
    public String getDescCurrency() {
        return descCurrency;
    }

    public void setDescCurrency(String descCurrency) {
        this.descCurrency = descCurrency;
    }

    /**
     *
     * @param payment
     * @param currency
     * @param autorization
     * @param paymentType
     * @param numPayment
     * @param amount
     * @param user
     * @param exchangeRate
     * @param bank
     * @param booking
     * @param insertDate
     * @param userComision usuario a comisionar
     */
	public Payment(Long payment, Integer currency, String autorization, Integer paymentType, String numPayment, Double amount, String user, Double exchangeRate, Bank bank, Long booking,Date insertDate,String userComision) {
		//this.payment = payment;
		this.currency = currency;
		this.autorization = autorization;
		this.paymentType = paymentType;
		this.numPayment = numPayment;
		this.amount = amount;
		this.userPayment = user;
        this.userComission = userComision;
		this.exchangeRate = exchangeRate;
		this.bank = bank;
		//this.booking = booking;
        this.insertDate=insertDate;
        this.releasedDate=insertDate;
        this.setPk(new PaymentPk(booking,payment));

	}


    public Payment() {
    }
}