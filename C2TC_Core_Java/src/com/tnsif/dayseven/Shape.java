package com.tnsif.dayseven;

public abstract class Shape //We cannot create objects
{
	float area;
	
	abstract void calArea();//No body for abstract method
	
	void display()//concrete method 
	{
		System.out.println("Area of the shape is:"+area);
	}
}
