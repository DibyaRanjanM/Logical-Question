package com.nt.stream;

import java.util.Arrays;
import java.util.List;

//Names starting with A
public class NameSstartingWithA {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Rahul", "Anil", "Priya", "Arun");
		names.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);

	}
}
