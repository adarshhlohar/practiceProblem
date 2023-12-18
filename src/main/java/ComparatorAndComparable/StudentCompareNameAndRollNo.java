package ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
	private String name;
	private int rollNo;

	public Person(String name, Integer rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", rollNo=" + rollNo + "]";
	}
}

class CustomerSortingComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int nameCompare = o1.getName().compareTo(o2.getName());
		int ageCompare = o1.getRollNo().compareTo(o2.getRollNo());

		if (nameCompare == 0) {
			return ageCompare;
		} else {
			return nameCompare;
		}
	}
}

public class StudentCompareNameAndRollNo {

	public static void main(String[] args) {
		List<Person> studs = Arrays.asList(new Person("Adarsh", 21), new Person("Mahesh", 22), new Person("Dhiraj", 24),
				new Person("Adarsh", 25), new Person("Mahesh", 23), new Person("Sachin", 26));
//		Collections.sort(studs);
		System.out.println("The value without sort");
		Iterator<Person> itr = studs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Collections.sort(studs, new CustomerSortingComparator());
		System.out.println("The value with sort");
		studs.forEach(n -> System.out.println(n));
	}
}
