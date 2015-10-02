package com.m4c.model.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="M4CPLANALIMENTICIO")
@NamedQueries({
		@NamedQuery(
				name = "com.m4c.model.entity.MealPlan.findAll",
				query = "SELECT m FROM MealPlan m"
		),
        @NamedQuery(
				name = "com.m4c.model.entity.MealPlan.findGeneral",
				query = "SELECT m FROM MealPlan m where m.clave_min='AI' or m.clave_min='EP' or m.clave_min='AIM'"
		)
})
public class MealPlan {

	public static final String TAG = MealPlan.class.getSimpleName();
	
	private Long id;
	private String plan;
	private String clave;

    private String clave_min;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="IDPLAN")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="PLAN")
	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Column(name="CLAVE")
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

    @Column(name="CLAVE_MIN")
    public String getClave_min() {
        return clave_min;
    }

    public void setClave_min(String clave_min) {
        this.clave_min = clave_min;
    }

    public MealPlan() {
    }
}
