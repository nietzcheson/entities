package com.m4c.model.entity;

import java.util.*;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.m4c.model.base.IDEntity;
import com.m4c.model.base.BeanComparator;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Formula;

/**
 * @author Elvira Aranda
 * @version 1.0
 */

@Entity
@Table(name = "M4CRESERVACION")
@javax.persistence.SequenceGenerator(name="SEQ_GEN", sequenceName="IDRESERVACION")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reservation implements IDEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date dateRequest;
    private Customer customer;
    private int adult;
    private int child;
    private String status;
    private Hotel hotel;
    private CallCenter callCenter;
    private String invoiced;
    private Program program;
    private Date initialDate;
    private Date finalDate;
    private String unit;
    private String hotelUnit;
    private String userName;
    private Sale booking;
    private String bookingsm;//BOOKINGSUMMERBAY
    private String cards;
    private Long  numeroManifesto;
    private int visa;
    private int mc;
    private int amex;
    private int other;
    private Integer hooked;
    private String maritalStatus;
    private String pickup;
    private String cotra;
    private Integer income;
    private String intPlan;
    private String sPlan;
    private String ages;
    private String confirm;
    private String confirm2;
    private String confirm3;
    private Integer priority=0;
    private PreCall preCall;
    private double revenue=0.0;
    private String source;
    private String membership;
    private String card;
    private Segment segment;
    private Integer oneway;
    private String rep;
    private Integer commission;
    private Integer shipping;
    private Integer shipping2;
    private Date shippingDate;
    private Date shippingDate2;
    private String polizaAssistCard;
    //private Long idreservacionpv;
    private List<Pax> paxes = new ArrayList<Pax>();
    private List<InvoiceDetail> payments = new ArrayList<InvoiceDetail>();
    private List<Pickup> pickups = new ArrayList<Pickup>();
    private List<ContractService> services = new ArrayList<ContractService>();
    private List<PaymentReservation> reservationPayments = new ArrayList<PaymentReservation>();
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name = "IDRESERVACION")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"reservation"})
    @JoinColumn(name="IDCLIENTE")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Column(name = "FECHA_RESERVACION")
    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }

    @Column(name = "TOTAL_ADULTO")
    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    @Column(name = "TOTAL_MENOR")
    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    @ManyToOne
    @JoinColumn(name = "IDCALLCENTER")
    public CallCenter getCallCenter() {
        return callCenter;
    }

    public void setCallCenter(CallCenter callCenter) {
        this.callCenter = callCenter;
    }

    @ManyToOne
    @JoinColumn(name = "HOTEL_ID")
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Column(name = "FACTURADA")
    public String getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(String invoiced) {
        this.invoiced = invoiced;
    }

    @ManyToOne
    @JoinColumn(name = "IDPROGRAMA")
    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Column(name = "CHECKOUT")
    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    @Column(name = "CHECKIN")
    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    @Column(name = "PLAN_ALIMENTICIO")
    public String getIntPlan() {
        return intPlan;
    }

    public void setIntPlan(String intPlan) {
        this.intPlan = intPlan;
    }
    
    /*@Column(name="IDRESERVACIONPV")
    public Long getIdreservacionpv() {
		return idreservacionpv;
	}

	public void setIdreservacionpv(Long idreservacionpv) {
		this.idreservacionpv = idreservacionpv;
	}*/

	@Transient
    public String getSPlan() {
        sPlan = "AI";
        if (intPlan.equals("4"))
            sPlan = "EP";
        if (intPlan.equals("7"))
            sPlan = "AIM";
        return sPlan;
    }
    
    public void setSPlan(String plan) {
		sPlan = plan;
	}

    @Column(name = "NUMCONFIRMACION")
    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
    
    @Column(name = "NUMCONFIRMACION2")
    public String getConfirm2() {
        return confirm2;
    }

    public void setConfirm2(String confirm2) {
        this.confirm2 = confirm2;
    }
    
    @Column(name = "NUMCONFIRMACION3")
    public String getConfirm3() {
        return confirm3;
    }

    public void setConfirm3(String confirm3) {
        this.confirm3 = confirm3;
    }
    
	@Column(name = "IDTIPOUNIDAD")
    public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Column(name = "CLAVEUNIDAD")
	public String getHotelUnit() {
		return hotelUnit;
	}

    @Column(name = "IDMANIFIESTO")
    public Long getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(Long numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }




    public void setHotelUnit(String hotelUnit) {
		this.hotelUnit = hotelUnit;
	}

	@Column(name = "IDUSER")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonIgnoreProperties({"survies"})
