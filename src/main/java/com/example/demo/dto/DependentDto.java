package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class DependentDto {


	private int DependentId;
	

	private String DependentName;
	/*
	//@ManyToOne(optional=false)
	//@NotFound(action = NotFoundAction.IGNORE)
	//@JoinColumn(name="id",nullable=true)
	//private Registration registration;
	


	
	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}*/

	public int getDependentId() {
		return DependentId;
	}

	public void setDependentId(int dependentId) {
		DependentId = dependentId;
	}

	public String getDependentName() {
		return DependentName;
	}

	public void setDependentName(String dependentName) {
		DependentName = dependentName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	
	private Date DOB;
	
	

}



