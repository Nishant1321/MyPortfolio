package com.example.MyWebsite.demo.MyWebSite.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
@Entity
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
	private int id;
	private String projecttitle;
	private String projecttype;
	private String position;
	private Date startdate;
	private Date complitiondate;
	@Size(max = 1000, message = "Description should not exceed 1000 characters")
    @Column(length = 1000)
	private String Description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjecttitle() {
		return projecttitle;
	}
	public void setProjecttitle(String projecttitle) {
		this.projecttitle = projecttitle;
	}
	public String getProjecttype() {
		return projecttype;
	}
	public void setProjecttype(String projecttype) {
		this.projecttype = projecttype;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getComplitiondate() {
		return complitiondate;
	}
	public void setComplitiondate(Date complitiondate) {
		this.complitiondate = complitiondate;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projecttitle=" + projecttitle + ", projecttype=" + projecttype + ", position="
				+ position + ", startdate=" + startdate + ", complitiondate=" + complitiondate + ", Description="
				+ Description + "]";
	}
	public Project(int id, String projecttitle, String projecttype, String position, Date startdate,
			Date complitiondate, String description) {
		super();
		this.id = id;
		this.projecttitle = projecttitle;
		this.projecttype = projecttype;
		this.position = position;
		this.startdate = startdate;
		this.complitiondate = complitiondate;
		Description = description;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