//    @JoinColumn(name="IDBOOKING")
//	public Sale getBooking() {
//		return booking;
//	}
//
//	public void setBooking(Sale booking) {
//		this.booking = booking;
//	}
	
	@Column(name = "BOOKINGSM")
	public String getBookingsm() {
		return bookingsm;
	}

	public void setBookingsm(String bookingsm) {
		this.bookingsm = bookingsm;
	}

	@Column(name = "NUMTARJETAS")
	public String getCards() {
		return cards;
	}

	public void setCards(String cards) {
		this.cards = cards;
	}

	@Column(name = "VISA")
	public int getVisa() {
		return visa;
	}

	public void setVisa(int visa) {
		this.visa = visa;
	}
	@Column(name = "MC")
	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		this.mc = mc;
	}
	@Column(name = "AMEX")
	public int getAmex() {
		return amex;
	}

	public void setAmex(int amex) {
		this.amex = amex;
	}
	
	@Column(name = "HOOKED")
	public Integer getHooked() {
		return hooked;
	}

	public void setHooked(Integer hooked) {
		this.hooked = hooked;
	}

	@Column(name = "OTRA")
	public int getOther() {
		return other;
	}

	public void setOther(int other) {
		this.other = other;
	}

	@Column(name = "ESTADOCIVIL")
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "PICKUP")
	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	@Column(name = "COTRA")
	public String getCotra() {
		return cotra;
	}

	public void setCotra(String cotra) {
		this.cotra = cotra;
	}

	@Column(name = "INCOME")
	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}
	
	
	@Column(name = "PRIORIDAD")
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	@ManyToOne
	@JoinColumn(name="IDPRECALL")
	public PreCall getPreCall() {
		return preCall;
	}

	public void setPreCall(PreCall preCall) {
		this.preCall = preCall;
	}
	
	@Column(name = "CANAL")
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	@Column(name="MEMBRESIA")
	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}
	
	@Column(name="TARJETA_AGENTE")
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	@ManyToOne
    @JoinColumn(name = "SEGMENTO")
	public Segment getSegment() {
		return segment;
	}

	public void setSegment(Segment segment) {
		this.segment = segment;
	}
    
	@Column(name="ONEWAYTRANS")	
	public Integer getOneway() {
		return oneway;
	}

	public void setOneway(Integer oneway) {
		this.oneway = oneway;
	}
	
	@Column(name="REP")
	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	@OneToMany(mappedBy = "reservation",fetch = FetchType.EAGER)
   // @JoinColumn(name = "IDRESERVACION")
    public List<Pax> getPaxes() {
        return paxes;
    }

    public void setPaxes(List<Pax> paxes) {
        this.paxes = paxes;
    }
    
    public boolean addPax(Pax p) {
	    return paxes.add(p);
	}
    
    
    @OneToMany(mappedBy = "reservation")
   // @JoinColumn(name = "IDRESERVACION")
    public List<ContractService> getServices() {
		return services;
	}

	public void setServices(List<ContractService> services) {
		this.services = services;
	}
	
	@OneToMany(mappedBy = "reservation")
	//@JoinColumn(name = "IDRESERVACION")
	public List<PaymentReservation> getReservationPayments() {
		return reservationPayments;
	}

	public void setReservationPayments(List<PaymentReservation> reservationPayments) {
		this.reservationPayments = reservationPayments;
	}
	
	@Column(name="COMISIONABLE")	
	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}
	
	@Column(name = "ENVIO1")
	public Integer getShipping() {
		return shipping;
	}
	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}
	
	@Column(name = "ENVIO2")
	public Integer getShipping2() {
		return shipping2;
	}
	public void setShipping2(Integer shipping2) {
		this.shipping2 = shipping2;
	}
	
	@Column(name = "FECHAENVIO1")
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	
	@Column(name = "FECHAENVIO2")
	public Date getShippingDate2() {
		return shippingDate2;
	}
	public void setShippingDate2(Date shippingDate2) {
		this.shippingDate2 = shippingDate2;
	}

	@Transient
	public double getRevenue() {
		revenue =0.0;
		for(ContractService cs : this.services) {
			revenue = revenue + cs.getAmount();			
		}
		return revenue;
	}
	
	@Transient
    public String getAges() {
        ages = "";
        for (Pax pax : this.paxes) {
            if (pax.getAge() != null)
                ages = ages + pax.getAge().toString() + "|";
        }
        return ages;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }

    @Transient
    public int getNight() {
        int night;
        Calendar checkin = Calendar.getInstance();
        Calendar checkout = Calendar.getInstance();
        if (this.getInitialDate() != null && this.getFinalDate() != null) {
            checkin.setTime(this.getInitialDate());
            checkout.setTime(this.getFinalDate());
            night = checkout.get(Calendar.DAY_OF_YEAR) - checkin.get(Calendar.DAY_OF_YEAR);
            if (night < 0) {
                int daysByYear = checkin.getActualMaximum(Calendar.DAY_OF_YEAR);
                night = night + daysByYear;
            }
            return night;
        }
        return 0;
    }

    @Transient
    public String getName() {
        String name = customer.getLastName() + " " + customer.getFirstName();
        if (!paxes.isEmpty()) {
            Pax p = paxes.get(0);
            name = p.getLastName() + " " + p.getFirstName();
        }
        return name;
    }

    @Transient
    public String getFirstName() {
        String name = customer.getFirstName();
        if (!paxes.isEmpty()) {
            Pax p = paxes.get(0);
            name = p.getFirstName();
        }
        return name;
    }

    @Transient
    public String getLastName() {
        String name = customer.getLastName();
        if (!paxes.isEmpty()) {
            Pax p = paxes.get(0);
            name = p.getLastName();
        }
        return name;
    }

    @OneToMany
    @JoinColumn(name = "IDRESERVACION")
    public List<InvoiceDetail> getPayments() {
        return payments;
    }

    public void setPayments(List<InvoiceDetail> payments) {
        this.payments = payments;
    }

    @Transient
    public double getPaymentAmount() {
        double paymentAmount = 0.0;
        if (!payments.isEmpty()) {
            Collections.sort(payments, new BeanComparator("invoice.id", "ASC"));
            int index = payments.size() - 1;
            payments.get(index);
            paymentAmount = payments.get(index).getTotal();
        }
        return paymentAmount;
    }
    
    
    @Transient
    public double getTaxesAmount() {
        double taxesAmount = 0.0;
        if (!payments.isEmpty()) {
            Collections.sort(payments, new BeanComparator("invoice.id", "ASC"));
            int index = payments.size() - 1;
            payments.get(index);
            taxesAmount = payments.get(index).getHotelTaxes();
        }
        return taxesAmount;
    }

    @ManyToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            mappedBy = "reservations",
            targetEntity = Pickup.class
    )
    public List<Pickup> getPickups() {
        return pickups;
    }

    public void setPickups(List<Pickup> pickups) {
        this.pickups = pickups;
    }

    @Column(name="POLIZASEGURO")
    public String getPolizaAssistCard() {
        return polizaAssistCard;
    }

    public void setPolizaAssistCard(String polizaAssistCard) {
        this.polizaAssistCard = polizaAssistCard;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adult;
		result = prime * result + amex;
		result = prime * result + ((booking == null) ? 0 : booking.hashCode());
		result = prime * result
				+ ((callCenter == null) ? 0 : callCenter.hashCode());
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		result = prime * result + child;
		result = prime * result + ((confirm == null) ? 0 : confirm.hashCode());
		result = prime * result + ((cotra == null) ? 0 : cotra.hashCode());
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result
				+ ((dateRequest == null) ? 0 : dateRequest.hashCode());
		result = prime * result
				+ ((finalDate == null) ? 0 : finalDate.hashCode());
		result = prime * result + ((hooked == null) ? 0 : hooked.hashCode());
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result
				+ ((hotelUnit == null) ? 0 : hotelUnit.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((income == null) ? 0 : income.hashCode());
		result = prime * result
				+ ((initialDate == null) ? 0 : initialDate.hashCode());
		result = prime * result + ((intPlan == null) ? 0 : intPlan.hashCode());
		result = prime * result
				+ ((invoiced == null) ? 0 : invoiced.hashCode());
		result = prime * result
				+ ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + mc;
		result = prime * result + other;
		result = prime * result + ((pickup == null) ? 0 : pickup.hashCode());
		result = prime * result + ((program == null) ? 0 : program.hashCode());
		result = prime * result + ((sPlan == null) ? 0 : sPlan.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + visa;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Reservation other = (Reservation) obj;
		if (adult != other.adult)
			return false;
		if (amex != other.amex)
			return false;
		if (booking == null) {
			if (other.booking != null)
				return false;
		} else if (!booking.equals(other.booking))
			return false;
		if (callCenter == null) {
			if (other.callCenter != null)
				return false;
		} else if (!callCenter.equals(other.callCenter))
			return false;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		if (child != other.child)
			return false;
		if (confirm == null) {
			if (other.confirm != null)
				return false;
		} else if (!confirm.equals(other.confirm))
			return false;
		if (cotra == null) {
			if (other.cotra != null)
				return false;
		} else if (!cotra.equals(other.cotra))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (dateRequest == null) {
			if (other.dateRequest != null)
				return false;
		} else if (!dateRequest.equals(other.dateRequest))
			return false;
		if (finalDate == null) {
			if (other.finalDate != null)
				return false;
		} else if (!finalDate.equals(other.finalDate))
			return false;
		if (hooked == null) {
			if (other.hooked != null)
				return false;
		} else if (!hooked.equals(other.hooked))
			return false;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (hotelUnit == null) {
			if (other.hotelUnit != null)
				return false;
		} else if (!hotelUnit.equals(other.hotelUnit))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (income == null) {
			if (other.income != null)
				return false;
		} else if (!income.equals(other.income))
			return false;
		if (initialDate == null) {
			if (other.initialDate != null)
				return false;
		} else if (!initialDate.equals(other.initialDate))
			return false;
		if (intPlan == null) {
			if (other.intPlan != null)
				return false;
		} else if (!intPlan.equals(other.intPlan))
			return false;
		if (invoiced == null) {
			if (other.invoiced != null)
				return false;
		} else if (!invoiced.equals(other.invoiced))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (mc != other.mc)
			return false;
		if (this.other != other.other)
			return false;
		if (pickup == null) {
			if (other.pickup != null)
				return false;
		} else if (!pickup.equals(other.pickup))
			return false;
		if (program == null) {
			if (other.program != null)
				return false;
		} else if (!program.equals(other.program))
			return false;
		if (sPlan == null) {
			if (other.sPlan != null)
				return false;
		} else if (!sPlan.equals(other.sPlan))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (visa != other.visa)
			return false;
		return true;
	}
    
}