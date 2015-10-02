package com.m4c.model.entity.online;

import com.fasterxml.jackson.annotation.*;
import com.m4c.model.base.BeanComparator;
import com.m4c.model.base.IDEntity;
import javax.persistence.*;

import com.m4c.model.entity.Campaign;
import org.apache.commons.lang.StringUtils;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


/**
 * User: Elvira Aranda
 * Date: 25/03/2008
 * Time: 04:27:12 PM
 */
@Entity
@Table(name = "M4CCERTSCLIENTES@M4CPUBLIC")
//@Table(name = "M4CCERTSCLIENTES@DBLNK_ONLINEDB_TEST")
@javax.persistence.SequenceGenerator(name="SEQ_CLIENTES", sequenceName="SEQ_CLIENTES",allocationSize=1)

public class CertCustomer implements IDEntity {

    public static final String TAG = CertCustomer.class.getSimpleName();
	private static final long serialVersionUID = 1L;
	private Long id;
    private String companyName;
    /*@JsonIgnore
    private CertCustomer ownerCustomer;*/
    private String responsableName;
    @JsonIgnore
    private CertsConfig config;
    private String invoiceAddress;
    private String phone;
    private String country;
    private String state;
    private String city;
    @JsonProperty("stateId")
    private Long stateId;
    //@JsonProperty("campaigns")
    //@JsonManagedReference
    //@JsonBackReference
  //  @JsonBackReference
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")

     @JsonIgnoreProperties({"foliosCertificado","certCustomer","destinations","offer", "program", "segment","config"})
   // @JsonIdentityReference(alwaysAsId = true)
    private List<Campaign> campaigns;
    /*@JsonIgnore
    private CertLogin certLogin;*/
    @JsonIgnore
    private List<CertContact> contacts = new ArrayList<CertContact>();

    //@JsonIgnore
    //@JsonProperty("brokers")
//    @JsonIgnoreProperties("certCustomer")
    @JsonIgnore
   private List<CertLogin> logins = new ArrayList<CertLogin>();
    @JsonIgnore
    private List<CertCustomer> leads =  new ArrayList<CertCustomer>();
    @JsonIgnore
    private List<Certificate> certificates =  new ArrayList<Certificate>();
    /*@JsonIgnore
    private List<CustomerNote> notes =  new ArrayList<CustomerNote>();*/
    @JsonIgnore
    private int totalUsed;
    @JsonIgnore
    private int totalNotUsed;
    @JsonIgnore
    private int space;
    @JsonIgnore
    private Date acceptedDate;
    @JsonIgnore
    private Long callCenter;

    private CertLogin user;

    
    @Id
    @Column(name = "ID")
   // @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CLIENTES")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "COMPANIA")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

   @OneToOne(mappedBy="masterBroker")

    public CertLogin getUser() {
        return user;
    }

    public void setUser(CertLogin user) {
        this.user = user;
    }
    /*@ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "IDCLIENTE")
    public CertCustomer getOwnerCustomer() {
        return ownerCustomer;
    }

    public void setOwnerCustomer(CertCustomer ownerCustomer) {
        this.ownerCustomer = ownerCustomer;
    }
*/
    @Column(name="DIRECCIONFACT")
    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    @Column(name="TELEFONO")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Transient
    public Long getStateId() {
        return  stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    @Column(name="PAIS")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }





