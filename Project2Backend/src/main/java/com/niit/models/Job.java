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
	private String JobTitle;
	private String JobDescription;
	@Column(nullable=false)
	private String SkillsRequired;
	private String Location;
	private Date PostedOn;
	private String Yrs_of_Exp;
	private String Reference;
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getJobDescription() {
		return JobDescription;
	}
	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}
	public String getSkillsRequired() {
		return SkillsRequired;
	}
	public void setSkillsRequired(String skillsRequired) {
		SkillsRequired = skillsRequired;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Date getPostedOn() {
		return PostedOn;
	}
	public void setPostedOn(Date postedOn) {
		PostedOn = postedOn;
	}
	public String getYrs_of_Exp() {
		return Yrs_of_Exp;
	}
	public void setYrs_of_Exp(String yrs_of_Exp) {
		Yrs_of_Exp = yrs_of_Exp;
	}
	public String getReference() {
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}
}
