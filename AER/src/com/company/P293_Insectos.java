package com.company;

import java.util.Scanner;

public class P293_Insectos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a,b,c,d,e;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			sum = (a*6) + (b*8) + (c*10) + ((d*e)*2);
			System.out.println(sum);
		}
		sc.close();
	}
}