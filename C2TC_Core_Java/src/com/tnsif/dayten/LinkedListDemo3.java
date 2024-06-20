package com.tnsif.dayten;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("JAVA");
		list2.add("C++");
		list2.add("Apps");
		list2.add("C");
		list2.add("Python");
		System.out.println(list2);
		list2.remove(3);
		list2.removeLast();
		System.out.println(list2);
		list2.removeFirst();
		System.out.println(list2);
		//to iterate the elements
		//descending iterator helps us to print the list in reverse(tail to head)
		Iterator<String> it = list2.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//returns the next element
		}
		
	}

}
