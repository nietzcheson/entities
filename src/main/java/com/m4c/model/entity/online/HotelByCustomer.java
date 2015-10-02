package com.m4c.model.entity.online;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class HotelByCustomer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private HotelByCustomerPk hotelByCustomerPk;
	private CertCustomer certCustomer;
	private Long idHotel;	

	@EmbeddedId
	    @AttributeOverrides( {
	    	@AttributeOverride(name="idCustomer", column=@Column(name="IDCLIENTE", unique=false, nullable=false, insertable=true, updatable=true) ),
	        @AttributeOverride(name="idHotel", column=@Column(name="IDHOTEL", unique=false, nullable=false, insertable=true, updatable=true) )
	        } )			
	public HotelByCustomerPk getHotelByCustomerPk() {
		return hotelByCustomerPk;
	}

	public void setHotelByCustomerPk(HotelByCustomerPk hotelByCustomerPk) {
		this.hotelByCustomerPk = hotelByCustomerPk;
	}
	
	@ManyToOne
	@JoinColumn(name="IDCLIENTE", unique=false, nullable=false, insertable=false, updatable=false)
	public CertCustomer getCertCustomer() {
		return certCustomer;
	}
	public void setCertCustomer(CertCustomer certCustomer) {
		this.certCustomer = certCustomer;
	}
	
	@Column(name="IDHOTEL")
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	
	
}
