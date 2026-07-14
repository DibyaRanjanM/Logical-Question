package com.nt.list;

public class MethodOverloading {
	public double area(double r) {
		return Math.PI * r * r;
	}

	public int area(int a, int b) {

		return a * b;

	}

	public static void main(String[] args) {
		MethodOverloading ml = new MethodOverloading();
		System.out.println(ml.area(4));
		System.out.println(ml.area(2, 5));
	}

}