    @Column(name="ESTADO")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name="CIUDAD")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    @Column(name="ACEPTATERMINOS")	
    public Date getAcceptedDate() {
		return acceptedDate;
	}

	public void setAcceptedDate(Date acceptedDate) {
		this.acceptedDate = acceptedDate;
	}
	
	@Column(name="IDCALLCENTER")
	public Long getCallCenter() {
		return callCenter;
	}

	public void setCallCenter(Long callCenter) {
		this.callCenter = callCenter;
	}

	 //@ManyToOne(fetch= FetchType.EAGER)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "certCustomer")
    @Fetch(value = FetchMode.SUBSELECT)
    @LazyCollection(LazyCollectionOption.TRUE)
	public List<CertLogin> getLogins() {
		return logins;
	}

	public void setLogins(List<CertLogin> logins) {
		this.logins = logins;
	}
	/*
	@Transient
    public CertLogin getCertLogin() {
		if(logins.size()>0)
			certLogin = logins.get(0);
		else
			certLogin=null;
        return certLogin;
    }

	public boolean addCertLogin(CertLogin cert) {
	    return getLogins().add(cert);
	}*/

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "certCustomer")
    //@LazyCollection(LazyCollectionOption.FALSE)
    public List<CertContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<CertContact> contacts) {
        this.contacts = contacts;
    }

    /*
    @Transient
    public int getIsMaster() {
        if (getOwnerCustomer() == null)
            return 1;
        else return 0;
    }*/

  /* @OneToMany(mappedBy = "ownerCustomer", fetch= FetchType.LAZY)
    public List<CertCustomer> getLeads() {
        return leads;
    }

    public void setLeads(List<CertCustomer> leads) {
        this.leads = leads;
    }*/
    @OneToMany(mappedBy = "certCustomer")
    @LazyCollection(LazyCollectionOption.FALSE)
    @Fetch(value = FetchMode.SUBSELECT)
    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

  public boolean addContact(CertContact o) {
        return getContacts().add(o);
    }
      
    @OneToOne(mappedBy = "certCustomer")
    public CertsConfig getConfig() {
		return config;
	}

	public void setConfig(CertsConfig config) {
		this.config = config;
	}


	/*// @OneToMany(mappedBy = "certCustomer", fetch= FetchType.EAGER) Para cancuncards(ecertificate) este es el formato
    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "certCustomer") Para manager certs	y reservations
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "certCustomer")
    public List<CustomerNote> getNotes() {
        return notes;
    }

    public void setNotes(List<CustomerNote> notes) {
        this.notes = notes;
    }

    public boolean addNote(CustomerNote o) {
        return notes.add(o);
    }*/
/*

    @Transient
    public List<CustomerNote> getDeploymentNotes() {
        List<CustomerNote> list = new ArrayList<CustomerNote>();
        for(CustomerNote note : notes){
            if(note.getNoteType().getId()==Long.parseLong("1")){
                 list.add(note);
            }
        }
        Collections.sort(list, new BeanComparator("date", "DESC"));        
        return list;
       
    }
*/

   

    @OneToMany(mappedBy = "certCustomer")
    public List<Certificate> getCertificates() {
        return certificates;
    }


    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }


    @Transient
    public List<Certificate> getUsedCertificates() {
        List<Certificate> usedCertificates = new ArrayList<Certificate>();
        for(Certificate c: getCertificates()){
            if(c.getBookingId()!=null) usedCertificates.add(c);
        }
        Collections.sort(usedCertificates, new BeanComparator("number", "ASC")); 
        return usedCertificates;
    }

     @Transient
    public List<Certificate> getNotUsedCertificates() {
        List<Certificate> notUsedCertificates = new ArrayList<Certificate>();
        for(Certificate c: getCertificates()){
            if(c.getBookingId()==null) notUsedCertificates.add(c);
        }
        Collections.sort(notUsedCertificates, new BeanComparator("number", "ASC")); 
        return notUsedCertificates;
    }



    @Transient
    public int getTotalUsed() {
    	  return totalUsed;
    }

    public void setTotalUsed(int totalUsed) {
        this.totalUsed = totalUsed;
    }

    @Transient
    public int getTotalNotUsed() {
    	 return totalNotUsed;
    }

    public void setTotalNotUsed(int totalNotUsed) {
        this.totalNotUsed = totalNotUsed;
    }
  

    @Transient
    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Transient
    public int[] getSpaces() {
        return new int[space];
    }

    @Transient
    public String getName() {    	
    	return StringUtils.substring(companyName, 0, 28);
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertCustomer that = (CertCustomer) o;


        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (invoiceAddress != null ? !invoiceAddress.equals(that.invoiceAddress) : that.invoiceAddress != null)
            return false;
       /* if (ownerCustomer != null ? !ownerCustomer.equals(that.ownerCustomer) : that.ownerCustomer != null)
            return false;*/
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        /*result = 31 * result + (ownerCustomer != null ? ownerCustomer.hashCode() : 0);*/
        result = 31 * result + (invoiceAddress != null ? invoiceAddress.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);

       result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        return result;
    }
    @Column(name="RESPONSABLENAME")
    public String getResponsableName() {
        return responsableName;
    }

    public void setResponsableName(String responsableName) {
        this.responsableName = responsableName;
    }

    public CertCustomer(String companyName, String responsableName, String phone, String country, String state, String city, CertLogin user, String invoiceAddress) {
        this.companyName = companyName;
        this.responsableName = responsableName;
        this.phone = phone;
        this.country = country;
        this.state = state;
        this.city = city;
       //this.user = user;
        this.invoiceAddress = invoiceAddress;
       // System.out.println("ID Cert "+this.id);
    }

    public CertCustomer() {
    }

    public String toString(){
    	return companyName;
    }
	
}

