package com.projectH.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.metamodel.StaticMetamodel;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long userId;
	private String fname;
	private String lname;
	private Date dob;
	private String email;
	private String aadharCard;
	private String mobileNo;
	private String maritalStatus;
	private String gender;
	/*
	 * @Embedded
	 * 
	 * @AttributeOverrides({
	 * 
	 * @AttributeOverride(name="country",column=@Column(name="Current_Country")),
	 * 
	 * @AttributeOverride(name="state",column=@Column(name="Current_state")),
	 * 
	 * @AttributeOverride(name="city",column=@Column(name="Current_city")),
	 * 
	 * @AttributeOverride(name="location",column=@Column(name="Current_location"))
	 * })
	 */

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Current_Address")
	private Address currentAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Permanent_Address")
	private Address permanentAddress;

//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="Address_name")
//	List<Address> addressList=new ArrayList<Address>();

	public Users() {
		// TODO Auto-generated constructor stub
	}



	public Users(String fname, String lname, Date dob, String email, String aadharCard, String mobileNo,
			String maritalStatus, String gender, Address currentAddress, Address permanentAddress) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.aadharCard = aadharCard;
		this.mobileNo = mobileNo;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanentAddress;
	}
	public Users(Long userId, String fname, String lname, Date dob, String email, String aadharCard, String mobileNo,
			String maritalStatus, String gender, Address currentAddress, Address permanentAddress) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.aadharCard = aadharCard;
		this.mobileNo = mobileNo;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanentAddress;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", email=" + email
				+ ", aadharCard=" + aadharCard + ", mobileNo=" + mobileNo + ", maritalStatus=" + maritalStatus
				+ ", gender=" + gender + ", currentAddress=" + currentAddress + ", permanentAddress=" + permanentAddress
				+ "]";
	}

}
