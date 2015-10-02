package com.m4c.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CSERVICIOSCONTRATADOS")
public class ContractService implements Serializable {
	private static final long serialVersionUID = 1L;

	private ContractServicePk pk=new ContractServicePk();
	private SubService subService;
	private Long idContractService;
	private Long idBooking;	
	private Integer quantity;
	private Integer pax;
	private Double amount;
	private String description;
	private String user;
	private Date insertDate=new Date();
	private Date updateDate=new Date();
	private Integer childs;
	private Reservation reservation;
	private String certificateNumber; 
	private Integer commission;
	private String userComission;
	private Promocion idPromotion;
	private String confirmation;
	private String location;
	private Long folioDolphin;
	private Integer rateExchange;

	 @EmbeddedId
	    @AttributeOverrides( {
	        @AttributeOverride(name="idService", column=@Column(name="IDSERVCONTRATADO", unique=false, nullable=false, insertable=true, updatable=true) ),
	        @AttributeOverride(name="idBooking", column=@Column(name="IDBOOKING", unique=false, nullable=false, insertable=true, updatable=true) ) } )		
	public ContractServicePk getPk() {
		return pk;
	}

	public void setPk(ContractServicePk pk) {
		this.pk = pk;
	}
	
	
	@Column(name="IDSERVCONTRATADO", unique=false, nullable=false, insertable=false, updatable=false)
	public Long getIdContractService() {
		return idContractService;
	}

	public void setIdContractService(Long idContractService) {
		this.idContractService = idContractService;
	}

	@Column(name="IDBOOKING", unique=false, nullable=false, insertable=false, updatable=false)
	public Long getIdBooking() {
		return idBooking;
	}

	public void setIdBooking(Long idBooking) {
		this.idBooking = idBooking;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="IDSUBSERVICIO")
	public SubService getSubService() {
		return subService;
	}

	public void setSubService(SubService subService) {
		this.subService = subService;
	}

	@Column(name="CANTIDAD")
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name="PERSONAS")
	public Integer getPax() {
		return pax;
	}

	public void setPax(Integer pax) {
		this.pax = pax;
	}

	@Column(name="IMPORTE")
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name="DESCRIPCION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name="FECHA")
	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	@Column(name="FECHAUPDATE")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name="MENORES")
	public Integer getChilds() {
		return childs;
	}

	public void setChilds(Integer childs) {
		this.childs = childs;
	}
	
	@ManyToOne
	@JoinColumn(name="IDRESERVACION")
	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	@Column(name="NUMCERT")
	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	@Column(name="COMISION")
	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}
	
	@Column(name="USER_COMISION")
	public String getUserComission() {
		return userComission;
	}

	public void setUserComission(String userComission) {
		this.userComission = userComission;
	}

    public ContractService(Long idBooking, Long idContractService, SubService subService, String description, String user, String certificateNumber, Integer pax,Integer childs,Integer quantity, Double amount) {
        this.pk.setIdBooking( idBooking);
        this.idContractService = idContractService;
        this.pk.setIdService(idContractService);
        this.subService = subService;
        this.description = description;
        this.user = user;
        this.certificateNumber = certificateNumber;
        this.pax = pax;
        this.amount = amount;
        this.quantity=quantity;
        this.childs=childs;

    }

    public ContractService(){

    }
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="IDPROMOCION")
	public Promocion getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(Promocion idPromotion) {
		this.idPromotion = idPromotion;
	}

	@Column(name="CONFIRMA")
	public String getConfirmation() {
		return confirmation;
	}
	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	
	@Column(name="LOCACION")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name="FOLIODOLPHIN")
	public Long getFolioDolphin() {
		return folioDolphin;
	}
	public void setFolioDolphin(Long folioDolphin) {
		this.folioDolphin = folioDolphin;
	}

	@Column(name="TIPOCAMBIO")
	public Integer getRateExchange() {
		return rateExchange;
	}

	public void setRateExchange(Integer rateExchange) {
		this.rateExchange = rateExchange;
	}
}
