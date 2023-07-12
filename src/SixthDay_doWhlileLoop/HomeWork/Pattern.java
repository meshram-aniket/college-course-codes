package SixthDay_doWhlileLoop.HomeWork;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i ; j++) {
                if (j == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 2; j <= i ; j++) {
                if (j == i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i ; j++) {
                if (j == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 2; j <= i ; j++) {
                if (j == i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
