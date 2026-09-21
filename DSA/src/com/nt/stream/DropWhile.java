package com.nt.stream;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhile {
	public static void main(String[] args) {
		/*
		 * 
		 * Ignore salaries below ₹30,000 Keep everything from ₹30,000 onward Give those
		 * employees a 10% salary increase Collect the result into a List<Double>
		 */
		List<Integer> salaries = List.of(20000, 25000, 30000, 35000, 40000, 50000, 60000);
		List<Double> collect = salaries.stream().dropWhile(s -> s < 30000).map(s -> s * 1.10)
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
