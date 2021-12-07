package com.company;

import java.util.Scanner;

public class P340_CuadradosConCerillas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int num1, num2, res;
		for (int i = 0; i < num; i++) {

			num1 = sc.nextInt();
			num2 = sc.nextInt();

			res = (((num1 + 1) * num2) * 2) + (num1 - num2);

			System.out.println(res);

		}

	}

}
