package com.company;

import java.util.Scanner;

public class P139_NumerosCubinfinitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cuboString, cuboStringAux, res;
        int suma;
        do {

            cuboString = sc.next();
            suma = 0;
            res = cuboString + " - ";
            if (!cuboString.equals("0")) {
                if (cuboString.equals("1")) {
                    System.out.println("1 -> cubinfinito.");
                } else {
                    while (suma != 1) {

                        for (int i = 0; i < cuboString.length(); i++) {

                            suma += Math.pow(Integer.parseInt(cuboString.substring(i, i + 1)), 3);

                        }

                        cuboString = Integer.toString(suma);

                        if (suma == 1) {
                            res += "1 -> cubinfinito.";

                        } else {
                            res += cuboString + " - ";
                            suma = 0;
                        }
                    }
                    System.out.println(res);
                }


            }

        } while (!cuboString.equals("0"));
    }

}
