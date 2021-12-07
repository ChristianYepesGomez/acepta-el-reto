package com.company;

import java.util.Scanner;

public class P219_PenyaAtletica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int decimos, numDecimo, contadorDecimos;

		for (int i = 0; i < n; i++) {

			decimos = sc.nextInt();
			contadorDecimos = 0;

			for (int j = 0; j < decimos; j++) {
				numDecimo = sc.nextInt();

				if (numDecimo % 2 == 0) {
					contadorDecimos++;
				}

			}
			System.out.println(contadorDecimos);
		}

		sc.close();

	}

}
