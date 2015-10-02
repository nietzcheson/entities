package com.m4c.model.entity.online;

import com.m4c.model.base.IDEntity;
import javax.persistence.*;


/**
 * User: Elvira Aranda
 * Date: 25/03/2008
 * Time: 04:35:40 PM
 */
@Entity
//@Table(name = "M4CCERTSCONTACTOS@DBLNK_ONLINEDB_TEST")
@Table(name = "M4CCERTSCONTACTOS@M4CPUBLIC")
public class CertContact implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private CertCustomer certCustomer;
    private String firstName;
    private String lastName;
    private String address;
    private String country;
    private String state;
    private String city;
    private String email;
    private String phone;

    @Id  
    @Column(name = "ID") 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="IDCLIENTE")
    public CertCustomer getCertCustomer() {
        return certCustomer;
    }

    public void setCertCustomer(CertCustomer certCustomer) {
        this.certCustomer = certCustomer;
    }

    @Column(name="NOMBRE")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="APELLIDO")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name="DIRECCION")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Column(name="EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="TELEFONO")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name="CIUDAD")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertContact that = (CertContact) o;

        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (certCustomer != null ? !certCustomer.equals(that.certCustomer) : that.certCustomer != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (certCustomer != null ? certCustomer.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
