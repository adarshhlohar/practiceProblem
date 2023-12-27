package com.bridgelabz.PracticeNewTopics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ArrayFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Predicate<Integer> evenNum = number->number%2==0;
		
		System.out.println("Even Numbers");
		numbers.stream().filter(evenNum).forEach(System.out::println);

		System.out.println("Numbers Greater Than five");
		Predicate<Integer>  greaterThan5 = number-> number>5;
		numbers.stream().filter(greaterThan5).forEach(System.out::println);
	}
}
