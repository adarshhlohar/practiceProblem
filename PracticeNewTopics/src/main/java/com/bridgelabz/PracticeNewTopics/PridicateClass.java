package com.bridgelabz.PracticeNewTopics;

import java.util.function.Predicate;

public class PridicateClass {
	public static void main(String[] args) {
		Predicate<String> predicateLength = str->str.length()>5;
		System.out.println(predicateLength.test("PredicateLenght"));
		System.out.println(predicateLength.test("adas"));
	}
}
