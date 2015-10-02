package com.m4c.model.entity.tc;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.m4c.model.base.IDEntity;

@Entity
@Table(name = "SOLICITUDES_RESERVACION")
public class SolicitudesReservacion implements IDEntity {
	
	private static final long serialVersionUID = 1L;
    private Long id;
    private String status;
    private Date dateStatus;
    
    @Id
    @Column(name = "NUMSOLICITUD")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="IDSTATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name="FECHASTATUS")
	public Date getDateStatus() {
		return dateStatus;
	}
	public void setDateStatus(Date dateStatus) {
		this.dateStatus = dateStatus;
	}

    
}
