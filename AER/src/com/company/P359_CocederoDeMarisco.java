package com.company;

import java.util.Scanner;

public class P359_CocederoDeMarisco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numDias = sc.nextInt();

		int numMejillones, contador, sumaMejillones;

		for (int i = 0; i < numDias; i++) {

			contador = 0;
			sumaMejillones = 0;
			do {
				numMejillones = sc.nextInt();

				if (numMejillones != -1) {
					contador++;

					sumaMejillones += numMejillones;
				}

			} while (numMejillones > -1);

			if (sumaMejillones > contador) {
				System.out.println("Suerte");
			} else if (sumaMejillones == contador) {
				System.out.println("Justo");
			} else {
				System.out.println("Timo");
			}

		}

		sc.close();

	}

}
