package com.m4c.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.m4c.model.base.IDEntity;

/**
* @author Jose Antonio Arroniz
* @version 1.0
*/

@Entity
@Table(name = "M4CIMAGENESCERTS")
public class ImageCertificate implements IDEntity {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String image;
	private String url;
	private Long type;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name="increment", strategy = "increment")
	@Column(name = "CLAVE")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="IMAGEN")
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Column(name="TIPO")
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	@Column(name="URL")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ImageCertificate(String image, Long type,String url) {
		this.image = image;
		this.type = type;
		this.url = url;
	}

	public ImageCertificate() {
	}
}
