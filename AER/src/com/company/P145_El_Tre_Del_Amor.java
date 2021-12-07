package com.company;

import java.util.Scanner;
import java.util.Stack;

public class P145_El_Tre_Del_Amor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1;
		char character;
		int contador;
		Stack<Character> pila = new Stack<>();

		while (sc.hasNext()) {
			contador = 0;
			s1 = sc.nextLine();

			for (int i = 0; i < s1.length(); i++) {
				character = s1.charAt(i);

				if (character == 'H') {
					pila.push(character);
				} else if (character == 'h') {
					pila.push(character);
				} else if (character == '@') {
					pila.clear();
				} else if (character == 'M') {
					if (!pila.isEmpty() && pila.pop() == 'H') {
						contador++;
					} else {
						pila.push(character);
					}
				} else if (character == 'm') {
					if (!pila.isEmpty() && pila.pop() == 'h') {
						contador++;
					} else {
						pila.push(character);
					}
				}

			}

			System.out.println(contador);
			pila.clear();
		}
		sc.close();
	}

}
