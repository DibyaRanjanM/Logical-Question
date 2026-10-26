package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MediumLevelQuestionSolve {
	public static void main(String[] args) {
		// 1.Write a program to find the sum of all elements in a list using Java Stream
		// API
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(n -> n).sum();
		System.out.println(sum);
		// 2. Given a list of integers, write a program to find and print the maximum
		// element using Java Stream API

		List<Integer> number = Arrays.asList(2, 4, 8, 6, 10);
		int orElseThrow = number.stream().mapToInt(n -> n).max().orElseThrow();
		System.out.println(orElseThrow);
		// 3. Write a program to filter out all the even numbers from a list using Java
		// Stream API
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		numbers1.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		// 4. Given a list of strings, write a program to count the number of strings
		// containing a specific character ‘a’ using Java Stream API.
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
		char searchChar = 'a';
		long count = strings.stream().filter(s -> s.contains(String.valueOf(searchChar))).count();
		System.out.println(count);
		// 5. Write a program to convert a list of strings to uppercase using Java
		// Stream API
		List<String> string = Arrays.asList("apple", "banana", "orange", "grape");
		string.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
		// 6. Given a list of integers, write a program to calculate the average of all
		// the numbers using Java Stream API.
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
		OptionalDouble average = numbers2.stream().mapToDouble(n -> n).average();
		System.out.println(average);
		// 7. Write a program to sort a list of strings in alphabetical order using Java
		// Stream API.
		List<String> strings1 = Arrays.asList("banana", "orange", "apple", "grape");
		strings1.stream().sorted().forEach(System.out::println);
		// 8. Given a list of strings, write a program to concatenate all the strings
		// using Java Stream API.
		List<String> strings2 = Arrays.asList("apple", "banana", "orange", "grape");
		String collect = strings2.stream().collect(Collectors.joining());
		System.out.println(collect);
		// 9. Write a program to find the longest string in a list of strings using Java
		// Stream API.
		List<String> strings3 = Arrays.asList("apple", "banana", "orange", "grape");
		Optional<String> max = strings3.stream().max(Comparator.comparing(String::length));
		System.out.println(max);

		// 10. Given a list of integers, write a program to find and print the second
		// largest number using Java Stream API.
		List<Integer> numbers3 = Arrays.asList(4, 2, 8, 6, 10);
		Optional<Integer> first = numbers3.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(first.get());

		// 11. Write a program to remove all the duplicate elements from a list using
		// Java Stream API.
		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
		numbers4.stream().distinct().forEach(System.out::println);

	}

}
