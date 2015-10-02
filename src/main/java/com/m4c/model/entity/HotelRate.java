package com.m4c.model.entity;

import com.m4c.model.base.IDEntity;
import javax.persistence.*;

/**
 * Date: 5/09/2007
 *
 * @author Elvira Aranda
 * @version 1.1
 */
@Entity
@Table(name="M4CTARIFASXHOTEL")
public class HotelRate implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private Hotel hotel;
    private Integer adults;
    private Integer nigths;
    private Integer rooms;
    private String plan;
    private double price;

    @Id
    @Column(name="ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="IDHOTEL")
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

     @Column(name="ADULTOS")
    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

     @Column(name="NOCHES")
    public Integer getNigths() {
        return nigths;
    }

    public void setNigths(Integer nigths) {
        this.nigths = nigths;
    }

     @Column(name="CUARTOS")
    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

     @Column(name="PLAN")
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }   

    @Column(name="PRECIO")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
