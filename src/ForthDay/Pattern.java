package ForthDay;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();



        for (int i = 1; i <= n; i++) {
//
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // 1st half number
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }

            // 2nd half
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
//
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // 1st half
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }

            // 2nd half number
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        System.out.println();




        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(64+j));
            }

//            print spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

//            print remaining star
            for (int j = i; j >= 1 ; j--) {
                System.out.print((char)(64+j));
            }
            System.out.println();
        }

        System.out.println();





//        star pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("1"+" ");
                }
                else {
                    System.out.print("0"+" ");
                }
//                System.out.print(i+" ");
            }


            System.out.println();
        }






//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % 2 != 0) {
//                    System.out.print((char)(j + 64)+" ");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            for (int j = 1; j <= (n-i)*2 ; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                if (i % 2 != 0) {
//                    System.out.print((char)(j + 64)+" ");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                if (i % 2 != 0) {
//                    System.out.print((char)(j + 64)+" ");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            for (int j = 1; j <= (n-i)*2 ; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                if (i % 2 != 0) {
//                    System.out.print((char)(j + 64)+" ");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print((char)(91-j)+" ");
//            }
//            System.out.println();
//        }
    }
}
