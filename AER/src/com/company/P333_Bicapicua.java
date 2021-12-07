package com.company;

import java.util.Scanner;

public class P333_Bicapicua {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 //TODO hacer ejercicio
		int longitud;
		String n;
		String sol = "";

			n = sc.next();
			
			longitud = n.length();
			String longitudString = Integer.toString(longitud);
			
			//Si la longitud del numero es de 1 cifra, nunca podra ser bicapicua
			//Y si la longitud del numero es de 2 cifras, siempre sera bicapicua
			if (longitud == 1) sol = "NO";
			if (longitud == 2) sol = "SI";
			
			int x = 0;
			
			String izq = "" , der = "";
			
			//Mientras x sea menor que la longitud de la palabra y la variable "sol" sea su valor inicial
			
				while (x < longitud && sol == "") {
				
					izq = n.substring(0,x+1);
					
					der = n.substring(x+1,n.length());
			
					//if 
					
					x++;
					
				}
			
			System.out.println(sol);
				
		sc.close();
	}
}
