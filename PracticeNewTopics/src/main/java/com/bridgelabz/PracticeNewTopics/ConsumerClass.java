package com.bridgelabz.PracticeNewTopics;

import java.util.function.Consumer;

class Person{
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class ConsumerClass {

	public static void main(String[] args) {
		Person p = new Person();
		Consumer<Person> setName = t-> t.setName("Adddi");
		setName.accept(p);
		System.out.println(p.getName());
	}

}
