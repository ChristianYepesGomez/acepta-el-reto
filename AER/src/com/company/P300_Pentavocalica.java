package com.company;

import java.util.Scanner;

public class P300_Pentavocalica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cA,cE,cI,cO,cU;
		String s1;

		for (int i = 0; i < n; i++) {
			cA = 0;
			cE = 0;
			cI = 0;
			cO = 0;
			cU = 0;
			s1 = sc.next();
			
			for (int j = 0; j < s1.length(); j++) {
				if (s1.substring(j,j+1).equals("a")) {
					cA++;
				}
				if (s1.substring(j,j+1).equals("e") ) {
					cE++;
				}
				if (s1.substring(j,j+1).equals("i")) {
					cI++;
				}
				if (s1.substring(j,j+1).equals("o")) {
					cO++;
				}
				if (s1.substring(j,j+1).equals("u")) {
					cU++;	
				}
			}
			
			if (cA > 0 && cE > 0 && cI > 0 && cO > 0 && cU > 0) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
			
		}

		sc.close();

	}

}
