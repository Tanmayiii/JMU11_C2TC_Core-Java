package com.tnsif.daytwo;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//To take input use System.in
		
		System.out.println("Enter customer ID:");//To display or print something use System.out
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter customer name:");
		String name = sc.nextLine();
		
		System.out.println("Enter customer city:");
		String city = sc.nextLine();
		
//		Customer c1 = new Customer();
//		c1.setCustomerid(id);
//		c1.setCustomerName(name);
//		c1.setCustomerCity(city);
		
//		System.out.println("Customer Details:"+c1);
		
		Customer c2 = new Customer(id,name,city);
		System.out.println(c2);
	}

}