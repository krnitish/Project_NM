package com.projectH.model;

import java.util.Date;

public class Doctors {

	private int doctorId;
	private String docName;
	private Date docDOB;
	private String gender;
	private String highestQualification;
	private String countryOfBachelor;
	private String countryOfMaster;
	private String aadhar;
	private int fees;
	private String hospitalName;
	private String hospitalCountry;
	private String hospitalState;
	private String hospitalCity;
	private String hospitalZIP;
	private String email;
	private String contact;
	
	public Doctors() {
		// TODO Auto-generated constructor stub
	}

	public Doctors(int doctorId, String docName, Date docDOB, String gender, String highestQualification,
			String countryOfBachelor, String countryOfMaster, String aadhar, int fees, String hospitalName,
			String hospitalCountry, String hospitalState, String hospitalCity, String hospitalZIP, String email,
			String contact) {
		super();
		this.doctorId = doctorId;
		this.docName = docName;
		this.docDOB = docDOB;
		this.gender = gender;
		this.highestQualification = highestQualification;
		this.countryOfBachelor = countryOfBachelor;
		this.countryOfMaster = countryOfMaster;
		this.aadhar = aadhar;
		this.fees = fees;
		this.hospitalName = hospitalName;
		this.hospitalCountry = hospitalCountry;
		this.hospitalState = hospitalState;
		this.hospitalCity = hospitalCity;
		this.hospitalZIP = hospitalZIP;
		this.email = email;
		this.contact = contact;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public Date getDocDOB() {
		return docDOB;
	}

	public void setDocDOB(Date docDOB) {
		this.docDOB = docDOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getCountryOfBachelor() {
		return countryOfBachelor;
	}

	public void setCountryOfBachelor(String countryOfBachelor) {
		this.countryOfBachelor = countryOfBachelor;
	}

	public String getCountryOfMaster() {
		return countryOfMaster;
	}

	public void setCountryOfMaster(String countryOfMaster) {
		this.countryOfMaster = countryOfMaster;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalCountry() {
		return hospitalCountry;
	}

	public void setHospitalCountry(String hospitalCountry) {
		this.hospitalCountry = hospitalCountry;
	}

	public String getHospitalState() {
		return hospitalState;
	}

	public void setHospitalState(String hospitalState) {
		this.hospitalState = hospitalState;
	}

	public String getHospitalCity() {
		return hospitalCity;
	}

	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}

	public String getHospitalZIP() {
		return hospitalZIP;
	}

	public void setHospitalZIP(String hospitalZIP) {
		this.hospitalZIP = hospitalZIP;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Doctors [doctorId=" + doctorId + ", docName=" + docName + ", docDOB=" + docDOB + ", gender=" + gender
				+ ", highestQualification=" + highestQualification + ", countryOfBachelor=" + countryOfBachelor
				+ ", countryOfMaster=" + countryOfMaster + ", aadhar=" + aadhar + ", fees=" + fees + ", hospitalName="
				+ hospitalName + ", hospitalCountry=" + hospitalCountry + ", hospitalState=" + hospitalState
				+ ", hospitalCity=" + hospitalCity + ", hospitalZIP=" + hospitalZIP + ", email=" + email + ", contact="
				+ contact + "]";
	}
	
}
