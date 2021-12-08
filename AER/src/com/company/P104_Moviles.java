package com.company;

import java.util.Scanner;

public class P104_Moviles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean leer = true;

        int pesoIzquierdo, pesoDerecho, distanciaIzquierda, distanciaDerecha;

        do {

            pesoIzquierdo = sc.nextInt();
            distanciaIzquierda = sc.nextInt();
            pesoDerecho = sc.nextInt();
            distanciaDerecha = sc.nextInt();

            if (distanciaDerecha != 0 && distanciaIzquierda != 0) {




            } else {
                leer = false;
            }

        } while (leer);
    }

}