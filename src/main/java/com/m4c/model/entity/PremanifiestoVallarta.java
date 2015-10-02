package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEWPREMANIFIESTOVALLARTA")
public class PremanifiestoVallarta {

	private Long id;
	private Date date;
	private String califica;
	private String calificacion;
	private String callcenter;
	private String comentario;
	private String concierge;
	private String edades;
	private String edocivil;
	private String estadia;
	private String fecha;
	private String hooked;
	private String hora;
	private String hotel;
	private String idioma;
	private String meals;
	private String nombre;
	private String origen;
	private String pax;
	private String programa;
	private String tc;
	private String traslado;
	
	@Id
	@Column(name="CLIENTE")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="FECHAPRESENTACION")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name="CALIFICA")
	public String getCalifica() {
		return califica;
	}
	public void setCalifica(String califica) {
		this.califica = califica;
	}
	@Column(name="CALIFICACION")
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	@Column(name="CALLCENTER")
	public String getCallcenter() {
		return callcenter;
	}
	public void setCallcenter(String callcenter) {
		this.callcenter = callcenter;
	}
	@Column(name="COMENTARIO")
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	@Column(name="CONCIERGE")
	public String getConcierge() {
		return concierge;
	}
	public void setConcierge(String concierge) {
		this.concierge = concierge;
	}
	@Column(name="EDADES")
	public String getEdades() {
		return edades;
	}
	public void setEdades(String edades) {
		this.edades = edades;
	}
	@Column(name="EDOCIVIL")
	public String getEdocivil() {
		return edocivil;
	}
	public void setEdocivil(String edocivil) {
		this.edocivil = edocivil;
	}
	@Column(name="ESTADIA")
	public String getEstadia() {
		return estadia;
	}
	public void setEstadia(String estadia) {
		this.estadia = estadia;
	}
	@Column(name="FECHA")
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Column(name="HOOKED")
	public String getHooked() {
		return hooked;
	}
	public void setHooked(String hooked) {
		this.hooked = hooked;
	}
	@Column(name="HORA")
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	@Column(name="HOTEL")
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	@Column(name="IDIOMA")
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	@Column(name="MEALS")
	public String getMeals() {
		return meals;
	}
	public void setMeals(String meals) {
		this.meals = meals;
	}
	@Column(name="NOMBRE")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name="ORIGEN")
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	@Column(name="PAX")
	public String getPax() {
		return pax;
	}
	public void setPax(String pax) {
		this.pax = pax;
	}
	@Column(name="PROGRAMA")
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	@Column(name="TC")
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	@Column(name="TRASLADO")
	public String getTraslado() {
		return traslado;
	}
	public void setTraslado(String traslado) {
		this.traslado = traslado;
	} 

}
