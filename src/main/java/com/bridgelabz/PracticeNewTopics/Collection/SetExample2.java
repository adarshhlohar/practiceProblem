package com.bridgelabz.PracticeNewTopics.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Car {
	String vin, description;

	public boolean equals(Object other) { // Depends on vin only
		if (!(other instanceof Car)) {
			return false;
		} else {
			return vin.equalsIgnoreCase(((Car) other).vin);
		}
	}

	public int hashCode() {
		return vin.hashCode();
	}

	public Car(String v, String d) {
		vin = v;
		description = d;
	}
	

	public String toString() {
		return vin + " " + description;
	}
}

public class SetExample2 {

	public static void main(String[] args) {
		Set<Car> carSet = new HashSet<>();
		Car[] mycar = {
				new Car("TJ1","toyota"),
				new Car("GM1","Corvetta"),
				new Car("TJ1", "Toyota Corolla")
		};
		
		for(Car c : mycar) {
			carSet.add(c);
		}
		Iterator<Car> it = carSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println(carSet.hashCode());
	}
}
