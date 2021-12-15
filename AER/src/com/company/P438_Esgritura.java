package com.company;

import java.util.Scanner;

public class P438_Esgritura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String linea;
        int letra, signo;
        while (sc.hasNext()) {

            linea = sc.nextLine().replace(" ", "");
            letra = 0;
            signo = 0;

            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) > 64 && linea.charAt(i) < 91 || linea.charAt(i) > 96 && linea.charAt(i) < 123) {
                    letra++;
                } else if (linea.charAt(i) == '!') {
                    signo++;
                }

            }

            if (letra < signo) {
                System.out.println("ESGRITO");
            } else {
                System.out.println("escrito");
            }

        }

    }

}