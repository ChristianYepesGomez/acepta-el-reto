package com.company;

import java.util.Scanner;

public class P622_LaMediaPrometida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nExamenes, sumatorioExamenes, mediaDeseada, aux, res;

        do {

            nExamenes = sc.nextInt();
            sumatorioExamenes = 0;

            if (nExamenes != 0) {
                nExamenes += 1;
                for (int i = 0; i < nExamenes - 1; i++) {

                    aux = sc.nextInt();
                    sumatorioExamenes += aux;

                }

                mediaDeseada = sc.nextInt();

                res = mediaDeseada * nExamenes - sumatorioExamenes;

                if (res <= 10 && res >= 0) {

                    System.out.println(res);

                } else {

                    System.out.println("IMPOSIBLE");
                    
                }


            }

        } while (nExamenes != 0);


    }

}
