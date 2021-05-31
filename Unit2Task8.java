package com.company;

public class Unit2Task8 {
    public static void main(String[] args) {
        int i;
        int j;
        String star = "*";
        String empty = " ";
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(star + " ");
            }
            System.out.println("\n");
        }

                System.out.println();

        for (i = 1; i <= 4; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print(star + " ");
            }
            System.out.println("\n");
        }

        System.out.println();

        int k;
        for (i = 1; i <= 4; i++) {

            for (j = 3; j >= i; j--) {
                System.out.print(empty + " ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(star + " ");
            }
            System.out.println("\n");
        }

        System.out.println();

        for (i = 1; i <= 4; i++) {

            for (j = 4; j >= i; j--) {
                System.out.print(star + " ");
            }
            for (k = 0; k < 3; k++) {
                System.out.print(empty + " ");
            }

            System.out.println("\n");
        }
    }
}






