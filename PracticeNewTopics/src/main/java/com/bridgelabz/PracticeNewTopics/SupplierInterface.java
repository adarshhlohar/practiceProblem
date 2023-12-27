package com.bridgelabz.PracticeNewTopics;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		Supplier<Double> getValue = ()->Math.random();
		System.out.println(getValue.get());
	}

}
