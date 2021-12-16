package com.company;

import java.util.Scanner;

public class P617_SpaceInvaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras;

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {

            int entradas = sc.nextInt();

            letras = new char[entradas * 3];

            sc.nextLine();

            for (int j = 0; j < entradas; j++) {

                String palabara = sc.nextLine();
                letras[j] = palabara.charAt(0);
                letras[j + entradas] = palabara.charAt(1);
                letras[j + entradas + entradas] = palabara.charAt(2);
            }


            for (int j = 0; j < letras.length; j++) {

                System.out.print(letras[j]);
            }

            System.out.println();

        }

    }
}