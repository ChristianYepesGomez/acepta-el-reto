package com.company;

import java.util.Scanner;

public class P380_MeCaso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean b = true;
		int n,res;
		
		while ( b == true) {
		
			n = sc.nextInt();
			res = 0;
			
			if ( n != 0 ) {
				for (int i = 0; i < n; i++) {
					res += sc.nextInt();
				}
				System.out.println(res);
			}
			else b = false;
		}
		sc.close();
	}
}