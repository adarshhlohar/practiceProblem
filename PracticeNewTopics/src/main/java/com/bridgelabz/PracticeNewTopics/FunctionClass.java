package com.bridgelabz.PracticeNewTopics;

import java.util.function.Function;

public class FunctionClass {
	public static void main(String[] args) {
		Function<Integer, String> getValue = t->t*10 + " is the value after multiplies with 10";
		System.out.println(getValue.apply(2));
	}
}
