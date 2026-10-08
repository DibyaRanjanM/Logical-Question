package com.nt.stream.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArray {

	public static void main(String[] args) {
		// Write a Program to find the Maximum element in an array?
		int arr[] = { 5, 1, 2, 8 };
		int asInt = Arrays.stream(arr).max().getAsInt();
		System.out.println(asInt);

		// Write a program to print the count of each character in a String?
		String str = "Now is the winter";
		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		/*
		 * 
		 * Given two arrays of Person objects, merge them, sort them by age in ascending
		 * order, and then by name alphabetically for people with the same age.
		 */

		Person[] pList1 = { new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 25) };
		Person[] pList2 = { new Person("David", 30), new Person("Eve", 25), new Person("Alice", 25) };
		Stream.concat(Arrays.stream(pList1), Arrays.stream(pList2))
				.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
				.forEach(System.out::println);

		// Write a program to find the length of the longest name in a list of strings.
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
		int max = names.stream().mapToInt(String::length).max().orElse(0);
		System.out.println(max);
		// Check if a list of integers contains any prime numbers.
		List<Integer> numbers = Arrays.asList(4, 6, 8, 11, 12, 13, 14, 15);
		boolean match = numbers.stream().anyMatch(StreamArray::isPrime);
		System.out.println(match);

		/*
		 * 
		 * Count the total number of distinct words (case-insensitive) across multiple
		 * sentences.
		 */
		List<String> sentences = Arrays.asList("Java Stream API provides a fluent interface",
				"It supports functional-style operations on streams", "In this exercise, you need to count words");
		long count = sentences.stream().map(x -> x.toLowerCase().split(" ")).flatMap(Arrays::stream).distinct().count();
		System.out.println(count);
		// Find and concatenate the first two words that have even lengths.
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		String collect2 = words.stream().filter(x -> x.length() % 2 == 0).limit(2).collect(Collectors.joining());
		System.out.println(collect2);
		/*
		 * 
		 * Given a list of transactions, find the sum of transaction amounts for each
		 * day and sort by date.
		 */
		List<Transaction> transactions = Arrays.asList(new Transaction("2022-01-01", 100),
				new Transaction("2022-01-01", 200), new Transaction("2022-01-02", 300));
		transactions.stream().collect(Collectors.groupingBy(Transaction::getDate, TreeMap::new,
				Collectors.summingLong(Transaction::getAmount)));
		/*
		 * 
		 * Given two arrays of integers, merge them, sort them, and then filter out any
		 * numbers greater than a specified threshold.
		 */
		int[] array1 = { 1, 5, 3, 9, 7 };
		int[] array2 = { 2, 4, 6, 8, 10 };
		int threshold = 7;
		IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).boxed().sorted().filter(x -> x <= threshold)
				.forEach(System.out::println);

		/*
		 * 
		 * Transform a list of employee records into a map of department to average
		 * salary.
		 */

		List<Employee> employees = Arrays.asList(new Employee("IT", 75000), new Employee("IT", 85000),
				new Employee("HR", 50000), new Employee("HR", 60000), new Employee("Finance", 90000),
				new Employee("Finance", 95000), new Employee("Sales", 70000), new Employee("Sales", 65000));
		Map<String, Double> collect3 = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

System.out.println(collect3);
	}

	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 1) {
				return false;
			}
		}
		return true;
	}

}
