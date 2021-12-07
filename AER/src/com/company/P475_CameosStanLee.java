package com.company;

import java.util.Scanner;

public class P475_CameosStanLee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String frase;

		String nombre = "stanlee";
		int pos,res;

		for (int i = 0; i < n; i++) {
			
			frase = sc.nextLine();
			frase = frase.trim().toLowerCase();
			pos = 0;
			res = 0;

			for (int j = 0; j < frase.length(); j++) {

				if (frase.charAt(j) == nombre.charAt(pos)) {
					pos++;
				}
				if (pos == nombre.length()) {
					pos = 0;
					res++;
				}

			}
			System.out.println(res);

		}
	}

}
