package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import JunitExample.Calculation;

public class CalculatorTest {
	
	@Test
	public void findMaxTest() {
		Calculation calculation = new Calculation();
		int max = calculation.findMax(new int[]{-12,-1,-3,-4,-2});
		assertEquals(-1, max);
	}
}
