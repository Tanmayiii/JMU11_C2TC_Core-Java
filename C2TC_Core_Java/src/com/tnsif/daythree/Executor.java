package com.tnsif.daythree;

import com.tnsif.daythree.Address;
import com.tnsif.daythree.Person;

public class Executor {
	public static void main(String args[]) {
 
		Address obj = new Address("marine","lamp","Mumbai");
		
		Person p = new Person("sagar",obj);
		
		System.out.println(p);
	}
}