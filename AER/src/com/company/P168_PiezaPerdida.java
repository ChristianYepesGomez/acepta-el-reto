package com.company;

import java.util.Scanner;

public class P168_PiezaPerdida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, veces, suma, res, sumaAux;

		do {

			suma = 0;
			res = 0;
			sumaAux = 0;

			veces = sc.nextInt();

			if (veces != 0) {

				for (int i = 1; i < veces; i++) {
					numero = sc.nextInt();
					suma += numero;

				}

				sumaAux += (veces * (veces + 1)) / 2;

				System.out.println(sumaAux - suma);

			}
		} while (veces != 0);
		sc.close();
	}

}
