package com.bridgelabz.PracticeNewTopics.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list2.add(1);
		list2.add(2);
		
		set.addAll(list1);
		set.addAll(list2);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(1));
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
