package StreamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

	public static boolean IsPrime(int number) {
		if (number < 1) {
			return false;
		}
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				return false;
			} 
		}
		return true; 
	}
	
	public static boolean isEven(int n) {
			return n%2==0?true:false;
	}
	

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2, 3, 4, 3, 6, 4, 8, 9);
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> square = list1.stream().map(x -> x * x).collect(Collectors.toList());
		square.forEach(n -> System.out.println(n));

		List<String> name = Arrays.asList("Adarsh", "Sandip", "Aman", "Mahesh", "Aditya", "Adesh");
		List<String> names = name.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		names.forEach(n -> System.out.println(n));

		List<String> show = names.stream().sorted().collect(Collectors.toList());
		show.forEach(n -> System.out.println(n));

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		Set<Integer> squareSet = nums.stream().map(x -> x * x).collect(Collectors.toSet());

		System.out.println("MAking the square in same line and printing in same by using stream");
		nums.stream().map(x -> x * x).forEach(x -> System.out.println(x));

		System.out.println("printing All vlaue using stream");
		squareSet.stream().forEach(x -> System.out.println(x));

		System.out.println("printing all Value by using the Iterator");
		Iterator<Integer> itr = squareSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("printing even number from list1");
		list1.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

		long len = name.stream().filter(x -> !x.isEmpty()).count();
		System.out.println("The length of name is " + len);

		System.out.println("Here we are used the Collectors.joining on name list");
		String newNames = name.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(newNames);

		System.out.println("Here we can use the distinct on map method on list1");
		List<Integer> squareDistinct = list1.stream().map(x -> x * x).distinct().collect(Collectors.toList());
		System.out.println(squareDistinct);

		System.out.println("Here we can using the IntSummaryStatastics");
		IntSummaryStatistics statistics = list1.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("the min value from list1 " + statistics.getMin());
		System.out.println("the max value from list1 " + statistics.getMax()); 
		System.out.println("the average value from list1 " + statistics.getAverage());
		System.out.println("the sum value  from list1 " + statistics.getSum());
		System.out.println("the count value from list1 " + statistics.getCount());

//		int a= list1.stream().sorted(  
		list2 = list1.stream().filter(i -> isEven(i)).distinct().collect(Collectors.toList());
		System.out.println(list2);

		list2 = list1.stream().filter(i -> IsPrime(i)).distinct().collect(Collectors.toList());
		System.out.println(list2);
		
		list2 = list1.stream().filter(i -> !isEven(i)).distinct().collect(Collectors.toList());
		System.out.println(list2);
	}

}
