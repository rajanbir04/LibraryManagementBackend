package com.nagarro.librarymanagement.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** Represent Books entity with
 * 	the following attributes :	bookCode, bookName, authorName, dateAdded
 * 
 */
@Entity
@Table(name="product")
public class Books {
	
	@Id
	int bookCode;
	
	@Column(name="bookName")
	String bookName;
	
	@Column(name="authorName")
	String authorName;
	
	@Column(name="dateAdded")
	String dateAdded;
	 
	 
	public Books() {
	}


	public Books(int bookCode, String bookName, String authorName, String dateAdded) {
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.authorName = authorName;
		this.dateAdded = dateAdded;
	}


	public int getBookCode() {
		return bookCode;
	}


	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getauthorName() {
		return authorName;
	}


	public void setauthorNameName(String authorName) {
		this.authorName = authorName;
	}


	public String getdateAdded() {
		return dateAdded;
	}


	public void setdateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}


	@Override
	public String toString() {
		return "Book : bookCode=" + bookCode + ", bookName=" + bookName + ", authorName=" + authorName + ", dateAdded=" + dateAdded
				+ ".";
	}
	 
	 
}
  