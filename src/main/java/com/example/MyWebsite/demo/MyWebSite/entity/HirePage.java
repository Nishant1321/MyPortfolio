package com.example.MyWebsite.demo.MyWebSite.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class HirePage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
	private int id;
	private String title;
	private Date complitiondate;
	private String email;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getComplitiondate() {
		return complitiondate;
	}
	public void setComplitiondate(Date complitiondate) {
		this.complitiondate = complitiondate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "HirePage [id=" + id + ", title=" + title + ", complitiondate=" + complitiondate + ", email=" + email
				+ ", description=" + description + "]";
	}
	public HirePage(int id, String title, Date complitiondate, String email, String description) {
		super();
		this.id = id;
		this.title = title;
		this.complitiondate = complitiondate;
		this.email = email;
		this.description = description;
	}
	public HirePage() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
