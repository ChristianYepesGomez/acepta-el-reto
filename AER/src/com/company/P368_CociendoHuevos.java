package com.company;

import java.util.Scanner;

public class P368_CociendoHuevos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;
		double res,n1,n2;
		int f = 0;
		
		while (b == true) {
		res = 0;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 != 0 || n2 != 0 ) {
			
			System.out.println((int)Math.ceil(n1/n2)*10);

		}	
		
		else b = false;
		
		}
			
		sc.close();
	}
}