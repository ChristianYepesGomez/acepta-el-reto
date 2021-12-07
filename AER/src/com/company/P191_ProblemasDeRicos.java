package com.company;

import java.util.Scanner;

public class P191_ProblemasDeRicos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int compartimentos,litrosMax,diferenciaEntreCompartimentos,litrosPerdidos,litrosTotal;

		for (int i = 0; i < n; i++) {
			litrosPerdidos = 0;
			
			compartimentos = sc.nextInt();
			litrosMax = sc.nextInt();
			diferenciaEntreCompartimentos = sc.nextInt();
			
			litrosTotal = compartimentos * litrosMax;
			
			for (int j = 0; j < compartimentos; j++) {
				litrosPerdidos += diferenciaEntreCompartimentos * j;;
			}
			
			System.out.println(litrosTotal - litrosPerdidos);

		}

		sc.close();

	}

}
