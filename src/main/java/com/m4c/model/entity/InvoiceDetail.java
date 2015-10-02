package com.m4c.model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CDETALLEFACTURA")
public class InvoiceDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private Invoice invoice;    //IDFACTURA
	private Reservation reservation;  //IDRESERVACION
	private int nights;   //NOCHES
	private int adults;   //ADULTOS
	private int childs;  // NINOS
	private int totalAges;  //TOTALEDADES
	private int rooms;    //HABITACIONES
	private int extraNights;  //EXNOCHES
	private int extraAdults; //EXADULTOS
	private int extraChilds;  //EXNINOS
	private double priceExtraNights; //PRECIOEXNOCHES
	private double priceExtraAdults;  //PRECIOEXADULTOS
	private double priceExtraChilds; //PRECIOEXNINOS
	private double rateExtraNights; //TARIFAEXNOCHES
	private double rateExtraAdults;  //TARIFAEXADULTOS
	private double rateExtraChilds; //TARIFAEXNINOS
	private double priceRegular;  //PRECIOREGULAR
	private String plan;  //PLAN
	private double anticipo; //ANTICIPO
    private ReservationStatus status; //STATUS
    private InvoiceDetailPk invoiceDetailPk; //
    private String note;
    private double difference = 0.0;
    private Double hotelTaxes=0.0;
    

    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="idReservation", column=@Column(name="IDRESERVACION", unique=false, nullable=false, insertable=true, updatable=true) ),
        @AttributeOverride(name="idInvoice", column=@Column(name="IDFACTURA", unique=false, nullable=false, insertable=true, updatable=true) ) } )
	public InvoiceDetailPk getDetailInvoicePk() {
		return invoiceDetailPk;
	}
	public void setDetailInvoicePk(InvoiceDetailPk invoiceDetailPk){
		this.invoiceDetailPk = invoiceDetailPk;
	}

	@Column(name="ADULTOS")
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}

	@Column(name="NINOS")
	public int getChilds() {
		return childs;
	}
	public void setChilds(int childs) {
		this.childs = childs;
	}

	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	@JoinColumn(name="IDFACTURA", unique=false, nullable=false, insertable=false, updatable=false)
    public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	@Column(name="NOCHES")
	public int getNights() {
		return nights;
	}
	public void setNights(int nights) {
		this.nights = nights;
	}

	@Column(name="PLAN")
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}

	@ManyToOne
	@JoinColumn(name="IDRESERVACION", unique=false, nullable=false, insertable=false, updatable=false)
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Column(name="HABITACIONES")
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}  

	@Column(name="TOTALEDADES")
	public int getTotalAges() {
		return totalAges;
	}
	public void setTotalAges(int totalAges) {
		this.totalAges = totalAges;
	}

    @Column(name="EXADULTOS")
	public int getExtraAdults() {
		return extraAdults;
	}
	public void setExtraAdults(int extraAdults) {
		this.extraAdults = extraAdults;
	}

	@Column(name="EXNINOS")
	public int getExtraChilds() {
		return extraChilds;
	}
	public void setExtraChilds(int extraChilds) {
		this.extraChilds = extraChilds;
	}

	@Column(name="EXNOCHES")
	public int getExtraNights() {
		return extraNights;
	}
	public void setExtraNights(int extraNights) {
		this.extraNights = extraNights;
	}

    @Column(name="TARIFAEXADULTOS")
	public double getRateExtraAdults() {
		return rateExtraAdults;
	}
	public void setRateExtraAdults(double rateExtraAdults) {
		this.rateExtraAdults = rateExtraAdults;
	}

	@Column(name="TARIFAEXNINOS")
	public double getRateExtraChilds() {
		return rateExtraChilds;
	}
	public void setRateExtraChilds(double rateExtraChilds) {
		this.rateExtraChilds = rateExtraChilds;
	}

	@Column(name="TARIFAEXNOCHES")
	public double getRateExtraNights() {
		return rateExtraNights;
	}
	public void setRateExtraNights(double rateExtraNights) {
		this.rateExtraNights = rateExtraNights;
	}

    @Column(name="PRECIOEXADULTOS")
	public double getPriceExtraAdults() {
		return priceExtraAdults;
	}
	public void setPriceExtraAdults(double priceExtraAdults) {
		this.priceExtraAdults = priceExtraAdults;
	}

	@Column(name="PRECIOEXNINOS")
	public double getPriceExtraChilds() {
		return priceExtraChilds;
	}
	public void setPriceExtraChilds(double priceExtraChilds) {
		this.priceExtraChilds = priceExtraChilds;
	}

	@Column(name="PRECIOEXNOCHES")
	public double getPriceExtraNights() {
		return priceExtraNights;
	}

	public void setPriceExtraNights(double priceExtraNights) {
		this.priceExtraNights = priceExtraNights;
	}

	@Column(name="PRECIOREGULAR")
	public double getPriceRegular() {
		return priceRegular;
	}
	public void setPriceRegular(double priceRegular) {
		this.priceRegular = priceRegular;
	}

    @Transient
    public double getTotal() {
    	if(hotelTaxes==null) hotelTaxes=0.0;
        return priceExtraAdults+ priceExtraChilds+priceExtraNights+ priceRegular- hotelTaxes;
	}
    
    @Column(name="HOTELTAXES")
    public Double getHotelTaxes() {
    	if(hotelTaxes==null) hotelTaxes=0.0;
		return hotelTaxes;
	}
	public void setHotelTaxes(Double hotelTaxes) {
		this.hotelTaxes = hotelTaxes;
	}
		
	@Column(name="ANTICIPO")
	public double getAnticipo() {
		return anticipo;
	}
	public void setAnticipo(double anticipo) {
		this.anticipo = anticipo;
	}

    @Transient
    public double getSaldo() {
        return  getTotal() - anticipo;
	}

    @ManyToOne
	@JoinColumn(name="IDSTATUS")
    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    @Column(name="NOTAS")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Column(name="DIFERENCIACXC")
    public double getDifference() {
        return difference;
    }
    public void setDifference(double difference) {
        this.difference = difference;
    }

    public String toString() {
        return status.toString();
    }
    
}
