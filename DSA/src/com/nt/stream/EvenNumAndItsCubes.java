package com.nt.stream;

import java.util.List;
//Find even numbers in stream and collect the cubes

public class EvenNumAndItsCubes {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n * n).forEach(System.out::println);
	}

}
