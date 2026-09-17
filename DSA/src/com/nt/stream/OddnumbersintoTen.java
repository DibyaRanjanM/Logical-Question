package com.nt.stream;

import java.util.Arrays;
import java.util.List;

//Odd numbers × 10
public class OddnumbersintoTen {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		numbers.stream().filter(n -> n % 2 == 1).map(n -> n * 10).forEach(System.out::println);
	}

}
