package com.company;

public class Main {

    final static int limite = 10;

    public static void main(String[] args) {

        StringBuilder cabecera = new StringBuilder("  |");
        StringBuilder cuerpo = new StringBuilder("\n");

        for (int i = 1; i < limite; i++) {

            cuerpo.append(String.format("%d |", i));
            cabecera.append(String.format(" %2s", i));
            cabecera.append(i == limite - 1 ? "\n" : "");

            for (int j = 1; j < limite; j++)
                cuerpo.append(String.format(" %2s", i * j));

            cuerpo.append("\n");

        }

        String separator = String.format("%" + cabecera.length() + "s", "-").replace(" ", "-");
        System.out.println(cabecera.append(separator).append(cuerpo));

    }
}
