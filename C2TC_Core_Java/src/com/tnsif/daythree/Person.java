package com.tnsif.daythree;

import com.tnsif.daythree.Address;

public class Person {
	private String name;
	private Address address;
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	void Displau() {
		System.out.println("Name:"+name+ "Address:"+address);
	}}