package com.company;

import java.util.Scanner;

public class P208_TirandoBolos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long numeroFilas, filaDerribada,numeroBolos,bolosRestantes,bolosDerribados,nuevoNumeroFilas;

		do {

			numeroFilas = sc.nextInt();

			if (numeroFilas != 0) {
				filaDerribada = sc.nextInt();
				
				numeroBolos = (numeroFilas * (numeroFilas + 1)) / 2;
				nuevoNumeroFilas = numeroFilas - filaDerribada + 1;
				bolosDerribados = (nuevoNumeroFilas * (nuevoNumeroFilas + 1)) / 2;
				bolosRestantes = numeroBolos - bolosDerribados;
				
				System.out.println(bolosRestantes);
				
				
			}

		} while (numeroFilas != 0);

	}

}
