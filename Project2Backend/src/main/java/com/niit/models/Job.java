package com.niit.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Job")

public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobId;
	@Column(nullable=false)
	private String jobTitle;
	private String jobDescription;
	@Column(nullable=false)
	private String skillsRequired;
	private String location;
	private Date postedOn;
	private String yrs_of_Exp;
	private String reference;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getSkillsRequired() {
		return skillsRequired;
	}
	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
	public String getYrs_of_Exp() {
		return yrs_of_Exp;
	}
	public void setYrs_of_Exp(String yrs_of_Exp) {
		this.yrs_of_Exp = yrs_of_Exp;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
}

	