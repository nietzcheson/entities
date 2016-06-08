package com.m4c.model.entity;

import com.m4c.model.base.IDEntity;

import javax.persistence.*;

/**
 * Created by desarrollo1 on 26/05/2016.
 */
@Entity
@Table(name = "M4CBBRESERVACIONES")
public class ReservationsBulkBank {
    private String M4SGId;
    private String firstname;
    private String lastname;
    private String hotelId;
    private BulkBank bulkbank;
    private Integer status;
    private String username;

    @Id
    @Column(name = "ID_M4SG")
    public String getM4SGId() {
        return M4SGId;
    }

    public void setM4SGId(String m4SGId) {
        M4SGId = m4SGId;
    }

    @Column(name = "NOMBRE")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "APELLIDO")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "ID_HOTEL")
    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @ManyToOne
    @JoinColumn(name="ID_BULKBANK")
    public BulkBank getBulkbank() {
        return bulkbank;
    }

    public void setBulkbank(BulkBank bulkbank) {
        this.bulkbank = bulkbank;
    }


    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "USUARIO")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
