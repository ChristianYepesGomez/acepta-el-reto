package com.company;

import java.util.Scanner;

public class P165_Numero_Hyperpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, numSeccionado, contadorImpares;
		String numString;

		do {

			numero = sc.nextInt();
			if (numero > -1) {

				numString = Integer.toString(numero);

				contadorImpares = 0;

				for (int i = 0; i < numString.length(); i++) {
					numSeccionado = Integer.parseInt(numString.substring(i, i + 1));

					if (numSeccionado % 2 != 0) {
						contadorImpares++;
					}
				}

				if (contadorImpares != 0) {
					System.out.println("NO");
				} else {
					System.out.println("SI");
				}
			}
		} while (numero > -1);

		sc.close();
	}

}
