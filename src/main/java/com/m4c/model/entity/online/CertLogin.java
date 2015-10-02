package com.m4c.model.entity.online;

import com.fasterxml.jackson.annotation.*;
import com.m4c.model.entity.Campaign;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.web.servlet.View;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: Elvira Aranda
 * Date: 1/04/2008
 * Time: 10:00:13 AM
 */
@Entity
@Table(name = "M4CCERTSLOGIN@M4CPUBLIC")
//@Table(name = "M4CCERTSLOGIN@DBLNK_ONLINEDB_TEST")

public class CertLogin implements Serializable {
    public static final String TAG = CertLogin.class.getSimpleName();
	private static final long serialVersionUID = 1L;
   /* @JsonIgnore
    private CertLoginPk id;*/
	private String user;

	//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
	//@JsonBackReference
   // @JsonBackReference
    private Campaign campaign;
    private String password;
    @JsonIgnore
    private Long callCenter;


    @JsonIgnore
    private CertCustomer certCustomer;
	@JsonIgnore
    private CertCustomer masterBroker;
    @JsonIgnore
    private Integer level;
    @JsonIgnore
    private String image;
    @JsonIgnore
    private String promotion;
    @JsonIgnore
    private String description;
    private String email;
    @JsonIgnore
    private String titlePromotion;
    @JsonIgnore
    private String ecert;
    private String phone;
    private String name;
    private Boolean active;
    /*
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="campaignId", column=@Column(name="IDCAMPANA", unique=false, nullable=false, insertable=true, updatable=true) ),
        @AttributeOverride(name="userId", column=@Column(name="IDUSER", unique=false, nullable=false, insertable=true, updatable=true) ) } )

    public CertLoginPk getId() {
		return id;
	}

	public void setId(CertLoginPk id) {
		this.id = id;
	}*/
    @Id
    @Column(name="IDUSER", unique=true, nullable=false, insertable=false, updatable=false)
    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="IDCAMPANA",/* unique=false, nullable=false,*/ insertable=true, updatable=true)
	public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    @Column(name="PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="IDCALLCENTER")
    public Long getCallCenter() {
        return callCenter;
    }

    public void setCallCenter(Long callCenter) {
        this.callCenter = callCenter;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="IDCLIENTE")
	public CertCustomer getCertCustomer() {
        return certCustomer;
    }

    public void setCertCustomer(CertCustomer certCustomer) {
        this.certCustomer = certCustomer;
    }

    @OneToOne
    @JoinColumn(name="ID_MASTERBROKER")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
    public CertCustomer getMasterBroker() {
        return masterBroker;
    }

    public void setMasterBroker(CertCustomer masterBroker) {
        this.masterBroker = masterBroker;
    }

    @Column(name="NIVELACCESO")
    public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	 @Column(name="LOGO")
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	 @Column(name="PROMOCION")
	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	 @Column(name="DESCRIPCION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="TITULO")
	public String getTitlePromotion() {
		return titlePromotion;
	}

	public void setTitlePromotion(String titlePromotion) {
		this.titlePromotion = titlePromotion;
	}
	
	@Column(name="ECERTIFICATE")
	public String getEcert() {
		return ecert;
	}

	public void setEcert(String ecert) {
		this.ecert = ecert;
	}

	@Column(name="TELEFONO")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    @Column(name="NOMBRE")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((callCenter == null) ? 0 : callCenter.hashCode());
		result = prime * result
				+ ((campaign == null) ? 0 : campaign.hashCode());
		result = prime * result
				+ ((certCustomer == null) ? 0 : certCustomer.hashCode());
		/*result = prime * result + ((id == null) ? 0 : id.hashCode());*/
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final CertLogin other = (CertLogin) obj;
		if (callCenter == null) {
			if (other.callCenter != null)
				return false;
		} else if (!callCenter.equals(other.callCenter))
			return false;
		if (campaign == null) {
			if (other.campaign != null)
				return false;
		} else if (!campaign.equals(other.campaign))
			return false;
		if (certCustomer == null) {
			if (other.certCustomer != null)
				return false;
		} else if (!certCustomer.equals(other.certCustomer))
			return false;
		/*if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;*/
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

    @Column(name="ACTIVO")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    public CertLogin(String user, String password, String email, String phone,String name,Boolean active) {
        this.user = user;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.name=name;
        this.active=active;
    }

    public CertLogin() {
    }

    public CertLogin(String user, Campaign campaign, String password, CertCustomer certCustomer, String email, Boolean active, String name) {
        this.user = user;
        this.campaign = campaign;
        this.password = password;
        this.certCustomer = certCustomer;
        this.email = email;
        this.active = active;
        this.name = name;
    }

    @Override
	public String toString() {
		return user;
	}
	
}
