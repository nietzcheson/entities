package com.m4c.model.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import com.m4c.model.base.IDEntity;

/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@Table(name="M4CFACTURA")
public class Invoice implements IDEntity{
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date dateInvoice;
	private CallCenter callCenter;
	private double total;
	private Program program;//M4SG o M4C
	private Campaign campaign;
    private Integer group; // 1 CV, 2 F2C
    private List<InvoiceDetail> details = new ArrayList<InvoiceDetail>();

    @Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column (name="IDFACTURA")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn (name="IDCALLCENTER")
	public CallCenter getCallCenter() {
		return callCenter;
	}
	public void setCallCenter(CallCenter callCenter) {
		this.callCenter = callCenter;
	}

	@Column (name="FECHA")
	public Date getDateInvoice() {
		return dateInvoice;
	}
	public void setDateInvoice(Date dateInvoice) {
		this.dateInvoice = dateInvoice;
	}

	@ManyToOne
	@JoinColumn (name="IDPROGRAMA")
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}

	@ManyToOne
	@JoinColumn (name="IDCAMPANA")
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

    @OneToMany(mappedBy = "invoice")
//    @JoinColumn(name="IDFACTURA")
    public List<InvoiceDetail> getDetails() {
        return details;
    }

    public void setDetails(List<InvoiceDetail> details) {
        this.details = details;
    }

   @Transient
    public double getTotal() {
        total = 0;
        for(InvoiceDetail dt : details){
            total = total + dt.getSaldo();
        }
        return total;
	}

    @Column(name="GRUPO")
    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}
