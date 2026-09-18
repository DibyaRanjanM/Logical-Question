package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistnictMethod {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Virat", "Rohit", "Aswin", "Bumrah");
		s.distinct().sorted((s1, s2) -> s2.compareTo(s2)).forEach(System.out::println);
		System.out.println("0----------------------------");
		// High-Level Practice Question
		/*
		 * 
		 * 
		 * Flatten all orders into one stream. Find prices greater than 1000. Remove
		 * duplicate prices. Apply a 10% discount. Sort the final prices in ascending
		 * order. Store the result in List<Double>. Print each price using forEach().
		 */
		List<List<Integer>> orders = Arrays.asList(Arrays.asList(1200, 500, 1200, 800), Arrays.asList(2500, 1500, 500),
				Arrays.asList(3000, 800, 2500), Arrays.asList(1000, 4500, 1500));
		List<Double> collect = orders.stream().flatMap(m -> m.stream()).filter(p -> p > 1000).distinct()
				.map(d -> d * 0.90).sorted().collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("7777777777777777777777777777777777");
		// Find all unique skills, sort them alphabetically, and store them in a List.
		List<List<String>> skills = Arrays.asList(Arrays.asList("Java", "SQL", "Spring"),
				Arrays.asList("Java", "AWS", "Docker"), Arrays.asList("SQL", "Python", "AWS"));
		List<String> collect2 = skills.stream().flatMap(f -> f.stream()).distinct().sorted()
				.collect(Collectors.toList());
		collect2.forEach(System.out::println);

		// Transaction Processing
		/*
		 * 
		 * 
		 * Find transactions greater than 1000 Remove duplicates Add a 5% processing fee
		 * Sort descending Store in List<Double> Print each transaction
		 */

		List<Integer> transactions = Arrays.asList(500, 1500, 2500, 1500, 5000, 2500, 10000);

	}

}
