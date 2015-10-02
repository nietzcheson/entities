package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Usuario on 16/06/2015.
 */
@Entity
@Table(name = "M4CLOTE_FOLIO")
public class BatchCertificateFolios  implements Serializable {


    private Integer begin;
    private Integer end;
    private Date createdDate;
    private BatchCertificates batchCertificates;
    private FoliosCertificado foliosCertificado;

    @Column(name = "INICIO")
    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    @Id
    @ManyToOne
    @JoinColumn(name="ID_FOLIO", unique=false, nullable=false, insertable=false, updatable=false)
    public FoliosCertificado getFoliosCertificado() {
        return foliosCertificado;
    }

    public void setFoliosCertificado(FoliosCertificado foliosCertificado) {
        this.foliosCertificado = foliosCertificado;
    }

    @Id
    @ManyToOne
    @JoinColumn(name="ID_LOTE", unique=false, nullable=false, insertable=false, updatable=false)
    @JsonIgnore
    public BatchCertificates getBatchCertificates() {
        return batchCertificates;
    }

    public void setBatchCertificates(BatchCertificates batchCertificates) {
        this.batchCertificates = batchCertificates;
    }

    @Column(name = "FECHACREACION")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "FIN")
    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public BatchCertificateFolios() {
    }
}
