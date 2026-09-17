package com.nt.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOrOdd {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(2, 5, 6, 8, 9, 3);
		// stream.filter(p -> p % 2 == 0).forEach(System.out::println);

//		System.out.println("Using Collectors.ToList");
//		Set<Integer> collect = stream.filter(p -> p % 2 == 0).collect(Collectors.toSet());
//		collect.forEach(System.out::println);

		System.out.println("Set of Odd nyumber");
		List<Integer> collect2 = stream.filter(p -> p % 2 == 1).collect(Collectors.toList());
		collect2.forEach(System.out::println);

	}

}
