package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Optional<Integer> opt = numbers.stream().reduce((a, b) -> (a + b));
		System.out.println(opt.get());
		Optional<Integer> op1 = numbers.stream().reduce(Integer::sum);
		System.out.println(op1.get());
		Integer op2 = numbers.stream().reduce(0, (a, b) -> (a + b));
		System.out.println(op2);
		Integer reduce = Stream.of(1, 2, 3).reduce(1, (a, b) -> (a * b));
		System.out.println(reduce);
		// sum all natural numbert
		System.out.println("======================================");
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
		Integer reduce2 = number.stream().reduce(0, (a, b) -> a + b);
		System.out.println(reduce2);

	}

}
