package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P105_Ventas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String res, martes, miercoles, jueves, viernes, sabado, domingo;

		String vectorDias[] = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };

		double vector[] = new double[6];
		double vectorClonado[];
		int contadorMax, contadorMin, sumaVentas, media;

		do {
			sumaVentas = 0;
			contadorMax = 0;
			contadorMin = 0;
			media = 0;
			martes = sc.next();

			vector[0] = Double.parseDouble(martes);

			if (Double.parseDouble(martes) > -1) {

				miercoles = sc.next();
				vector[1] = Double.parseDouble(miercoles);
				jueves = sc.next();
				vector[2] = Double.parseDouble(jueves);
				viernes = sc.next();
				vector[3] = Double.parseDouble(viernes);
				sabado = sc.next();
				vector[4] = Double.parseDouble(sabado);
				domingo = sc.next();
				vector[5] = Double.parseDouble(domingo);

				vectorClonado = vector.clone();
				Arrays.sort(vector);

				for (int i = 0; i < vectorClonado.length; i++) {
					if (vectorClonado[i] == vector[5]) {
						contadorMax = i;
					}
					if (vectorClonado[i] == vector[0]) {
						contadorMin = i;
					}
					sumaVentas += vector[i];
				}

				media = sumaVentas / 6;

				if (vectorClonado[5] > media) {
					res = "SI";
				} else
					res = "NO";
				if (contadorMax != contadorMin) {

					System.out.printf("%s %s %s%n", vectorDias[contadorMax], vectorDias[contadorMin], res);
				} else {
					System.out.printf("EMPATE %s%n",res);

				}
			}

		} while (Double.parseDouble(martes) > -1);

		sc.close();
	}

}
