package SixthDay_doWhlileLoop;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean check = true;
            for (int j = 2; j < Math.sqrt(num); j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }


            if (!check) {
                System.out.println("not prime number");
            }
            else {
                System.out.println("prime number");
            }


    }
}
