package com.cg.bsm.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name="bcode") 
	private String bcode;
	
	@Column(name="title") 
	private String title;
	
	@Column(name="publish_date") 
	private LocalDate publishDate;
	
	@Column(name="price") 
	private Double price;

	public Book() {
		
	}

	public Book(String bcode, String title, LocalDate publishDate, Double price) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("bcode=%s, title=%s, publishDate=%s, price=%s", bcode, title, publishDate, price);
	}
	
	
}

