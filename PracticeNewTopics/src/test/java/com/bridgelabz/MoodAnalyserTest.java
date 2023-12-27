package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import JunitExample.MoodAnalyser;

public class MoodAnalyserTest {

	@Test
	public void analyseMoodTest() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			assertEquals("Happy", moodAnalyser.analyseMood("sad"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
