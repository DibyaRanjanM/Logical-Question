package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find all numbers greater than 20, multiply them by 2, and store the result in a List
public class NumbersGreaterThan {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		List<Integer> collect = numbers.stream().filter(num -> num > 20).map(num -> num * 2)
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

	}

}
