package com.company;

import java.util.Scanner;

public class P211_CodigoMorse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palabra = "";

		while (sc.hasNext()) {

			palabra = sc.next();

			if (referenciaMorse(palabra)) {
				System.out.println(palabra + " OK");
			} else {
				System.out.println(palabra + " X");
			}

		}

		sc.close();
	}

	public static boolean referenciaMorse(String s1) {

		boolean b = true;

		String res = "";
		String auxA = "";
		String auxB = "";
		String[][] matriz = { { "A", ".-" }, { "B", "-..." }, { "C", "-.-." }, { "D", "-.." }, { "E", "." },
				{ "F", "..-." }, { "G", "--." }, { "H", "...." }, { "I", ".." }, { "J", ".---" }, { "K", "-.-" },
				{ "L", ".-.." }, { "M", "--" }, { "N", "-." }, { "O", "---" }, { "P", ".--." }, { "Q", "--.-" },
				{ "R", ".-." }, { "S", "..." }, { "T", "-" }, { "U", "..-" }, { "V", "...-" }, { "W", ".--" },
				{ "X", "-..-" }, { "Y", "-.--" }, { "Z", "--.." } };

		for (int i = 0; i < s1.length(); i++) {

			auxA = s1.substring(i, i + 1);
			if (i == 0) {
				auxB = s1.substring(i, i + 1);;
			}

			for (int j2 = 0; j2 < matriz[0].length - 1; j2++) {

				if (auxA.equalsIgnoreCase("A") || auxA.equalsIgnoreCase("E") || auxA.equalsIgnoreCase("I")
						|| auxA.equalsIgnoreCase("U")) {
					res += ".";
				} else if (auxA.equalsIgnoreCase("O")) {
					res += "-";
				}
			}

		}
		
		for (int i = 0; i < matriz.length; i++) {
			if (res.equals(matriz[i][1])) {
				if (s1.substring(0,1).equalsIgnoreCase(matriz[i][0])) {
					b = true;
					i = matriz.length;
				} else {
					b = false;
				}
			} else {
				b = false;
			}
			
		}
		return b;
	}

}
