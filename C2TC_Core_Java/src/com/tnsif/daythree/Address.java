package com.tnsif.daythree;

public class Address {
	private String Street;
	private String landmark;
	private String city;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String street, String landmark, String city) {
		super();
		Street = street;
		this.landmark = landmark;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", landmark=" + landmark + ", city=" + city + "]";
	}
	
	
}