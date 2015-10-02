package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
 * Date: 05/02/2009
 *
 * @author Elvira Aranda
 * @version 1.1
 */
@Entity
@Table(name = "M4CUNIDADES_HOTEL")
public class HotelUnitM4C implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private Hotel hotel;
    private String unit;
    private String uniteq;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name="ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    @ManyToOne
    @JoinColumn(name="HOTEL_ID")
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Column(name="UNIDAD")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Column(name="UNIDAD_HOTEL")
	public String getUniteq() {
		return uniteq;
	}

	public void setUniteq(String uniteq) {
		this.uniteq = uniteq;
	}
    

}
