package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Fernando on 06/10/2015.
 */
@Entity
@Table(name = "M4CCATASSISTCARD")
public class AssistCard {

    private Long id;
    private Long idSubService;
    private String productCode;
    private String rateCode;
    private Integer effectiveDays;
    private String dateType;

    @Id
    @Column(name = "IDASSISTCARD")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "IDSUBSERVICIO")
    public Long getIdSubService() {
        return idSubService;
    }

    public void setIdSubService(Long idSubService) {
        this.idSubService = idSubService;
    }
    @Column(name = "CODIGO_PRODUCTO")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    @Column(name = "CODIGO_TARIFA")
    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }
    @Column(name = "DIAS_VIGENCIA")
    public Integer getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
    }
    @Column(name = "TIPO_FECHA")
    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }
}
