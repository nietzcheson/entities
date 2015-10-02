package com.m4c.model.entity.online;

import com.m4c.model.base.IDEntity;
import javax.persistence.*;

/**
 * User: Elvira Aranda
 * Date: 9/04/2008
 * Time: 04:14:25 PM
 */
@Entity
@Table(name = "M4CCERTSTIPONOTAS@M4CPUBLIC")
//@Table(name = "M4CCERTSTIPONOTAS@DBLNK_ONLINEDB_TEST")
public class NoteType implements IDEntity {
  
	private static final long serialVersionUID = 1L;
	private Long id;
    private String type;
        
    @Id  
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="TIPO")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteType noteType = (NoteType) o;

        if (id != null ? !id.equals(noteType.id) : noteType.id != null) return false;
        if (type != null ? !type.equals(noteType.type) : noteType.type != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public String toString() {
        return type;
    }
}
