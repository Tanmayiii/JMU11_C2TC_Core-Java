package com.tnsif.dayeleven;

import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		Message m1 = (name)->
		{
			System.out.println("Hello! Good Morning "+name);
		};
		m1.greet("Tanmayi");
		
		Cube c = (a)->
		{
			return (a*a*a);
		};
		System.out.println(c.calculate(7));
		
		//Another way of writing the lambda expression
		Cube c1 = (a)-> a*a*a;
		System.out.println(c1.calculate(8));
		
		//Stream API
		Stream<Integer> stream= Stream.of(10,20,30,40,50,60,70);
		Function<Integer,Integer> sqr = (n)-> n*n;
		stream.map(sqr).forEach(System.out::println);
	}
}
