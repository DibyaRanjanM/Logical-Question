package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Names starting with A
public class NameStartingWithA {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("amit", "rahul", "anil", "priya", "arun");
		names.stream().filter(n -> n.startsWith("a")).map(n -> n.toUpperCase()).forEach(System.out::println);
		System.out.println("------------------------");
		// Names longer than 4 → uppercase
		List<String> namess = Arrays.asList("Raj", "Rahul", "Amit", "Priya", "Alexander");
		namess.stream().filter(n -> n.length() > 4).map(n -> n.toUpperCase()).forEach(System.out::println);
		System.out.println("-----------------------");
		// Print squares of even numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		numbers.stream().map(n -> n * n).filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println("-----------------");

		// Employee salaries Find salaries greater than 40000 and store them in a List.
		List<Integer> salaries = Arrays.asList(25000, 40000, 55000, 30000, 70000);
		List<Integer> collect = salaries.stream().filter(sal -> sal > 40000).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("------------------");
		// Find prices greater than 1000 and apply a 10% discount.
		List<Integer> prices = Arrays.asList(500, 1200, 800, 2500, 3000);
		prices.stream().filter(p -> p > 1000).map(p -> p * 0.90).forEach(System.out::println);

		System.out.println("----------------------");
		// Find marks greater than or equal to 50, then add 5 marks.
		List<Integer> marks = Arrays.asList(35, 70, 85, 42, 90, 25, 60);
		List<Integer> collect2 = marks.stream().filter(m -> m >= 50).map(m -> m + 5).collect(Collectors.toList());
		collect2.forEach(System.out::println);

		System.out.println("-------------------------");

		/*
		 * 
		 * 1. Find even numbers 2. Square them 3. Store in List
		 */
		List<Integer> number = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
		List<Integer> collect3 = number.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
		collect3.forEach(System.out::println);

		System.out.println("---------------------");
		// Find transactions greater than 1000, apply a 5% processing fee, and store the
		// result in a List.
		List<Integer> transactions = Arrays.asList(500, 1500, 200, 5000, 3000, 100);
		List<Double> collect4 = transactions.stream().filter(t -> t > 1000).map(t -> t * 1.05)
				.collect(Collectors.toList());
		collect4.forEach(System.out::println);
	}

}
