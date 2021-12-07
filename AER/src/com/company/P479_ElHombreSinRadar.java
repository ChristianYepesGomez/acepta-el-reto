package com.company;

import java.util.Scanner;

public class P479_ElHombreSinRadar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int columna, fila, casos, posFila, posColumna, contadorPasosHastaEnemigo;
		String filaMatriz, direccion;
		boolean sinEnemigos;
		char matriz[][];

		do {

			fila = sc.nextInt();
			columna = sc.nextInt();

			if (fila != 0 && columna != 0) {
				sc.nextLine();
				matriz = new char[fila][columna];

				for (int i = 0; i < fila; i++) {
					filaMatriz = sc.nextLine();
					matriz[i] = filaMatriz.toCharArray();
				}

				casos = sc.nextInt();

				for (int i = 0; i < casos; i++) {
					sinEnemigos = true;
					contadorPasosHastaEnemigo = 0;
					posFila = sc.nextInt() - 1;
					posColumna = sc.nextInt() - 1;
					direccion = sc.next();

					if (direccion.equals("ABAJO")) {
						for (int j = posFila; j < matriz.length; j++) {
							if (matriz[j][posColumna] == 'X') {
								j = matriz.length;
								sinEnemigos = false;
							} else {
								contadorPasosHastaEnemigo++;
							}
						}
					} else if (direccion.equals("ARRIBA")) {
						for (int j = posFila; j >= 0; j--) {
							if (matriz[j][posColumna] == 'X') {
								j = -1;
								sinEnemigos = false;
							} else {
								contadorPasosHastaEnemigo++;
							}
						}
					} else if (direccion.equals("DERECHA")) {
						for (int j = posColumna; j < matriz[0].length; j++) {
							if (matriz[posFila][j] == 'X') {
								j = matriz[0].length;
								sinEnemigos = false;
							} else {
								contadorPasosHastaEnemigo++;
							}
						}
					} else if (direccion.equals("IZQUIERDA")) {
						for (int j = posFila; j >= 0; j--) {
							if (matriz[posFila][j] == 'X') {
								j = -1;
								sinEnemigos = false;
							} else {
								contadorPasosHastaEnemigo++;
							}
						}
					}
					if (sinEnemigos) {
						System.out.println("NINGUNO");                                                                                     
					} else {
						System.out.println(contadorPasosHastaEnemigo);
					}
					if (i == casos - 1) {
						System.out.println("---");
					}

				}

			}
		} while (columna != 0 && fila != 0);

		sc.close();
	}

}
