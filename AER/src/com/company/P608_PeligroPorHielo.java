package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P608_PeligroPorHielo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean frio;
        int ncasos, temperatura, alarmas;

        do {
            ncasos = sc.nextInt();
            alarmas = 0;
            frio = false;
            if (ncasos > 0) {
                for (int i = 0; i < ncasos; i++) {
                    temperatura = sc.nextInt();

                    if (temperatura <= 4 && !frio) {
                        alarmas++;
                        frio = true;
                    }

                    if (temperatura > 6) {
                        frio = false;
                    }

                }
                System.out.println(alarmas);
            }
        } while (ncasos != 0);

    }

}