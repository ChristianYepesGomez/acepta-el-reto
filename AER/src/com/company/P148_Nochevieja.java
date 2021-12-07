package com.company;

import java.util.Scanner;

public class P148_Nochevieja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n,minsString,horasString;
		int horas, mins;
		boolean cond = true;

		while (cond == true) {

			n = sc.nextLine();

			if (!n.equals("00:00")){

				minsString = n.substring(3,5);
				horasString = n.substring(0,2);

				mins = Integer.parseInt(minsString);
				horas = Integer.parseInt(horasString);

				horas = ((horas - 24) * -1)*60;

				System.out.println(horas - mins);
			}
			else {
				cond = false;
			}
		}
		sc.close();
	}
}