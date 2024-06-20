package com.tnsif.dayseven;

public class StaticDemo {
	static private int serialNo;
	private int section;
	
	//static block gets executed before the main method is executed
	//static block
	static
	{
		System.out.println("I am static block!!!");
		serialNo = 1000;
	}

	public StaticDemo() {
		System.out.println("I am default constructor block!!!");
		section++;
		serialNo++;
	}

	@Override
	public String toString() {
		return "StaticDemo =[section=" + section + ", serialNO=" + serialNo + "]";
	}
	
	//we do not need to use an object to display a static method
	static void display() {
		System.out.println("Serial Number"+ serialNo);
	}
	
}
