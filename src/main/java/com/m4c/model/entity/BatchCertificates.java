package com.m4c.model.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Usuario on 16/06/2015.
 */
@Entity
@Table(name = "M4CLOTES")
@javax.persistence.SequenceGenerator(name="SEQ_LOTES", sequenceName="SEQ_LOTES",allocationSize=1)
public class BatchCertificates {
    public static final String TAG = BatchCertificates.class.getSimpleName();
    private Long id;
    private Integer quantity;
    private Date createdDate;
    private List<BatchCertificateFolios> batchCertificateFoliosLst;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_LOTES")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CANTIDAD")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "FECHACREACION")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    @OneToMany(mappedBy = "batchCertificates",fetch = FetchType.EAGER,cascade = CascadeType.ALL )
    @Fetch(value = FetchMode.SUBSELECT )@OnDelete(action = OnDeleteAction.CASCADE)
    public List<BatchCertificateFolios> getBatchCertificateFoliosLst() {
        return batchCertificateFoliosLst;
    }

    public void setBatchCertificateFoliosLst(List<BatchCertificateFolios> batchCertificateFoliosLst) {
        this.batchCertificateFoliosLst = batchCertificateFoliosLst;
    }

    public BatchCertificates() {
    }

}
