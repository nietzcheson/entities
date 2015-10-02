package com.m4c.model.entity.tc;

import java.io.Serializable;

public class UnidadAReservarPk implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long numSolicitud;
	private String claveUnidad;
	
	public long getNumSolicitud() {
		return numSolicitud;
	}
	public void setNumSolicitud(long numSolicitud) {
		this.numSolicitud = numSolicitud;
	}
	
	public String getClaveUnidad() {
		return claveUnidad;
	}
	public void setClaveUnidad(String claveUnidad) {
		this.claveUnidad = claveUnidad;
	}

}
