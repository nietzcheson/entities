package com.m4c.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Usuario on 28/07/2015.
 */
@Entity
@Table(name="M4CTABLA")
public class DataCard implements Serializable {
    /*private  Long idBooking;
    private  Long payment;*/

    private  String name;
    private  String lastName;
    private  String nCard;
    private  String cvv;
    private  String exp;
    private  String tipoCard;
    public DataCardId dataCardId;


    @Column(name = "CAMPO7")
    public String getName() {
        return name;
    }
    @Column(name = "CAMPO8")
    public String getLastName() {
        return lastName;
    }

    @Column(name = "CAMPO3")
    public String getnCard() {
        return nCard;
    }

    @Column(name = "CAMPO6")
    public String getCvv() {
        return cvv;
    }

    @Column(name = "CAMPO5")
    public String getExp() {
        return exp;
    }
    @Column(name = "CAMPO4")
    public String getTipoCard() {
        return tipoCard;
    }
    public DataCard(String idBooking, Integer payment, String name, String lastName, String nCard, String cvv, String exp, String typeCard) {

        this.name = name;
        this.lastName = lastName;
        this.nCard = nCard;
        this.cvv = cvv;
        this.exp = exp;
        this.tipoCard = typeCard;
        this.setDataCardId( new DataCardId(payment.toString(),idBooking));
    }

    public DataCard() {
    }

    @EmbeddedId
    @AttributeOverrides( {
            @AttributeOverride(name="idBooking", column=@Column(name="CAMPO1", unique=false, nullable=false, insertable=true, updatable=true) ),
            @AttributeOverride(name="payment", column=@Column(name="CAMPO2", unique=false, nullable=false, insertable=true, updatable=true) ) } )
    public DataCardId getDataCardId() {
        return dataCardId;
    }

    public void setTipoCard(String tipoCard) {
        this.tipoCard = tipoCard;
    }

    public void setDataCardId(DataCardId dataCardId) {
        this.dataCardId = dataCardId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setnCard(String nCard) {
        this.nCard = nCard;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }


}
