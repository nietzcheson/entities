package com.m4c.model.entity;

import java.util.*;
import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.*;
import com.m4c.model.entity.online.Country;
import com.m4c.model.entity.online.State;
import org.apache.commons.lang.StringUtils;
import com.m4c.model.base.IDEntity;
import org.hibernate.annotations.*;


/**
 *
 * @author Elvira Aranda
 * @version 1.0
 */

@Entity
@Table(name="M4CLIENTE")
public class Customer implements IDEntity{
    private static final long serialVersionUID = 1L;
    public static final String TAG = Customer.class.getSimpleName();
    private Long id;
   // @JsonIgnore
    private CallCenter callCenter;
    private String firstName;
    private String lastName;
    private String address;
    private Country country;
    private State state;
    private String city;
    private String postalCode;
    private String userName;
    private String email;
    private String phone1;
    private String phone2;
    private String phone3;
    private String movil;
    private String fax;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
    private Date birthdate;
    private Integer DOBDay;
    private Integer DOBMonth;
    private Integer DOBYear;
    @JsonProperty("age")
    private Integer Age;



    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
    private Date date=new Date();
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC" )
    private Date updateDate=new Date();
    @JsonIgnore
    private List<Reservation> reservations =  new ArrayList<Reservation>();
    @JsonIgnore
    private List<CustomerNote> notes =  new ArrayList<CustomerNote>();
    @JsonIgnore
    private List<CustomerCard> cards =  new ArrayList<CustomerCard>();
    private Integer income=15000;
    private int visa=0;
    private int mc=0;
    private int amex=0;
    private int other=0;
    private String comments="";
    //private int taxes=0;
    private int maxNotes=0;
    private String qualify="";
    private String ageRange;
    private String srcQualify;     //CALIFICACION_ORIGEN
    private Double srcIncome;   //INGRESOS_ORIGEN
    private String src;         //SALA_ORIGEN
    private String reasonNq;    //MOTIVO_NQ_ORIGEN
    private String occupation;

    private EdoCivil maritalStatus;
    private Title title;
    private Set<CustomerFeatures> featuresesLst=new HashSet<CustomerFeatures>();
    @JsonManagedReference
    private Set<Sale> saleSet=new HashSet<Sale>();


    @Id
    @Column (name="IDCLIENTE")
//    @GeneratedValue( generator = "trigger" )
//    @GenericGenerator( name="trigger", strategy="com.m4sg.crm4marketingsunset.util.TriggerAssignedIdentityGenerator" )
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="DIRECCION")
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="IDCALLCENTER")

    public CallCenter getCallCenter() {
        return callCenter;
    }
    public void setCallCenter(CallCenter callCenter) {
        this.callCenter = callCenter;
    }

    @Column (name="NOMBRE")
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column (name="APELLIDO")
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToOne
    @JoinColumn (name="PAIS",insertable = false,updatable = false)
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }



    @ManyToOne

    @JoinColumns({
            @JoinColumn(name = "ESTADO",referencedColumnName ="code" ),
            @JoinColumn(name = "PAIS",referencedColumnName ="PAIS_CODE" )
    })
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }




    @Column (name="CIUDAD")
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Column (name="CP")
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Column (name="IDUSER")
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column (name="EMAIL")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column (name="TELEFONO")
    public String getPhone1() {
        return phone1;
    }
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Column (name="TELEFONO2")
    public String getPhone2() {
        return phone2;
    }
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Column (name="TELEFONO3")
    public String getPhone3() {
        return phone3;
    }
    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }
    @Column (name="CELULAR")
    public String getMovil() {
        return movil;
    }
    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Column (name="FAX")
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }

    @Column (name="FECHA")
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    @Column (name="FECHAUPDATE")
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    //@OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL, CascadeType.MERGE}, mappedBy = "customer")
    @OneToMany(cascade = {CascadeType.ALL, CascadeType.MERGE}, mappedBy = "customer",fetch = FetchType.LAZY)
//	@JoinColumn(name = "IDCLIENTE")
    public List<CustomerNote> getNotes() {
        return notes;
    }

    public void setNotes(List<CustomerNote> notes) {
        this.notes = notes;
    }

    public boolean addNote(CustomerNote o) {
        return notes.add(o);
    }


    @OneToMany(cascade = {CascadeType.ALL, CascadeType.MERGE}, mappedBy = "customer",fetch = FetchType.LAZY)
