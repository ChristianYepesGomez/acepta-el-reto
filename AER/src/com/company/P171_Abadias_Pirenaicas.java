package com.company;

import java.util.Scanner;

public class P171_Abadias_Pirenaicas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, tamanyo, j, contador,mayor;
		boolean b = true;

		do {

			numero = sc.nextInt();
			j = 0;
			contador = 1;

			if (numero != 0) {

				int[] montanyas = new int[numero];

				for (int i = 0; i < numero; i++) {

					tamanyo = sc.nextInt();

					montanyas[i] = tamanyo;
					
				}
				
				mayor = montanyas[montanyas.length-1];
				
				for (int i = montanyas.length-1; i >= 0; i--) {
					if (montanyas[i] > mayor) {
						contador++;
						mayor = montanyas[i];
					}
				}

				System.out.println(contador);
				
			} else {
				b = !b;
			}

		} while (b && sc.hasNextInt());

		sc.close();
	}

}