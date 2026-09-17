package com.nt.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Find even numbers in stream and collect the sqaure

public class FindEvenANdItsSqaure {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Set<Integer> collect = numbers.stream().filter(num -> num % 2 == 0).map(num -> num * num)
				.collect(Collectors.toSet());
		collect.forEach(System.out::println);
	}

}