//	@JoinColumn(name = "IDCLIENTE")
    public List<CustomerCard> getCards() {
        return cards;
    }
    public void setCards(List<CustomerCard> cards) {
        this.cards = cards;
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer",fetch = FetchType.LAZY)
//     @JoinColumn(name = "IDCLIENTE")
    public List<Reservation> getReservations() {
        return reservations;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public boolean addReservation(Reservation r) {
        return reservations.add(r);
    }


    @Column(name="RANGOEDAD")
    public String getAgeRange() {
        return ageRange;
    }
    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    @Transient
    public Integer getIncome() {
        if(reservations.size()>0)
            income = reservations.get(0).getIncome();
        return income;
    }
    @Transient
    public int getVisa() {
        if(reservations.size()>0)
            visa=reservations.get(0).getVisa();
        return visa;
    }

    @Transient
    public int getMc() {
        if(reservations.size()>0)
            mc=reservations.get(0).getMc();
        return mc;
    }

    @Transient
    public int getAmex() {
        if(reservations.size()>0)
            amex=reservations.get(0).getAmex();
        return amex;
    }

    @Transient
    public int getOther() {
        if(reservations.size()>0)
            other=reservations.get(0).getOther();
        return other;
    }

    @Transient
    public String getComments() {
        for(CustomerNote note :notes) {
            if(note.getNoteType().getId().equals(Long.parseLong("15")))
                comments =note.getNote();
            if(note.getNoteType().getId().equals(Long.parseLong("3")))
                comments =note.getNote();
        }
        return comments;
    }

    @Transient
    public int getMaxNotes() {
        for(CustomerNote note :notes) {
            if(note.getNumber()>maxNotes)
                maxNotes = note.getNumber();
        }
        return maxNotes;
    }


    @Transient
    public int getMaxReservas() {
        Integer maxTotal = callCenter.getMaxReservas();
        if(maxTotal==null)
            maxTotal=5;
        for(Reservation r : reservations) {
            if(!StringUtils.equals("13", r.getStatus()))
                maxTotal --;
        }
        return maxTotal;
    }

    @Transient
    public String getQualify() {
        if(reservations.size()>0) {
            if(reservations.get(0).getPreCall()!=null)
                qualify=reservations.get(0).getPreCall().getQualify();
            else {
                for(Reservation r : reservations) {
                    if(r.getPreCall()!=null)
                        qualify=r.getPreCall().getQualify();
                }
            }
        }
        return qualify;
    }


    @Column (name="CALIFICACION_ORIGEN")
    public String getSrcQualify() {
        return srcQualify;
    }
    public void setSrcQualify(String srcQualify) {
        this.srcQualify = srcQualify;
    }

    @Column (name="INGRESOS_ORIGEN")
    public Double getSrcIncome() {
        return srcIncome;
    }
    public void setSrcIncome(Double srcIncome) {
        this.srcIncome = srcIncome;
    }

    @Column (name="SALA_ORIGEN")
    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }

    @Column (name="MOTIVO_NQ_ORIGEN")
    public String getReasonNq() {
        return reasonNq;
    }
    public void setReasonNq(String reasonNq) {
        this.reasonNq = reasonNq;
    }
    @ManyToOne
    @JoinColumn(name = "TITULO_ID")
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
    @Column(name ="OCUPACION" )
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    @ManyToOne
    @JoinColumn(name = "IDEDOCIVIL")
    public EdoCivil getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(EdoCivil maritalStatus) {
        this.maritalStatus = maritalStatus;
    }



    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customerFeaturesId.customer", cascade=CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    public Set<CustomerFeatures> getFeaturesesLst() {
        return featuresesLst;
    }

    public void setFeaturesesLst(Set<CustomerFeatures> featuresesLst) {
        this.featuresesLst = featuresesLst;
    }
    @Column(name ="FECHA_NACIMIENTO" )
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    @OneToMany(mappedBy = "customer",fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JsonIgnoreProperties({"cardNumber","expiration","securityCode","comissionAgent","comissionVerifier"})
    public Set<Sale> getSaleSet() {
        return saleSet;
    }

    public void setSaleSet(Set<Sale> saleSet) {
        this.saleSet = saleSet;
    }

    public Integer getDOBDay() {
        return DOBDay;
    }

    public void setDOBDay(Integer DOBDay) {
        this.DOBDay = DOBDay;
    }

    public Integer getDOBMonth() {
        return DOBMonth;
    }

    public void setDOBMonth(Integer DOBMonth) {
        this.DOBMonth = DOBMonth;
    }

    public Integer getDOBYear() {
        return DOBYear;
    }

    public void setDOBYear(Integer DOBYear) {
        this.DOBYear = DOBYear;
    }
    @Transient
    public Integer getAge() {


        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
