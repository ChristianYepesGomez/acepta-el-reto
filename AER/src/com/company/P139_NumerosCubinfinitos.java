package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P139_NumerosCubinfinitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cuboString;
        int suma, cubo, digito;
        Set<Integer> set;
        do {

            cubo = sc.nextInt();

            if (cubo != 0) {
                suma = 0;

                set = new TreeSet<>();
                set.add(cubo);

                if (cubo == 1) {
                    System.out.println("1 -> cubifinito.");
                } else {
                    System.out.print(cubo + " - ");
                    while (true) {
                        cuboString = Integer.toString(cubo);
                        for (int i = 0; i < cuboString.length(); i++) {
                            digito = Integer.parseInt("" + cuboString.charAt(i));
                            suma += digito * digito * digito;

                        }

                        cubo = suma;

                        if (suma == 1) {
                            System.out.println("1 -> cubifinito.");
                            break;

                        } else if (set.contains(suma)) {
                            System.out.println(cubo + " -> no cubifinito.");
                            break;

                        } else {
                            set.add(suma);
                            System.out.print(cubo + " - ");
                            suma = 0;
                        }
                    }
                }

            }

        } while (cubo != 0);
    }

}