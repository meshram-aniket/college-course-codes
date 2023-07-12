package SecondDay;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int reverse = 0 ;
        while (num != 0) {
            int remainder = num % 10;
            reverse =  (10 * reverse) + remainder;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
