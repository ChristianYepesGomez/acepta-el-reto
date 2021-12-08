package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class P472_CaminandoVoy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxDesnivel, numeroCotas, cotaActual, cotaVariable, desnivelActual;

        while (sc.hasNextInt()) {

            maxDesnivel = sc.nextInt();
            numeroCotas = sc.nextInt();
            cotaActual = sc.nextInt();
            Boolean apta = true;
            desnivelActual = 0;

            for (int i = 0; i < numeroCotas - 1; i++) {

                cotaVariable = sc.nextInt();

                if (cotaActual < cotaVariable) {
                    desnivelActual += cotaVariable - cotaActual;
                } else {
                    desnivelActual = 0;
                }

                if (desnivelActual > maxDesnivel) {
                    apta = false;
                }

                cotaActual = cotaVariable;

            }

            if (apta) {
                System.out.println("APTA");
            } else {
                System.out.println("NO APTA");
            }
        }

    }

}