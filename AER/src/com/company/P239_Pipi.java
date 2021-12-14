package com.company;

import java.util.Scanner;

public class P239_Pipi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diasEmitidos, numeroEmisoras, segundosTotales, dias, horas, minutos;


        while (true) {
            diasEmitidos = sc.nextInt();
            numeroEmisoras = sc.nextInt();

            if (diasEmitidos != 0 && numeroEmisoras != 0) {

                segundosTotales = (diasEmitidos * numeroEmisoras) * 144;

                dias = segundosTotales / 86400;
                segundosTotales %= 86400;

                horas = segundosTotales / 3600;
                segundosTotales %= 3600;

                minutos = segundosTotales / 60;
                segundosTotales %= 60;


                System.out.printf("%01d:%02d:%02d:%02d\n", dias, horas, minutos, segundosTotales);

            }


        }


    }

}
