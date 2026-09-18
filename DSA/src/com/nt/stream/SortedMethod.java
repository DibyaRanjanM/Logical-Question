package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(89, 56, 12, 58, 90, 34);
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------");
		// Sort numbers descending
		List<Integer> number = Arrays.asList(50, 10, 30, 20, 40);
		number.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("-------------------------");

		// Sort names alphabetically
		List<String> names = Arrays.asList("Rahul", "Amit", "Priya", "Anil");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------------");

		// Sort names in reverse alphabetical order
		List<String> name = Arrays.asList("Rahul", "Amit", "Priya", "Anil");
		name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("-------------------------");
		// Even numbers only, then sort
		List<Integer> number1 = Arrays.asList(15, 8, 22, 3, 10, 5, 18);
		number1.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::println);

		System.out.println("---------------------");
		// Sort after mapping
		/*
		 * Multiply each number by 10 Sort Store in List
		 * 
		 * 
		 */

		List<Integer> num = Arrays.asList(5, 2, 8, 1, 4);
		List<Integer> collect = num.stream().map(n -> n * 10).sorted().collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("------------------------");
		// Employee Salaries
		/*
		 * Find salaries greater than 30000 Sort them in ascending order Store them in a
		 * List
		 * 
		 * 
		 */

		List<Integer> salaries = Arrays.asList(55000, 25000, 70000, 40000, 30000);
		List<Integer> collect2 = salaries.stream().filter(s -> s > 30000).sorted().collect(Collectors.toList());
		collect2.forEach(System.out::println);

		System.out.println("------------------------");
		/*
		 * Find numbers greater than 20 Sort them in descending order Multiply each by 2
		 * Store in a List
		 */
		List<Integer> numb = Arrays.asList(50, 15, 40, 25, 10, 35, 20);

		List<Integer> collect3 = numb.stream().filter(n -> n > 20).sorted(Comparator.reverseOrder()).map(n -> n * 2)
				.collect(Collectors.toList());
		collect3.forEach(System.out::println);
		System.out.println("-----------------");
		// Sort prices from cheapest to most expensive.
		List<Integer> prices = Arrays.asList(2500, 500, 1500, 3000, 1000);
		prices.stream().sorted((p1, p2) -> p1.compareTo(p2)).forEach(System.out::println);

	}

}
