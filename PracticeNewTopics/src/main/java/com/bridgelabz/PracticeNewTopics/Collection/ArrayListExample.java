package com.bridgelabz.PracticeNewTopics.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Adarsh");
		list1.add("Mahesh");
		list1.add("Sameer");
		list1.add("Dhiraj");
		list1.add("Mahesh");
		System.out.println(list1.get(3));
		System.out.println(list1.indexOf("Mahesh"));
		System.out.println();
		System.out.println(list1.remove(4));
		System.out.println();
		System.out.println(list1.lastIndexOf("Mahesh"));
		System.out.println(list1.set(0, "Addi"));
		System.out.println("We can Iterate element using iterator");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("we can iterate element by using the for loop");
		for(int i = 0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("we can iterate element by using the for each loop");
		for(String elem : list1) {
			System.out.println(elem);
		}
		
		
		System.out.println(list1.contains("Adarsh"));
		list1.clear();
		
		
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list2.addAll(list2);
		Iterator<Integer> itr2 = list2.iterator();
		System.out.println("We can Iterate element using iterator");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("we can iterate element by using the for loop");
		for(int i = 0; i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("we can iterate element by using the for each loop");
		for(Integer elem : list2) {
			System.out.println(elem);
		}
		list2.clear();
	}
}
