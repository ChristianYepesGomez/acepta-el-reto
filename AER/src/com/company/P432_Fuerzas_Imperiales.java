package com.company;

import java.util.Scanner;

public class P432_Fuerzas_Imperiales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fila, columna,contador;
		String filaMatriz,asteriscos;
		char matriz[][];
		//TODO JOse me ha deprimido y no puedo continuar
		while (sc.hasNext()) {
			contador = 0;
			asteriscos = "";
			fila = sc.nextInt();
			columna = sc.nextInt();
			sc.nextLine();
			matriz = new char[fila+2][columna+2];
			
			for (int i = 0; i < matriz.length; i++) {
				asteriscos += '*';
			}
			matriz[0] = asteriscos.toCharArray();
			asteriscos = "";
			for (int i = 1; i < fila; i++) {
				filaMatriz = '*' + sc.nextLine() + '*';
				matriz[i] = filaMatriz.toCharArray();
			}
			for (int i = 0; i < matriz.length; i++) {
				asteriscos += '*';
			}
			matriz[fila+1] = asteriscos.toCharArray();
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.printf("%d",matriz[i][j]);
					if (contador == fila+2){
						System.out.println();
						contador = 0;
					}
				}
			}
			

		}
	}

}
