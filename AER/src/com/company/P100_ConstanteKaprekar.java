package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P100_ConstanteKaprekar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ncasos = sc.nextInt(), resto, invertido = 0;
        String resString, num1String, num2String;
        int num1, num2;
        int res, contador;

        for (int i = 0; i < ncasos; i++) {

            ArrayList<Integer> numeros = new ArrayList<Integer>();
            resString = sc.next();
            contador = 0;
            res = Integer.parseInt(resString);

            while (res != 6174 && contador < 8) {
                num1String = "";
                num2String = "";
                contador++;
                numeros.clear();

                for (int j = 0; j < resString.length(); j++) {
                    numeros.add(Integer.parseInt(resString.substring(j, j + 1)));
                }

                Collections.sort(numeros);

                for (int j = 0; j < numeros.size(); j++) {
                    num1String += Integer.toString(numeros.get(j));
                    num2String += Integer.toString(numeros.get((numeros.size() - 1) - j));
                }

                while (num2String.length() < 4) {
                    num2String += "0";
                }

                num1 = Integer.parseInt(num1String);
                num2 = Integer.parseInt(num2String);

                if (num1 > num2) {
                    resString = Integer.toString(num1 - num2);
                } else {
                    resString = Integer.toString(num2 - num1);
                }
                res = Integer.parseInt(resString);


            }

            System.out.println(contador);

        }

    }

}