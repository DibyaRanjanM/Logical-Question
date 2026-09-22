package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PRACTICE {
	public static void main(String[] args) {
		// Find the maximum number from a list of integers.
//		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//		numbers.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
//		
//		//Find the first non-repeated character in a string.
//		
//		String name = null;
//
//		Optional<String> result = Optional.ofNullable(name);
//
//		System.out.println(result);

//		List<Integer> numbers = Arrays.asList(10, 12, 17, 25, 33, 35);
//		List<Integer> collect = numbers.stream().filter(n -> n % 5 == 0).map(m -> m * m).collect(Collectors.toList());
//		collect.forEach(System.out::println);
		// sort
		List<Integer> number = Arrays.asList(1, 15, 3, 40, 50, 9, 7);
		number.stream().sorted().limit(3).forEach(System.out::println);
		System.out.println("------------------------");
		number.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//sum all natural numbert

	}

}
