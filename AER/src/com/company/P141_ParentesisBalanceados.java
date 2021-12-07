package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class P141_ParentesisBalanceados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean equilibrada;
		String linea;
		char character;
		LinkedList<Character> cola = new LinkedList<>();

		while (sc.hasNext()) {
			equilibrada = true;
			linea = sc.nextLine();

			for (int i = 0; i < linea.length() && equilibrada; i++) {
				character = linea.charAt(i);

				if (character == '(' || character == '[' || character == '{') {
					cola.add(character);
				} else if (character == ')' || character == ']' || character == '}') {
					if (cola.isEmpty()) {
						equilibrada = false;
					} else {
						if (character == ')') {
							if (cola.removeLast().equals('(')) {
								equilibrada = true;
							} else {
								equilibrada = false;
							}
						} else if (character == ']') {
							if (cola.removeLast().equals('[')) {
								equilibrada = true;
							} else {
								equilibrada = false;
							}

						} else if (character == '}') {
							if (cola.removeLast().equals('{')) {
								equilibrada = true;
							} else {
								equilibrada = false;
							}
						}
					}
				}

			}	
			if (equilibrada && cola.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			cola.clear();
		}

	}

}
