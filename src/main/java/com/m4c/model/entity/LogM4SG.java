package com.m4c.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.m4c.model.base.IDEntity;

import java.util.Date;

@Entity
@Table(name = "M4SGLOG")
public class LogM4SG implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String userID;
	private String userName;
	private String ipAddress;
	private String module;
	private String window;
	private String action;
	private Date creationDate;
	private String detail;
	private Integer bookingID;
	private Integer reservationID;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m4sglog_sequence")
	@SequenceGenerator(name = "m4sglog_sequence", sequenceName = "M4SGLOG_SEQ", allocationSize=1)
	@Column (name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="IDUSER")
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	@Column(name="NOMBRE_USUARIO")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name="IP")
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	@Column(name="MODULO")
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	
	@Column(name="VENTANA")
	public String getWindow() {
		return window;
	}
	public void setWindow(String window) {
		this.window = window;
	}
	
	@Column(name="ACCION")
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	@Column(name="FECHA")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Column(name="DETALLE")
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	@Column(name="IDBOOKING")
	public Integer getBookingID() {
		return bookingID;
	}
	public void setBookingID(Integer bookingID) {
		this.bookingID = bookingID;
	}
	
	@Column(name="IDRESERVACION")
	public Integer getReservationID() {
		return reservationID;
	}
	public void setReservationID(Integer reservationID) {
		this.reservationID = reservationID;
	}

    public LogM4SG(String userID, String userName, String ipAddress, String module, String window, String action, Date creationDate, String detail, Integer bookingID, Integer reservationID) {
        this.userID = userID;
        this.userName = userName;
        this.ipAddress = ipAddress;
        this.module = module;
        this.window = window;
        this.action = action;
        this.creationDate = creationDate;
        this.detail = detail;
        this.bookingID = bookingID;
        this.reservationID = reservationID;
    }

    @Override
    public String toString() {
        return "LogM4SG{" +
                "id=" + id +
                ", userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", module='" + module + '\'' +
                ", window='" + window + '\'' +
                ", action='" + action + '\'' +
                ", creationDate=" + creationDate +
                ", detail='" + detail + '\'' +
                ", bookingID=" + bookingID +
                ", reservationID=" + reservationID +
                '}';
    }
}
