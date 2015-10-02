package com.m4c.model.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by jhon on 15/05/15.
 */
@Embeddable
public class ECertConfigId implements Serializable{
    private ImageCertificate imageCertificate;
    private ECert cert;
    private Language language;

    @ManyToOne @JoinColumn(name = "IMAGEN_CLAVE")
    public ImageCertificate getImageCertificate() {
        return imageCertificate;
    }

    public void setImageCertificate(ImageCertificate imageCertificate) {
        this.imageCertificate = imageCertificate;
    }
    @ManyToOne @JoinColumn(name = "ECERT_ID")
    public ECert getCert() {
        return cert;
    }

    public void setCert(ECert cert) {
        this.cert = cert;
    }




    @ManyToOne @JoinColumn(name = "LANGUAGE_CODE")
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }


}
