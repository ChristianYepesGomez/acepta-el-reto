package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class P416_MichaelJFox_PatoDonald {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ncasos;
        String fecha;
        ArrayList<String> arrayFechas = new ArrayList<String>();
        Boolean encontrado;

        do {

            ncasos = sc.nextInt();

            if (ncasos != 0) {

                arrayFechas.clear();
                encontrado = false;
                for (int i = 1; i <= ncasos; i++) {
                    fecha = sc.next();

                    fecha = fecha.replace(fecha.substring(fecha.length() - 5, fecha.length()), "");

                    if (arrayFechas.contains(fecha)) {
                        encontrado = true;
                    }

                    arrayFechas.add(fecha);
                }
                if (!encontrado) {
                    System.out.println("NO");
                } else {
                    System.out.println("SI");
                }
            }
        } while (ncasos != 0);


    }

}