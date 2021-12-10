package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P355_GregorioXIII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ncasos = sc.nextInt(), anio;

        for (int i = 0; i < ncasos; i++) {

            anio = sc.nextInt();

            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                System.out.println(29);
            else
                System.out.println(28);
        }
    }

}