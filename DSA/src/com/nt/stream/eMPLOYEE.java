package com.nt.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find all employee names whose length is greater than 4 and store them in a new List.
public class eMPLOYEE {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Roshan", "Dibya", "Bishal", "Gandu");
		List<String> collect = stream.filter(name -> name.length() > 4).collect(Collectors.toList());
		collect.forEach(System.out::println);

	}

}
