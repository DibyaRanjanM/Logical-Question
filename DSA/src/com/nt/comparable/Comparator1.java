package com.nt.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(101, "Amit", 50000, 28));
		employees.add(new Employee(102, "Rahul", 70000, 32));
		employees.add(new Employee(103, "Priya", 50000, 26));
		employees.add(new Employee(104, "John", 90000, 35));
		employees.add(new Employee(105, "Neha", 45000, 24));
		employees.add(new Employee(106, "Alex", 70000, 30));
		employees.add(new Employee(107, "Sara", 60000, 29));
		employees.add(new Employee(108, "Vijay", 45000, 27));
		// Sort employees by name using Comparator.
		Collections.sort(employees, new Employee());
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		System.out.println("===============================");
		// Sort employees by salary descending.
		Collections.sort(employees, new Employee());
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		System.out.println("========================================");
		// Sort employees by salary, then by name
		Collections.sort(employees, new Employee());
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		System.out.println("]------------------");
		// Sort employees by salary in ascending order.
		employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);
		System.out.println("===========================");
		// Sort employees by salary in descending order.
		employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).forEach(System.out::println);
		System.out.println("============================");
		// Sort employees by name alphabetically.
		employees.stream().sorted((a, b) -> a.name.compareTo(b.name)).forEach(System.out::println);
		System.out.println("***************************");
		// Sort employees by age in ascending order.
		employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		System.out.println("++++++++++++++++++++++++++++++");
		// Sort employees by age in descending order.
		employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
		// Level 2 — Multiple sorting conditions
		System.out.println("========================++++++++++++++++++++++++++++");
		// Sort employees by salary, and if salary is the same, sort by name.
		employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName))
				.forEach(System.out::println);
		System.out.println("++++++++++++++++++++==========================");
		// Sort employees by salary descending, then by name ascending.
		employees.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed().thenComparing(Employee::getName))
				.forEach(System.out::println);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		// Sort employees by name length.
		employees.stream()
				.sorted(Comparator.comparingInt((Employee e) -> e.getName().length()).thenComparing(Employee::getName))
				.forEach(e -> System.out.println(e.getName() + "..." + e.getName().length()));
		System.out.println("--------------------==============================");
		// Sort employees by name length, then alphabetically by name.
		employees.stream()
				.sorted(Comparator.comparingInt((Employee e) -> e.getName().length()).thenComparing(Employee::getName))
				.forEach(System.out::println);
		System.out.println("==========================================");
		// Sort employees by salary descending. If salary is the same, sort by age
		// ascending. If both salary and age are the same, sort by name alphabetically
		employees
				.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()
						.thenComparingInt(Employee::getAge).thenComparing(Employee::getName))
				.forEach(System.out::println);
		;
		System.out.println("------------------------------");

		// Find the highest-paid employee using Stream API
		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1)
				.forEach(System.out::println);
		employees.stream().max(Comparator.comparingInt(Employee::getSalary)).ifPresent(System.out::println);
		System.out.println("---------------------");
		// Find the second-highest-paid employee.

		employees.stream().filter(e -> e.getSalary() == employees.stream().map(Employee::getSalary)
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0)).forEach(System.out::println);
		// Find the employee(s) having the second-highest salary.
		employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.ifPresent(System.out::println);

	}

	static class Employee implements Comparator<Employee> {

		private int id;
		private String name;
		private int salary;
		private int age;

		public Employee() {
		}

		public Employee(int id, String name, int salary, int age) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		public int getAge() {
			return age;
		}

		@Override
		public String toString() {
			return id + " " + name + " " + salary + " " + age;
		}

		@Override
		public int compare(Employee o1, Employee o2) {
			// return o1.name.compareTo(o2.name);
			//// Sort employees by salary descending.
			// return Integer.compare(o2.getSalary(), o1.getSalary());

			// Sort employees by salary, then by name
			int compare = Integer.compare(o1.salary, o2.salary);
			if (compare == 0) {
				return o1.name.compareTo(o2.name);
			}
			return compare;
		}

	}

}
