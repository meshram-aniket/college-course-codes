package ForthDay;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter from number: ");
        double n = sc.nextDouble();

        double sum = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;

        double fact = 1;
        double fact1 = 1;
        int count = 0;

        for (double i = 1; i <= n ; i++) {
            sum = sum + (1/i);
        }
        for (double i = 1; i <= n ; i++) {
            sum3 += 1 / (i * i);

        }
        for (double i = 1; i <= n ; i++) {
            fact = fact * i;
            sum2 += 1 / fact;
        }

        for (int i = 1; i <= (2*n)-1; i++) {

            fact1 = fact1 * i;
            if (i % 2 != 0) {
                count += 1;
                if (count % 2 == 0) {
                    sum4 += -1 / fact1;
                } else {
                    sum4 += 1 / fact1;
                }
            }
        }


        System.out.println("enter value of x: " );
        double x = sc.nextInt();

        int count1 = 0;
        double sum5 = 0;
        double fact2 = 1;
        for(double i = 1; i <= x; i++) {
            fact2 = fact2 * i;
            if (i % 2 != 0) {
                count1 += 1;
                if (count1 % 2 == 0) {
                    sum5 += -Math.pow(x, i) / fact2;
                } else {
                    sum5 += Math.pow(x, i) / fact2;
                }
            }
        }

        int count2 = 0;
        double sum6 = 0;
        double fact3 = 1;
        for(double i = 1; i <= x; i++) {
            fact3 = fact3 * i;
            if (i % 2 == 0) {
                count2 += 1;
                if (count2 % 2 == 0) {
                    sum6 += -Math.pow(x, i) / fact3;
                } else {
                    sum6 += Math.pow(x, i) / fact3;
                }
            }
        }

        System.out.println(sum);
        System.out.println(sum3);
        System.out.println(sum2);
        System.out.println(sum4);
        System.out.println(sum5);
        System.out.println(sum6);

    }

}
