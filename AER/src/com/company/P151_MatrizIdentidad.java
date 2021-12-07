package com.company;

import java.util.Scanner;

public class P151_MatrizIdentidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean b1 = true;
		int n1, n2;
		int[][] matriz;
		int sumaMatriz;
		
		while (sc.hasNextInt()) {
			b1 = true;
			n1 = sc.nextInt();

			if (n1 == 0) {
				break;
			} else {

				matriz = new int[n1][n1];
				sumaMatriz = 0;
				
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						n2 = sc.nextInt();
						matriz[i][j] = n2;
						sumaMatriz += matriz[i][j];
					}
					if (matriz[i][i] != 1) {
						b1 = false;
					}
					
				}
				if (sumaMatriz != n1) {
					b1 = false;
				}
			}

			if (b1 == false) {
				System.out.println("NO");
			} else {
				System.out.println("SI");
			}

		}

	}

}
