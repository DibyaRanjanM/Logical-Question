package com.nt.stream;

import java.util.List;
import java.util.stream.Stream;

public class Limit {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.limit(7).forEach(System.out::println);

		System.out.println("-------------------------");
		// Print only the first 2 names using limit().
		List<String> names = List.of("Amit", "Rahul", "Priya", "Sneha", "John");

		names.stream().limit(2).forEach(System.out::println);
		System.out.println("_----------------------------------_");

		// Print the first 3 numbers greater than 10.
		List<Integer> number = List.of(5, 12, 18, 25, 30, 7, 40);
		number.stream().filter(n -> n > 10).limit(3).forEach(System.out::println);
		System.out.println("---------------------------------------------------");

		// Print the first 2 names that start with "A".
		List<String> nam = List.of("Alex", "Bob", "Andrew", "David", "Anil", "John");
		nam.stream().filter(n -> n.startsWith("A")).limit(2).forEach(System.out::println);
		System.out.println("=================================");

		// Find the 3 smallest numbers.
		List<Integer> numb = List.of(50, 10, 80, 30, 90, 20, 70, 40);
		numb.stream().sorted().limit(3).forEach(System.out::println);
	}

}
