package com.nt.annonymousclass;

@FunctionalInterface
interface Greetings {
	void greet();
}

@FunctionalInterface
interface Calculator {
	int add(int a, int b);
}

@FunctionalInterface
interface Square {
	void calculate(int x);
}
