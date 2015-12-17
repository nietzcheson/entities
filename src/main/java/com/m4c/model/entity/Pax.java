package com.m4c.model.entity;

import com.m4c.model.base.StringTools;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
*
* @author Elvira Aranda
* @version 1.0
*/

@Entity
@org.hibernate.annotations.Entity(dynamicInsert=true, dynamicUpdate=true) 
@Table(name="M4CRESERVACIONPAX")
public class Pax implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long idPax;
	private Reservation reservation;
	private Integer age;
	private String firstName;
	private String lastName;
	private PaxPk paxPk;
	private String relation;
	private String occupation;
	private Date birthDate;
	private String polizas;

	/*@Column(name="RESERVACION_PAX_ID", unique=false, nullable=false, insertable=false, updatable=false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}*/
	
	@Column(name="RESERVACION_PAX_ID", unique=false, nullable=false, insertable=false, updatable=false)
	public Long getIdPax() {
		return id;
	}
	public void setIdPax(Long id) {
		this.id = id;
	}

	@EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="reservation", column=@Column(name="IDRESERVACION", unique=false, nullable=false, insertable=true, updatable=true) ),
        @AttributeOverride(name="idPax", column=@Column(name="RESERVACION_PAX_ID", unique=false, nullable=false, insertable=true, updatable=true) )
        } )
	public PaxPk getPaxPk() {
		return paxPk;
	}
	public void setPaxPk(PaxPk paxPk) {
		this.paxPk = paxPk;
	}

	@Column(name="EDAD")
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name="NOMBRE")
	public String getFirstName() {
		return firstName;
	}
	@Transient
	public String getFirstNameNoEspecialCharacter() {
		return StringTools.replaceEspecialCharacterByHyphen(firstName);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name="APELLIDO")
	public String getLastName() {
		return lastName;
	}
	@Transient
	public String getLastNameNoEspecialCharacter() {
		return StringTools.replaceEspecialCharacterByHyphen(lastName);
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//@ManyToOne(fetch=FetchType.EAGER,	   cascade = CascadeType.ALL)		
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="IDRESERVACION", unique=false, nullable=false, insertable=false, updatable=false)
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Column(name="RELACION_PAX")
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	@Column(name="OCUPACION")
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

    @Column(name = "FECHA_NACIMIENTOPAX")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    @Column(name = "POLIZAS")
    public String getPolizas() {
        return polizas;
    }

    public void setPolizas(String polizas) {
        this.polizas = polizas;
    }





    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((paxPk == null) ? 0 : paxPk.hashCode());
		result = prime * result
				+ ((relation == null) ? 0 : relation.hashCode());
		result = prime * result
				+ ((reservation == null) ? 0 : reservation.hashCode());
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
		final Pax other = (Pax) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (paxPk == null) {
			if (other.paxPk != null)
				return false;
		} else if (!paxPk.equals(other.paxPk))
			return false;
		if (relation == null) {
			if (other.relation != null)
				return false;
		} else if (!relation.equals(other.relation))
			return false;
		if (reservation == null) {
			if (other.reservation != null)
				return false;
		} else if (!reservation.equals(other.reservation))
			return false;
		return true;
	}
	
}
