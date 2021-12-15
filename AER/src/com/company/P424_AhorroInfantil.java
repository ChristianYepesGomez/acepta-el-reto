package com.company;

import java.util.Scanner;

public class P424_AhorroInfantil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long casos, res, num, max;

        do {

            casos = sc.nextInt();
            res = 0;
            max = 0;

            if (casos != 0) {

                for (int i = 0; i < casos; i++) {

                    num = sc.nextInt();
                    res += num;

                    if (max < res) {
                        max = res;
                    }
                }
                System.out.println(res + " " + max);
            }

        } while (casos != 0);

    }

}