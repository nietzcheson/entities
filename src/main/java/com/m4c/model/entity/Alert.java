package com.m4c.model.entity;


import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.m4c.model.base.IDEntity;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "M4CALERTAS")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

//@javax.persistence.SequenceGenerator(name="SEQ_GENALERT", sequenceName="IDALERTA")
public class Alert implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String user;
	private String group;
	private Date date;
	private String type;
 	@JsonIgnore
	private Customer customer;
	@JsonIgnore
	private Reservation reservation;
	private Date changedDate;
	private Date closedDate;
	private String status;
	private String sourceUser;
	private String sourceGroup;
	private String comments;
	private String closeUser;
	private Date createdDate;
	private String url;
	private Long idContract;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GENALERT")
	@Column(name="IDALERTA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="USUARIO")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name="GRUPO")
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	@Column(name="FECHA")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
	public Date getDate() {		
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name="TIPOALERTA")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCLIENTE")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

//	@ManyToOne()
//	@JsonIgnore
//	@LazyCollection(LazyCollectionOption.FALSE)
//    @JoinColumn(name = "IDRESERVACION")
//	public Reservation getReservation() {
//		return reservation;
//	}
//	public void setReservation(Reservation reservation) {
//		this.reservation = reservation;
//	}
	@JsonIgnore
	@Column(name="FECHACAMBIO")
	public Date getChangedDate() {
		return changedDate;
	}
	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}

	@JsonIgnore
	@Column(name="FECHACERRADA")
	public Date getClosedDate() {
		return closedDate;
	}
	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	@Column(name="STATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name="USUARIOORIGEN")
	public String getSourceUser() {
		return sourceUser;
	}
	public void setSourceUser(String sourceUser) {
		this.sourceUser = sourceUser;
	}
	@JsonIgnore
	@Column(name="GRUPOORIGEN")
	public String getSourceGroup() {
		return sourceGroup;
	}
	public void setSourceGroup(String sourceGroup) {
		this.sourceGroup = sourceGroup;
	}

	@Column(name="COMENTARIOS")
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@JsonIgnore
	@Column(name="USUARIOCIERRE")
	public String getCloseUser() {
		return closeUser;
	}
	public void setCloseUser(String closeUser) {
		this.closeUser = closeUser;
	}

	@Column(name="FECHACREADA")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name="URL")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@JsonIgnore
	@Column(name="IDCONTRATO")
	public Long getIdContract() {
		return idContract;
	}
	public void setIdContract(Long idContract) {
		this.idContract = idContract;
	}
		

}
