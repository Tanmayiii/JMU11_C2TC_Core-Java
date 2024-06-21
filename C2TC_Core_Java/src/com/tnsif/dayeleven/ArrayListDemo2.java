package com.tnsif.dayeleven;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String args[]) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		obj.add(70);
		
		for (int i = 0; i < obj.size(); i++) {
			int square = obj.get(i) * obj.get(i);
			System.out.println(square);
		}
	}
}
