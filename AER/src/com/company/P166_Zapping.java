package com.company;

import java.util.Scanner;

public class P166_Zapping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int canalActual, canalDeseado, res;
		boolean b = true;
		
		while (sc.hasNext() && b == true) {
			res = 0;
			canalActual = sc.nextInt();
			canalDeseado = sc.nextInt();

			if (canalActual != 0 && canalDeseado != 0) {

				if (canalActual < canalDeseado) {
					
					if ((canalDeseado - canalActual) < 50) {
						res = canalDeseado - canalActual;
					} else {
						res = (canalActual - canalDeseado) + 99;
					}
					
				} else {
					if ((canalActual - canalDeseado) < 50) {
						res = canalActual - canalDeseado;
					} else {
						res = (canalDeseado - canalActual) + 99;
					}
				}
				System.out.println(res);
				
			} else {
				b = false;
			}
		}
		sc.close();
	}

}
