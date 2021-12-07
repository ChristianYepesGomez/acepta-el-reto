package com.company;

import java.util.Scanner;

public class P157_CuantosDiasFaltan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dia, mes, diasRestantes;
		int n = sc.nextInt();

		int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < n; i++) {

			dia = sc.nextInt();
			mes = sc.nextInt();
			diasRestantes = 0;

			for (int j = mes; j <= 12; j++) {
				diasRestantes += meses[j-1];
			}

			diasRestantes = diasRestantes - dia;
			
			System.out.println(diasRestantes);
		}
	}

}
