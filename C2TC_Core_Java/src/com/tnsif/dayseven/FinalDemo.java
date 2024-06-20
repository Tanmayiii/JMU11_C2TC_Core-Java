package com.tnsif.dayseven;

public class FinalDemo {
	public static void main(String[] args) {
		final float pi = 3.14f; //constant value
	}
}
//final class cannot be extended
class Parent
{
	void property()
	{
		System.out.println("Something");
	}
//final method cannot be overriden	
	void marry()
	{
		System.out.println("Sadie Sink....");
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("Sydney Sweeney....");
	}
}