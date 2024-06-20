package com.tnsif.dayten;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		
		System.out.println(al.size());
		al.add("Tanmayi");
		al.add(1234);
		al.add(21);
		al.add("Thane");
		
		System.out.println(al);
		
		//adding at a particular index value
		al.add(2,"Hobby : Sleeping");
		System.out.println(al);
		
		//to check if the list is empty or not
		System.out.println(al.isEmpty());
		
		//Introduction to Generics ---> To provide type safety for collection objects
		ArrayList<String> petname = new ArrayList();
		petname.add("Oreo");
		petname.add("Pluto");
		//petname.add(123);//Not allowed
		System.out.println(petname);
	}
}
