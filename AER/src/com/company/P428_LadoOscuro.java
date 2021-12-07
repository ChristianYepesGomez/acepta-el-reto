package com.company;

import java.util.Scanner;

public class P428_LadoOscuro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		int midiclorianos, auxDiv, modulo, contador;
		String res;

		for (int i = 0; i < casos; i++) {
			contador = 0;
			res = "";
			midiclorianos = sc.nextInt();

			auxDiv = midiclorianos;

			while (auxDiv >= 5) {

				auxDiv = midiclorianos / 5;
				modulo = midiclorianos % 5;

				res = modulo + res;

				if (auxDiv < 5) {
					res = auxDiv + res;
				}

				midiclorianos = auxDiv;
			}

			for (int j = 0; j < res.length(); j++) {
				if (res.charAt(j) == '4') {
					contador++;
				}
			}

			if (contador > 1) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
			
		}

		sc.close();

	}

}
