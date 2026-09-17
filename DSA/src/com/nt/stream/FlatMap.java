package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

///map + Flattening [Converting Collections of collection into single collection]
public class FlatMap {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("D", "E", "F");
		List<String> list3 = Arrays.asList("G", "H", "I");
		List<List<String>> asList = Arrays.asList(list1, list2, list3);
		List<String> collect = asList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("---------------------");
		// Flattening of prime, even and odd number
		List<Integer> primeNumbers = Arrays.asList(5, 7, 11);
		List<Integer> evenNumbers = Arrays.asList(2, 4, 6);
		List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
		List<List<Integer>> asList2 = Arrays.asList(primeNumbers, evenNumbers, oddNumbers);
		List<Integer> collect2 = asList2.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		collect2.forEach(System.out::println);

		System.out.println("-------------------------");
		// Get even numbers from nested lists

		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(10, 15, 20), Arrays.asList(25, 30, 35),
				Arrays.asList(40, 45, 50));
		List<Integer> collect3 = numbers.stream().flatMap(n -> n.stream()).filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		collect3.forEach(System.out::println);
		System.out.println("---------------------------");
		// Flatten and convert names to uppercase
		List<List<String>> names = Arrays.asList(Arrays.asList("rahul", "amit"), Arrays.asList("priya", "raj"),
				Arrays.asList("anil", "neha"));

		List<String> collect4 = names.stream().flatMap(n -> n.stream()).map(n -> n.toUpperCase())
				.collect(Collectors.toList());
		collect4.forEach(System.out::println);

		System.out.println("-----------------------------");
		// Flatten and find numbers greater than 20
		List<List<Integer>> number = Arrays.asList(Arrays.asList(10, 25, 30), Arrays.asList(15, 40, 50),
				Arrays.asList(5, 60, 70));
		List<Integer> collect5 = number.stream().flatMap(n -> n.stream()).filter(n -> n > 20)
				.collect(Collectors.toList());
		collect5.forEach(System.out::println);
		System.out.println("------------------------");

		/*
		 * Do all of these:
		 * 
		 * Flatten the lists using flatMap() Find numbers greater than 20 Multiply them
		 * by 2 Store the result in List<Integer>
		 */
		List<List<Integer>> num = Arrays.asList(Arrays.asList(10, 15, 20), Arrays.asList(25, 30, 35),
				Arrays.asList(40, 45, 50));
		List<Integer> collect6 = num.stream().flatMap(n -> n.stream()).filter(n -> n > 20).map(n -> n * 2)
				.collect(Collectors.toList());
		collect6.forEach(System.out::println);
	}

}
