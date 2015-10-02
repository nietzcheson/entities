package com.m4c.model.entity;

import com.m4c.model.base.IDEntity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

/**
 * Date: 4/09/2007
 * @author Elvira Aranda
 * @version 1.1
 */
@Entity
@Table(name="M4CFACTURAXHOTEL")
public class HotelInvoice implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private Reservation reservation;
    private double cost; //Tarifa hotel
    private double callCenterPayment;
    private double hotelTaxesPayment;
    private double totalPayments;//Pagos callcenter
    private boolean invoiced;
    private Boolean confirmedPayments;
    private String reference;
    private Date invoiceDate;
    private ReservationStatus status;
    private double hotelTaxes;
    private List<ExtraCost> extraCosts = new ArrayList<ExtraCost>();
    
    /*private Double extraCost;
    private Double spaCost;//COSTOSPA
    private Double spaExtraCost;//COSTOSPAEXTRA
    private Double islaCost;//COSTOISLA
    private Double islaExtraCost;//COSTOISLAEXTRA
    private Double tourcost;//COSTOTOUR
    private Double lowSeasson;//COSTOTEMPBAJA
    private Double certificateAI; //COSTOCERTAI
    private Boolean breakfast;
    private Boolean spa;
    private Double costoChichenReg;
    private Double costoChichenCenote;
    private Double costoChichenLuz;
    private Double costoTulumExpress;
    private Double costoTulumXelha;
    private Double costoJungleTour;
    private Double costoWaveRunner;
    private Double costoXplorer;
    private Double costoRioSecreto;
    private Double costoNocheMex;
    private Double costoHorseRide;
    private Double costoXcaret;
    private Double costoXcaretPlus;*/

    @Id @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name="ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="IDRESERVACION")
    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Column(name="COSTO")
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Transient
    public double getCallCenterPayment() {
        callCenterPayment = reservation.getPaymentAmount();
        return callCenterPayment;
    }
    public void setCallCenterPayment(double callCenterPayment) {
        this.callCenterPayment = callCenterPayment;
    }

    @Column(name="PAGOS")
	public double getTotalPayments() {
		return totalPayments;
	}
	public void setTotalPayments(double totalPayments) {
		this.totalPayments = totalPayments;
	}	
    
    @Column(name="FACTURADA")
    public Boolean getInvoiced() {
        return invoiced;
    }
    public void setInvoiced(Boolean invoiced) {
        this.invoiced = invoiced;
    }
    
    @Column(name="PAGOSCONFIRMADOS")
    public Boolean getConfirmedPayments() {
        return confirmedPayments;
    }

    public void setConfirmedPayments(Boolean confirmedPayments) {
        this.confirmedPayments = confirmedPayments;
    }
    
    @Column(name="REFERENCIA")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Column(name="FECHAFACT")
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @ManyToOne
    @JoinColumn(name="IDSTATUS")
    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
   
    @Column(name="HOTELTAXES")
	public double getHotelTaxes() {
		return hotelTaxes;
	}

	public void setHotelTaxes(double hotelTaxes) {
		this.hotelTaxes = hotelTaxes;
	}
		
    @OneToMany(cascade = {CascadeType.ALL})  
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
  	@JoinColumn(name="IDFACTURA")
	public List<ExtraCost> getExtraCosts() {
		return extraCosts;
	}

	public void setExtraCosts(List<ExtraCost> extraCosts) {
		this.extraCosts = extraCosts;
	}

	public boolean add(ExtraCost cost) {
		return extraCosts.add(cost);
	}

	/*
	@Column(name="COSTOEXTRA")
	public Double getExtraCost() {
		return extraCost;
	}

	public void setExtraCost(Double extraCost) {
		this.extraCost = extraCost;
	}

    @Column(name="COSTOSPA")
	public Double getSpaCost() {
		return spaCost;
	}

	public void setSpaCost(Double spaCost) {
		this.spaCost = spaCost;
	}

	@Column(name="COSTOSPAEXTRA")
	public Double getSpaExtraCost() {
		return spaExtraCost;
	}

	public void setSpaExtraCost(Double spaExtraCost) {
		this.spaExtraCost = spaExtraCost;
	}

	@Column(name="COSTOISLA")
	public Double getIslaCost() {
		return islaCost;
	}

	public void setIslaCost(Double islaCost) {
		this.islaCost = islaCost;
	}

	@Column(name="COSTOTOUR")
	public Double getTourcost() {
		return tourcost;
	}

	public void setTourcost(Double tourcost) {
		this.tourcost = tourcost;
	}

	@Column(name="COSTOTEMPBAJA")
	public Double getLowSeasson() {
		return lowSeasson;
	}

	public void setLowSeasson(Double lowSeasson) {
		this.lowSeasson = lowSeasson;
	}

	@Column(name="COSTOCERTAI")
	public Double getCertificateAI() {
		return certificateAI;
	}

	public void setCertificateAI(Double certificateAI) {
		this.certificateAI = certificateAI;
	}

	@Column(name="DESAYUNO")
	public Boolean getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(Boolean breakfast) {
		this.breakfast = breakfast;
	}

	@Column(name="SPA")
	public Boolean getSpa() {
		return spa;
	}

	public void setSpa(Boolean spa) {
		this.spa = spa;
	}
				  
	@Column(name="COSTOISLAEXTRA")
	public Double getIslaExtraCost() {
		return islaExtraCost;
	}

	public void setIslaExtraCost(Double islaExtraCost) {
		this.islaExtraCost = islaExtraCost;
	}

	@Transient
    public Double getTotalExtraCost() {
		Double totalExtraCost=0.0;
		if(extraCost!=null)
			totalExtraCost += extraCost;
		if(spaCost!=null)
			totalExtraCost += spaCost;
		if(spaExtraCost!=null)
			totalExtraCost += spaExtraCost;
		if(certificateAI!=null)
			totalExtraCost += certificateAI;
		if(tourcost!=null)
			totalExtraCost += tourcost;
		if(lowSeasson!=null)
			totalExtraCost += lowSeasson;
		if(islaCost!=null)
			totalExtraCost += islaCost;
		if(islaExtraCost!=null)
			totalExtraCost += islaExtraCost;
		
		totalExtraCost += getTotalTours();
		
        return totalExtraCost; 
    }
	
	@Transient
	public Double getTotalTours()
	{		
		Double result = 0.0;
						
		if( this.costoChichenCenote != null )
			result += costoChichenCenote;
		
		if( this.costoChichenLuz != null )
			result += costoChichenLuz;
		
		if( this.costoChichenReg != null )
			result += costoChichenReg;
		
		if( this.costoHorseRide != null )
			result += costoHorseRide;
		
		if( this.costoJungleTour != null)
			result += costoJungleTour;
		
		if( this.costoNocheMex != null)
			result += costoNocheMex;
	
		if( this.costoRioSecreto != null)
			result += costoRioSecreto;
		
		if( this.costoTulumExpress != null)
			result += costoTulumExpress;
		
		if( this.costoTulumXelha != null)
			result += costoTulumXelha;
		
		if( this.costoWaveRunner != null )
			result += costoWaveRunner;
		
		if( this.costoXcaret != null )
			result += costoXcaret;
		
		if( this.costoXcaretPlus != null )
			result += costoXcaretPlus;
		
		if( this.costoXplorer != null )
			result += costoXplorer;
		
		//ORAT cambios de costos de tours?
		if( this.tourcost != null )
		{
			if( this.tourcost > result )
				result = this.tourcost;
		}
		
		return result;		
		
	}
	
	
	@Column(name="COSTO_CHICHENREG")
	public Double getCostoChichenReg() {
		return costoChichenReg;
	}

	public void setCostoChichenReg(Double costoChichenReg) {
		this.costoChichenReg = costoChichenReg;
	}

		
	
	@Column(name="COSTO_CHICHENCENOTE")
	public Double getCostoChichenCenote() {
		return costoChichenCenote;
	}
	public void setCostoChichenCenote(Double costoChichenCenote) {
		this.costoChichenCenote = costoChichenCenote;
	}

	
	@Column(name="COSTO_CHICHENLUZ")
	public Double getCostoChichenLuz() {
		return costoChichenLuz;
	}
	public void setCostoChichenLuz(Double costoChichenLuz) {
		this.costoChichenLuz = costoChichenLuz;
	}
	@Column(name="COSTO_TULUMEXPRESS")
	public Double getCostoTulumExpress() {
		return costoTulumExpress;
	}
	public void setCostoTulumExpress(Double costoTulumExpress) {
		this.costoTulumExpress = costoTulumExpress;
	}
	@Column(name="COSTO_TULUMXELHA")
	public Double getCostoTulumXelha() {
		return costoTulumXelha;
	}
	public void setCostoTulumXelha(Double costoTulumXelha) {
		this.costoTulumXelha = costoTulumXelha;
	}	
	@Column(name="COSTO_JUNGLETOUR")
	public Double getCostoJungleTour() {
		return costoJungleTour;
	}
	public void setCostoJungleTour(Double costoJungleTour) {
		this.costoJungleTour = costoJungleTour;
	}

	
	@Column(name="COSTO_WAVERUNNER")
	public Double getCostoWaveRunner() {
		return costoWaveRunner;
	}
	public void setCostoWaveRunner(Double costoWaveRunner) {
		this.costoWaveRunner = costoWaveRunner;
	}

	
	@Column(name="COSTO_XPLORER")
	public Double getCostoXplorer() {
		return costoXplorer;
	}
	public void setCostoXplorer(Double costoXplorer) {
		this.costoXplorer = costoXplorer;
	}	
	@Column(name="COSTO_RIOSECRETO")
	public Double getCostoRioSecreto() {
		return costoRioSecreto;
	}
	public void setCostoRioSecreto(Double costoRioSecreto) {
		this.costoRioSecreto = costoRioSecreto;
	}
	@Column(name="COSTO_NOCHEMEX")
	public Double getCostoNocheMex() {
		return costoNocheMex;
	}
	public void setCostoNocheMex(Double costoNocheMex) {
		this.costoNocheMex = costoNocheMex;
	}	
	@Column(name="COSTO_HORSERIDE")	
	public Double getCostoHorseRide() {
		return costoHorseRide;
	}
	public void setCostoHorseRide(Double costoHorseRide) {
		this.costoHorseRide = costoHorseRide;
	}
	@Column(name="COSTO_XCARET")		
	public Double getCostoXcaret() {
		return costoXcaret;
	}
	public void setCostoXcaret(Double costoXcaret) {
		this.costoXcaret = costoXcaret;
	}	
	@Column(name="COSTO_XCARETPLUS")
	public Double getCostoXcaretPlus() {
		return costoXcaretPlus;
	}
	public void setCostoXcaretPlus(Double costoXcaretPlus) {
		this.costoXcaretPlus = costoXcaretPlus;
	}	
*/	
	@Transient
    public Double getBalance() {
        return cost - callCenterPayment - hotelTaxesPayment - reservation.getRevenue();
    }
	
	@Transient
    public double getHotelTaxesPayment() {
		 hotelTaxesPayment = reservation.getTaxesAmount();
        return hotelTaxesPayment;
    }
	 
	 @Transient
	 public Double getTotalExtraCost() {
		 Double extraCost =0.0;
		for(ExtraCost ec: this.getExtraCosts())
			 extraCost+=ec.getExtraCost();
		return 	extraCost;		 
	 }
	 
}