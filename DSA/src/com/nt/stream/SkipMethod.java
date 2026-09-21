package com.nt.stream;

import java.util.Comparator;
import java.util.List;

public class SkipMethod {
	public static void main(String[] args) {
		// Find the first 3 even numbers.

		List<Integer> numbers = List.of(5, 12, 7, 20, 33, 40, 50, 61);
		numbers.stream().filter(n -> n % 2 == 0).limit(3).forEach(System.out::println);
		System.out.println("------------------------------------------");
		// Skip the first 2 even numbers and print the remaining even numbers.
		List<Integer> number = List.of(5, 12, 7, 20, 33, 40, 50, 61);
		number.stream().filter(n -> n % 2 == 0).skip(2).forEach(System.out::println);
		System.out.println("=======================================");

		// Find the first 2 names starting with "A".
		List<String> names = List.of("Amit", "Rahul", "Anil", "John", "Arjun", "Alex");
		names.stream().filter(n -> n.startsWith("A")).limit(2).forEach(System.out::println);

		System.out.println("------------------------------------------");
		/*
		 * 
		 * 
		 * Keep only even numbers. Skip the first 2 even numbers. Take the next 3.
		 */
		List<Integer> num = List.of(10, 15, 20, 25, 30, 35, 40, 45, 50);
		num.stream().filter(n -> n % 2 == 0).skip(2).forEach(System.out::println);

		System.out.println("--------------------------------");
		// Find the 3 highest salaries.
		List<Integer> salaries = List.of(50000, 80000, 30000, 100000, 60000, 90000, 40000);
		salaries.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

		System.out.println("====================================");
		// Find the 2nd and 3rd highest salaries.
		List<Integer> salary = List.of(50000, 80000, 30000, 100000, 60000, 90000, 40000);
		salary.stream().sorted(Comparator.reverseOrder()).skip(1).limit(2).forEach(System.out::println);
		

	}

}
