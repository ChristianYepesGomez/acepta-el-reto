package com.company;

import java.util.Scanner;

public class P371_FormasConCerillas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n,res;
		boolean b = true;
		
		while ( b == true) {
			
			res = 0;
			n   = sc.nextInt();
			
			if ( n != 0 ) {
				
				for (int i = 1; i <= n; i++) {
					res += 3*i;
				}
				System.out.println(res);
			}
			else b = false;
		}
		sc.close();
	}

}
