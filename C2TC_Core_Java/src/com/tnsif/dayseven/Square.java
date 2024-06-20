package com.tnsif.dayseven;

public class Square extends Shape {
	
	float side;
	
	
	public Square() {
		side = 2.0f;
		// TODO Auto-generated constructor stub
	}


	public Square(float side) {
		super();
		this.side = side;
	}


	@Override
	void calArea() {
		super.area = side*side;
		
	}
	
}
