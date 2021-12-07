package com.company;

import java.util.Scanner;

public class P250_DesgasteBombines {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroDias, suma, resta, numeroDesgastePorDia, contador, minimo, posicion, auxSuma, auxResta;
		int[] vector;

		do {

			numeroDias = sc.nextInt();
			if (numeroDias != 0) {

				vector = new int[numeroDias];
				suma = 0;
				resta = 0;

				for (int i = 0; i < numeroDias; i++) {

					numeroDesgastePorDia = sc.nextInt();
					vector[i] = numeroDesgastePorDia;

					if (numeroDesgastePorDia >= 0) {

						suma += numeroDesgastePorDia;

					} else {

						resta += numeroDesgastePorDia;

					}
				}

				if (suma + resta == 0) {
					System.out.println(0);
				} else {

					contador = 0;
					minimo = suma;
					posicion = 0;
					auxSuma = suma;
					auxResta = 0;

					while (contador < vector.length) {
						
						auxSuma -= vector[contador];
						auxResta += vector[contador];

						if ((auxResta - auxSuma) < (minimo))
							if (Math.abs((auxResta - auxSuma)) < Math.abs(minimo)) {
								posicion = contador + 1;
								minimo = Math.abs(auxResta - auxSuma);
							}
						
						++contador;
					}
					System.out.println(posicion);
				}

			}

		} while (numeroDias != 0);

	}

}
