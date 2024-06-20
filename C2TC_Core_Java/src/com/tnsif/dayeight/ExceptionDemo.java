package com.tnsif.dayeight;

public class ExceptionDemo {
	public static void main(String[] args) {
	int arr[];
	
	try //risky code 
	{
	arr = new int[] {10, 20, 30 ,40, 50};
	
	System.out.println(arr[40]);
	}
	catch(ArrayIndexOutOfBoundsException a)//handling code
	{
		System.out.println("Array Index Out of Bound....");
		System.err.println("Array Index Out of Bound....");//prints the error in red color
		System.err.println(a.getMessage());//to get detailed error message
	}
	finally
	{
		System.out.println("The mandatory code has been executed");//for example closing a connection or a file
	}
}
}