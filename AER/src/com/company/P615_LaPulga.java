package com.company;

import java.util.Scanner;

public class P615_LaPulga {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ncasos = sc.nextInt();
        int pasos, factor, tiempo, res;

        for (int i = 0; i < ncasos; i++) {

            pasos = sc.nextInt();
            factor = sc.nextInt();
            tiempo = sc.nextInt();

            if (tiempo == pasos) {
                System.out.println(tiempo * factor);
            } else {
                pasos++;
                while (tiempo >= pasos) {

                    tiempo -= pasos;

                }

                res = tiempo * factor;
                System.out.println(res);


            }


        }


    }
}

