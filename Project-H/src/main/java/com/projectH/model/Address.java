package com.projectH.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//@Embeddable
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int addressId;
	private String country;
	private String state;
	private String city;
	private String location;
	@OneToOne
	@JoinColumn(name="UserId")
	Users users;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String country, String state, String city, String location) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.location = location;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", location=" + location + "]";
	}
	
	
}
