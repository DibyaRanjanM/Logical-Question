package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Roshan");
		list.add("DIbya");
		list.add("HG");
		list.add("Ajeet");
		list.stream().forEach(p -> System.out.println(p));
		Stream<Integer> stream = Stream.of(2, 4, 5, 6, 7);
		stream.forEach(p -> System.out.println(p));

	}

}
