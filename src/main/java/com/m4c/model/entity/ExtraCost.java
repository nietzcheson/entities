package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.m4c.model.base.IDEntity;

/**
* @author Elvira Aranda
* @version 2.0
*/

@Entity
@Table(name="M4CCOSTOSEXTRA")
public class ExtraCost implements IDEntity{

	private static final long serialVersionUID = 1L;
	private Long id;
	private HotelInvoice hotelInvoice;
	private String category;
	private String type;
	private Double extraCost;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column (name="IDCOSTOEXTRA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	@ManyToOne
	@JoinColumn(name="IDFACTURA")
	public HotelInvoice getHotelInvoice() {
		return hotelInvoice;
	}
	public void setHotelInvoice(HotelInvoice hotelInvoice) {
		this.hotelInvoice = hotelInvoice;
	}
	
	@Column(name="CATEGORIA")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Column(name="TIPO")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
	
	@Column(name="COSTO")
	public Double getExtraCost() {
		return extraCost;
	}
	public void setExtraCost(Double extraCost) {
		this.extraCost = extraCost;
	}
	
}