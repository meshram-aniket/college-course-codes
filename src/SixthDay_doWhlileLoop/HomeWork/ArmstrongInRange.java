package SixthDay_doWhlileLoop.HomeWork;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isArmstrong(int i) {
        int cor = i;
        int sum = 0;
        while(i != 0) {
            int num = i % 10;
            sum += num*num*num;
            i /= 10;

            if (sum == cor) {
                return true;
            }
        }
        return false;

    }
}
