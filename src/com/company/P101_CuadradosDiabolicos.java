package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P101_CuadradosDiabolicos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int n1, n2, contador;
		int[][] matriz;
		int[] vector;
		while (sc.hasNextInt() && b == true) {

			n1 = sc.nextInt();
			n2 = 0;
			contador = 0;
			vector = new int[n1 * n1];
			matriz = new int[n1][n1];

			if (n1 == 0) {
				b = false;
			}

			else {

				for (int i = 0; i < matriz.length; i++) {

					for (int j = 0; j < matriz.length; j++) {
						n2 = sc.nextInt();
						matriz[i][j] = n2;
						vector[contador] = n2;
						contador++;
					}
				}

				// Comprobar si es cuadrado Diabolico
				if (esDiabolico(matriz) == false) {
					System.out.println("NO");
				} else {
					if (esEsoterico(matriz, vector) == true) {
						System.out.println("ESOTERICO");
					} else {
						System.out.println("DIABOLICO");
					}
				}
			}
		}
		sc.close();
	}

	public static boolean esDiabolico(int[][] matriz) {
		int sumaMatriz1 = 0;
		int sumaMatriz2 = 0;
		int contador = 0;
		int auxDiagonal = 0;
		boolean b2 = true;

		// Primero comprobar si todas las Columnas de la matriz suman lo mismo
		// Recorro las filas
		for (int i = 0; i < matriz.length; i++) {
			sumaMatriz1 = 0;
			// Recorro las columnas
			for (int j = 0; j < matriz[0].length; j++) {
				// Le voy añadiendo los valores de cada fila a sumaMatriz1
				sumaMatriz1 += matriz[j][i];

			}
			// Añado un contador para que el valor de sumaMatriz2 solo sea igual al de
			// sumaMatriz1 la primera vez
			if (contador == 0) {
				sumaMatriz2 = sumaMatriz1;
				contador++;
			}
			// Si los valores de las dos variables no son iguales, el cuadrado deja de ser
			// diabolico y paro el for y el while
			if (sumaMatriz1 != sumaMatriz2) {
				b2 = false;
				i = matriz.length;
				return b2;

			}
		} // For

		// Comprobar si todas las Filas de la matriz suman lo mismo
		// Recorro las filas
		for (int i = 0; i < matriz.length; i++) {
			sumaMatriz1 = 0;
			// Recorro las columnas
			for (int j = 0; j < matriz[0].length; j++) {
				// Le voy añadiendo los valores de cada fila a sumaMatriz1
				sumaMatriz1 += matriz[i][j];

			}
			// Si los valores de las dos variables no son iguales, el cuadrado deja de ser
			// diabolico y paro el for y el while
			if (sumaMatriz1 != sumaMatriz2) {
				b2 = false;
				i = matriz.length;
				return b2;

			}
		} // For

		// Reinicio el valor de la variable
		sumaMatriz1 = 0;

		// Recorro la matriz en diagonal
		for (int i = 0; i < matriz.length; i++) {
			sumaMatriz1 += matriz[i][i];
		} // For

		// Si los valores de las dos variables no son iguales, el cuadrado deja de ser
		// diabolico y paro el for y el while
		if (sumaMatriz1 != sumaMatriz2) {
			b2 = false;
			return b2;
		}
		
		sumaMatriz1 = 0;
		auxDiagonal = matriz.length-1;
		// Recorro la matriz en diagonal
		for (int i = 0; i < matriz.length ; i++) {
			sumaMatriz1 += matriz[i][auxDiagonal];
			auxDiagonal--;
		} // For

		// Si los valores de las dos variables no son iguales, el cuadrado deja de ser
		// diabolico y paro el for y el while
		if (sumaMatriz1 != sumaMatriz2) {
			b2 = false;
			return b2;
		}

		return b2;

	}

	public static boolean esEsoterico(int[][] matriz, int[] vector) {

		int sumaFilaMatriz = 0;
		int longitudMatriz = matriz.length;
		int sumaEsquinasMatriz = matriz[0][0] + matriz[0][longitudMatriz - 1] + matriz[longitudMatriz - 1][0]
				+ matriz[longitudMatriz - 1][longitudMatriz - 1];
		int sumaCasillasMitadPares = 0;
		int sumaCasillasCentralPares = 0;
		int sumaCasillasMitadImpares = 0;
		int multiplicacionCasillaCentralImpares = 0;

		boolean b = true;

		// Ordeno el vector
		Arrays.sort(vector);

		// Accedo a cada posicion del vector y verifico que contiene el numero
		// correspondiente
		// en serie, posicion 1 numero 1, 2-2, 3,3.
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != i + 1) {
				b = false;
				return b;
			}
		}

		// Sumo una fila de la matriz para mas adelante comparar el resultado
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				sumaFilaMatriz += matriz[i][j];

			}
		}
		int constanteMagica2 = (sumaFilaMatriz * 4) / longitudMatriz;

		// Compruebo si la suma de las esquinas de la matriz es igual a "Constante
		// Magica2"
		if (constanteMagica2 != sumaEsquinasMatriz) {
			b = false;
			return b;
		}

		// Si la matriz es impar
		if (longitudMatriz % 2 == 1) {

			// Sumo las casillas del medio de cada lado de la matriz
			sumaCasillasMitadImpares += matriz[0][(longitudMatriz - 1) / 2];
			sumaCasillasMitadImpares += matriz[(longitudMatriz - 1) / 2][0];
			sumaCasillasMitadImpares += matriz[(longitudMatriz - 1) / 2][longitudMatriz - 1];
			sumaCasillasMitadImpares += matriz[longitudMatriz - 1][(longitudMatriz - 1) / 2];

			if (sumaCasillasMitadImpares != constanteMagica2) {
				b = false;
				return b;
			}

			// Busco la casilla central de la matriz impar
			multiplicacionCasillaCentralImpares = matriz[(longitudMatriz - 1) / 2][(longitudMatriz - 1) / 2] * 4;

			if (constanteMagica2 != multiplicacionCasillaCentralImpares) {
				b = false;
				return b;
			}

			// Si la longitud de la matriz es par
		} else {

			// Sumo las dos casillas centrales de los cuatro laterales de la matriz
			for (int i = (longitudMatriz - 1) / 2; i < ((longitudMatriz - 1) / 2) + 2; i++) {
				sumaCasillasMitadPares += matriz[0][i];
				sumaCasillasMitadPares += matriz[i][0];
				sumaCasillasMitadPares += matriz[i][longitudMatriz - 1];
				sumaCasillasMitadPares += matriz[longitudMatriz - 1][i];
			}

			for (int i = (longitudMatriz - 1) / 2; i < ((longitudMatriz - 1) / 2) + 1; i++) {
				sumaCasillasCentralPares += matriz[i][i];
				sumaCasillasCentralPares += matriz[i + 1][i];
				sumaCasillasCentralPares += matriz[i][i + 1];
				sumaCasillasCentralPares += matriz[i + 1][i + 1];
			}

			// Compruebo si la suma de las casillas mitad pares no es igual a la constate
			// magica por 2
			if (sumaCasillasMitadPares != constanteMagica2 * 2) {
				b = false;
				return b;
			}

			// Compruebo si la suma de las casillas centrales es igual a la constante magica
			if (sumaCasillasCentralPares != constanteMagica2) {
				b = false;
				return b;
			}

		}

		return b;
	}

}