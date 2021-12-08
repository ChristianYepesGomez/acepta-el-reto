package com.company;

import java.util.Scanner;

public class P584_BombillasLed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ncasos = sc.nextInt();

        long horasCapacidad, numeroEncendidos, horasEstimadas, res;

        for (int i = 0; i < ncasos; i++) {

            horasCapacidad = sc.nextInt();
            numeroEncendidos = sc.nextInt();
            horasEstimadas = sc.nextInt();

            res = numeroEncendidos * horasEstimadas;

            if (res > horasCapacidad) {
                System.out.println("HORAS");
            } else if (res < horasCapacidad) {
                System.out.println("ENCENDIDOS");
            } else {
                System.out.println("AMBAS");

            }

        }


    }

}