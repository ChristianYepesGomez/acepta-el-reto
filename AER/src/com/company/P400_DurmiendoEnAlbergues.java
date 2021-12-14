package com.company;

import java.util.Scanner;

public class P400_DurmiendoEnAlbergues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String camas = sc.nextLine();
            char[] camasL = camas.toCharArray();
            int cantidad = 0;
            int maxCantidad = 0;
            boolean principio = false;

            for (int i = 0; i < camasL.length; i++) {
                if (camasL[i] == '.') {
                    cantidad++;
                    if (i == 0) {
                        principio = true;
                    }
                    if (i == camasL.length - 1) {
                        maxCantidad = Math.max(maxCantidad, cantidad - 1);
                    }
                } else {
                    if (principio) {
                        principio = false;
                        maxCantidad = Math.max(maxCantidad, cantidad - 1);
                    } else if (cantidad % 2 == 0) {
                        maxCantidad = Math.max(maxCantidad, cantidad / 2 - 1);
                    } else {
                        maxCantidad = Math.max(maxCantidad, cantidad / 2);
                    }
                    cantidad = 0;
                }

            }
            System.out.println(maxCantidad);
        }
    }
}