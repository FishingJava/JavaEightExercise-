package com.javaEight.practice;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamOperations {

	public static void main(String[] args) {
		
		int[] values = {3,10,6,1,4,8,2,5,9,8};
		//display original values 
		System.out.println("original Values: ");
		IntStream.of(values)
		          .forEach(value -> System.out.printf("%d ", value));
		
		//count, min, max, sum and average of the values
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());
		System.out.printf("%nCount: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("%nCount: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("%nSum: %d%n", IntStream.of(values).sum());
		System.out.printf("%nAverage: %.2f%n", IntStream.of(values).average().orElse(0));
		
		System.out.printf("sum via reduce method: %d%n",
		   IntStream.of(values)
		            .reduce(0, (x, y) -> x+y));
		
		System.out.printf("product of squres via reduce method: %d%n",
				   IntStream.of(values)
				            .reduce(1, (x, y) -> x*y));
		
	   //Even values displayed in sorted order
		System.out.printf("%nEven numbers displayed in a sorted order: ");
				   IntStream.of(values)
				            .filter(value -> value % 2 ==0)
				            .sorted()
				            .forEach(value -> System.out.printf("%d ", value));
		
	}

}
