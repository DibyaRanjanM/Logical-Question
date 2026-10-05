package com.nt.stream.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
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

	}

}
