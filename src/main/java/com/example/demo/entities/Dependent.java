package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="Dependent")
public class Dependent {
	@Id
	@Column(name="DependentId")

	private int DependentId;
	
	@Column(name="DependentName")
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

	@Column(name="DOB")
	private Date DOB;
	
	

}
