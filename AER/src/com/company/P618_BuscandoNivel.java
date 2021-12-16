package com.company;

import java.util.Scanner;

public class P618_BuscandoNivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nivele;
        do {
            nivele = sc.nextInt();
            if (nivele != 0) {
                int[] niveles = new int[nivele + 1];
                niveles[0] = 0;
                for (int i = 1; i < nivele + 1; i++) {
                    niveles[i] = sc.nextInt();
                }
                int casos = sc.nextInt();
                for (int i = 0; i < casos; i++) {
                    int x = sc.nextInt();
                    int z = sc.nextInt();
                    int sum = 0;

                    if (x < z) {
                        for (int j = x + 1; j < z; j++) {
                            sum += niveles[j];
                        }
                    } else {
                        for (int j = z; j < x + 1; j++) {
                            sum += niveles[j];
                        }
                        sum = sum * -1;
                    }


                    System.out.println(sum);

                }
                System.out.println("---");
            }

        } while (nivele != 0);
    }

}