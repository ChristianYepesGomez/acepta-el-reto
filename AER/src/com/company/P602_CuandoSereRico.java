package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class P602_CuandoSereRico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ncasos = sc.nextInt(), metaCentimos, centimos, dia1, dia2, centimosTotales;
        ArrayList<Integer> dias = new ArrayList<Integer>();

        for (int i = 0; i < ncasos; i++) {
            dias.clear();
            dias.add(1);
            dias.add(1);
            centimos = 0;
            centimosTotales = 2;
            metaCentimos = sc.nextInt();
            if (metaCentimos == 1) {
                System.out.println("1");
            } else if (metaCentimos == 2) {
                System.out.println("2");
            } else {
                while (centimosTotales < metaCentimos) {
                    dia1 = dias.get(dias.size() - 2);
                    dia2 = dias.get(dias.size() - 1);
                    centimos = dia1 * 2 + dia2;
                    centimosTotales += centimos;
                    dias.add(centimos);
                }
                System.out.println(dias.size());
            }
        }
    }
}