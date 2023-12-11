package com.bridgelabz.PracticeNewTopics.Collection;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("PineApple");
//		fruits.add(null);
		fruits.add("Strawberry");
		fruits.add("PineApple");
//		fruits.add(null);
		LinkedList<String> veges = new LinkedList<>();
		veges.add("Palak");
		veges.add("methi");
		veges.add("kothimber");
//		fruits.addFirst("cherry");
//		fruits.addLast("tomato");
//		fruits.set(2, "grapes");
		fruits.offerFirst("cherry");
		fruits.offerLast("cherryLast");
		System.out.println("This is peek element");
		System.out.println(fruits.peek());
		System.out.println("This is poll element");
		System.out.println(fruits.poll());
		System.out.println("This is poll Last element");
		System.out.println(fruits.pollLast());
		System.out.println(fruits.removeIf(n->(n.length()>8)));
		fruits.addAll(veges);
		System.out.println(fruits.lastIndexOf(null));
		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		System.out.println(fruits.size());
		System.out.println("printing the element by iterator");
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("");
	}
}
