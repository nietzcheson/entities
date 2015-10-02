package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/
@Entity
@Table(name="M4CFORMULASHARE")
public class FormulasShare implements IDEntity{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer idcatcommission;
	private Integer rankini;
	private Integer rankfin;
	private Double amount;
	private Integer idposition;
	private String codeposition;
	private String type;
	private String usergroup;
	
	@Id
	@GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	@Column (name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="IDCATCOMISION")
	public Integer getIdcatcommission() {
		return idcatcommission;
	}
	public void setIdcatcommission(Integer idcatcommission) {
		this.idcatcommission = idcatcommission;
	}
	
	@Column (name="RANGO_INI")
	public Integer getRankini() {
		return rankini;
	}
	public void setRankini(Integer rankini) {
		this.rankini = rankini;
	}
	
	@Column (name="RANGO_FIN")
	public Integer getRankfin() {
		return rankfin;
	}
	public void setRankfin(Integer rankfin) {
		this.rankfin = rankfin;
	}
	
	@Column (name="IMPORTE")
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Column (name="IDPUESTO")
	public Integer getIdposition() {
		return idposition;
	}
	public void setIdposition(Integer idposition) {
		this.idposition = idposition;
	}
	
	@Column (name="CODIGO_PUESTO")
	public String getCodeposition() {
		return codeposition;
	}
	public void setCodeposition(String codeposition) {
		this.codeposition = codeposition;
	}
	
	@Column (name="TIPO")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column (name="GRUPO")
	public String getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(String usergroup) {
		this.usergroup = usergroup;
	}

}
