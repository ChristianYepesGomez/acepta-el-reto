package com.company;

import java.util.Scanner;

public class P535_Desembalse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int distancia, maximaCantidad;
		int[] alturas;

		do {

			distancia = sc.nextInt();
			
			if (distancia > 0) {
				
				alturas = new int[distancia];
				maximaCantidad = 0;

				for (int i = 0; i < distancia; i++) {

					alturas[i] = sc.nextInt();

				}
				for (int i = 0; i < alturas.length; i++) {

					maximaCantidad += alturas[alturas.length - 1] - alturas[i];
				}

				System.out.println(maximaCantidad);

			}

		} while (distancia > 0);

		sc.close();
	}

}