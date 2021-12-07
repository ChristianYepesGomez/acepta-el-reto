package com.company;

import java.util.Scanner;

public class P216_Goteras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int segundos= 0; 
		int minutos = 0;		
		int horas 	= 0;
		
		for (int i = 0; i < n; i++) {
			segundos = sc.nextInt();
			minutos = segundos / 60;
			horas   = minutos / 60;
			segundos = segundos - minutos * 60;
			minutos = minutos - horas * 60;
			System.out.printf("%02d:%02d:%02d%n",horas,minutos,segundos);
		}
		sc.close();
	}
}