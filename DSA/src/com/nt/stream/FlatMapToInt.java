package com.nt.stream;

import java.util.List;

public class FlatMapToInt {
	public static void main(String[] args) {

		// Calculate the total number of products across all carts.
		Cart cart1 = new Cart(List.of(new Product("Laptop", 1), new Product("Mouse", 2), new Product("Keyboard", 1)));

		Cart cart2 = new Cart(List.of(new Product("Phone", 2), new Product("Charger", 3)));

		Cart cart3 = new Cart(List.of(new Product("Monitor", 2), new Product("Cable", 4)));
		List<Cart> carts = List.of(cart1, cart2, cart3);
		int sum = carts.stream().flatMapToInt((t -> t.getProducts().stream().mapToInt(Product::getQuantity))).sum();
		System.out.println(sum);

		System.out.println("========================================================");

		// Create a single List<String> containing all subjects taken by all students.
		List<Student> students = List.of(new Student("Amit", List.of("Java", "SQL")),
				new Student("Rahul", List.of("Spring", "Docker")), new Student("Priya", List.of("AWS", "Java")));
		int sum2 = students.stream().flatMapToInt(s -> s.getSubjects().stream().mapToInt(String::length)).sum();
		System.out.println(sum2);

	}

	static class Product {
		private String name;
		private int quantity;

		private Product(String name, int quantity) {
			super();
			this.name = name;
			this.quantity = quantity;
		}

		public int getQuantity() {
			return quantity;
		}
	}

	static class Cart {
		private List<Product> products;

		private Cart(List<Product> products) {
			super();
			this.products = products;
		}

		public List<Product> getProducts() {
			return products;
		}

	}

	static class Student {
		private String name;
		private List<String> subjects;

		public Student(String name, List<String> subjects) {
			this.name = name;
			this.subjects = subjects;
		}

		public String getName() {
			return name;
		}

		public List<String> getSubjects() {
			return subjects;
		}
	}

}
