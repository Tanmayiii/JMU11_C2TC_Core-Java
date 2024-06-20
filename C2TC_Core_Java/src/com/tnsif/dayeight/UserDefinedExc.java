package com.tnsif.dayeight;
import java.util.Scanner;

public class UserDefinedExc {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age:");
		
		Scanner obj = new Scanner(System.in);
		age = obj.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You are underage....you cannot vote!!");
		}
		else
		{
			System.out.println("You can vote");
		}
	}
}
