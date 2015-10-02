package com.m4c.model.entity.sistemas;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Fernando on 26/03/2015.
 */
@Entity
@Table(name = "USUARIO")
public class UserIntranet {
    public static final String TAG = UserIntranet.class.getSimpleName();
    private String username;
    private TypeUser typeUSer;//
    private String password;
    private String name;
    private Area area;//
    private Position position;//
    private Integer accessLevel;
    private String phone;
    private Location location;//
    private String address;
    private String email;
    private String photo;
    private Integer manMonth;
    private Integer active;
    private Integer publico;
    private String phone2;
    private String extension;
    private String fax;
    private String faxUSA;
    private String emailUSA;
    private String extensionUSA;
    private Date expiryDate;
    private Integer vacunLimited;
    @Id
    @Column(name = "USUARIO_ID")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @ManyToOne
    @JoinColumn(name = "TIPO_USUARIO_ID")
    public TypeUser getTypeUSer() {
        return typeUSer;
    }

    public void setTypeUSer(TypeUser typeUSer) {
        this.typeUSer = typeUSer;
    }
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "NOMBRE")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToOne
    @JoinColumn(name = "DEPTO_ID")
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    @ManyToOne
    @JoinColumn(name = "PUESTO_ID")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    @Column(name = "NIVEL_ACCESO")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }
    @Column(name = "TELEFONO")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @ManyToOne
    @JoinColumn(name = "LOCACION_ID")
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    @Column(name = "DIRECCION")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "FOTOGRAFIA")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    @Column(name = "HOMBREDELMES")
    public Integer getManMonth() {
        return manMonth;
    }

    public void setManMonth(Integer manMonth) {
        this.manMonth = manMonth;
    }
    @Column(name = "ACTIVO")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
    @Column(name = "PUBLICO")
    public Integer getPublico() {
        return publico;
    }

    public void setPublico(Integer publico) {
        this.publico = publico;
    }
    @Column(name = "TELEFONO2")
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
    @Column(name = "EXTENSION")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    @Column(name = "FAX")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    @Column(name = "FAXUSA")
    public String getFaxUSA() {
        return faxUSA;
    }

    public void setFaxUSA(String faxUSA) {
        this.faxUSA = faxUSA;
    }
    @Column(name = "EMAILUSA")
    public String getEmailUSA() {
        return emailUSA;
    }

    public void setEmailUSA(String emailUSA) {
        this.emailUSA = emailUSA;
    }
    @Column(name = "EXTENSIONUSA")
    public String getExtensionUSA() {
        return extensionUSA;
    }

    public void setExtensionUSA(String extensionUSA) {
        this.extensionUSA = extensionUSA;
    }
    @Column(name = "FECHA_CADUCIDAD")
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    @Column(name = "VACUNLIMITED")
    public Integer getVacunLimited() {
        return vacunLimited;
    }

    public void setVacunLimited(Integer vacunLimited) {
        this.vacunLimited = vacunLimited;
    }
}
