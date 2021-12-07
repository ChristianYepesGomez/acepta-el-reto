package com.company;

import java.util.Scanner;

public class P102_Encriptacion {

	static String abc = "abcdefghijklmnopqrstuvwxyz";
	static String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int posicionesEncriptadas, numVocales;
		int contador = 1;
		int posP = 16;
		String mensajeEncriptado;

		boolean posEncontrada;
		boolean seguirLeyendo = true;

		while (seguirLeyendo) {
			numVocales = 0;
			contador = 1;
			mensajeEncriptado = sc.nextLine();
			posEncontrada = false;

			for (int i = 0; i < abc.length() && !posEncontrada; i++) {

				if (!abc.substring(i, i + 1).equalsIgnoreCase(mensajeEncriptado.substring(0, 1))) {

					contador++;

				} else {
					posEncontrada = true;
					posicionesEncriptadas = posP - contador;

					numVocales = buscarVocales(mensajeEncriptado, posicionesEncriptadas);

					if (numVocales != -1) {
						System.out.println(numVocales);
					} else {
						seguirLeyendo = false;
					}

				}

			}

		}
		sc.close();
	}

	public static int buscarVocales(String mensajeEncriptado, int posEncriptadas) {

		int posicionLetraEncriptada = 0;
		int posicionReal;
		int contadorVocales = 0;
		String mensajeReal = "";
		String letra;
		for (int i = 1; i < mensajeEncriptado.length(); i++) {
			letra = mensajeEncriptado.substring(i, i + 1);

			if (!abc.contains(letra) && !ABC.contains(letra)) {

				mensajeReal += letra;

			} else {
				if (Character.isLowerCase(letra.charAt(0))) {

					posicionLetraEncriptada = abc.indexOf(letra);
				} else {
					posicionLetraEncriptada = ABC.indexOf(letra);
				}
			
			posicionReal = posicionLetraEncriptada + posEncriptadas;
			if (posicionReal > 25) {
				posicionReal -= 26;
			} else if (posicionReal < 0) {
				posicionReal += 26;
			}
			if (abc.substring(posicionReal, posicionReal + 1).equalsIgnoreCase("a")
					|| abc.substring(posicionReal, posicionReal + 1).equalsIgnoreCase("e")
					|| abc.substring(posicionReal, posicionReal + 1).equalsIgnoreCase("i")
					|| abc.substring(posicionReal, posicionReal + 1).equalsIgnoreCase("o")
					|| abc.substring(posicionReal, posicionReal + 1).equalsIgnoreCase("u")) {
				contadorVocales++;
			}
			if (Character.isLowerCase(letra.charAt(0))) {

				mensajeReal += abc.substring(posicionReal, posicionReal + 1);
			} else {
				mensajeReal += ABC.substring(posicionReal, posicionReal + 1);
			}
		}
		}
		if (mensajeReal.equals("FIN")) {
			contadorVocales = -1;
		}
		
		return contadorVocales;
	}

}
