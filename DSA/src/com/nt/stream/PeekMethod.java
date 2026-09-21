package com.nt.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethod {
	public static void main(String[] args) {
		Stream<String> numbers = Stream.of("Apple", "Mango", "Grapes", "Kiwi", "pomogranate");
		List<Integer> collect = numbers.peek(s -> System.out.println("Peeking from Original: " + s.toUpperCase()))
				.map(n -> n.length()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
