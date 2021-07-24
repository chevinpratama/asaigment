package com.javaprograms;

import java.util.HashMap;

public class studentdetails {

	public static void main(String[] args) {

		String[] namestudent = { "Doni", "Chevin", "Ragil", "Luna" };
		System.out.println("nama saya : " + namestudent[1]);

		// MAPS
		HashMap<String, Integer> matapelajaran = new HashMap<>();

		matapelajaran.put("English", 100);
		matapelajaran.put("Indonesia", 97);
		matapelajaran.put("Phycs", 85);
		matapelajaran.put("Maths", 88);
		for (String key : matapelajaran.keySet()) {
			System.out.println("Mata Pelajaran : " + key + " Nilainya : " + matapelajaran.get(key));
		}

		// RollNUMBER
		String[] RollNumber = { "111", "121", "131", "141" };
		System.out.println("Roll Number : " + RollNumber[1]);

		// NameParents
		String[] NameParentAyah = { "Triyanto" };
		String[] NameParentIbu = { "Srihelmayati" };

		System.out.println("Nama Ayah : " + NameParentAyah[0]);
		System.out.println("Nama Ibu : " + NameParentIbu[0]);

		// PhoneNumber
		String[] PhoneNumber = { "08126373733", "0812633636733", "081282526385" };
		System.out.println("No Telp : " + PhoneNumber[2]);

		// Email
		String[] Email = { "kevinpratamo@gmail.com", "chevinpratama.cp@gmail.com", "kelvinrifan@gmail.com" };
		System.out.println("Email : " + Email[1]);
	}
}
