package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
	public static void main(String[] args) {
		/// Group names by first character

		List<String> names = Arrays.asList("Ram", "Raj", "John", "Ravi", "James", "Robert");
		Map<Character, List<String>> collect = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println(collect);

		// Group words by their length
		List<String> words = Arrays.asList("cat", "dog", "apple", "bat", "banana", "car");
		Map<Integer, List<String>> collect2 = words.stream().collect(Collectors.groupingBy(n -> n.length()));
		System.out.println(collect2);
		// Group numbers by even/odd
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Map<Boolean, List<Integer>> collect3 = numbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));
		System.out.println(collect3);

		// Group employees by department
		List<Employeee> employees = Arrays.asList(new Employeee("John", "IT"), new Employeee("Ram", "HR"),
				new Employeee("Raj", "IT"), new Employeee("Sam", "Finance"), new Employeee("Tom", "HR"));
		Map<String, List<Employeee>> collect4 = employees.stream()
				.collect(Collectors.groupingBy(Employeee::getDepartment));
		System.out.println(collect4);
	}

}
