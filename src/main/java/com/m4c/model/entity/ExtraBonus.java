package com.m4c.model.entity;

import javax.persistence.*;

/**
 * Created by Usuario on 17/08/2015.
 */
@Entity
@Table(name="M4CEXTRABONOS")
public class ExtraBonus {

    private String description;
    private String name;
    private String nameEng;
    private ExtraBonusId extraBonusId;


    @Column(name="DESCRIPCION")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @EmbeddedId
    @AttributeOverrides( {
            @AttributeOverride(name="id", column=@Column(name="IDEXTRABONO", unique=false, nullable=false, insertable=true, updatable=true) ),
            @AttributeOverride(name="IdCallCenter", column=@Column(name="IDCALLCENTER", unique=false, nullable=false, insertable=true, updatable=true) ) } )

    public ExtraBonusId getExtraBonusId() {
        return extraBonusId;
    }

    public void setExtraBonusId(ExtraBonusId extraBonusId) {
        this.extraBonusId = extraBonusId;
    }
    @Column(name="EXTRABONO_ENG")
    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }
    @Column(name="EXTRABONO")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtraBonus(String description, String name, String nameEng, ExtraBonusId extraBonusId) {
        this.description = description;
        this.name = name;
        this.nameEng = nameEng;
        this.extraBonusId = extraBonusId;
    }

    public ExtraBonus() {
    }
}
