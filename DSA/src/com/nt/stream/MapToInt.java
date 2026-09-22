package com.nt.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MapToInt {
	public static void main(String[] args) {
		// Total Salary
		List<Integer> salaries = List.of(30000, 40000, 50000, 60000);
		int sum = salaries.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println("==========================================");
		// Average Marks
		List<Integer> marks = List.of(70, 80, 90, 60, 100);
		OptionalDouble average = marks.stream().mapToInt(Integer::intValue).average();
		System.out.println(average);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

		// Employee Salary Sum
		/*
		 * Amit 30000 Rahul 50000 John 45000
		 * 
		 */
		List<Employee> employees = List.of(new Employee("Amit", 30000), new Employee("Rahul", 50000),
				new Employee("John", 45000));
		int sum2 = employees.stream().mapToInt(Employee::getSalary).sum();
		System.out.println(sum2);
		System.out.println("________________________________________________________");

		// Total Characters
		List<String> names = List.of("Java", "Spring", "Microservices");
		int sum3 = names.stream().mapToInt(String::length).sum();
		System.out.println(sum3);
		System.out.println("))))))))))))))))))))))))))))");

		// Highest Salary
		List<Employee> emp = List.of(new Employee("Amit", 30000), new Employee("Rahul", 50000),
				new Employee("John", 45000), new Employee("Alex", 70000));
		OptionalInt max = emp.stream().mapToInt(Employee::getSalary).max();
		System.out.println(max);

		Employee orElse = emp.stream().max(Comparator.comparingInt(Employee::getSalary)).orElse(null);
		System.out.println(orElse.name);
		System.out.println(orElse.salary);
		System.out.println("------------------------------------------------------");
		// Revenue Report
		/*
		 * 
		 * Convert orders to amounts using mapToInt() Find: Total Revenue Average Order
		 * Value Maximum Order Value
		 */
		List<Order> orders = List.of(new Order(1000), new Order(2000), new Order(1500), new Order(3000),
				new Order(2500));
		int sum4 = orders.stream().mapToInt(Order::getAmount).sum();
		OptionalDouble average2 = orders.stream().mapToInt(Order::getAmount).average();
		OptionalInt max2 = orders.stream().mapToInt(Order::getAmount).max();
		System.out.println(sum4);
		System.out.println(average2.getAsDouble());
		System.out.println(max2.getAsInt());

		IntSummaryStatistics summaryStatistics = orders.stream().mapToInt(Order::getAmount).summaryStatistics();
		System.out.println(summaryStatistics);

		System.out.println("-----------------------------------------------");

		/*
		 * 
		 * Write a single Stream pipeline that:
		 * 
		 * Keeps employees with salary > 40000 Converts salaries using mapToInt()
		 * Calculates the average salar
		 */
		List<Employee> employee = List.of(new Employee("Amit", 30000), new Employee("Rahul", 50000),
				new Employee("John", 45000), new Employee("Alex", 70000), new Employee("Priya", 55000));
		OptionalDouble average3 = employee.stream().filter(sal -> sal.getSalary() > 40000).mapToInt(Employee::getSalary)
				.average();
		System.out.println(average3);
		System.out.println("----------------------------------");

		/*
		 * 
		 * Advanced Revenue Report — Real-Time Scenario
		 * 
		 * You are working on an e-commerce application. You need to generate a revenue
		 * report from customer orders.
		 */

		List<Orders> order = List.of(new Orders(101, "Amit", "Electronics", 5000, "COMPLETED"),
				new Orders(102, "Rahul", "Clothing", 2000, "COMPLETED"),
				new Orders(103, "John", "Electronics", 8000, "CANCELLED"),
				new Orders(104, "Priya", "Electronics", 7000, "COMPLETED"),
				new Orders(105, "Alex", "Clothing", 3000, "COMPLETED"),
				new Orders(106, "Neha", "Books", 1500, "PENDING"),
				new Orders(107, "Vijay", "Electronics", 9000, "COMPLETED"),
				new Orders(108, "Sara", "Books", 2500, "COMPLETED"),
				new Orders(109, "Ravi", "Clothing", 4000, "CANCELLED"),
				new Orders(110, "Anu", "Electronics", 6000, "COMPLETED"));

		IntSummaryStatistics summaryStatistics2 = order.stream().mapToInt(Orders::getAmount).summaryStatistics();
		System.out.println(summaryStatistics2);
		IntSummaryStatistics summaryStatistics3 = order.stream().filter(s -> s.equals("COMPLETED"))
				.mapToInt(Orders::getAmount).summaryStatistics();
		System.out.println(summaryStatistics3);
	}

	static class Employee {
		String name;
		int salary;

		Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}

		public int getSalary() {
			return salary;
		}
	}

	static class Order {
		int amount;

		Order(int amount) {
			this.amount = amount;
		}

		public int getAmount() {
			return amount;
		}
	}

	static class Orders {
		private int orderId;
		private String customer;
		private String category;
		private int amount;
		private String status;

		private Orders(int orderId, String customer, String category, int amount, String status) {
			super();
			this.orderId = orderId;
			this.customer = customer;
			this.category = category;
			this.amount = amount;
			this.status = status;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public String getCustomer() {
			return customer;
		}

		public void setCustomer(String customer) {
			this.customer = customer;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		// constructor
		// getters
	}

}
