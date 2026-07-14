package com.nt.list;

public class ConstructorImplementation {
	int a;
	int b;

	private ConstructorImplementation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int addNumbers() {
		return a + b;

	}

	public static void main(String[] args) {
		ConstructorImplementation c = new ConstructorImplementation(10, 7);
		System.out.println(c.addNumbers());

	}

}
