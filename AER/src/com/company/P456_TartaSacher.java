package com.company;

import java.util.Scanner;

public class P456_TartaSacher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cuadraditosAncho,cuadraditosLargo,cuadraditosNecesito;
		
		
		for (int i = 0; i < n; i++) {
			cuadraditosAncho = sc.nextInt();
			cuadraditosLargo = sc.nextInt();
			cuadraditosNecesito = sc.nextInt();
			int cont = 0;
			int res = 0;
			
			do {
				cont++;
				res +=cuadraditosAncho * cuadraditosLargo;
			} while (cuadraditosNecesito > res);
			
				System.out.println(cont);
		}

		sc.close();
		
	}

}
