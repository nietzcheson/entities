package com.m4c.model.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

/**
 * Created by Usuario on 23/07/2015.
 */
@Entity
@Table(name="M4CSERVICIOSPAGADOS")
public class PaymentService {
    private Long id;
    private Long idBooking;
    private Long payment;
    private ContractService contractService;
    private Double amount;
    private Integer currency;
    private Double exchangeRate;

    @Id
    @Column(name="IDSERVPAGADO")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="IDBOOKING",insertable = false,updatable = false)
    public Long getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Long idBooking) {
        this.idBooking = idBooking;
    }

    @Column(name="IDPAGO")
    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }
    @ManyToOne
    @JoinColumns({@JoinColumn( name = "IDSERVCONTRATADO",referencedColumnName = "IDSERVCONTRATADO"),@JoinColumn(name = "IDBOOKING",referencedColumnName = "IDBOOKING")})
    public ContractService getContractService() {
        return contractService;
    }

    public void setContractService(ContractService contractService) {
        this.contractService = contractService;
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


    @Column(name="TIPOCAMBIO")
    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public PaymentService(Long id, Long idBooking, Long payment, ContractService contractService, Double amount, Integer currency, Double exchangeRate) {
        this.id = id;
        this.idBooking = idBooking;
        this.payment = payment;
        this.contractService = contractService;
        this.amount = amount;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }

    public PaymentService() {
    }
}
