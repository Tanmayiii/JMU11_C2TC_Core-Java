package com.tnsif.dayten;

import java.util.LinkedList;
public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(2,99);
		System.out.println(list);
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.addFirst(11);
		list1.addFirst(22);
		list1.addFirst(33);
		System.out.println(list1);
		list.addAll(3,list1);
		System.out.println(list);
	}
}
