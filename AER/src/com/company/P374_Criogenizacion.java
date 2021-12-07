package com.company;

import java.util.Scanner;

public class P374_Criogenizacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long minimo,maximo,contadorMaxima,contadorMinima;
		long temperatura = 0;

		for (int i = 0; i < n; i++) {
			contadorMaxima = 0;
			contadorMinima = 0;
			minimo = Long.MAX_VALUE;
			maximo = 0;

			do {
				temperatura = sc.nextLong();
				if (temperatura != 0) {

					if (temperatura > maximo) {
						maximo = temperatura;
						contadorMaxima = 0;
					}
					if (temperatura < minimo) {
						minimo = temperatura;
						contadorMinima = 0;
					}
					if (temperatura == maximo) {
						contadorMaxima++;
					}
					if (temperatura == minimo) {
						contadorMinima++;
					}
				}
			} while (temperatura != 0);

			System.out.printf("%d %d %d %d%n", minimo, contadorMinima, maximo, contadorMaxima);

		}

		sc.close();

	}

}
