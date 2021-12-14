package com.company;

import java.util.Scanner;

public class P597_SeHaColado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int contador = 0;
            int personas = sc.nextInt();
            int anteriorPersona = 0;
            int[] cola = new int[personas];
            for (int j = 0; j < personas; j++) {
                int aux = sc.nextInt();
                cola[j] = aux;
            }
            for (int j = 0; j < personas; j++) {
                int personaEnCola = cola[cola.length - j - 1];
                if (j == 0) {
                    anteriorPersona = personaEnCola;
                } else {
                    if (personaEnCola > anteriorPersona) {
                        contador++;
                    } else {
                        anteriorPersona = personaEnCola;
                    }
                }

            }
            System.out.println(contador);
        }
    }
}