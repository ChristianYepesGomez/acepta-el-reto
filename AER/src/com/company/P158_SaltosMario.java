package com.company;

import java.util.Scanner;

public class P158_SaltosMario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int muros, altura;
		int[] vector;

		for (int i = 0; i < n; i++) {

			int saltoArriba = 0;
			int saltoAbajo = 0;
			muros = sc.nextInt();
			vector = new int[muros];

			for (int j = 0; j < vector.length; j++) {
				altura = sc.nextInt();
				vector[j] = altura;
			}

			for (int j = 0; j < vector.length - 1; j++) {
				if (vector[j] < vector[j + 1]) {
					saltoArriba++;
				} else if (vector[j] > vector[j + 1]) {
					saltoAbajo++;
				}

			}
			System.out.printf("%d %d%n", saltoArriba, saltoAbajo);
		}

		sc.close();

	}

}
