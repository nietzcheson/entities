package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Usuario on 17/08/2015.
 */
@Embeddable
public class ExtraBonusId implements Serializable{

    private Long id;
    private Long IdCallCenter;

    @Column(name = "IDEXTRABONO")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "IDCALLCENTER")
    public Long getIdCallCenter() {
        return IdCallCenter;
    }

    public void setIdCallCenter(Long idCallCenter) {
        IdCallCenter = idCallCenter;
    }

    public ExtraBonusId(Long id, Long idCallCenter) {
        this.id = id;
        IdCallCenter = idCallCenter;
    }

    public ExtraBonusId() {
    }
}
