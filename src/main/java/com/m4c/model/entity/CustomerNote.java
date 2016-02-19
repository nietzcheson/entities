package com.m4c.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="M4CCLIENTENOTAS")
public class CustomerNote {

	@JsonIgnore
	private Customer customer;
	private int number;
	private CustomerNotePk pk;
	private Status status;
	private NoteType noteType;
	private String note;
	private String specialReq;
	private Date date;
	private String user;
	private Date contactDate;
	private Long note_noteId;

	@EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="customerId", column=@Column(name="IDCLIENTE", unique=false, nullable=false, insertable=true, updatable=true) ),
        @AttributeOverride(name="noteId", column=@Column(name="IDNOTA", unique=false, nullable=false, insertable=true, updatable=true) )
        } )
	public CustomerNotePk getPk() {
		return pk;
	}
	public void setPk(CustomerNotePk pk) {
		this.pk = pk;
	}
	
	//@ManyToOne(cascade = {CascadeType.ALL, CascadeType.MERGE})
	@ManyToOne(fetch=FetchType.EAGER, 
			   cascade = CascadeType.ALL)	
	@JoinColumn(name="IDCLIENTE", unique=false, nullable=false, insertable=false, updatable=false)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Column(name="IDNOTA", unique=false, nullable=false, insertable=false, updatable=false)
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@ManyToOne
	@JoinColumn(name="IDESTADO")
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@ManyToOne
	@JoinColumn(name="IDTIPONOTA")
	public NoteType getNoteType() {
		return noteType;
	}
	public void setNoteType(NoteType noteType) {
		this.noteType = noteType;
	}
	
	@Column(name="NOTA")
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Column(name="FECHA")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name="IDUSER")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Column(name="FECHAPCONTACTO")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone="UTC")
	public Date getContactDate() {
		return contactDate;
	}
	public void setContactDate(Date contactDate) {
		this.contactDate = contactDate;
	}
	
	@Column(name="SPECIALREQ")
	public String getSpecialReq() {
		return specialReq;
	}
	public void setSpecialReq(String specialReq) {
		this.specialReq = specialReq;
	}

	@Column(name="NOTA_IDNOTA")
	public Long getNote_noteId() {
		return note_noteId;
	}

	public void setNote_noteId(Long note_noteId) {
		this.note_noteId = note_noteId;
	}
	
}
