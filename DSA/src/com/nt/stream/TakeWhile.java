package com.nt.stream;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile {
	public static void main(String[] args) {
		// Use takeWhile() to print numbers while they are positive.
		List<Integer> numbers = List.of(10, 20, 30, 40, -5, 50, 60);
		numbers.stream().takeWhile(n -> n > 0).forEach(System.out::println);
		System.out.println("-------------------------------------------");

		// Use takeWhile() to take numbers less than 50.
		List<Integer> number = List.of(10, 20, 30, 40, 50, 60, 70);
		number.stream().peek(s -> System.out.println()).takeWhile(n -> n < 50).forEach(System.out::println);

		System.out.println("===================================");
		// Take names while the name starts with "A".
		List<String> names = List.of("Amit", "Anil", "Arjun", "Rahul", "Alex", "Ajay");
		names.stream().peek(S -> System.out.println()).takeWhile(n -> n.startsWith("A")).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		/*
		 * 
		 * 
		 * Take numbers while n >= 10 Multiply each selected number by 2 Print the
		 * result
		 */
		List<Integer> numb = List.of(10, 20, 30, 40, 5, 60);
		numb.stream().takeWhile(n -> n >= 10).map(s -> s * 2).forEach(System.out::println);
		System.out.println("----------------------------------------------");
		// Take names while they start with "A" and convert them to uppercase.
		List<String> name = List.of("Amit", "Anil", "Arjun", "Bob", "Alex");
		name.stream().takeWhile(s -> s.startsWith("A")).map(m -> m.toUpperCase()).forEach(System.out::println);
		System.out.println("---------------------------------------------");
		/*
		 * 
		 * Keep only even numbers using filter() Then use takeWhile() to take numbers
		 * less than 10 Print them
		 */
		List<Integer> num = List.of(1, 3, 4, 6, 8, 9, 10, 12);
		num.stream().filter(n -> n % 2 == 0).takeWhile(p -> p < 10).forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		// Take salaries while they are greater than or equal to 50000.Take Until Salary
		// Drops
		List<Integer> salaries = List.of(50000, 60000, 70000, 80000, 30000, 90000);
		salaries.stream().takeWhile(sal -> sal >= 50000).forEach(System.out::println);

		System.out.println("----------------------------------------");
		// Use takeWhile() to process transactions until the first negative value.
		List<Integer> transactions = List.of(100, 200, 300, 400, -1, 500, 600);
		transactions.stream().takeWhile(t -> t > 0).forEach(System.out::println);
		System.out.println("----------------------------------");
		/*
		 * 
		 * Sort the numbers in ascending order. Take numbers while they are < 50. Print
		 * them.
		 */
		List<Integer> numbe = List.of(50, 10, 30, 20, 70, 40, 60);
		numbe.stream().sorted((s1, s2) -> s1.compareTo(s2)).takeWhile(n -> n < 50).forEach(System.out::println);

		System.out.println("==============================================================");
		/*
		 * 
		 * Sorts salaries in ascending order. Takes salaries while they are < 60000.
		 * Converts them to a 10% increased salary using map(). Collects the result into
		 * a List.
		 */
		List<Integer> salary = List.of(30000, 45000, 50000, 55000, 60000, 35000, 70000, 80000);
		List<Double> collect = salary.stream().sorted().takeWhile(n -> n < 60000).map(m -> m * 1.10)
				.collect(Collectors.toList());

		collect.forEach(System.out::println);
	}

}
