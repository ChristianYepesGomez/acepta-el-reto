package com.company;

import java.util.Scanner;

public class P397_MultiploDe3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long ncasos = sc.nextInt(), numero;

        for (int i = 0; i < ncasos; i++) {

            numero = sc.nextInt();
            numero = ((numero * (numero + 1)) / 2);

            if (numero % 3 == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }
    }

}
