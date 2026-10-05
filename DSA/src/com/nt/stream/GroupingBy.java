package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

		// Count each Number
		List<Integer> number = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		Map<Integer, Long> collect5 = number.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect5);

		// Count each word
		List<String> word = Arrays.asList("java", "python", "java", "c", "python", "java");
		Map<String, Long> collect6 = word.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println(collect6);
		// Count each character
		String str = "hello";
		Map<String, Long> collect7 = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect7);

		// Count names based on their first character
		List<String> name = Arrays.asList("Ram", "Raj", "Ravi", "John", "James", "Sam", "Steve", "Suresh");
		Map<Character, Long> collect8 = name.stream()
				.collect(Collectors.groupingBy(n -> n.charAt(0), Collectors.counting()));
		System.out.println(collect8);
		System.out.println("----------------");
		// Count words based on their length
		List<String> wrd = Arrays.asList("cat", "dog", "bat", "apple", "mango", "banana", "orange");
		Map<Integer, Long> collect9 = wrd.stream()
				.collect(Collectors.groupingBy(n -> n.length(), Collectors.counting()));
		System.out.println(collect9);
		// Count employees in each department
		List<Employeee> employeess = Arrays.asList(new Employeee("John", "IT"), new Employeee("Ram", "HR"),
				new Employeee("Raj", "IT"), new Employeee("Sam", "Finance"), new Employeee("Tom", "HR"),
				new Employeee("Mike", "IT"));
		Map<String, Long> collect10 = employeess.stream()
				.collect(Collectors.groupingBy(Employeee::getDepartment, Collectors.counting()));
		System.out.println(collect10);
		// Find the frequency of each character in this String:
		String str1 = "mississippi";
		Map<Character, Long> collect11 = str1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect11);

	}

}
