package com.company;

import java.util.Scanner;

public class P439_Velocidad_Tiempo_Desplazamiento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		String dato1, dato2;
		int num1, num2, velocidad, desplazamiento, tiempo;

		for (int i = 0; i < casos; i++) {

			dato1 = sc.next();
			dato2 = sc.next();

			num1 = Integer.parseInt(dato1.substring(2, dato1.length()));
			num2 = Integer.parseInt(dato2.substring(2, dato2.length()));

			if ((dato1.substring(0, 1)).equals("D") && (dato2.substring(0, 1)).equals("T"))  {

				velocidad = num1 / num2;
				System.out.printf("V=%d%n", velocidad);

			} else if (((dato1.substring(0, 1))).equals("T") && ((dato2.substring(0, 1))).equals("D")) {

				velocidad = num2 / num1;
				System.out.printf("V=%d%n", velocidad);

			} else if (((dato1.substring(0, 1))).equals("D") && ((dato2.substring(0, 1))).equals("V")) {

				tiempo = num1 / num2;
				System.out.printf("T=%d%n", tiempo);

			} else if (((dato1.substring(0, 1))).equals("V") && ((dato2.substring(0, 1))).equals("D")) {

				tiempo = num2 / num1;
				System.out.printf("T=%d%n", tiempo);

			} else if (((dato1.substring(0, 1))).equals("V") && ((dato2.substring(0, 1))).equals("T")
					|| ((dato1.substring(0, 1))).equals("T") && ((dato2.substring(0, 1))).equals("V")) {

				desplazamiento = num1 * num2;
				System.out.printf("D=%d%n", desplazamiento);
			}
		}

		sc.close();

	}

}
