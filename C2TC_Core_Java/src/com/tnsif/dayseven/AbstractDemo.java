package com.tnsif.dayseven;

public class AbstractDemo {
	public static void main(String[] args) {
		Square s = new Square();
		s.calArea();
		s.display();
		
		Shape sh; //reference variable(not an object)
		sh = new Square(10.5f);
		sh.calArea();
		sh.display();
				
	}
}
