package com.company;

import java.util.Scanner;

public class P446_AbuelasFalsas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		String s1, s2;
		int n2,contador;
		for (int i = 0; i < n1; i++) {
			boolean abuela = false;
			s2 = "";
			s1 = sc.next();
			n2 = sc.nextInt();
			contador = 0;

			if (n2 > 1) {

				for (int j = 0; j < n2; j++) {

					s2 = sc.next();
					
					if (s2.equals(s1)) {
						contador++;
						if (j == n2 - 1 && contador == 1) {
							abuela = true;
						}
					}

				}
			} else {
				s2 = sc.next();
			}
			
			if (abuela == false ) {
				System.out.println("FALSA");
			} else {
				System.out.println("VERDADERA");
			}

		}

		sc.close();

	}

}
