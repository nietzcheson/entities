package com.m4c.model.entity.online;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 *@author	Elvira Aranda
 *@version	1.0
 */

@Embeddable
public class CustomerNotePk implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long customerId;
	private Long noteId;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getNoteId() {
		return noteId;
	}
	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((noteId == null) ? 0 : noteId.hashCode());
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
		final CustomerNotePk other = (CustomerNotePk) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (noteId == null) {
			if (other.noteId != null)
				return false;
		} else if (!noteId.equals(other.noteId))
			return false;
		return true;
	}
	
	

}
