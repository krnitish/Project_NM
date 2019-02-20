package com.projectH.model;

import java.util.Date;

public class Admin {

	private int adminId;
	private String adminName;
	private Date adminDOB;
	private String adminAadhar;
	private String adminPAN;
	private String adminEmail;
	private String adminContact;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminId, String adminName, Date adminDOB, String adminAadhar, String adminPAN, String adminEmail,
			String adminContact) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminDOB = adminDOB;
		this.adminAadhar = adminAadhar;
		this.adminPAN = adminPAN;
		this.adminEmail = adminEmail;
		this.adminContact = adminContact;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public Date getAdminDOB() {
		return adminDOB;
	}

	public void setAdminDOB(Date adminDOB) {
		this.adminDOB = adminDOB;
	}

	public String getAdminAadhar() {
		return adminAadhar;
	}

	public void setAdminAadhar(String adminAadhar) {
		this.adminAadhar = adminAadhar;
	}

	public String getAdminPAN() {
		return adminPAN;
	}

	public void setAdminPAN(String adminPAN) {
		this.adminPAN = adminPAN;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminDOB=" + adminDOB + ", adminAadhar="
				+ adminAadhar + ", adminPAN=" + adminPAN + ", adminEmail=" + adminEmail + ", adminContact="
				+ adminContact + "]";
	}
}
