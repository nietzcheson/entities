package com.m4c.model.entity.online;
import com.m4c.model.base.IDEntity;
import javax.persistence.*;
import java.util.Date;

/**
 * User: Elvira Aranda
 * Date: 9/04/2008
 * Time: 04:09:12 PM
 */
@Entity
@Table(name = "M4CCERTSCLIENTENOTAS@M4CPUBLIC")
//@Table(name = "M4CCERTSCLIENTENOTAS@DBLNK_ONLINEDB_TEST")
public class CustomerNote implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private CertCustomer certCustomer;
    private NoteType noteType;
    private String note;
    private Date date;
    private String user;
    
    @Id
	@Column(name = "IDNOTA")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="IDCLIENTE")
    public CertCustomer getCertCustomer() {
        return certCustomer;
    }

    public void setCertCustomer(CertCustomer certCustomer) {
        this.certCustomer = certCustomer;
    }

    @ManyToOne
    @JoinColumn(name="TIPO")
    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType){
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
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name="USUARIO")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }  
    

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((certCustomer == null) ? 0 : certCustomer.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result
				+ ((noteType == null) ? 0 : noteType.hashCode());
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
		final CustomerNote other = (CustomerNote) obj;
		if (certCustomer == null) {
			if (other.certCustomer != null)
				return false;
		} else if (!certCustomer.equals(other.certCustomer))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (noteType == null) {
			if (other.noteType != null)
				return false;
		} else if (!noteType.equals(other.noteType))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public String toString() {
        return note;
    }
}
