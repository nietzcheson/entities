package com.m4c.model.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table (name="M4CVIEWSERVICIOSPAGADOS")
public class PaymentServices implements Serializable {
		private static final long serialVersionUID = 1L;		
		private Long id;
		private Long booking;
		private Long reservation;
		private Long idPayment;
		private Long idContractService;
		private Integer currency;
		private Double amount;
		private Double exchangeRate;
		private String user;
		private Date date;
		private Long idCategoryService;
		
		
		@Id
		@Column (name="IDSERVPAGADO")
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		@Column (name="IDBOOKING")
		public Long getBooking(){
			return booking;
		}
		public void setBooking(Long booking){
			this.booking = booking;
		}
		
		@Column (name="IDRESERVACION")
		public Long getReservation(){
			return reservation;
		}
		public void setReservation(Long reservation){
			this.reservation = reservation;
		}
		
		@Column (name="IDPAGO")
		public Long getIdPayment(){
			return idPayment;
		}
		public void setIdPayment(Long idPayment){
			this.idPayment = idPayment;
		}
		
		@Column (name="IDSERVCONTRATADO")
		public Long getIdContractService(){
			return idContractService;
		}
		public void setIdContractService(Long idContractService){
			this.idContractService = idContractService;
		}
		
		@Column (name="MONEDA")
		public Integer getCurrency(){
			return currency;
		}
		public void setCurrency(Integer currency){
			this.currency = currency;
		}
		
		@Column (name="IMPORTE")
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		
		@Column (name="TIPOCAMBIO")
		public Double getExchangeRate() {
			return exchangeRate;
		}
		public void setExchangeRate(Double exchangeRate) {
			this.exchangeRate = exchangeRate;
		}
		
		@Column (name="USUARIO")
		public String getUser(){
			return user;
		}
		public void setUser(String user){
			this.user = user;
		}
		
		@Column (name="FECHA")
		public Date getDate(){
			return date;
		}
		public void setDate(Date date){
			this.date = date;
		}
		
		@Column (name="IDCATSERVICIO")
		public Long getIdCategoryService(){
			return idCategoryService;
		}
		public void setIdCategoryService(Long idCategoryService){
			this.idCategoryService = idCategoryService;
		}
		
		

	}
