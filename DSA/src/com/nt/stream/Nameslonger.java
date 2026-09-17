package com.nt.stream;

import java.util.Arrays;
import java.util.List;

//Names longer than 5 characters
public class Nameslonger {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rahul", "Alexander", "Amit", "Priyanka", "Raj");
		names.stream().filter(n -> n.length() > 5).forEach(System.out::println);
	}

}
