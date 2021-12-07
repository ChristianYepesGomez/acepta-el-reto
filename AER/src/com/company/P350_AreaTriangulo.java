package com.company;

import java.util.Scanner;

public class P350_AreaTriangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		float res ,x,y;
		
		while (true){
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x == 0 && y == 0) {
				break;
			}
			
			res = (x * y) / 2;
			
			System.out.printf("%.1f%n",res);
		
		}
		sc.close();
	}

}
