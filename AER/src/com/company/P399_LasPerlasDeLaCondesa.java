package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P399_LasPerlasDeLaCondesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long perla;
        boolean correcto;
        long[] perlas;
        int contador;

        do {

            perla = sc.nextLong();

            if (perla != 0) {
                perlas = new long[1001];
                contador = 0;
                correcto = true;
                do {
                    perlas[contador] = perla;
                    perla = sc.nextLong();
                    contador++;

                } while (perla != 0);
                perla = 1;
                Arrays.sort(perlas);
                String collar = "";
                if (contador == 1) {
                    System.out.println(perlas[perlas.length - 1]);
                } else {
                    for (int i = perlas.length - 1; i > 0 && correcto; i = i - 2) {
                        if (i == perlas.length - 1) {
                            if (contador % 2 == 0) {
                                correcto = false;
                                //&& perlas[i] == perlas[i - 1] //collar = perlas[i] + " " + perlas[i - 1];
                            } else if (contador % 2 != 0) {
                                collar = perlas[i] + "";
                                i++;
                            } else {
                                correcto = false;
                            }
                        } else {
                            if (perlas[i] != 0) {
                                if (perlas[i - 1] != perlas[i]) {
                                    correcto = false;
                                } else {
                                    collar = perlas[i] + " " + collar + " " + perlas[i];
                                }
                            } else {
                                break;
                            }
                        }
                    }

                    if (correcto) {
                        System.out.println(collar);
                    } else {
                        System.out.println("NO");
                    }
                }

            }


        } while (perla != 0);
    }
}