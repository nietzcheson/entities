package com.m4c.model.entity.tc;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="UnidadReservar")
@Table(name = "UNIDAD_A_RESERVAR")
public class UnidadAReservar implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private UnidadAReservarPk id;
	private Integer numeroClub;
	private String numConfirmacion;
	private Date checkin;
	private Date checkout;
	private Long numSolicitud;
	
	@EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="numSolicitud", column=@Column(name="NUMSOLICITUD", unique=false, nullable=false, insertable=true, updatable=true) ),
        @AttributeOverride(name="claveUnidad", column=@Column(name="CLAVEUNIDAD", unique=false, nullable=false, insertable=true, updatable=true) ) } )
    public UnidadAReservarPk getId() {
		return id;
	}
	public void setId(UnidadAReservarPk id) {
		this.id = id;
	}
	
	@Column(name="NUMEROCLUB")
	public Integer getNumeroClub() {
		return numeroClub;
	}
	public void setNumeroClub(Integer numeroClub) {
		this.numeroClub = numeroClub;
	}
	
	@Column(name="NUMCONFIRMACION")
	public String getNumConfirmacion() {
		return numConfirmacion;
	}
	public void setNumConfirmacion(String numConfirmacion) {
		this.numConfirmacion = numConfirmacion;
	}
	
	@Column(name="CHECKIN")
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	
	@Column(name="CHECKOUT")
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	@Column(name="NUMSOLICITUD", unique=false, nullable=false, insertable=false, updatable=false)
	public Long getNumSolicitud() {
		return numSolicitud;
	}
	public void setNumSolicitud(Long numSolicitud) {
		this.numSolicitud = numSolicitud;
	}

}
