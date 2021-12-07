package com.company;

import java.util.Scanner;

public class P515_PoniendoLaMesa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int copas, paseos;

		do {

			copas = sc.nextInt();

			if (copas == 0) {
				break;
			}

			paseos = calcularViajes(copas);
			
			if(paseos == 0 ) {
				paseos = paseos + 1;
			}
			System.out.println(paseos);

		} while (copas != 0);

	}

	public static int calcularViajes(int copas) {

		int paseos = 0;

		copas--;
		paseos++;

		if (copas < 1) {
			paseos = 0;
		} else {

			if (copas % 2 == 0) {
				paseos = (calcularViajes(copas - 2)) + 2;
			} else {
				paseos = (calcularViajes(copas - 1)) + 2;
			}
		}
		return paseos;

	}

}
