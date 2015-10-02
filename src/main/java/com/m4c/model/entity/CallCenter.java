package com.m4c.model.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.m4c.model.base.IDEntity;

/**
 * @author Elvira Aranda
 * @version 1.0
 */

@Entity
@Table(name = "M4CCALLCENTER")
@javax.persistence.SequenceGenerator(name="SEQ_GEN", sequenceName="IDCALLCENTER")
public class CallCenter implements IDEntity {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String address;
    private String rfc;
    private String idSunset;
    private Integer invoice;
    private Integer active;
    private Integer paradise;
    private Integer maxReservas;
    private Integer folio; 
    private String contact1;
    private String email1;
    private String phone;
    private Integer hooked;
    private Program program;
    @JsonBackReference
    private ResOnlineConfig config;
    private Segment segment;
    private Integer oneway;
    private String merchant;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name = "IDCALLCENTER")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NOMBRE")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "RFC")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Column(name = "DIRECCION")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "ACTIVO")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Column(name = "FACTURA")
    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    @Column(name="IDSUNSET")
    public String getIdSunset() {
        return idSunset;
    }

    public void setIdSunset(String idSunset) {
        this.idSunset = idSunset;
    }

    @Column(name="PARADISEDESTINATION")    
    public Integer getParadise() {
        return paradise;
    }

    public void setParadise(Integer paradise) {
        this.paradise = paradise;
    }

    public String toString() {
        return name;
    }    
    
    @Column(name="FOLIO")  
    public Integer getFolio() {
		return folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}

	@Column(name="MAXRESERVAS")  
	public Integer getMaxReservas() {
		return maxReservas;
	}

	public void setMaxReservas(Integer maxReservas) {
		this.maxReservas = maxReservas;
	}


	@OneToOne(mappedBy="callCenter")
	public ResOnlineConfig getConfig() {
		return config;
	}

	public void setConfig(ResOnlineConfig config) {
		this.config = config;
	}

	@Column(name="CONTACTO_1")
	public String getContact1() {
		return contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	@Column(name="EMAIL_1")
	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	
	@Column(name="TELEFONO")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name="SOFTHOOK")
	public Integer getHooked() {
		return hooked;
	}

	public void setHooked(Integer hooked) {
		this.hooked = hooked;
	}
	
	@ManyToOne
    @JoinColumn(name = "PROGRAMA")
    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
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

	@Column(name="MERCHANT")	
	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	    
}
