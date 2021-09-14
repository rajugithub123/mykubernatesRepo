package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.demo.entities.Dependent;

public class RegistrationDto {
	

	private int Id;
	
    
	private String Name;
    
   
    private String Address;
    
    
    private String State;
    
    
    private String Country;
    
    
    private String EmailAddress;
    
   
    private String Pan;
    
    
    private int ContactNo;
    
    public int getContactNo() {
		return ContactNo;
	}

	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}

    private Date Dob;
	

	 private List<Dependent> dependents;



	public List<Dependent> getDependents() {
		return dependents;
	}

	public void setDependents(List<Dependent> dependents) {
		this.dependents = dependents;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getPan() {
		return Pan;
	}

	public void setPan(String pan) {
		Pan = pan;
	}


	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}


}
