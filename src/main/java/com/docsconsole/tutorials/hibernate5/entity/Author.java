package com.docsconsole.tutorials.hibernate5.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHOR")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTHOR_ID")
	private long prodDetailsId;

	@Column(name = "AUTHOR_NAME")
	private String authorName;

	public long getProdDetailsId() {
		return prodDetailsId;
	}

	public void setProdDetailsId(long prodDetailsId) {
		this.prodDetailsId = prodDetailsId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


}