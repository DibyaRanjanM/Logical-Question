package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalStream {
	public static void main(String[] args) {
		//// Program to verify whether the container has value or not
		String str = "null1";
		Optional<String> optional = Optional.ofNullable(str);
		String string = optional.orElse("No VAlue");
		System.out.println(string);
		// Optional is containing value or not?
		if (optional.isPresent()) {
			System.out.println("Value by get :" + optional.get());
		} else {
			System.err.println("No value is available in the container");
		}

		System.out.println("------------------------------------------------------");
		// Program to verify value is available or not
		List<Optional<String>> optionalList = new ArrayList<>();

		optionalList.add(Optional.of("Ameerpet"));
		optionalList.add(Optional.of("S.R Nagar"));
		optionalList.add(Optional.of("Begumpet"));
		optionalList.add(Optional.of("Koti"));
		optionalList.add(Optional.empty());

		for (Optional<String> opt : optionalList) {
			if (opt.isPresent()) {
				System.out.println(opt.get());
			} else {
				System.out.println("no data Availabale");
			}
		}
		System.out.println("=-========================================================");
		//// Immutability of Optional class

		Optional<String> of = Optional.of("INDIA");
		System.out.println(of.hashCode());
		Optional<String> newOptnl = modifyOptional(of);
		System.out.println(newOptnl.hashCode());
		System.out.println("Add is " + (of == newOptnl));

	}

	public static Optional<String> modifyOptional(Optional<String> optional) {

		if (optional.isPresent()) {
			return Optional.of("Modified: " + optional.get());
		} else {
			return Optional.empty();
		}

	}

}
