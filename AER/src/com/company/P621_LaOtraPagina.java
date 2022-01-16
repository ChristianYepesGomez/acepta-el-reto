package com.company;

import java.util.Scanner;

public class P621_LaOtraPagina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ncasos, npaginas;

        ncasos = sc.nextInt();

        for (int i = 0; i < ncasos; i++) {

            npaginas = sc.nextInt();

            if (npaginas % 2 == 0) {
                System.out.println(npaginas + 1);
            } else {
                System.out.println(npaginas - 1);
            }

        }

    }

}
