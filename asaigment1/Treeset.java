package com.javaprograms;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> number = new TreeSet<String>();
		number.add("one");
		number.add("two");
		number.add("three");
		number.remove("two");
		System.out.println(number);
	}
}
