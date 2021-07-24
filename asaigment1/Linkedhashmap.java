package com.javaprograms;

import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {

		LinkedHashMap<String, String> namedate = new LinkedHashMap<String, String>();
		namedate.put("chevin", "Perumahan Griya Ciledug");
		namedate.put("dewa", "Perumahan Puri Kartika");
		namedate.put("Fabian", "Perumahan Sakura");
		namedate.put("srihelmayati", "Perumahan Rempoa");
		// System.out.println(namedate.get("chevin"));

		for (String word : namedate.keySet()) {
			System.out.println(namedate.get(word));

		}

	}
}
