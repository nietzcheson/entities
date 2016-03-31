package com.m4c.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.*;
import com.m4c.model.base.IDEntity;
import org.hibernate.annotations.*;

/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CVENTA")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sale implements IDEntity{

	private static final long serialVersionUID = 1L;
	private Long id;

	private Campaign campaign;
	private Customer customer;
	private Date saleDate;
	private String consultant;
	private String verifier;
	private Integer numberOfPayments;
	private String user;
	private String status;
	private Date insertDate;
	private String numGuia;
	private String cardNumber;
	private CardType cardType;
	private String expiration;
	private String securityCode;
	private String certificate;
	private String comments;
	private Long idCallCenter;
	private String certificateNumber;
	private Double comissionAgent;
	private Double comissionVerifier;
	private Integer regular;
	private String supervisor;
	private String collectionAgent;
	private Date collectionDate;
	private Long extras;
	private String record;
	private Double downpayment;
//	@JsonIgnore
	@JsonManagedReference
	private List<Reservation> reservations =  new ArrayList<Reservation>();
	@JsonManagedReference
	private List<Survey> survies =  new ArrayList<Survey>();
	@Id
	@Column(name="IDBOOKING")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="IDCAMPANIA")
    @JsonIgnoreProperties({"foliosCertificado","campaigns"})
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnoreProperties({"saleSet"})
    @JoinColumn(name="IDCLIENTE")
	public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
	@Column(name="FECHAVENTA")
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	@Column(name="CONSULTOR")
	public String getConsultant() {
		return consultant;
	}
	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}
	
	@Column(name="IDVERIFICADOR")
    public String getVerifier() {
		return this.verifier;
	}
	public void setVerifier(String verifier) {
		this.verifier = verifier;
	}
	
	@Column(name="NUMPAGOS")
	public Integer getNumberOfPayments() {
		return numberOfPayments;
	}
	public void setNumberOfPayments(Integer numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}
	
	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name="IDSTATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
	@Column(name="FECHA")
	public Date getInsertDate() {
		return insertDate;
	}	
	
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;	
	}	
	
	@Column(name="NUMGUIA")
	public String getNumGuia() {
		return numGuia;
	}
	public void setNumGuia(String numGuia) {
		this.numGuia = numGuia;
	}
	
	@Column(name="NUMTARJETA")
	public String getCardNumber() {
		return cardNumber;
	}
    public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

    @ManyToOne
    @JoinColumn(name = "TIPOTARJETA")
    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

	@Column(name="VENCIMIENTO")
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	@Column(name="CODSEGURIDAD")
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	@Column(name="CERTIFICADO")
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	@Column(name="OBSERVACIONES")
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Column(name="IDCALLCENTER")
	public Long getIdCallCenter() {
		return idCallCenter;
	}
	public void setIdCallCenter(Long idCallCenter) {
		this.idCallCenter = idCallCenter;
	}

	@Column(name="NUMCERT")
	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}



	
	@Column(name="COMISION_CONSULTOR")
	public Double getComissionAgent() {
		return this.comissionAgent;
	}
	public void setComissionAgent(Double comissionAgent) {
	    this.comissionAgent = comissionAgent;
	}

	@Column(name="COMISION_VERIFICADOR")
	public Double getComissionVerifier() {
	    return this.comissionVerifier;
	}
	public void setComissionVerifier(Double comissionVerifier) {
	    this.comissionVerifier = comissionVerifier;
	}
    @Column(name="REGULAR")
    public Integer getRegular() {
        return regular;
    }

    public void setRegular(Integer regular) {
        this.regular = regular;
    }
    @Column(name="IDSUPERVISOR")
	public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    @Column(name="AGENTECOBRANZA")
    public String getCollectionAgent() {
        return collectionAgent;
    }

    public void setCollectionAgent(String collectionAgent) {
        this.collectionAgent = collectionAgent;
    }
    @Column(name="FECHACOBRANZA")
    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
    @Column(name="EXTRAS")
    public Long getExtras() {
        return extras;
    }

    public void setExtras(Long extras) {
        this.extras = extras;
    }
    @Column(name="IDGRABACION")
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
	@Column(name="ENGANCHE")
	public Double getDownpayment() {
		return downpayment;
	}

	public void setDownpayment(Double downpayment) {
		this.downpayment = downpayment;
	}

//	@OneToMany
//			(mappedBy = "booking",fetch = FetchType.EAGER)
//	@Fetch(FetchMode.SUBSELECT)
//	@JoinFormula(value="(SELECT res.IDBOOKING from M4CRESERVACION res where res.IDBOOKING=IDBOOKING)")
//	@JoinColumnsOrFormulas({
//			@JoinColumnOrFormula(formula =
//			@JoinFormula(value = "(SELECT res.IDBOOKING from M4CRESERVACION res where res.IDBOOKING=IDBOOKING)",
//					referencedColumnName = "IDBOOKING")) })
//	public List<Reservation> getReservations() {
//		return reservations;
//	}
//	public void setReservations(List<Reservation> reservations) {
//		this.reservations = reservations;
//	}

	@OneToMany(mappedBy = "sale",fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnoreProperties({"sale"})
	public List<Survey> getSurvies() {
		return survies;
	}
	public void setSurvies(List<Survey> survies) {
		this.survies = survies;
	}

	public Sale(Campaign campaign, Customer customer, Long idBooking, String consultant, String verifier, String supervisor, Integer numberOfPayments,
				String certificateNumber, String user, String status,
				Date saleDate, Date insertDate, Integer regular, Long extra, String collectionAgent,
				Date collectionDate, String comments, String record) {
        this.id=idBooking;
        this.consultant = consultant;
        this.verifier = verifier;
        this.numberOfPayments = numberOfPayments;
        this.certificateNumber = certificateNumber;
        this.user = user;
        this.status = status;
        this.saleDate = saleDate;
        this.insertDate = insertDate;
        this.regular = regular;
        this.supervisor = supervisor;
        this.campaign = campaign;
        this.customer = customer;
        this.idCallCenter = campaign.getCallCenter().getId();
        this.extras = extra;
        this.collectionAgent=collectionAgent;
        this.collectionDate=collectionDate;
        this.comments=comments;
        this.record=record;
    }

    public Sale() {
    }




}