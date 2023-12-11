package ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>{
	private double rating;
	private String name;
	private int year;
	
	
	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	

	public double getRating() {
		return rating;
	}


	public String getName() {
		return name;
	}


	public int getYear() {
		return year;
	}



	public int compareTo(Movie movie) {
		if(this.year > movie.year) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	
}

class NameCompare implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2){
		return m1.getName().compareTo(m2.getName());
	}
}


class RatingCompare implements Comparator<Movie>{
	public int compare(Movie m1, Movie m2) {
		if(m1.getRating() > m2.getRating()) {
			return 1;
		}else if(m1.getRating() < m2.getRating()){
			return -1;
		}else {
			return 0;
		}
	}
}

public class ComparableClassExample {
	public static void main(String[] args) {
		List<Movie> mv  = Arrays.asList(new Movie(8.3,"Leo",2023),new Movie(8.5,"Vikram",2022),new Movie(8.7,"Master",2021),new Movie(8.6,"Beast",2022));
		
		System.out.println("Before Sorting");
		for(Movie m : mv) {
			System.out.println(m);
		}
		
		Collections.sort(mv);
		System.out.println("After Sorting By the Year");
		for(Movie m : mv) {
			System.out.println(m);
		}
		
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(mv,ratingCompare);
		System.out.println("After Sorting By the Rating");
		mv.forEach(n -> System.out.println(n));
		
		NameCompare nameCompare = new NameCompare();
		Collections.sort(mv,nameCompare);
		System.out.println("After Sorting by Name");
		mv.forEach(n -> System.out.println(n));
	}
}


