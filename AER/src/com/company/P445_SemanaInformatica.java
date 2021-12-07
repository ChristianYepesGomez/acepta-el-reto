package com.company;

import java.util.Scanner;

public class P445_SemanaInformatica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//TODO Revisar la forma de hacerlo e intentarlo
		int n2;

		while (sc.hasNextInt()) {
			
			int n1 = sc.nextInt();
			int[] datos = new int[n1 * 2];

			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < 2; j++) {
					n2 = sc.nextInt();
					datos[j] = n2;
					System.out.println(datos[j]);
				}

				// int[][] matriz = new int[n][];

			}
		}
		sc.close();

	}

}
