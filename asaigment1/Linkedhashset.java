package com.javaprograms;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<String> number = new LinkedHashSet<String>();
		number.add("one");
		number.add("two");
		number.add("three");
		number.remove("one");
		System.out.println(number);

	}
}
