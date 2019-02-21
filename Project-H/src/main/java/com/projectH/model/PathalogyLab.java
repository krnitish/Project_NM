package com.projectH.model;

public class PathalogyLab {

	private int labId;
	private String labName;
	private String labCity;
	private String labState;
	private String labCountry;
	private String labAssistant;
	private String labContact;
	
	public PathalogyLab() {
		// TODO Auto-generated constructor stub
	}

	public PathalogyLab(int labId, String labName, String labCity, String labState, String labCountry,
			String labAssistant, String labContact) {
		super();
		this.labId = labId;
		this.labName = labName;
		this.labCity = labCity;
		this.labState = labState;
		this.labCountry = labCountry;
		this.labAssistant = labAssistant;
		this.labContact = labContact;
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabCity() {
		return labCity;
	}

	public void setLabCity(String labCity) {
		this.labCity = labCity;
	}

	public String getLabState() {
		return labState;
	}

	public void setLabState(String labState) {
		this.labState = labState;
	}

	public String getLabCountry() {
		return labCountry;
	}

	public void setLabCountry(String labCountry) {
		this.labCountry = labCountry;
	}
	public String getLabAssistant() {
		return labAssistant;
	}

	public void setLabAssistant(String labAssistant) {
		this.labAssistant = labAssistant;
	}

	public String getLabContact() {
		return labContact;
	}

	public void setLabContact(String labContact) {
		this.labContact = labContact;
	}

	@Override
	public String toString() {
		return "PathalogyLab [labId=" + labId + ", labName=" + labName + ", labCity=" + labCity + ", labState="
				+ labState + ", labCountry=" + labCountry + ", labAssistant=" + labAssistant + ", labContact="
				+ labContact + "]";
	}
	
	
}
