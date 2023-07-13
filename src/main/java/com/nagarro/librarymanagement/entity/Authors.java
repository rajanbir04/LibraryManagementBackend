package com.nagarro.librarymanagement.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** Represent Authors entity with
 * 	the following attributes :	authorId, authorName
 * 
 */
@Entity
@Table(name="authors")
public class Authors {
	
	@Id
	int authorId;
	@Column(name="authorName")
	String authorName;

	public int getauthorId() {
		return authorId;
	}

	public void setauthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getauthorName() {
		return authorName;
	}

	public void setauthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Author : authorId=" + authorId + ", authorName=" + authorName + ".";
	}
	
}
