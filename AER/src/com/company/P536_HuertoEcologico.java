package com.company;

import java.util.Scanner;

public class P536_HuertoEcologico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vectorCaracteristicasCampo = new int[4];
		int[] vectorCaracteristicasAux = new int[4];
		int longitud;
		String propietario, propietarioAux;

		while (sc.hasNextInt()) {

			longitud = sc.nextInt();

			vectorCaracteristicasCampo[0] = sc.nextInt(); // Tamanyo
			vectorCaracteristicasCampo[3] = sc.nextInt(); // Abono
			vectorCaracteristicasCampo[1] = sc.nextInt(); // Agua
			vectorCaracteristicasCampo[2] = sc.nextInt(); // Distancia
			propietario = sc.nextLine();

			for (int i = 0; i < longitud - 1; i++) {

				vectorCaracteristicasAux[0] = sc.nextInt(); // Tamanyo
				vectorCaracteristicasAux[3] = sc.nextInt(); // Abono
				vectorCaracteristicasAux[1] = sc.nextInt(); // Agua
				vectorCaracteristicasAux[2] = sc.nextInt(); // Distancia
				propietarioAux = sc.nextLine();

				if (vectorCaracteristicasCampo[0] < vectorCaracteristicasAux[0]) {

					vectorCaracteristicasCampo[0] = vectorCaracteristicasAux[0];
					vectorCaracteristicasCampo[1] = vectorCaracteristicasAux[1];
					vectorCaracteristicasCampo[2] = vectorCaracteristicasAux[2];
					vectorCaracteristicasCampo[3] = vectorCaracteristicasAux[3];
					propietario = propietarioAux;

				} else if (vectorCaracteristicasCampo[0] == vectorCaracteristicasAux[0]
						&& vectorCaracteristicasCampo[1] > vectorCaracteristicasAux[1]) {

					vectorCaracteristicasCampo[0] = vectorCaracteristicasAux[0];
					vectorCaracteristicasCampo[1] = vectorCaracteristicasAux[1];
					vectorCaracteristicasCampo[2] = vectorCaracteristicasAux[2];
					vectorCaracteristicasCampo[3] = vectorCaracteristicasAux[3];
					propietario = propietarioAux;

				} else if ((vectorCaracteristicasCampo[0] == vectorCaracteristicasAux[0]
						&& vectorCaracteristicasCampo[1] == vectorCaracteristicasAux[1]
						&& vectorCaracteristicasCampo[2] > vectorCaracteristicasAux[2])) {

					vectorCaracteristicasCampo[0] = vectorCaracteristicasAux[0];
					vectorCaracteristicasCampo[1] = vectorCaracteristicasAux[1];
					vectorCaracteristicasCampo[2] = vectorCaracteristicasAux[2];
					vectorCaracteristicasCampo[3] = vectorCaracteristicasAux[3];
					propietario = propietarioAux;

				} else if ((vectorCaracteristicasCampo[0] == vectorCaracteristicasAux[0]
						&& vectorCaracteristicasCampo[1] == vectorCaracteristicasAux[1]
						&& vectorCaracteristicasCampo[2] == vectorCaracteristicasAux[2]
						&& vectorCaracteristicasCampo[3] > vectorCaracteristicasAux[3])) {

					vectorCaracteristicasCampo[0] = vectorCaracteristicasAux[0];
					vectorCaracteristicasCampo[1] = vectorCaracteristicasAux[1];
					vectorCaracteristicasCampo[2] = vectorCaracteristicasAux[2];
					vectorCaracteristicasCampo[3] = vectorCaracteristicasAux[3];
					propietario = propietarioAux;

				}
			}

			System.out.println(propietario.trim());
		}

		sc.close();

	}

}