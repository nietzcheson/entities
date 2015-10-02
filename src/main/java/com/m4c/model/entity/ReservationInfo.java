package com.m4c.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;


@Entity
@Table(name = "M4CRESADICIONALINFO")
@javax.persistence.SequenceGenerator(name="SEQ_GEN", sequenceName="IDADICIONALINFO")
public class ReservationInfo  implements IDEntity {
    private static final long serialVersionUID = 1L;
    
	private Long id;
	private Reservation reservation;
    private String concierge;
    private Date date;
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne()
    @JoinColumn(name = "IDRESERVACION")
	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Column(name = "FECHA")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


    @Column(name="CONCIERGE")
	public String getConcierge() {
		return concierge;
	}

	public void setConcierge(String concierge) {
		this.concierge = concierge;
	}
    
    
    

}
