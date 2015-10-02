package com.m4c.model.entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table (name="M4CCOMISION")
public class Commission implements IDEntity {
	private static final long serialVersionUID = 1L;
	
	private Long id; 
	private Date	date;
	private User	user;
	private Double	amount;
	private Integer	currency;
	private Double	exchangeRate;
	private CategoryService	category;
	private String	concept;
	private Double	commission;
	private Long booking;
	private Long reservation;
	private Long idContractService;
	private Long idPayment;
	private Long idcatcommission;
    private Integer iddepartment;
    private Date dateini;
    private Date datefin;
    private String codcategory;
    private String programa;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column (name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="FECHA")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@ManyToOne()
	@JoinColumn(name="IDUSER")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Column (name="MONTO")
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Column(name="MONEDA")
	public Integer getCurrency() {
		return currency;
	}
	public void setCurrency(Integer currency) {
		this.currency = currency;
	}
	
	@Column(name="TCAMBIO")
	public Double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	@ManyToOne()
	@JoinColumn(name="IDCATSERVICIO")
	public CategoryService getCategory() {
		return category;
	}
	public void setCategory(CategoryService category) {
		this.category = category;
	}
	
	@Column(name="CONCEPTO")
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	
	@Column(name="COMISION")
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	
	@Column(name="IDBOOKING")
	public Long getBooking() {
		return booking;
	}
	public void setBooking(Long booking) {
		this.booking = booking;
	}
	
	@Column(name="IDRESERVACION")
	public Long getReservation() {
		return reservation;
	}
	public void setReservation(Long reservation) {
		this.reservation = reservation;
	}
	
	@Column(name="IDSERVICIOCONTRATADO")
	public Long getIdContractService() {
		return idContractService;
	}
	public void setIdContractService(Long idContractService) {
		this.idContractService = idContractService;
	}
	
	@Column(name="IDPAGO")
	public Long getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}
	
	@Column(name="IDCATCOMISION")
	  public Long getIdcatcommission() {
	    return this.idcatcommission;
	  }
	  public void setIdcatcommission(Long idcatcommission) {
	    this.idcatcommission = idcatcommission;
	  }

	  @Column(name="IDDEPTO")
	  public Integer getIddepartment() {
	    return this.iddepartment;
	  }
	  public void setIddepartment(Integer iddepartment) {
	    this.iddepartment = iddepartment;
	  }

	  @Column(name="FECHAINI")
	  public Date getDateini() {
	    return this.dateini;
	  }
	  public void setDateini(Date dateini) {
	    this.dateini = dateini;
	  }

	  @Column(name="FECHAFIN")
	  public Date getDatefin() {
	    return this.datefin;
	  }
	  public void setDatefin(Date datefin) {
	    this.datefin = datefin;
	  }

	  @Column(name="CODCATEGORIA")
	  public String getCodcategory() {
	    return this.codcategory;
	  }
	  public void setCodcategory(String codcategory) {
	    this.codcategory = codcategory;
	  }

	  @Column(name="PROGRAMA")
	  public String getPrograma() {
	    return this.programa;
	  }
	  public void setPrograma(String programa) {
	    this.programa = programa;
	  }
	
}
