package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Registration")
public class Registration {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
    @Column(name="Name")
	private String Name;
    
    @Column(name="Address")
    private String Address;
    
    @Column(name="State")
    private String State;
    
    @Column(name="Country")
    private String Country;
    
    @Column(name="EmailAddress")
    private String EmailAddress;
    
    @Column(name="Pan")
    private String Pan;
    
    @Column(name="ContactNo")
    private int ContactNo;
    
    public int getContactNo() {
		return ContactNo;
	}

	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}

	@Column(name="DOB")
    private Date Dob;
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
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
