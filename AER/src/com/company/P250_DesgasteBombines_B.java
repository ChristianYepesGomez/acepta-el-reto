package com.company;

import java.util.Scanner;

public class P250_DesgasteBombines_B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos = 0;
        int desgastes[];
        int diferenciaDesgasteTotal = 0;
        int res = 0;
        int diferencia = Integer.MAX_VALUE;

        do {
            casos = sc.nextInt();
            desgastes = new int[casos];
            diferenciaDesgasteTotal = 0;

            for (int i = 0; i < casos; i++) {
                desgastes[i] = sc.nextInt();
                diferenciaDesgasteTotal += desgastes[i];
            }

            diferenciaDesgasteTotal = Math.abs(diferenciaDesgasteTotal);

            for (int i = 0; i < desgastes.length; i++) {
                //desgastes[i]-diferenciaDesgasteTotal
            }

            System.out.println(diferenciaDesgasteTotal);

        } while (casos > 0);


    }

}
