package com.tnsif.daysix;

public class String1 {

	public static void main(String[] args) {
//		String  s = new String();
//		String s = new String("Tanmayi");// imputable object
//		s.concat(" Nandurkar");
//		StringBuffer s2 = new StringBuffer("Tanmayi");
//		s2.append(" Nandurkar");
//		String s3 = "Hello";
//		System.out.println(s);
//		System.out.println(s2);
//		
		String s = new String("Tanmayi");
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		String upper = s.toUpperCase();
		System.out.println(upper);
		String s1 = "Mumbai";
		System.out.println(s1.equals("mumbai"));
		System.out.println(s1.equalsIgnoreCase("mumbai"));
		System.out.println(s1.replace('M','t'));
		System.out.println(s.trim());
		String a = "Tanmayi Nandurkar";
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 6));
		
	}

}