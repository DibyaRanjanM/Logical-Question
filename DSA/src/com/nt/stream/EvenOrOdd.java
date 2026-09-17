package com.nt.stream;

import java.util.stream.Stream;

public class EvenOrOdd {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(2, 5, 6, 8, 9, 3);
		stream.filter(p -> p % 2 == 0).forEach(System.out::println);
	}

}
