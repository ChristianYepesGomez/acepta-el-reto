package com.company;

import java.util.Scanner;

public class P252_Palindromos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s1Minusculas, s2;

		do {

			s1 = sc.nextLine();
			s2 = "";
			
			if (!s1.equals("XXX")) {
				s1Minusculas = s1.toLowerCase();
				s1Minusculas = s1Minusculas.replace(" ", "");

				for (int i = s1Minusculas.length(); i > 0; i--) {
					s2 += s1Minusculas.substring(i-1, i);
				}
				
				if (s2.equals(s1Minusculas)) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
			}

		} while (!s1.equals("XXX"));

	}

}
