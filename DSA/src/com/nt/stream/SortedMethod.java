package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedMethod {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(89, 56, 12, 58, 90, 34);
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------");
		// Sort numbers descending
		List<Integer> number = Arrays.asList(50, 10, 30, 20, 40);
		number.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("-------------------------");

		// Sort names alphabetically
		List<String> names = Arrays.asList("Rahul", "Amit", "Priya", "Anil");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------------");

		// Sort names in reverse alphabetical order
		List<String> name = Arrays.asList("Rahul", "Amit", "Priya", "Anil");
		name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("-------------------------");
		// Even numbers only, then sort
		List<Integer> number1 = Arrays.asList(15, 8, 22, 3, 10, 5, 18);
		number1.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::println);

		System.out.println("---------------------");
		// Sort after mapping
		/*
		 * Multiply each number by 10 Sort Store in List
		 * 
		 * 
		 */

		List<Integer> num = Arrays.asList(5, 2, 8, 1, 4);
		List<Integer> collect = num.stream().map(n -> n * 10).sorted().collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("------------------------");
		// Employee Salaries
		/*
		 * Find salaries greater than 30000 Sort them in ascending order Store them in a
		 * List
		 * 
		 * 
		 */

		List<Integer> salaries = Arrays.asList(55000, 25000, 70000, 40000, 30000);
		List<Integer> collect2 = salaries.stream().filter(s -> s > 30000).sorted().collect(Collectors.toList());
		collect2.forEach(System.out::println);

		System.out.println("------------------------");
		/*
		 * Find numbers greater than 20 Sort them in descending order Multiply each by 2
		 * Store in a List
		 */
		List<Integer> numb = Arrays.asList(50, 15, 40, 25, 10, 35, 20);

		List<Integer> collect3 = numb.stream().filter(n -> n > 20).sorted(Comparator.reverseOrder()).map(n -> n * 2)
				.collect(Collectors.toList());
		collect3.forEach(System.out::println);
		System.out.println("-----------------");
		// Sort prices from cheapest to most expensive.
		List<Integer> prices = Arrays.asList(2500, 500, 1500, 3000, 1000);
		prices.stream().sorted((p1, p2) -> p1.compareTo(p2)).forEach(System.out::println);
		System.out.println("------------------------------------------------------");

		// Sort salaries from highest to lowest.
		List<Integer> salary = Arrays.asList(45000, 25000, 70000, 35000, 55000);
		// salary.stream().sorted((s1, s2) ->
		// s2.compareTo(s1)).forEach(System.out::println);
		salary.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		// Sort names in reverse alphabetical order.
		System.out.println("----------------------------------------------");
		List<String> nam = Arrays.asList("Rahul", "Amit", "Priya", "Anil", "Raj");
		nam.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		nam.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");
		// Sort employees by name length, shortest first.
		List<String> employees = Arrays.asList("Rahul", "Amit", "Alexander", "Raj", "Priya");
		employees.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).forEach(System.out::println);

		System.out.println("===================================================");
		// Sort names by length — longest first

		List<String> employe = Arrays.asList("Rahul", "Amit", "Alexander", "Raj", "Priya");
		employe.stream().sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())).forEach(System.out::println);

		System.out.println("&&&&&&&&&&***********************************");
		/*
		 * Remove salaries below 40000 Remove duplicate salaries Sort highest salary
		 * first Store the result in a List Print the result
		 */
		List<Integer> salari = Arrays.asList(25000, 55000, 40000, 75000, 55000, 30000);
		List<Integer> collect4 = salari.stream().filter(s -> s >= 40000).distinct().sorted((s1, s2) -> s2.compareTo(s1))
				.collect(Collectors.toList());
		collect4.forEach(System.out::println);
		System.out.println("********************************************");
		/*
		 * 
		 * Remove salaries below 40000 Remove duplicate salaries Apply a 10% salary
		 * bonus Sort from highest to lowest Store the result in List<Double> Print
		 * using forEach()
		 */

		List<Integer> sal = Arrays.asList(25000, 55000, 40000, 75000, 55000, 30000, 90000, 45000, 75000);

		List<Double> collect5 = sal.stream().filter(s -> s >= 40000).distinct().map(b -> b * 1.10)
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		collect5.forEach(System.out::println);
		System.out.println("))))))))))))))))))))))))))))))))))))))))))))))))))");

		/*
		 * 
		 * Keep prices greater than 1000 Remove duplicates Apply 15% discount Sort
		 * discounted prices lowest to highest Store in List<Double> Print each price
		 */
		List<Integer> price = Arrays.asList(500, 1500, 2500, 1000, 3000, 1500, 4500, 2500, 800, 5000);
		List<Double> collect6 = price.stream().filter(p -> p > 1000).distinct().map(d -> d * 0.85)
				.sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		collect6.forEach(System.out::println);
		System.out.println("===============================================");

		/*
		 * 
		 * 
		 * 
		 * Remove marks below 60 Remove duplicates Add 5 bonus marks Sort highest to
		 * lowest Store in List<Integer> Print using forEach()
		 */

		List<Integer> marks = Arrays.asList(45, 78, 90, 65, 78, 55, 92, 90, 35, 88, 65);
		List<Integer> collect7 = marks.stream().filter(s -> s > 60).distinct().map(b -> b + 5)
				.sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		collect7.forEach(System.out::println);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

		/*
		 * 
		 * Keep transactions greater than 1000 Remove duplicates Add a 5% processing fee
		 * Sort highest to lowest Store in List<Double> Print the results\
		 * 
		 */
		List<Integer> transactions = Arrays.asList(500, 1500, 3000, 1500, 5000, 7500, 3000, 10000, 800, 12000);

		List<Double> collect8 = transactions.stream().filter(t -> t > 1000).distinct().map(a -> a * 1.05)
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		collect8.forEach(System.out::println);
		System.out.println("_____________________________________________________________________");
		/*
		 * Remove orders below 2000 Remove duplicate orders Apply 10% discount Keep only
		 * discounted prices greater than 2500 Sort from highest to lowest Store in
		 * List<Double> Print using forEach()
		 */
		List<Integer> orders = Arrays.asList(1200, 500, 2500, 1200, 4500, 3000, 800, 4500, 6000, 2500, 10000, 1500);

		List<Double> collect9 = orders.stream().filter(o -> o > 2000).distinct().map(d -> d * 0.90)
				.filter(p -> p > 2500).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		collect9.forEach(System.out::println);
	}

}
