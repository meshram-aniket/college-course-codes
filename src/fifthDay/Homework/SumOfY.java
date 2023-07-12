package fifthDay.Homework;

import java.util.Scanner;

public class SumOfY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a X: ");
        int x = sc.nextInt();

        System.out.println("enter Y: ");
        int y = sc.nextInt();

        int sum = 0;
        while (x != 0) {
            if (x % 2 != 0) {
                sum += y;
            }
            x = x / 2;
            y = y * 2;
        }

        System.out.println(sum);
    }
}
