package com.javaprograms;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {

		TreeMap<Integer, String> name = new TreeMap<Integer, String>();
		name.put(100, "chevin");
		name.put(200, "dewa");
		name.put(300, "fabian");
		name.put(400, "srihelmayati");
		// System.out.println(name.get(200));

		for (Integer i : name.keySet()) {
			System.out.println(name.get(i));
		}
	}

}
