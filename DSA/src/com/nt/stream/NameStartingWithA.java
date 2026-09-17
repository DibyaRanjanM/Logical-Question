package com.nt.stream;

import java.util.Arrays;
import java.util.List;

//Names starting with A
public class NameStartingWithA {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("amit", "rahul", "anil", "priya", "arun");
		names.stream().filter(n -> n.startsWith("a")).map(n -> n.toUpperCase()).forEach(System.out::println);
	}

}
