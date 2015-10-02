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


@Entity
@Table(name = "M4CLOGRESERVACIONONLINE")
public class LogReservation implements IDEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    private CallCenter callCenter;
    private Date update;
    private String action;
    

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name="IDLOG")
    public Long getId() {
    	return id;
    }
    public void setId(Long id) {
    	this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="IDCALLCENTER")
    public CallCenter getCallCenter() {
    	return callCenter;
    }
    public void setCallCenter(CallCenter callCenter) {
    	this.callCenter = callCenter;
    }
    
    @Column(name="FECHA")
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	
	@Column(name="ACCION")
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
}
