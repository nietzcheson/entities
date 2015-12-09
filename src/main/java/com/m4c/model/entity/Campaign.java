package com.m4c.model.entity;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.*;
import com.m4c.model.base.IDEntity;
import com.m4c.model.entity.online.CertCustomer;
import com.m4c.model.entity.online.CertLogin;
import com.m4c.model.entity.online.Country;
import org.hibernate.annotations.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author Elvira Aranda
* @version 1.0
*/
@Entity
@Table(name="M4CCATCAMPANA")
@javax.persistence.SequenceGenerator(name="SEQ_CAMPANIA", sequenceName="SEQ_CAMPANIA",allocationSize=1)
public class Campaign implements IDEntity{
	private static final long serialVersionUID = 1L;
    public static final String TAG = Campaign.class.getSimpleName();
	private Long id;
	private String name;
//	@JsonIgnore
//	private String destinies;
	@JsonIgnore
	private Integer type;

	private CallCenter callCenter;
	@JsonIgnore
	private Integer invoice;
	@JsonIgnore
	private Integer hook;
	@JsonIgnore
	private ResOnlineConfig config;
	@JsonIgnore
	private Boolean ai;
//	@JsonIgnore
	private Program program;
    private Segment segment;
    private String merchant;
	@JsonIgnore
    private Integer oneway;
	@JsonIgnore
    private String clave;
	@JsonIgnore
    private Integer online;
    private String codigo;
    private Integer expira;
    private ReservationGroup reservationGroup;
    private Country country;
	private List<FoliosCertificado> foliosCertificado;

	private Integer typeCertificate; //  1- E-CERT   2- FISICOS
	private Integer typeFolio;      //  1- Generico  2- Unico

	private Offer offer;
	private String  slug;
	private Integer  status;
	private Date dateCreated=new Date();
    private Date dateUpdated;
    private String description;

	@Column(name="SUBJECT")
	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}
	@Column(name="BODY")
	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	private String Subject;
	private String Body;
    //@JsonIgnore
    //@JsonBackReference
    //@JsonInclude(JsonInclude.Include.NON_EMPTY)


    private CertCustomer certCustomer;
//	@JsonIgnoreProperties({"certCustomer","campana"})
//	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="user")
	//@JsonManagedReference
    @JsonIgnore
	private List<CertLogin> brokers = new ArrayList<CertLogin>();
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="IDCAMPANIA")
	//@GeneratedValue( generator = "trigger" )
	//@GenericGenerator( name="trigger", strategy="com.m4sg.crm4marketingsunset.util.TriggerAssignedIdentityGenerator" )
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="DESTINOS")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

	@Column(name="CAMPANIA")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="TIPO")
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}


    @ManyToOne
    @JoinColumn(name="IDCALLCENTER")
	public CallCenter getCallCenter() {
		return callCenter;
	}
	public void setCallCenter(CallCenter callCenter) {
		this.callCenter = callCenter;
	}

	@Column(name="FACTURA")
	public Integer getInvoice() {
		return invoice;
	}
	public void setInvoice(Integer invoice) {
		this.invoice = invoice;
	}

	@Column(name="CERTSOFTHOOK")
	public Integer getHook() {
		return hook;
	}
	public void setHook(Integer hook) {
		this.hook = hook;
	}

	@OneToOne(mappedBy="campaign", fetch = FetchType.LAZY)
	public ResOnlineConfig getConfig() {
		return config;
	}

	public void setConfig(ResOnlineConfig config) {
		this.config = config;
	}

	@Column(name="AI")
	public Boolean getAi() {
		return ai;
	}
	public void setAi(Boolean ai) {
		this.ai = ai;
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

	@Column(name="MERCHANT")
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	@Column(name="ONEWAYTRANS")
	public Integer getOneway() {
		return oneway;
	}

	public void setOneway(Integer oneway) {
		this.oneway = oneway;
	}

	@Column(name="CLAVE")
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}


	@Column(name="PAGOS_ONLINE")
	public Integer getOnline() {
		return online;
	}
	public void setOnline(Integer online) {
		this.online = online;
	}

	@Column(name="CODIGO")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Column(name="EXPIRA")
	public Integer getExpira() {
		return expira;
	}

	public void setExpira(Integer expira) {
		this.expira = expira;
	}
	@ManyToOne
	@JoinColumn(name= "IDRESERVATIONGROUP",nullable = false)
	public ReservationGroup getReservationGroup() {
		return reservationGroup;
	}

	public void setReservationGroup(ReservationGroup reservationGroup) {
		this.reservationGroup = reservationGroup;
	}

	@ManyToOne
	@JoinColumn(name = "CODIGOPAIS")
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@OneToMany(cascade=CascadeType.ALL, mappedBy = "campaign", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JsonIgnoreProperties({"campaign"})
	public List<FoliosCertificado> getFoliosCertificado() {
		return foliosCertificado;
	}

	public void setFoliosCertificado(List<FoliosCertificado> foliosCertificado) {
		this.foliosCertificado = foliosCertificado;
	}
	@Column(name = "TIPO_CERT")
	public Integer getTypeCertificate() {
		return typeCertificate;
	}

	public void setTypeCertificate(Integer typeCertificate) {
		this.typeCertificate = typeCertificate;
	}
	@Column(name = "TIPO_FOLIO")
	public Integer getTypeFolio() {
		return typeFolio;
	}

	public void setTypeFolio(Integer typeFolio) {
		this.typeFolio = typeFolio;
	}
	@ManyToOne
	@JoinColumn(name= "OFFER_ID",nullable = false)
	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

//    @Column(name = "description")
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }


    public Campaign(String name,String codigo,
					Integer type, CallCenter callCenter,
					Segment segment, String merchant,ReservationGroup reservationGroup,
					int expiration,Country country,int typeFolio,int typeCertificate,
					Offer offer, String description) {
		this.name = name;
		this.codigo=codigo;
		this.type = type;
		this.callCenter = callCenter;
		this.segment = segment;
		this.merchant = merchant;
		this.reservationGroup=reservationGroup;
		this.expira=expiration;
		this.country= country;
		this.typeCertificate=typeCertificate;
		this.typeFolio=typeFolio;
		this.offer=offer;
		this.description=description;
	}
@Column(name = "SLUG")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "date_created")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC")
    public Date getDateCreated() {
        return dateCreated;
    }
    @Column(name = "date_updated")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Campaign(){

	}
    //@JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCLIENTE")
	@JsonIgnoreProperties({"campaigns","user"})
    public CertCustomer getCertCustomer() {
        return certCustomer;
    }

    public void setCertCustomer(CertCustomer certCustomer) {
        this.certCustomer = certCustomer;
    }
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "campaign")
	@Fetch(value = FetchMode.SUBSELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	public List<CertLogin> getBrokers() {
		return brokers;
	}

	public void setBrokers(List<CertLogin> brokers) {
		this.brokers = brokers;
	}
}
