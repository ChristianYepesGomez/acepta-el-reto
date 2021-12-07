package com.company;

import java.util.Scanner;

public class P430_PruebasDeYoda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numVeces, diasPrimeraVez, diasSiguienteVez, suma;

		do {

			numVeces = sc.nextInt();
			suma = 0;
			if (numVeces != 0) {

				for (int i = 0; i < numVeces; i++) {

					diasPrimeraVez = sc.nextInt();
					diasSiguienteVez = sc.nextInt();

					if (i == 0)
						suma = diasPrimeraVez;
					else {
						while (diasPrimeraVez <= suma)
							diasPrimeraVez += diasSiguienteVez;
						suma = diasPrimeraVez;
					}
				}
				System.out.println(suma);

			}

		} while (numVeces != 0);

		sc.close();

	}

}
