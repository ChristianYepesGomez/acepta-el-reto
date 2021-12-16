package com.company;

import java.util.*;

public class P619_PantallasDeCarga {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] n = sc.nextLine().split(" ");
        int x = Integer.parseInt(n[0]), y = Integer.parseInt(n[1]);

        while (x != 0 || y != 0) {
            char[][] mapa = new char[y][x];
            for (int i = 0; i < y; i++) {
                //System.out.println(n[i]);
                mapa[i] = sc.nextLine().toCharArray();
            }

            /*for (int i=0; i < y; i++){
                System.out.println(mapa[i]);

            }*/
            int x1 = 0, x2 = 7;
            int y1 = 0, y2 = 7;

            boolean error = false;

            while (y2 <= y - 1 && !error) {
                while (x2 <= x - 1 && !error) {
                    ArrayList<Character> list = new ArrayList<Character>();
                    for (int j = y1; j <= y2; j++) {
                        for (int i = x1; i <= x2; i++) {
                            //System.out.print(mapa[j][i]);
                            if (list.contains(mapa[j][i])) continue;
                            else if (!list.contains(mapa[j][i]) && (list.size() < 2)) {
                                list.add(mapa[j][i]);
                            } else {
                                error = true;
                                break;
                            }
                        }
                        //System.out.println();
                    }
                    //System.out.println("========");
                    x1 = x2 + 1;
                    x2 += 8;
                }
                y1 = y2 + 1;
                y2 += 8;
                x1 = 0;
                x2 = 7;

            }


            if (!error) System.out.println("SI");
            else System.out.println("NO");

            n = sc.nextLine().split(" ");
            x = Integer.parseInt(n[0]);
            y = Integer.parseInt(n[1]);
        }
    }

}