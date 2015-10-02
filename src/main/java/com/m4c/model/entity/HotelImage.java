package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Juan on 1/29/2015.
 */
@Entity
@Table(name = "m4chotel_images")
@NamedQueries({
        @NamedQuery(
                name = "com.m4c.model.entity.HotelImage.findAll",
                query = "SELECT h FROM HotelImage h"
        )
})
@javax.persistence.SequenceGenerator(name = "SEQ_GEN", sequenceName = "HOTEL_IMG_SEQ", allocationSize = 1)
public class HotelImage implements Serializable {

    public static final String TAG = HotelImage.class.getSimpleName();

    private long id;
    private Hotel hotel;
    private String token;
    private String path;
    private String url;
    private Date date;

    public HotelImage() {
        this.hotel = null;
        this.token = null;
        this.path=null;
    }

    public HotelImage(Hotel hotel, String token, String path,String url) {
        this.hotel = hotel;
        this.token = token;
        this.path = path;
        this.url = url;
        this.date=new Date();
    }
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    @JsonIgnore
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    @Column(name = "TOKEN")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    @Column(name = "PATH", nullable = false)
    @JsonIgnore
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    @Column(name = "DATE_CREATED", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Column(name = "URL", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelImage that = (HotelImage) o;

        return Objects.equal(this.id, that.id) &&
                Objects.equal(this.hotel, that.hotel) &&
                Objects.equal(this.token, that.token) &&
                Objects.equal(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, hotel, token, path);
    }
}
