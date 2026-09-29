package com.nt.lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ExamleOfLambdaExpression {
	public static void main(String[] args) {
		// Use a lambda expression to print every number.
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		numbers.forEach(s -> System.out.println(s));
		System.out.println("---------------------------------");
		// Even Numbers

		List<Integer> number = Arrays.asList(10, 15, 20, 25, 30, 35);
		number.stream().filter(n -> n % 2 == 0).forEach(s -> System.out.println(s));
		System.out.println("-----------------------------------");

		// Sort Ascending

		List<Integer> numbe = Arrays.asList(50, 20, 40, 10, 30);
		numbe.stream().sorted(Comparator.comparingInt(n -> n)).forEach(s -> System.out.println(s));
		// Sort Descending
		List<Integer> numb = Arrays.asList(50, 20, 40, 10, 30);
		numb.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		;
		System.out.println("=-----------------------=======");
		// Strings by Length
		List<String> names = Arrays.asList("Rahul", "Amit", "Alexander", "Joe");
		names.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
				.forEach(s -> System.out.println(s));
		// Employee Salary
		List<Employee> employees = Arrays.asList(new Employee(101, "Rahul", 50000), new Employee(102, "Amit", 70000),
				new Employee(103, "Priya", 40000));
		employees.stream().sorted(Comparator.comparingInt((Employee e) -> e.salary)).forEach(System.out::println);

		// Salary Descending
		employees.stream().sorted(Comparator.comparingInt((Employee e) -> e.salary).reversed())
				.forEach(System.out::println);
		System.out.println("------------------------------");
		// Salary Then Name
		/*
		 * Salary ascending If salary is same → name ascending
		 */
		List<Employee> employee = Arrays.asList(new Employee(101, "Rahul", 50000), new Employee(102, "Amit", 50000),
				new Employee(103, "Priya", 60000), new Employee(104, "John", 50000));
		employee.stream()
				.sorted(Comparator.comparingInt((Employee e) -> e.salary).thenComparing((Employee e) -> e.name))
				.forEach(System.out::println);
		employee.sort((e1, e2) -> {
			int result = Integer.compare(e1.salary, e2.salary);

			if (result == 0) {
				result = e1.name.compareTo(e2.name);
			}
			return result;

		});
		employee.forEach(System.out::println);
		// Create a TreeSet<Integer> using a lambda expression so that numbers are
		// stored in descending order

		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		set.add(10);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(30);

		System.out.println(set);

		System.out.println("---------------------------------------");
//Use a lambda expression to print employees whose salary is greater than 50000.
		List<Employee> employe = Arrays.asList(new Employee(101, "Rahul", 50000), new Employee(102, "Amit", 70000),
				new Employee(103, "Priya", 40000), new Employee(104, "John", 80000));
		employe.stream().filter(e -> e.salary > 50000).forEach(System.out::println);
		System.out.println("=========================");
		employe.forEach(e -> {
			if (e.salary > 50000) {
				System.out.println(e);
			}
		});

	}

}
