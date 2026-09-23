package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Optional<Integer> opt = numbers.stream().reduce((a, b) -> (a + b));
		System.out.println(opt.get());
		Optional<Integer> op1 = numbers.stream().reduce(Integer::sum);
		System.out.println(op1.get());
		Integer op2 = numbers.stream().reduce(0, (a, b) -> (a + b));
		System.out.println(op2);
		Integer reduce = Stream.of(1, 2, 3).reduce(1, (a, b) -> (a * b));
		System.out.println(reduce);
		// sum all natural numbert
		System.out.println("======================================");
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
		Integer reduce2 = number.stream().reduce(0, (a, b) -> a + b);
		System.out.println(reduce2);
		System.out.println("================================================");
		// Find maximum
		List<Integer> salaries = List.of(30000, 45000, 60000, 55000, 80000);
		Integer reduce3 = salaries.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(reduce3);
		System.out.println("----------------------------------");
		// Find minimum
		List<Integer> prices = List.of(500, 1200, 300, 800, 1500);
		Integer reduce4 = prices.stream().reduce((a, b) -> a < b ? a : b).orElse(0);
		System.out.println(reduce4);

		System.out.println("-----------------------------------");
		// Product of numbers
		List<Integer> numbe = List.of(2, 3, 4, 5);
		Integer reduce5 = numbe.stream().reduce((a, b) -> a * b).orElse(0);
		System.out.println(reduce5);
		System.out.println("---------------------------");
		// Join names
		List<String> names = List.of("Amit", "Rahul", "Priya", "John");
		String orElse = names.stream().reduce((a, b) -> a + "-" + b).orElse("");
		System.out.println(orElse);
		System.out.println("===========----------------p00000000000000");
		// Total completed order amount

		List<Order> orders = List.of(new Order(101, 5000), new Order(102, 3000), new Order(103, 7000),
				new Order(104, 2000));
		int total = orders.stream().map(Order::getAmount).reduce(0, (a, b) -> a + b);

		System.out.println(total);
		System.out.println("=====================================");
		// Highest-paid employee
		List<Employee> employees = List.of(new Employee("Amit", 30000), new Employee("Rahul", 70000),
				new Employee("Priya", 55000), new Employee("John", 90000), new Employee("Neha", 45000));
		Employee orElse2 = employees.stream().reduce((a, b) -> a.getSalary() > b.getSalary() ? a : b).orElse(null);
		System.out.println(orElse2.getSalary());
		System.out.println(orElse2.getName());

	}

	static class Order {
		private int orderId;
		private int amount;

		public Order(int orderId, int amount) {
			this.orderId = orderId;
			this.amount = amount;
		}

		public int getOrderId() {
			return orderId;
		}

		public int getAmount() {
			return amount;
		}
	}

	static class Employee {
		private String name;
		private int salary;

		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}
	}

}
