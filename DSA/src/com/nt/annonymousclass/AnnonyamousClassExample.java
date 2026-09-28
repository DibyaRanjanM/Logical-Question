package com.nt.annonymousclass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AnnonyamousClassExample {

	public static void main(String[] args) {
		Greeting greet = new Greeting() {

			@Override
			public void greet() {
				System.out.println("greeting");

			}
		};
		greet.greet();

		System.out.println("==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Shape sa = new Shape() {

			@Override
			void draw() {
				System.out.println("Draw the circle");

			}
		};
		sa.draw();
		System.out.println("+++++_++++++++++++++++++++++++++_____________");
		Animal an = new Animal() {
			@Override
			void speak() {
				System.out.println("Dog barks");

			}
		};
		an.speak();

		System.out.println("====================Lambda Expression==============================");
		Greeting g = () -> System.out.println("Hello Java");
		g.greet();

		System.out.println("-------------------------------");

		Calculator c = (a, b) -> a + b;

		System.out.println(c.add(10, 20));
		System.out.println("-Create a lambda that accepts an integer and prints its square.--");

		// Square s = (a) -> (a * a);
		Square s = (a) -> System.out.println(a * a);
		s.calculate(5);
		System.out.println("=============");
		/*
		 * 
		 * Built-in Interfaces Problem 5 — Predicate
		 * 
		 * Create:
		 */
		Predicate<Integer> p = x -> x > 50;
		System.out.println(p.test(70));
		System.out.println(p.test(50));
		System.out.println("-=============p-------");
		Function<String, Integer> f = x -> x.length();
		System.out.println(f.apply("ROshan"));
		System.out.println("-----------------------------------");
		Consumer<String> c1 = n -> System.out.println("Welcome" + n);
		c1.accept("Roshan");
		System.out.println("---------------------");
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		numbers.stream().filter(p1 -> p1 % 2 == 0).forEach(p1 -> System.out.println(p1));
		System.out.println("----------------------------------");
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		number.stream().map(p2 -> p2 * 2).forEach(p2 -> System.out.println(p2));
		System.out.println("----------------------------");
		List<Integer> numb = Arrays.asList(5, 12, 7, 20, 3, 18, 25);
		/*
		 * 
		 * Using Stream + lambda, print numbers that:
		 * 
		 * Are greater than 10 Are even Are multiplied by 2
		 */
		numb.stream().filter(n -> n > 10).filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * 2)
				.forEach(n2 -> System.out.println(n2));
		System.out.println("=====================================");
		// Print only names whose length is greater than 3.
		List<String> names = Arrays.asList("Amit", "Raj", "Ananya", "Bob", "Arjun");
		names.stream().filter(n -> n.length() > 3).forEach(n -> System.out.println(n));

	}

}
