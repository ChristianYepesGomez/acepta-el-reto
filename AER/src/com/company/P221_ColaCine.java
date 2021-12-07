package com.company;

import java.util.Scanner;

public class P221_ColaCine {

	public static void main(String[] args) {
		//TODO
		Scanner sc = new Scanner(System.in);
		int numVecinos, numCola, contadorPares, contadorFor;

		int numVeces = sc.nextInt();

		for (int i = 0; i < numVeces; i++) {
			contadorPares = 0;
			numVecinos = sc.nextInt();

			if (numVecinos % 2 == 0) {
				contadorFor = numVecinos / 2;
			} else {
				contadorFor = numVecinos / 2 + 1;
			}

			for (int j = 0; j < contadorFor; j++) {

				numCola = sc.nextInt();
				if (numCola % 2 == 0) {
					contadorPares++;
				}
			}
			if(contadorPares == contadorFor) {
				System.out.printf("SI %d%n",contadorFor);
			} else {
				System.out.println("NO");
			}
			sc.nextLine();
		}

	}

}
