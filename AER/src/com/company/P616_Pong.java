package com.company;

import java.util.Scanner;

public class P616_Pong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos, golpes = 0, izq = 0, der = 0;
        String golpe;

        do {

            casos = sc.nextInt();
            if (casos != 0) {


                golpes = 0;
                izq = 0;
                der = 0;

                for (int i = 0; i < casos; i++) {

                    golpe = sc.next();

                    if (golpe.equals("PIC")) {
                        golpes++;
                    } else if (golpe.equals("PONG!")) {
                        if (golpes % 2 != 0) {
                            der++;
                        } else {
                            izq++;
                        }
                    }


                }

                System.out.println(izq + " " + der);
            }
        } while (casos != 0);


    }
}