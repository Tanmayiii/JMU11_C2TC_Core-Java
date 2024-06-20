package com.tnsif.daynine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExecutor {
	public static void main(String args[]) {
		List<Employee> emps = new ArrayList<Employee>();
		
		emps.add(new Employee("Tanmayi",11,100000.00));
		
		emps.add(new Employee("Sagar",18,400000.00));
		
		emps.add(new Employee("Shruti",10,100000.00));
		
		System.out.println("Unsorted List:");
		emps.forEach(System.out::println);
		
		//Collections.sort(emps);
		//System.out.println("Sorted List:");
		//emps.forEach(System.out::println);
		
		System.out.println("**************");
		Collections.sort(emps, new SalaryComparator());
		System.out.println("Sorted List on the basis of salary:");
		emps.forEach(System.out::println);
		
		System.out.println("**************");
		Collections.sort(emps, new NameComparator());
		System.out.println("Sorted List on the basis of name:");
		emps.forEach(System.out::println);
	}
}
