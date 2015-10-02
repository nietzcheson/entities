package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by jhon on 15/05/15.
 */
@Entity
@Table(name = "M4CCERTCONFIG",uniqueConstraints ={@UniqueConstraint(columnNames ="ECERT_ID" ),@UniqueConstraint(columnNames = "LANGUAGE_CODE"),@UniqueConstraint(columnNames = "IMAGEN_CLAVE")})
public class ECertConfig {
    @JsonIgnoreProperties({"cert"})
    private ECertConfigId certConfigId=new ECertConfigId();
    @EmbeddedId
    public ECertConfigId getCertConfigId() {
        return certConfigId;
    }

    public void setCertConfigId(ECertConfigId certConfigId) {
        this.certConfigId = certConfigId;
    }





    @Transient
    public ECert geteCert() {
        return certConfigId.getCert();
    }
    @Transient
    public Language getLanguage() {
        return certConfigId.getLanguage();
    }
    @Transient
    public ImageCertificate getImageCertificate() {
        return certConfigId.getImageCertificate();
    }



    public ECertConfig(ImageCertificate imageCertificate, Language language, ECert eCert) {
        this.certConfigId.setImageCertificate(imageCertificate);
        this.certConfigId.setLanguage(language);
        this.certConfigId.setCert(eCert);
    }

    public ECertConfig() {
    }
}
