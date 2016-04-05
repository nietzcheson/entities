package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.m4c.model.base.IDEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by desarrollo1 on 23/03/2016.
 */
@Entity
@Table(name="M4CSURVEY")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Survey  implements IDEntity {
    private Long id;
    private Date checkIn;
    private Date checkOut;
    private Sale sale;

    @Id
    @Column(name="IDSURVEY")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="CHECKIN")
    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    @Column(name="CHECKOUT")
    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"survies"})
    @JoinColumn(name="IDBOOKING")
    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
