package com.company;

import java.util.Scanner;

public class P309_CalculoMental {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ncasos = sc.nextInt();
        int num2, resultado = 0;
        String operacion;

        for (int i = 0; i < ncasos; i++) {

            resultado = sc.nextInt();
            operacion = sc.next();
            num2 = sc.nextInt();

            do {

                switch (operacion) {
                    case "+":
                        resultado += num2;
                        break;
                    case "-":
                        resultado -= num2;
                        break;
                }

                operacion = sc.next();

                if (operacion.equals(".")) {
                    System.out.print(resultado);
                    resultado = 0;
                } else {
                    System.out.print(resultado + ", ");
                    num2 = sc.nextInt();
                }

            } while (!operacion.equals("."));

            System.out.println();
        }
    }

}

