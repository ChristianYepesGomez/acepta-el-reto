package com.company;

import java.util.Scanner;

public class P264_PiramideAjedrez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	

		while (sc.hasNextInt()) {

			int numeroFichas = sc.nextInt();

			int x = 1;
			int y = 0;
			int z = 0;
			int f = 0;

			do {
				y += x;
				x++;
				f++;
				if (y > numeroFichas) {
					z++;
					x = z;
					y = 0;
					f = 0;
				}

			} while (y != numeroFichas);
			
			System.out.println(f);
		} // While
		sc.close();
	}

}
