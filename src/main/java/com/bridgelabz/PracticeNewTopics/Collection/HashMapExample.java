package com.bridgelabz.PracticeNewTopics.Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("India", 125);
		hm.put("China", 130);
		hm.put("USA", 100);
		hm.put("Indonesia", 50);
		hm.put("China", 140);
		System.out.println(hm.remove("China"));
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey("China"));
		System.out.println(hm.get("China"));
		
		for(Map.Entry<String, Integer> e : hm.entrySet()) {
			System.out.println("Key : " + e.getKey() + " Value :" +e.getValue());
		}
		
		Enumeration<String> enumStr = Collections.enumeration(hm.keySet());
		
		while(enumStr.hasMoreElements()) {
			System.out.println(enumStr.nextElement());
		}
	}
}
