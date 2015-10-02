package com.m4c.model.entity.online;


import javax.persistence.*;

import com.m4c.model.base.IDEntity;


/**
 * User: Elvira Aranda
 * Date: 25/03/2008
 * Time: 04:19:23 PM
 */

@Entity
@Table(name = "M4CTIPOCERTS@M4CPUBLIC")
//@Table(name = "M4CTIPOCERTS@DBLNK_ONLINEDB_TEST")
public class CertType implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;
    private Integer hooked;
    private Double activation;
    private Double taxes;
    private Integer nights;
    private Boolean electronic;
    private Boolean allinclusive;
    private Boolean active;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="DESCRIPCION")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="HOOKED")
    public Integer getHooked() {
		return hooked;
	}

	public void setHooked(Integer hooked) {
		this.hooked = hooked;
	}

	@Column(name="ACTIVACION")
	public Double getActivation() {
		return activation;
	}

	public void setActivation(Double activation) {
		this.activation = activation;
	}

	@Column(name="TAXES")
	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	@Column(name="NOCHES")
	public Integer getNights() {
		return nights;
	}

	public void setNights(Integer nights) {
		this.nights = nights;
	}

	@Column(name="ELECTRONICO")
	public Boolean getElectronic() {
		return electronic;
	}

	public void setElectronic(Boolean electronic) {
		this.electronic = electronic;
	}
	@Column(name="ALLINCLUSIVE")
	public Boolean getAllinclusive() {
		return allinclusive;
	}

	public void setAllinclusive(Boolean allinclusive) {
		this.allinclusive = allinclusive;
	}

	@Column(name="ACTIVO")
	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	

}
