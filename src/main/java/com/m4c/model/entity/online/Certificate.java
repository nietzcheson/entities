package com.m4c.model.entity.online;

import com.m4c.model.entity.BatchCertificates;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: Elvira Aranda
 * Date: 25/03/2008
 * Time: 01:50:04 PM
 */
@Entity
//@Table(name = "M4CCERTSPUBLIC@DBLNK_ONLINEDB_TEST")
@Table(name = "M4CCERTSPUBLIC@M4CPUBLIC")
public class Certificate implements Serializable{

	private static final long serialVersionUID = 1L;
	private String number;
    private Long campaign;
    private Long folioCertificadoId;
    private CertType certType;
    private Long bookingId;
    private Date createdDate=new Date();
    private Date assignedDate;
    private CertCustomer certCustomer;
    private BatchCertificates batchId;
    private Integer sequenceBatch;

    @Id
    @Column(name="NUMCERT")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name="IDCAMP")
    public Long getCampaign() {
        return campaign;
    }

    public void setCampaign(Long campaign) {
        this.campaign = campaign;
    }

    @ManyToOne
    @JoinColumn(name="TYPE")
    public CertType getCertType() {
        return certType;
    }

    public void setCertType(CertType certType) {
        this.certType = certType;
    }        

    @Column(name="IDBOOKING")
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    @Column(name="FECHA")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name="FECHAASIGNACION")
    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    @ManyToOne
    @JoinColumn(name="IDCLIENTE")
    public CertCustomer getCertCustomer() {
        return certCustomer;
    }

    public void setCertCustomer(CertCustomer certCustomer) {
        this.certCustomer = certCustomer;
    }


    @Column(name="FOLIOSCERTIFICADO_ID")
    public Long getFolioCertificadoId() {
        return folioCertificadoId;
    }

    public void setFolioCertificadoId(Long folioCertificadoId) {
        this.folioCertificadoId = folioCertificadoId;
    }

    public void setFoliosCertificado(Long folioCertificadoId) {
        this.folioCertificadoId = folioCertificadoId;
    }

    @JoinColumn(name="LOTE_ID")
    @ManyToOne
    public BatchCertificates getBatchId() {
        return batchId;
    }

    public void setBatchId(BatchCertificates batchId) {
        this.batchId = batchId;
    }

    @Column(name="CONSECUTIVO_LOTE")
    public Integer getSequenceBatch() {
        return sequenceBatch;
    }

    public void setSequenceBatch(Integer sequenceBatch) {
        this.sequenceBatch = sequenceBatch;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Certificate that = (Certificate) o;

        if (assignedDate != null ? !assignedDate.equals(that.assignedDate) : that.assignedDate != null) return false;
        if (bookingId != null ? !bookingId.equals(that.bookingId) : that.bookingId != null) return false;
        if (campaign != null ? !campaign.equals(that.campaign) : that.campaign != null) return false;
        if (certCustomer != null ? !certCustomer.equals(that.certCustomer) : that.certCustomer != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (number != null ? number.hashCode() : 0);
        result = 31 * result + (campaign != null ? campaign.hashCode() : 0);
        result = 31 * result + (bookingId != null ? bookingId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (assignedDate != null ? assignedDate.hashCode() : 0);
        result = 31 * result + (certCustomer != null ? certCustomer.hashCode() : 0);
        return result;
    }
    public Certificate() {
    }
    public Certificate(String number, Long foliosCertificadoId,Long campaignId) {
        this.number = number;
        this.folioCertificadoId=foliosCertificadoId;
        this.setCampaign(campaignId);
    }

    public Certificate(String number, Integer sequence,BatchCertificates batchCertificates) {
        this.number = number;

       // this.folioCertificadoId=foliosCertificadoId;
        //this.setCampaign(campaignId);
        this.sequenceBatch=sequence;
        this.setBatchId(batchCertificates);


    }


}
