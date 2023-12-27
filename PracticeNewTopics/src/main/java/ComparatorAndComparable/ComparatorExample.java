package ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	private int age;
	private String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student that) {
		if (this.age > that.age) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparatorExample {
	public static void main(String[] args) {

		Comparator<Integer> com = (i, j) -> i % 10 > j % 10 ? 1 : -1;

		List<Integer> nums = Arrays.asList(73, 23, 32, 48, 53, 67, 61, 48, 59, 55);
		Collections.sort(nums, com);
//		System.out.println(nums);
		nums.forEach(n -> System.out.println(n));

		List<Student> studs = Arrays.asList(new Student(21, "Adarsh"), new Student(25, "Mahesh"),
				new Student(23, "Sameer"), new Student(24, "Dhiraj"), new Student(22, "Akash"));
		Collections.sort(studs);
		for (Student s : studs) {
			System.out.println(s);
		}
	}
}
