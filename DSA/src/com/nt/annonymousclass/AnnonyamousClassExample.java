package com.nt.annonymousclass;

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

	}

}
