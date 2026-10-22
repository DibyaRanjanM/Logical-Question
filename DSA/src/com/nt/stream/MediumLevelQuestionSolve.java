package com.nt.stream;

import java.util.Arrays;
import java.util.List;

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

	}

}
